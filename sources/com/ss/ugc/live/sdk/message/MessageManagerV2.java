package com.ss.ugc.live.sdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.JsonApiResult;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.ILogger;
import com.ss.ugc.live.sdk.message.interfaces.IMessageConverter;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.message.interfaces.IMonitor;
import com.ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.ugc.live.sdk.msg.a;
import com.ss.ugc.live.sdk.msg.b.c;
import com.ss.ugc.live.sdk.msg.b.e;
import com.ss.ugc.live.sdk.msg.c.a;
import com.ss.ugc.live.sdk.msg.c.d;
import com.ss.ugc.live.sdk.msg.d.h;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class MessageManagerV2 extends HandlerThread implements IMessageManagerV2 {
    private final DeduplicateInterceptor deduplicateInterceptor;
    public volatile boolean isFetching;
    private final long[] mApiCallDelayTimeList;
    private int mApiCallDelayTimeListIndex;
    public long mApiCallStartTime;
    public volatile long mApiCallTimeStamp;
    public volatile String mCursor;
    private volatile boolean mEnableAlongsideHttp;
    private volatile boolean mEnablePriority;
    private volatile boolean mEnableSmoothlyDispatch;
    public int mFetchFailedCount;
    public volatile long mFetchInterval;
    public volatile long mHeartbeatDurationInS;
    private long mHeartbeatPacketSendTime;
    private AtomicInteger mHeartbeatPacketSeqIdGenerator;
    private String mHeartbeatSendPacketSeqId;
    public ArrayList<String> mHostWsMessageAckList;
    private final List<OnInterceptListener> mInterceptListeners;
    private final List<IInterceptor> mInterceptors;
    public volatile boolean mIsAnchor;
    public boolean mIsEnhanceWS;
    private ILogger mLogger;
    public volatile Handler mMainThreadHandler;
    public IMessageWsClient mMessageClient;
    private IMessageWsClient.Callback mMessageClientCallback;
    private a mMessageContext;
    public IMessageConverter mMessageConverter;
    private final SparseArray<Set<OnMessageListener>> mMessageListenerMap;
    private final List<IMessage> mMessageQueue = new ArrayList();
    public volatile MessageStrategy mMessageStrategy;
    private IMonitor mMonitor;
    public final List<Long> mMonitorMessageIds;
    private volatile boolean mNeedEnqueueMessage;
    private volatile int mNextTimeDispatchSize;
    public volatile Handler mSelfThreadHandler;
    public volatile int mState;
    public com.ss.ugc.live.sdk.msg.c.a mUplinkClient;
    private volatile long mWaitWsConnectDuration;
    public int mWsConnectFailedCount;

    static {
        Covode.recordClassIndex(102764);
    }

    public static int com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    private void clearMessageQueueInMain() {
        this.mMainThreadHandler.sendEmptyMessage(206);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2
    public boolean isWsConnected() {
        IMessageWsClient iMessageWsClient = this.mMessageClient;
        if (iMessageWsClient == null || !iMessageWsClient.isWsConnected()) {
            return false;
        }
        return true;
    }

    public void cancelAlongsideHttp() {
        this.mEnableAlongsideHttp = false;
        if (this.mSelfThreadHandler != null && this.mSelfThreadHandler.hasMessages(113)) {
            this.mSelfThreadHandler.removeMessages(113);
        }
    }

    public void cancelFallbackTimer() {
        if (this.mSelfThreadHandler != null && this.mSelfThreadHandler.hasMessages(106)) {
            this.mSelfThreadHandler.removeMessages(106);
        }
    }

    public void cancelHeartbeatTimer() {
        if (this.mSelfThreadHandler != null && this.mSelfThreadHandler.hasMessages(110)) {
            this.mSelfThreadHandler.removeMessages(110);
        }
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.mSelfThreadHandler = new Handler(getLooper()) {
            /* class com.ss.ugc.live.sdk.message.MessageManagerV2.AnonymousClass3 */

            static {
                Covode.recordClassIndex(102768);
            }

            public void handleMessage(Message message) {
                MessageManagerV2.this.handleSelfThreadMessage(message);
            }
        };
        this.mSelfThreadHandler.sendEmptyMessage(101);
    }

    private long getApiCallMaxTime() {
        long[] jArr = this.mApiCallDelayTimeList;
        long j2 = 0;
        for (long j3 : jArr) {
            if (j3 > j2) {
                j2 = j3;
            }
        }
        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "maxTime: ".concat(String.valueOf(j2)));
        if (j2 > 0) {
            return j2;
        }
        return 200;
    }

    public void resetAndTriggerHeartbeatTimer() {
        if (this.mState == 2) {
            IMessageWsClient iMessageWsClient = this.mMessageClient;
            if ((iMessageWsClient == null || iMessageWsClient.isWsConnected()) && this.mSelfThreadHandler != null) {
                com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "trigger heartbeat timer");
                cancelHeartbeatTimer();
                this.mSelfThreadHandler.sendMessageDelayed(this.mSelfThreadHandler.obtainMessage(110), this.mHeartbeatDurationInS * 1000);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void startMessage() {
        if (this.mState != 2 && this.mState != 1) {
            if (getLooper() == null) {
                this.mState = 1;
                start();
            } else if (this.mSelfThreadHandler != null) {
                this.mSelfThreadHandler.sendEmptyMessage(101);
            }
        }
    }

    public void wsAlongWithHttpFetch() {
        if (this.mState == 2) {
            IMessageWsClient iMessageWsClient = this.mMessageClient;
            if ((iMessageWsClient == null || !iMessageWsClient.isWsConnected()) && this.mSelfThreadHandler != null) {
                com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "trigger ws along with http");
                this.mEnableAlongsideHttp = true;
                this.mSelfThreadHandler.sendMessage(this.mSelfThreadHandler.obtainMessage(113));
            }
        }
    }

    private void calculateNextTimeDispatchCount() {
        if (this.mEnableSmoothlyDispatch) {
            int size = this.mMessageQueue.size();
            com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "message queue size is: " + this.mMessageQueue.size());
            long apiCallMaxTime = this.mFetchInterval + getApiCallMaxTime();
            if (apiCallMaxTime < 200) {
                apiCallMaxTime = 200;
            }
            int i2 = (int) ((apiCallMaxTime + 100) / 200);
            com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "expect dispatch count: ".concat(String.valueOf(i2)));
            if (size / i2 > 0) {
                this.mNextTimeDispatchSize = (size + (i2 / 2)) / i2;
            } else {
                this.mNextTimeDispatchSize = 1;
            }
            com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "next time dispatch size: " + this.mNextTimeDispatchSize);
            return;
        }
        this.mNextTimeDispatchSize = 1;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void release() {
        h hVar;
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
        IMessageWsClient iMessageWsClient = this.mMessageClient;
        if (iMessageWsClient != null) {
            iMessageWsClient.disconnectFromWebSocket("release");
            this.mMessageClient.onRelease();
            this.mMessageClient.setCallback(null);
        }
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
        com.ss.ugc.live.sdk.msg.c.a aVar = this.mUplinkClient;
        com.ss.ugc.live.sdk.msg.d.a.a(aVar.f154137g, "uplink release");
        h hVar2 = aVar.f154132b;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
        }
        h hVar3 = aVar.f154133c;
        if (hVar3 != null) {
            hVar3.removeCallbacksAndMessages(null);
        }
        h hVar4 = aVar.f154134d;
        if (hVar4 != null) {
            hVar4.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = aVar.f154131a;
        if (handlerThread != null && handlerThread.getLooper() != null && (hVar = aVar.f154134d) != null) {
            hVar.sendEmptyMessage(com.ss.ugc.live.sdk.msg.c.a.n);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void reset() {
        if (this.mSelfThreadHandler != null) {
            this.mSelfThreadHandler.removeCallbacksAndMessages(null);
        }
        if (this.mMainThreadHandler != null) {
            this.mMainThreadHandler.removeCallbacksAndMessages(null);
        }
        IMessageWsClient iMessageWsClient = this.mMessageClient;
        if (iMessageWsClient != null) {
            iMessageWsClient.setCallback(null);
        }
        this.isFetching = false;
        this.mCursor = "0";
        this.mWsConnectFailedCount = 0;
        this.mHeartbeatPacketSeqIdGenerator = new AtomicInteger(0);
        this.mHeartbeatPacketSendTime = 0;
        this.mMessageStrategy = MessageStrategy.HTTP;
        this.deduplicateInterceptor.clear();
        this.mMonitorMessageIds.clear();
        this.mMessageQueue.clear();
        this.mInterceptListeners.clear();
        this.mInterceptors.clear();
        this.mMessageListenerMap.clear();
        this.mState = 0;
        refresh(new Configuration());
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

    public void switchToHttp(String str) {
        if (this.mMessageClient != null) {
            com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "switchToHttp");
            cancelFallbackTimer();
            cancelAlongsideHttp();
            this.mMessageStrategy = MessageStrategy.HTTP;
            this.mMessageClient.disconnectFromWebSocket(str);
            if (this.mIsEnhanceWS) {
                this.mSelfThreadHandler.sendEmptyMessage(109);
            } else {
                this.mSelfThreadHandler.sendEmptyMessage(103);
            }
        }
    }

    public void processServerHeartbeatPacket(PayloadItem payloadItem) {
        try {
            String str = new String(payloadItem.getPayload());
            long j2 = this.mHeartbeatPacketSendTime;
            long serverTime = payloadItem.getServerTime();
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - j2;
            com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "sendPacketTime = " + j2 + ", serverTime = " + serverTime + ", receivePacketTime = " + currentTimeMillis + ", serverTimeGap = " + (((j3 / 2) + serverTime) - currentTimeMillis));
            if (TextUtils.equals(str, this.mHeartbeatSendPacketSeqId) && currentTimeMillis > j2 && j2 > 0 && serverTime > 0 && serverTime >= currentTimeMillis && j3 <= 1000) {
                long j4 = (serverTime + (j3 / 2)) - currentTimeMillis;
                IMessageWsClient iMessageWsClient = this.mMessageClient;
                if (iMessageWsClient != null) {
                    iMessageWsClient.setWebSocketServerTimeGap(j4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void fetchMessage(int i2) {
        if (!(this.mMessageClient == null || this.isFetching)) {
            if (i2 != MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE || this.mEnableAlongsideHttp) {
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
                        for (int i3 = 1; i3 < size; i3++) {
                            sb.append(",");
                            sb.append(this.mMonitorMessageIds.get(i3));
                        }
                        hashMap.put("ack_ids", sb.toString());
                        this.mMonitorMessageIds.clear();
                    }
                }
                if (!this.mHostWsMessageAckList.isEmpty()) {
                    hashMap.put("frontier_ext", TextUtils.join(",", this.mHostWsMessageAckList));
                    this.mHostWsMessageAckList.clear();
                }
                com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "call api");
                this.mApiCallStartTime = System.currentTimeMillis();
                this.isFetching = true;
                this.mMessageClient.apiCall(hashMap, i2);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManager
    public void refresh(Configuration configuration) {
        boolean z;
        this.mMessageConverter = configuration.getMessageConverter();
        this.mInterceptors.clear();
        this.mInterceptors.add(this.deduplicateInterceptor);
        this.mInterceptors.addAll(configuration.getInterceptors());
        this.mInterceptListeners.clear();
        this.mInterceptListeners.addAll(configuration.getInterceptListeners());
        IMessageWsClient httpClientWS = configuration.getHttpClientWS();
        this.mMessageClient = httpClientWS;
        if (httpClientWS != null) {
            httpClientWS.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "mEnableSmoothlyDispatch: " + this.mEnableSmoothlyDispatch);
        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "mEnablePriority: " + this.mEnablePriority);
        if (this.mEnableSmoothlyDispatch || this.mEnablePriority) {
            z = true;
        } else {
            z = false;
        }
        this.mNeedEnqueueMessage = z;
        this.mLogger = configuration.getLogger();
        this.mMonitor = configuration.getMonitor();
        this.mWaitWsConnectDuration = configuration.getWaitWsConnectDuration();
        if (!(this.mLogger == null || this.mMonitor == null)) {
            this.mMessageContext = new a(this.mLogger, this.mMonitor);
        }
        if (this.mMessageContext != null && this.mMessageClient != null) {
            this.mUplinkClient = new com.ss.ugc.live.sdk.msg.c.a(this.mMessageContext, this.mMessageClient, configuration.getHttpClient(), configuration.getUplinkConfig());
        }
    }

    MessageManagerV2(Configuration configuration) {
        super("LiveMessageManager_WS");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.mInterceptors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.mInterceptListeners = copyOnWriteArrayList2;
        this.mMonitorMessageIds = new ArrayList();
        this.mMessageListenerMap = new SparseArray<>();
        this.mApiCallDelayTimeList = new long[5];
        boolean z = false;
        this.mApiCallDelayTimeListIndex = 0;
        this.mNextTimeDispatchSize = 1;
        this.mApiCallTimeStamp = 0;
        this.mCursor = "0";
        this.mHeartbeatDurationInS = 10;
        this.mMessageStrategy = MessageStrategy.HTTP;
        this.mWsConnectFailedCount = 0;
        this.mHeartbeatPacketSeqIdGenerator = new AtomicInteger(0);
        this.mHeartbeatPacketSendTime = 0;
        this.mHostWsMessageAckList = new ArrayList<>();
        this.mIsEnhanceWS = false;
        this.mEnableAlongsideHttp = false;
        this.mMessageClientCallback = new IMessageWsClient.Callback() {
            /* class com.ss.ugc.live.sdk.message.MessageManagerV2.AnonymousClass1 */

            static {
                Covode.recordClassIndex(102765);
            }

            public static int com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
                return 0;
            }

            public static int com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                return 0;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketConnected() {
                com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketConnected");
                MessageManagerV2.this.cancelAlongsideHttp();
                MessageManagerV2.this.cancelFallbackTimer();
                MessageManagerV2.this.resetAndTriggerHeartbeatTimer();
            }

            private void scheduleNextFetch() {
                long j2;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mFetchInterval > 0) {
                        j2 = MessageManagerV2.this.mFetchInterval;
                    } else {
                        j2 = 1000;
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "call api after ".concat(String.valueOf(j2)));
                    MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j2);
                }
            }

            private void scheduleNextFetchWhileWSConnecting() {
                long j2;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mFetchInterval > 0) {
                        j2 = MessageManagerV2.this.mFetchInterval;
                    } else {
                        j2 = 1000;
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "call api after ".concat(String.valueOf(j2)));
                    MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(113, j2);
                }
            }

            private void scheduleNextFetchWithStrategy() {
                long j2;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mFetchInterval > 0) {
                        j2 = MessageManagerV2.this.mFetchInterval;
                    } else {
                        j2 = 1000;
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "call api after ".concat(String.valueOf(j2)));
                    MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(109, j2);
                }
            }

            private void startReDetermineMessageStrategyWhenWSLost() {
                long j2;
                if (MessageManagerV2.this.mSelfThreadHandler != null) {
                    if (MessageManagerV2.this.mMessageClient != null) {
                        MessageManagerV2.this.mMessageClient.disconnectFromWebSocket("ws_disconnect_re_determine");
                    }
                    if (!MessageManagerV2.this.mSelfThreadHandler.hasMessages(109)) {
                        MessageManagerV2.this.mMessageStrategy = MessageStrategy.HTTP;
                        if (MessageManagerV2.this.mFetchInterval > 0) {
                            j2 = MessageManagerV2.this.mFetchInterval;
                        } else {
                            j2 = 1000;
                        }
                        com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "re determine message strategy ".concat(String.valueOf(j2)));
                        MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(109, j2);
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketDisconnected() {
                MessageManagerV2.this.mWsConnectFailedCount++;
                com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketDisconnected, ws connect failed count is " + MessageManagerV2.this.mWsConnectFailedCount);
                MessageManagerV2.this.cancelHeartbeatTimer();
                MessageManagerV2.this.cancelFallbackTimer();
                MessageManagerV2.this.cancelAlongsideHttp();
                if (MessageManagerV2.this.mIsEnhanceWS || MessageManagerV2.this.mWsConnectFailedCount < 3) {
                    startReDetermineMessageStrategyWhenWSLost();
                } else {
                    MessageManagerV2.this.switchToHttp("retry_count_over");
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onHostWebSocketMessage(PayloadItem payloadItem) {
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && payloadItem != null) {
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onHostWebSocketMessage");
                    MessageManagerV2.this.mSelfThreadHandler.obtainMessage(111, payloadItem).sendToTarget();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult) {
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && protoApiResult != null) {
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onHostWebSocketPayloadDecoded");
                    dispatchWsMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    if (MessageManagerV2.this.mMessageClient != null && protoApiResult.needAck) {
                        if (MessageManagerV2.this.mMessageClient.isWsConnected()) {
                            MessageManagerV2.this.mSelfThreadHandler.obtainMessage(112, protoApiResult);
                        } else if (!TextUtils.isEmpty(protoApiResult.internalExt)) {
                            MessageManagerV2.this.mHostWsMessageAckList.add(protoApiResult.internalExt);
                        }
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onApiSuccess(JsonApiResult jsonApiResult) {
                MessageManagerV2.this.isFetching = false;
                MessageManagerV2.this.mFetchFailedCount = 0;
                if (MessageManagerV2.this.mState == 2 && MessageManagerV2.this.mMainThreadHandler != null) {
                    JSONObject jSONObject = jsonApiResult.extra;
                    MessageManagerV2.this.mCursor = jSONObject.optString("cursor");
                    MessageManagerV2.this.mFetchInterval = jSONObject.optLong("fetch_interval");
                    MessageManagerV2.this.mApiCallTimeStamp = jSONObject.optLong("now");
                    JSONArray jSONArray = jsonApiResult.data;
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("common");
                            if (optJSONObject != null) {
                                IMessage convert = MessageManagerV2.this.mMessageConverter.convert(optJSONObject.optString("method"), jSONObject2.toString(), MessageManagerV2.this.mApiCallTimeStamp);
                                if (convert != null) {
                                    arrayList.add(convert);
                                }
                            }
                        } catch (JSONException e2) {
                            com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("LiveMessageManager_WS", e2.toString());
                        }
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onApiSuccess, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + arrayList.size());
                    dispatchMessage(arrayList, jsonApiResult.delayTimeBeforeDispatch);
                    scheduleNextFetch();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onDetermineMessageStrategy(ProtoApiResult protoApiResult) {
                long size;
                MessageManagerV2.this.isFetching = false;
                MessageManagerV2.this.mFetchFailedCount = 0;
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mMainThreadHandler != null) {
                    MessageManagerV2.this.mCursor = protoApiResult.cursor;
                    MessageManagerV2.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManagerV2.this.mApiCallTimeStamp = protoApiResult.now;
                    MessageManagerV2.this.mHeartbeatDurationInS = Math.max(10L, protoApiResult.heartbeatDuration);
                    if (protoApiResult.messages == null) {
                        size = 0;
                    } else {
                        size = (long) protoApiResult.messages.size();
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onDetermineMessageStrategy, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + size + ", heartbeat duration: " + MessageManagerV2.this.mHeartbeatDurationInS);
                    if (MessageApiConstant.FetchType.WEBSOCKET != protoApiResult.fetchType || TextUtils.isEmpty(protoApiResult.pushServer) || MessageManagerV2.this.mSelfThreadHandler == null) {
                        MessageManagerV2.this.mMessageStrategy = MessageStrategy.HTTP;
                        dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                        if (MessageManagerV2.this.mIsEnhanceWS) {
                            scheduleNextFetchWithStrategy();
                        } else {
                            scheduleNextFetch();
                        }
                    } else {
                        MessageManagerV2.this.mMessageStrategy = MessageStrategy.WS;
                        dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                        MessageManagerV2.this.mSelfThreadHandler.obtainMessage(105, protoApiResult.routeParams).sendToTarget();
                        if (MessageManagerV2.this.mIsEnhanceWS) {
                            MessageManagerV2.this.mSelfThreadHandler.postDelayed(new Runnable() {
                                /* class com.ss.ugc.live.sdk.message.MessageManagerV2.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(102766);
                                }

                                public void run() {
                                    MessageManagerV2.this.wsAlongWithHttpFetch();
                                }
                            }, 1000);
                        }
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketMessage(PayloadItem payloadItem) {
                Message obtainMessage;
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && payloadItem != null) {
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketMessage: payload type is " + payloadItem.getPayloadType());
                    if (TextUtils.equals(payloadItem.getPayloadType(), "msg")) {
                        MessageManagerV2.this.mApiCallStartTime = System.currentTimeMillis();
                        MessageManagerV2.this.mSelfThreadHandler.obtainMessage(107, payloadItem).sendToTarget();
                    } else if (TextUtils.equals(payloadItem.getPayloadType(), "close")) {
                        com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketMessage: payload type is close, fallback to http");
                        MessageManagerV2.this.switchToHttp("service_close_cmd");
                    } else if (TextUtils.equals(payloadItem.getPayloadType(), "hb")) {
                        MessageManagerV2.this.processServerHeartbeatPacket(payloadItem);
                    } else if (TextUtils.equals(payloadItem.getPayloadType(), "uplink_im_gateway")) {
                        com.ss.ugc.live.sdk.msg.c.a aVar = MessageManagerV2.this.mUplinkClient;
                        l.c(payloadItem, "");
                        h hVar = aVar.f154133c;
                        if (hVar != null && (obtainMessage = hVar.obtainMessage(com.ss.ugc.live.sdk.msg.c.a.f154128k, payloadItem)) != null) {
                            obtainMessage.sendToTarget();
                        }
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult) {
                if (2 == MessageManagerV2.this.mState && MessageManagerV2.this.mSelfThreadHandler != null && protoApiResult != null) {
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketPayloadDecoded");
                    MessageManagerV2.this.mCursor = protoApiResult.cursor;
                    MessageManagerV2.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManagerV2.this.mApiCallTimeStamp = protoApiResult.now;
                    MessageManagerV2.this.mHeartbeatDurationInS = Math.max(10L, protoApiResult.heartbeatDuration);
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketPayloadDecoded, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + protoApiResult.messages.size() + ", heartbeat duration is " + MessageManagerV2.this.mHeartbeatDurationInS);
                    dispatchWsMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    if (TextUtils.equals(protoApiResult.payloadType, "msg") && protoApiResult.needAck) {
                        com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onWebSocketPayloadDecoded, need send ack: " + protoApiResult.getFormatAckInfo());
                        MessageManagerV2.this.mSelfThreadHandler.obtainMessage(108, protoApiResult).sendToTarget();
                    }
                }
            }

            private void dispatchWsMessage(List<IMessage> list, long j2) {
                if (list != null && !list.isEmpty()) {
                    MessageManagerV2.this.mMainThreadHandler.sendMessageDelayed(MessageManagerV2.this.mMainThreadHandler.obtainMessage(201, list), j2);
                }
            }

            private void dispatchMessage(List<IMessage> list, long j2) {
                if (!(list == null || list.isEmpty())) {
                    if (MessageManagerV2.this.mIsAnchor) {
                        ArrayList arrayList = new ArrayList();
                        for (IMessage iMessage : list) {
                            if (iMessage.needMonitor()) {
                                MessageManagerV2.this.mMonitorMessageIds.add(Long.valueOf(iMessage.getMessageId()));
                            }
                        }
                        MessageManagerV2.this.mMainThreadHandler.obtainMessage(203, arrayList).sendToTarget();
                    }
                    MessageManagerV2.this.mMainThreadHandler.sendMessageDelayed(MessageManagerV2.this.mMainThreadHandler.obtainMessage(201, list), j2);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onApiError(Exception exc, int i2) {
                long j2;
                MessageManagerV2.this.isFetching = false;
                if (MessageManagerV2.this.mState == 2 && MessageManagerV2.this.mSelfThreadHandler != null) {
                    MessageManagerV2.this.mFetchFailedCount++;
                    if (MessageManagerV2.this.mFetchFailedCount > 3) {
                        j2 = 5000;
                    } else {
                        j2 = (long) (MessageManagerV2.this.mFetchFailedCount * 1000);
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("LiveMessageManager_WS", "onApiError: " + exc.toString() + ". failed count: " + MessageManagerV2.this.mFetchFailedCount + ", retry after " + j2);
                    if (i2 == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
                        MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(113, j2);
                    } else if (i2 == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
                        scheduleNextFetchWithStrategy();
                    } else {
                        MessageManagerV2.this.mSelfThreadHandler.sendEmptyMessageDelayed(103, j2);
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient.Callback
            public void onApiSuccess(ProtoApiResult protoApiResult, int i2) {
                long size;
                MessageManagerV2.this.isFetching = false;
                MessageManagerV2.this.mFetchFailedCount = 0;
                if (MessageManagerV2.this.mState == 2 && MessageManagerV2.this.mMainThreadHandler != null) {
                    MessageManagerV2.this.mCursor = protoApiResult.cursor;
                    MessageManagerV2.this.mFetchInterval = protoApiResult.fetchInterval;
                    MessageManagerV2.this.mApiCallTimeStamp = protoApiResult.now;
                    if (protoApiResult.messages == null) {
                        size = 0;
                    } else {
                        size = (long) protoApiResult.messages.size();
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2$1_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "onApiSuccess, cursor: " + MessageManagerV2.this.mCursor + ", fetch_interval: " + MessageManagerV2.this.mFetchInterval + ", timestamp: " + MessageManagerV2.this.mApiCallTimeStamp + ", size: " + size);
                    dispatchMessage(protoApiResult.messages, protoApiResult.delayTimeBeforeDispatch);
                    if (i2 == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE) {
                        scheduleNextFetchWhileWSConnecting();
                    } else if (i2 == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
                        scheduleNextFetchWithStrategy();
                    } else {
                        scheduleNextFetch();
                    }
                }
            }
        };
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) {
            /* class com.ss.ugc.live.sdk.message.MessageManagerV2.AnonymousClass2 */

            static {
                Covode.recordClassIndex(102767);
            }

            public void handleMessage(Message message) {
                MessageManagerV2.this.handleMainThreadMessage(message);
            }
        };
        this.mIsEnhanceWS = configuration.isEnhanceWS();
        this.mMessageConverter = configuration.getMessageConverter();
        DeduplicateInterceptor deduplicateInterceptor2 = new DeduplicateInterceptor(configuration.getDuplicateSize());
        this.deduplicateInterceptor = deduplicateInterceptor2;
        copyOnWriteArrayList.add(deduplicateInterceptor2);
        copyOnWriteArrayList.addAll(configuration.getInterceptors());
        copyOnWriteArrayList2.addAll(configuration.getInterceptListeners());
        IMessageWsClient httpClientWS = configuration.getHttpClientWS();
        this.mMessageClient = httpClientWS;
        if (httpClientWS != null) {
            httpClientWS.setCallback(this.mMessageClientCallback);
        }
        this.mEnableSmoothlyDispatch = configuration.isEnableSmoothlyDispatch();
        this.mEnablePriority = configuration.isEnablePriority();
        this.mIsAnchor = configuration.isAnchor();
        this.mLogger = configuration.getLogger();
        this.mMonitor = configuration.getMonitor();
        this.mWaitWsConnectDuration = configuration.getWaitWsConnectDuration();
        this.mMessageContext = new a(this.mLogger, this.mMonitor);
        this.mUplinkClient = new com.ss.ugc.live.sdk.msg.c.a(this.mMessageContext, this.mMessageClient, configuration.getHttpClient(), configuration.getUplinkConfig());
        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "mEnableSmoothlyDispatch: " + this.mEnableSmoothlyDispatch);
        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "mEnablePriority: " + this.mEnablePriority);
        this.mNeedEnqueueMessage = (this.mEnableSmoothlyDispatch || this.mEnablePriority) ? true : z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.List<java.lang.Long> */
    /* JADX WARN: Multi-variable type inference failed */
    public void handleMainThreadMessage(Message message) {
        switch (message.what) {
            case 201:
                if (this.mState == 2) {
                    List<IMessage> list = (List) message.obj;
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "main thread receive message list, size is " + list.size());
                    if (!this.mNeedEnqueueMessage) {
                        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "don't need enqueue message, directly dispatch messages");
                        for (IMessage iMessage : list) {
                            onMessage(iMessage);
                        }
                        return;
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "add message list to message queue, size is " + list.size());
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
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "main thread receive single message");
                    if (!this.mNeedEnqueueMessage) {
                        com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "don't need enqueue message, directly dispatch message");
                        onMessage(iMessage3);
                        return;
                    }
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "add single message to message queue");
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
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "before dispatch, message queue size is " + this.mMessageQueue.size());
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
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "after dispatch, message queue size is " + this.mMessageQueue.size());
                    if (this.mMessageQueue.size() > 0) {
                        scheduleNextDispatch(true);
                        return;
                    }
                    return;
                }
                return;
            case 206:
                this.mMessageQueue.clear();
                return;
            default:
                return;
        }
    }

    public void handleSelfThreadMessage(Message message) {
        IMessageWsClient iMessageWsClient;
        switch (message.what) {
            case 101:
                if (this.mState != 2) {
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "start message manager");
                    this.mState = 2;
                    IMessageWsClient iMessageWsClient2 = this.mMessageClient;
                    if (iMessageWsClient2 != null) {
                        iMessageWsClient2.onStartMessage();
                    }
                    com.ss.ugc.live.sdk.msg.c.a aVar = this.mUplinkClient;
                    com.ss.ugc.live.sdk.msg.d.a.a(aVar.f154137g, "uplink client start");
                    a.h hVar = new a.h(aVar, "UplinkClient");
                    hVar.start();
                    aVar.f154131a = hVar;
                    fetchMessage(MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE);
                    return;
                }
                return;
            case 102:
            case 104:
                com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "stop message manager");
                cancelAlongsideHttp();
                this.mSelfThreadHandler.removeMessages(103);
                this.mMainThreadHandler.removeCallbacksAndMessages(null);
                if (this.mState == 2 && (iMessageWsClient = this.mMessageClient) != null) {
                    iMessageWsClient.onStopMessage();
                    this.mMessageClient.disconnectFromWebSocket("stop_message");
                }
                if (message.what == 104) {
                    this.mCursor = "0";
                    this.deduplicateInterceptor.clear();
                    clearMessageQueueInMain();
                }
                this.mState = 3;
                return;
            case 103:
                if (this.mState == 2) {
                    fetchMessage(MessageApiConstant.FetchRule.FETCH_DATA_ONLY);
                    return;
                }
                return;
            case 105:
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.connectToWebSocket((Map) message.obj, this.mCursor);
                    resetAndTriggerFallbackTimer(this.mWaitWsConnectDuration, "ws_connect_timeout");
                    return;
                }
                return;
            case 106:
                if (this.mState == 2) {
                    switchToHttp((String) message.obj);
                    return;
                }
                return;
            case 107:
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.decodeWebSocketPayload((PayloadItem) message.obj);
                    return;
                }
                return;
            case 108:
                if (this.mState == 2 && this.mMessageClient != null) {
                    ProtoApiResult protoApiResult = (ProtoApiResult) message.obj;
                    if (protoApiResult.internalExt != null) {
                        this.mMessageClient.sendWebSocketMessage("none", "ack", protoApiResult.internalExt.getBytes(), protoApiResult.logId, protoApiResult.logId);
                        return;
                    }
                    return;
                }
                return;
            case 109:
                if (this.mState == 2 && this.mMessageClient != null) {
                    fetchMessage(MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE);
                    return;
                }
                return;
            case 110:
                if (this.mState == 2 && this.mMessageClient != null) {
                    int incrementAndGet = this.mHeartbeatPacketSeqIdGenerator.incrementAndGet();
                    this.mHeartbeatSendPacketSeqId = String.valueOf(incrementAndGet);
                    this.mHeartbeatPacketSendTime = System.currentTimeMillis();
                    com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "send heartbeat packet: seqId is " + this.mHeartbeatSendPacketSeqId);
                    long j2 = (long) incrementAndGet;
                    this.mMessageClient.sendWebSocketMessage("none", "hb", this.mHeartbeatSendPacketSeqId.getBytes(), j2, j2);
                    resetAndTriggerHeartbeatTimer();
                    return;
                }
                return;
            case 111:
                if (this.mState == 2 && this.mMessageClient != null) {
                    this.mMessageClient.decodeHostWebSocketPayload((PayloadItem) message.obj);
                    return;
                }
                return;
            case 112:
                if (this.mState == 2 && this.mMessageClient != null) {
                    ProtoApiResult protoApiResult2 = (ProtoApiResult) message.obj;
                    if (protoApiResult2.internalExt != null) {
                        this.mMessageClient.sendWebSocketMessage("none", "frontier_ack", protoApiResult2.internalExt.getBytes(), protoApiResult2.logId, protoApiResult2.logId);
                        return;
                    }
                    return;
                }
                return;
            case 113:
                if (this.mState == 2) {
                    fetchMessage(MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE);
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

    public void resetAndTriggerFallbackTimer(long j2, String str) {
        if (this.mState == 2) {
            IMessageWsClient iMessageWsClient = this.mMessageClient;
            if ((iMessageWsClient == null || !iMessageWsClient.isWsConnected()) && this.mSelfThreadHandler != null) {
                com_ss_ugc_live_sdk_message_MessageManagerV2_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveMessageManager_WS", "trigger fallback timer");
                cancelFallbackTimer();
                this.mSelfThreadHandler.sendMessageDelayed(this.mSelfThreadHandler.obtainMessage(106, str), j2);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2
    public void sendRequest(long j2, e eVar, c cVar) {
        long d2;
        Message obtainMessage;
        com.ss.ugc.live.sdk.msg.c.a aVar = this.mUplinkClient;
        l.c(eVar, "");
        l.c(cVar, "");
        long incrementAndGet = aVar.f154136f.f154142a.incrementAndGet();
        if (eVar.f154117i > 0) {
            d2 = eVar.f154117i;
        } else {
            d2 = aVar.f154139i.d();
        }
        d dVar = new d(incrementAndGet, j2, d2, eVar, cVar);
        h hVar = aVar.f154132b;
        if (hVar != null && (obtainMessage = hVar.obtainMessage(com.ss.ugc.live.sdk.msg.c.a.f154127j, dVar)) != null) {
            obtainMessage.sendToTarget();
        }
    }
}
