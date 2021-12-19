package com.ss.ugc.live.sdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.JsonApiResult;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class MessageManager extends HandlerThread implements IMessageManager {
    private final DeduplicateInterceptor deduplicateInterceptor;
    public volatile boolean isFetching;
    private final long[] mApiCallDelayTimeList;
    private int mApiCallDelayTimeListIndex;
    private long mApiCallStartTime;
    public volatile long mApiCallTimeStamp;
    public volatile String mCursor;
    private volatile boolean mEnablePriority;
    private volatile boolean mEnableSmoothlyDispatch;
    public int mFetchFailedCount;
    public volatile long mFetchInterval;
    private final List<OnInterceptListener> mInterceptListeners;
    private final List<IInterceptor> mInterceptors;
    public volatile boolean mIsAnchor;
    public volatile Handler mMainThreadHandler;
    private IMessageClient mMessageClient;
    private IMessageClient.Callback mMessageClientCallback;
    public IMessageConverter mMessageConverter;
    private final SparseArray<Set<OnMessageListener>> mMessageListenerMap;
    private final List<IMessage> mMessageQueue = new ArrayList();
    public final List<Long> mMonitorMessageIds;
    private volatile boolean mNeedEnqueueMessage;
    private volatile int mNextTimeDispatchSize;
    public volatile Handler mSelfThreadHandler;
    public volatile int mState;

    static {
        Covode.recordClassIndex(102759);
    }

    public static int com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void refresh(Configuration configuration) {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void reset() {
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.mSelfThreadHandler = new Handler(getLooper()) {
            /* class com.ss.ugc.live.sdk.message.MessageManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(102762);
            }

            public void handleMessage(Message message) {
                MessageManager.this.handleSelfThreadMessage(message);
            }
        };
        this.mSelfThreadHandler.sendEmptyMessage(101);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void startMessage() {
        if (getLooper() == null) {
            this.mState = 1;
            start();
        } else if (this.mSelfThreadHandler != null) {
            this.mSelfThreadHandler.sendEmptyMessage(101);
        }
    }

    private long getApiCallMaxTime() {
        long[] jArr = this.mApiCallDelayTimeList;
        long j2 = 0;
        for (long j3 : jArr) {
            if (j3 > j2) {
                j2 = j3;
            }
        }
        com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "maxTime: ".concat(String.valueOf(j2)));
        if (j2 > 0) {
            return j2;
        }
        return 200;
    }

    private void calculateNextTimeDispatchCount() {
        if (this.mEnableSmoothlyDispatch) {
            int size = this.mMessageQueue.size();
            com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "message queue size is: " + this.mMessageQueue.size());
            long apiCallMaxTime = this.mFetchInterval + getApiCallMaxTime();
            if (apiCallMaxTime < 200) {
                apiCallMaxTime = 200;
            }
            int i2 = (int) ((apiCallMaxTime + 100) / 200);
            com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "expect dispatch count: ".concat(String.valueOf(i2)));
            if (size / i2 > 0) {
                this.mNextTimeDispatchSize = (size + (i2 / 2)) / i2;
            } else {
                this.mNextTimeDispatchSize = 1;
            }
            com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "next time dispatch size: " + this.mNextTimeDispatchSize);
            return;
        }
        this.mNextTimeDispatchSize = 1;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void release() {
        this.mState = 4;
        if (getLooper() != null) {
            if (this.mSelfThreadHandler != null) {
                this.mSelfThreadHandler.removeCallbacksAndMessages(null);
            }
            if (this.mMainThreadHandler != null) {
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
            }
            quit();
        }
        IMessageClient iMessageClient = this.mMessageClient;
        if (iMessageClient != null) {
            iMessageClient.disconnectFromWebSocket();
            this.mMessageClient.onRelease();
            this.mMessageClient.setCallback(null);
        }
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
    }

    private void fetchMessage() {
        if (!(this.mMessageClient == null || this.isFetching)) {
            HashMap hashMap = new HashMap();
            hashMap.put("cursor", this.mCursor);
            hashMap.put("user_id", String.valueOf(this.mMessageClient.getUserId()));
            if (this.mIsAnchor) {
                if (this.mApiCallTimeStamp > 0) {
                    hashMap.put("fetch_time", String.valueOf(this.mApiCallTimeStamp));
                }
                if (this.mMonitorMessageIds.size() > 0) {
                    int size = this.mMonitorMessageIds.size();
                    StringBuilder sb = new StringBuilder(size * 20);
                    sb.append(this.mMonitorMessageIds.get(0));
                    for (int i2 = 1; i2 < size; i2++) {
                        sb.append(",");
                        sb.append(this.mMonitorMessageIds.get(i2));
                    }
                    hashMap.put("ack_ids", sb.toString());
                    this.mMonitorMessageIds.clear();
                }
            }
            com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "call api");
            this.mApiCallStartTime = System.currentTimeMillis();
            this.isFetching = true;
            this.mMessageClient.apiCall(hashMap);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptors.add(iInterceptor);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void addOnInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListeners.add(onInterceptListener);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void insertMessage(IMessage iMessage) {
        insertMessage(iMessage, false);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeInterceptor(IInterceptor iInterceptor) {
        this.mInterceptors.remove(iInterceptor);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeOnInterceptListener(OnInterceptListener onInterceptListener) {
        this.mInterceptListeners.remove(onInterceptListener);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void stopMessage(boolean z) {
        int i2;
        if (getLooper() != null && this.mSelfThreadHandler != null) {
            Handler handler = this.mSelfThreadHandler;
            if (z) {
                i2 = 104;
            } else {
                i2 = 102;
            }
            handler.sendEmptyMessage(i2);
        }
    }

    private void dispatchMessage(IMessage iMessage) {
        Set<OnMessageListener> set = this.mMessageListenerMap.get(iMessage.getIntType());
        if (!(set == null || set.isEmpty())) {
            for (OnMessageListener onMessageListener : set) {
                onMessageListener.onMessage(iMessage);
            }
        }
    }

    private void enqueueMessage(IMessage iMessage) {
        if (this.mEnablePriority) {
            int size = this.mMessageQueue.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (iMessage.getPriority() >= this.mMessageQueue.get(i2).getPriority()) {
                    this.mMessageQueue.add(i2, iMessage);
                    return;
                }
            }
            this.mMessageQueue.add(iMessage);
            return;
        }
        this.mMessageQueue.add(iMessage);
    }

    private void onMessage(IMessage iMessage) {
        for (IInterceptor iInterceptor : this.mInterceptors) {
            if (iInterceptor.onMessage(iMessage)) {
                for (OnInterceptListener onInterceptListener : this.mInterceptListeners) {
                    onInterceptListener.onIntercept(iMessage);
                }
                return;
            }
        }
        dispatchMessage(iMessage);
    }

    private void scheduleNextDispatch(boolean z) {
        if (this.mState == 2 && this.mMainThreadHandler != null && !this.mMainThreadHandler.hasMessages(205)) {
            if (!this.mEnableSmoothlyDispatch || !z) {
                this.mMainThreadHandler.sendEmptyMessage(205);
            } else {
                this.mMainThreadHandler.sendEmptyMessageDelayed(205, 200);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeMessageListener(OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            int size = this.mMessageListenerMap.size();
            for (int i2 = 0; i2 < size; i2++) {
                Set<OnMessageListener> valueAt = this.mMessageListenerMap.valueAt(i2);
                if (valueAt != null) {
                    valueAt.remove(onMessageListener);
                }
            }
        }
    }

    public void handleSelfThreadMessage(Message message) {
        IMessageClient iMessageClient;
        switch (message.what) {
            case 101:
                if (this.mState != 2) {
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "start message manager");
                    IMessageClient iMessageClient2 = this.mMessageClient;
                    if (iMessageClient2 != null) {
                        iMessageClient2.connectToWebSocket();
                    }
                    this.mState = 2;
                    fetchMessage();
                    return;
                }
                return;
            case 102:
            case 104:
                com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "stop message manager");
                this.mSelfThreadHandler.removeMessages(103);
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
                if (this.mState == 2 && (iMessageClient = this.mMessageClient) != null) {
                    iMessageClient.disconnectFromWebSocket();
                }
                if (message.what == 104) {
                    this.mCursor = "0";
                    this.deduplicateInterceptor.clear();
                }
                this.mState = 3;
                return;
            case 103:
                if (this.mState == 2) {
                    fetchMessage();
                    return;
                }
                return;
            default:
                return;
        }
    }

    MessageManager(Configuration configuration) {
        super("LiveMessageManager");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.mInterceptors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.mInterceptListeners = copyOnWriteArrayList2;
        this.mMonitorMessageIds = new ArrayList();
        this.mMessageListenerMap = new SparseArray<>();
        DeduplicateInterceptor deduplicateInterceptor2 = new DeduplicateInterceptor(512);
        this.deduplicateInterceptor = deduplicateInterceptor2;
        this.mApiCallDelayTimeList = new long[5];
        boolean z = false;
        this.mApiCallDelayTimeListIndex = 0;
        this.mNextTimeDispatchSize = 1;
        this.mApiCallTimeStamp = 0;
        this.mCursor = "0";
        this.mMessageClientCallback = new IMessageClient.Callback() {
            /* class com.ss.ugc.live.sdk.message.MessageManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(102760);
            }

            public static int com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
                return 0;
            }

            public static int com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                return 0;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onApiError(Exception exc) {
                long j2;
                MessageManager.this.isFetching = false;
                if (MessageManager.this.mState == 2 && MessageManager.this.mSelfThreadHandler != null) {
                    MessageManager.this.mFetchFailedCount++;
                    if (MessageManager.this.mFetchFailedCount > 3) {
                        j2 = 5000;
                    } else {
                        j2 = (long) (MessageManager.this.mFetchFailedCount * 1000);
                    }
                    com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("LiveMessageManager", "onApiError: " + exc.toString() + ". failed count: " + MessageManager.this.mFetchFailedCount + ", retry after " + j2);
                    MessageManager.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j2);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onApiSuccess(ProtoApiResult protoApiResult) {
                long size;
                MessageManager.this.isFetching = false;
                MessageManager.this.mFetchFailedCount = 0;
                if (MessageManager.this.mState == 2 && MessageManager.this.mMainThreadHandler != null) {
                    MessageManager.this.mCursor = protoApiResult.cursor;
                    MessageManager.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManager.this.mApiCallTimeStamp = protoApiResult.now;
                    if (protoApiResult.messages == null) {
                        size = 0;
                    } else {
                        size = (long) protoApiResult.messages.size();
                    }
                    com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "onApiSuccess, cursor: " + MessageManager.this.mCursor + ", fetch_interval: " + MessageManager.this.mFetchInterval + ", timestamp: " + MessageManager.this.mApiCallTimeStamp + ", size: " + size);
                    dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onWebSocketMessage(IMessage iMessage) {
                com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "receive web socket message");
                if (MessageManager.this.mState == 2 && iMessage != null && MessageManager.this.mMainThreadHandler != null) {
                    if (MessageManager.this.mIsAnchor && iMessage.needMonitor()) {
                        MessageManager.this.mMainThreadHandler.obtainMessage(204, Long.valueOf(iMessage.getMessageId())).sendToTarget();
                    }
                    MessageManager.this.mMainThreadHandler.obtainMessage(202, iMessage).sendToTarget();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageClient.Callback
            public void onApiSuccess(JsonApiResult jsonApiResult) {
                MessageManager.this.isFetching = false;
                MessageManager.this.mFetchFailedCount = 0;
                if (MessageManager.this.mState == 2 && MessageManager.this.mMainThreadHandler != null) {
                    JSONObject jSONObject = jsonApiResult.extra;
                    MessageManager.this.mCursor = jSONObject.optString("cursor");
                    MessageManager.this.mFetchInterval = jSONObject.optLong("fetch_interval");
                    MessageManager.this.mApiCallTimeStamp = jSONObject.optLong("now");
                    JSONArray jSONArray = jsonApiResult.data;
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("common");
                            if (optJSONObject != null) {
                                IMessage convert = MessageManager.this.mMessageConverter.convert(optJSONObject.optString("method"), jSONObject2.toString(), MessageManager.this.mApiCallTimeStamp);
                                if (convert != null) {
                                    arrayList.add(convert);
                                }
                            }
                        } catch (JSONException e2) {
                            com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("LiveMessageManager", e2.toString());
                        }
                    }
                    com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "onApiSuccess, cursor: " + MessageManager.this.mCursor + ", fetch_interval: " + MessageManager.this.mFetchInterval + ", timestamp: " + MessageManager.this.mApiCallTimeStamp + ", size: " + arrayList.size());
                    dispatchMessage(arrayList, jsonApiResult.delayTimeBeforeDispatch);
                }
            }

            private void dispatchMessage(List<IMessage> list, long j2) {
                long j3;
                if (list != null && !list.isEmpty()) {
                    if (MessageManager.this.mIsAnchor) {
                        ArrayList arrayList = new ArrayList();
                        for (IMessage iMessage : list) {
                            if (iMessage.needMonitor()) {
                                MessageManager.this.mMonitorMessageIds.add(Long.valueOf(iMessage.getMessageId()));
                            }
                        }
                        MessageManager.this.mMainThreadHandler.obtainMessage(203, arrayList).sendToTarget();
                    }
                    MessageManager.this.mMainThreadHandler.sendMessageDelayed(MessageManager.this.mMainThreadHandler.obtainMessage(201, list), j2);
                }
                if (MessageManager.this.mSelfThreadHandler != null) {
                    if (MessageManager.this.mFetchInterval > 0) {
                        j3 = MessageManager.this.mFetchInterval;
                    } else {
                        j3 = 1000;
                    }
                    com_ss_ugc_live_sdk_message_MessageManager$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "call api after ".concat(String.valueOf(j3)));
                    MessageManager.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j3);
                }
            }
        };
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) {
            /* class com.ss.ugc.live.sdk.message.MessageManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(102761);
            }

            public void handleMessage(Message message) {
                MessageManager.this.handleMainThreadMessage(message);
            }
        };
        this.mMessageConverter = configuration.getMessageConverter();
        copyOnWriteArrayList.add(deduplicateInterceptor2);
        copyOnWriteArrayList.addAll(configuration.getInterceptors());
        copyOnWriteArrayList2.addAll(configuration.getInterceptListeners());
        IMessageClient httpClient = configuration.getHttpClient();
        this.mMessageClient = httpClient;
        if (httpClient != null) {
            httpClient.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "mEnableSmoothlyDispatch: " + this.mEnableSmoothlyDispatch);
        com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "mEnablePriority: " + this.mEnablePriority);
        this.mNeedEnqueueMessage = (this.mEnableSmoothlyDispatch || this.mEnablePriority) ? true : z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.List<java.lang.Long> */
    /* JADX WARN: Multi-variable type inference failed */
    public void handleMainThreadMessage(Message message) {
        switch (message.what) {
            case 201:
                if (this.mState == 2) {
                    List<IMessage> list = (List) message.obj;
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "main thread receive message list, size is " + list.size());
                    if (!this.mNeedEnqueueMessage) {
                        com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "don't need enqueue message, directly dispatch messages");
                        for (IMessage iMessage : list) {
                            onMessage(iMessage);
                        }
                        return;
                    }
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "add message list to message queue, size is " + list.size());
                    for (IMessage iMessage2 : list) {
                        enqueueMessage(iMessage2);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.mApiCallStartTime;
                    if (currentTimeMillis > 0) {
                        long[] jArr = this.mApiCallDelayTimeList;
                        int i2 = this.mApiCallDelayTimeListIndex;
                        jArr[i2] = currentTimeMillis;
                        int i3 = i2 + 1;
                        this.mApiCallDelayTimeListIndex = i3;
                        if (i3 > 4) {
                            this.mApiCallDelayTimeListIndex = 0;
                        }
                    }
                    calculateNextTimeDispatchCount();
                    scheduleNextDispatch(false);
                    return;
                }
                return;
            case 202:
                if (this.mState == 2) {
                    IMessage iMessage3 = (IMessage) message.obj;
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "main thread receive single message");
                    if (!this.mNeedEnqueueMessage) {
                        com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "don't need enqueue message, directly dispatch message");
                        onMessage(iMessage3);
                        return;
                    }
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "add single message to message queue");
                    enqueueMessage(iMessage3);
                    scheduleNextDispatch(false);
                    return;
                }
                return;
            case 203:
                this.mMonitorMessageIds.addAll((Collection) message.obj);
                return;
            case 204:
                this.mMonitorMessageIds.add(message.obj);
                return;
            case 205:
                if (this.mState == 2) {
                    int size = this.mMessageQueue.size();
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "before dispatch, message queue size is " + this.mMessageQueue.size());
                    if (this.mEnableSmoothlyDispatch && size > this.mNextTimeDispatchSize) {
                        size = this.mNextTimeDispatchSize;
                    }
                    List<IMessage> subList = this.mMessageQueue.subList(0, size);
                    for (IMessage iMessage4 : subList) {
                        if (iMessage4 != null) {
                            onMessage(iMessage4);
                        }
                    }
                    subList.clear();
                    com_ss_ugc_live_sdk_message_MessageManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager", "after dispatch, message queue size is " + this.mMessageQueue.size());
                    if (this.mMessageQueue.size() > 0) {
                        scheduleNextDispatch(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void insertMessage(IMessage iMessage, boolean z) {
        if (iMessage != null) {
            if (z) {
                dispatchMessage(iMessage);
            } else {
                onMessage(iMessage);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void addMessageListener(int i2, OnMessageListener onMessageListener) {
        if (onMessageListener != null) {
            Set<OnMessageListener> set = this.mMessageListenerMap.get(i2);
            if (set == null) {
                set = new CopyOnWriteArraySet<>();
                this.mMessageListenerMap.put(i2, set);
            }
            set.add(onMessageListener);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void removeMessageListener(int i2, OnMessageListener onMessageListener) {
        Set<OnMessageListener> set;
        if (onMessageListener != null && (set = this.mMessageListenerMap.get(i2)) != null && !set.isEmpty()) {
            set.remove(onMessageListener);
        }
    }
}
