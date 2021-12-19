package com.ss.mediakit.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class AVMDLDNSParser {
    public static AVMDLCustomHTTPDNSParser mCustomHttpDNSParser;
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalEnableBackUpIp;
    public static int mGlobalEnableDNSLog;
    public static int mGlobalEnableParallel;
    public static int mGlobalEnableRefresh;
    public static int mGlobalForceExpiredTime;
    public static String mGlobalGoogleDNSParseHost = "";
    public static int mGlobalMainType;
    public static String mGlobalOwnDNSParseHost = "";
    private static AVMDLDNSParser mInstance;
    public static AVMDLNetClientMaker mNetClientMaker;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, AVMDLHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    static {
        Covode.recordClassIndex(101134);
    }

    public AVMDLDNSParser() {
        HandlerThread handlerThread = new HandlerThread("AVMDLDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.ss.mediakit.net.AVMDLDNSParser.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101135);
            }

            public void handleMessage(Message message) {
                AVMDLDNSInfo aVMDLDNSInfo;
                if (message.obj != null) {
                    aVMDLDNSInfo = (AVMDLDNSInfo) message.obj;
                } else {
                    aVMDLDNSInfo = null;
                }
                AVMDLLog.d("AVMDLDNSParser", a.a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
                int i2 = message.what;
                if (i2 == 2) {
                    AVMDLDNSParser.this.proccessFailMsg(message.what, aVMDLDNSInfo);
                } else if (i2 == 3) {
                    AVMDLDNSParser.this.proccessSucMsg(message.what, aVMDLDNSInfo);
                } else if (i2 == 4) {
                    AVMDLDNSParser.this.proccessPreParseMsg(message.what, aVMDLDNSInfo);
                } else if (i2 == 6) {
                    AVMDLDNSParser.this.processParseMsg(message.what, aVMDLDNSInfo);
                } else if (i2 == 7) {
                    AVMDLDNSParser.this.processBatchParseMsg(message.what, aVMDLDNSInfo);
                }
                AVMDLLog.d("AVMDLDNSParser", a.a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
            }
        };
    }

    public static AVMDLDNSParser getInstance() {
        MethodCollector.i(404);
        if (mInstance == null) {
            synchronized (AVMDLDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new AVMDLDNSParser();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(404);
                    throw th;
                }
            }
        }
        AVMDLDNSParser aVMDLDNSParser = mInstance;
        MethodCollector.o(404);
        return aVMDLDNSParser;
    }

    public static AVMDLNetClient getNetClient() {
        AVMDLNetClient aVMDLNetClient;
        MethodCollector.i(712);
        synchronized (AVMDLDNSParser.class) {
            try {
                AVMDLNetClientMaker aVMDLNetClientMaker = mNetClientMaker;
                if (aVMDLNetClientMaker != null) {
                    aVMDLNetClient = aVMDLNetClientMaker.getNetClient();
                } else {
                    aVMDLNetClient = null;
                }
            } finally {
                MethodCollector.o(712);
            }
        }
        if (aVMDLNetClient == null) {
            aVMDLNetClient = new AVMDLHTTPNetwork();
        }
        return aVMDLNetClient;
    }

    public static void processHijack() {
        AVMDLLog.d("AVMDLDNSParser", a.a("----process hijack old dnsmain:%d back:%d", new Object[]{Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)}));
        int i2 = mGlobalMainType;
        if (i2 == 0) {
            mGlobalMainType = mGlobalBackType;
            mGlobalBackType = i2;
        }
        AVMDLLog.d("AVMDLDNSParser", a.a("****process hijack new dnsmain:%d back:%d", new Object[]{Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)}));
    }

    public static void setClientMaker(AVMDLNetClientMaker aVMDLNetClientMaker) {
        MethodCollector.i(597);
        synchronized (AVMDLDNSParser.class) {
            if (aVMDLNetClientMaker != null) {
                try {
                    mNetClientMaker = aVMDLNetClientMaker;
                } catch (Throwable th) {
                    MethodCollector.o(597);
                    throw th;
                }
            }
        }
        MethodCollector.o(597);
    }

    private void reportLog(AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && mGlobalEnableDNSLog > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_type", "mdl_dns_log");
                jSONObject.put("dns_type", aVMDLDNSInfo.mType);
                jSONObject.put("ip_list", aVMDLDNSInfo.mIpList);
                AVMDLDataLoader.getInstance().onLogInfo(15, 0, jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    private void sendBatchParseMsg(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.d("AVMDLDNSParser", "hosts null not need do batch parse");
            return;
        }
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, strArr, (String) null, 0, (String) null);
        Message message = new Message();
        message.what = 7;
        message.obj = aVMDLDNSInfo;
        AVMDLLog.d("AVMDLDNSParser", a.a("send msg for batch parse", new Object[0]));
        this.mHandler.sendMessage(message);
    }

    public static void setCustomHttpDNSParser(AVMDLCustomHTTPDNSParser aVMDLCustomHTTPDNSParser) {
        MethodCollector.i(710);
        synchronized (AVMDLDNSParser.class) {
            int i2 = 1;
            try {
                Object[] objArr = new Object[1];
                if (aVMDLCustomHTTPDNSParser == null) {
                    i2 = 0;
                }
                objArr[0] = Integer.valueOf(i2);
                AVMDLLog.d("AVMDLDNSParser", a.a("set custom http dns parser:%d", objArr));
                if (aVMDLCustomHTTPDNSParser != null) {
                    mCustomHttpDNSParser = aVMDLCustomHTTPDNSParser;
                }
            } finally {
                MethodCollector.o(710);
            }
        }
    }

    public static int getIntValue(int i2) {
        int i3;
        MethodCollector.i(423);
        AVMDLLog.d("AVMDLDNSParser", a.a("----get value for key:%d", new Object[]{Integer.valueOf(i2)}));
        synchronized (AVMDLDNSParser.class) {
            if (i2 != 10) {
                switch (i2) {
                    case 0:
                        i3 = mGlobalMainType;
                        break;
                    case 1:
                        i3 = mGlobalBackType;
                        break;
                    case 2:
                        i3 = mGlobalDefaultExpiredTime;
                        break;
                    case 3:
                        i3 = mGlobalBackUpDelayedTime;
                        break;
                    case 4:
                        i3 = mGlobalEnableParallel;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        i3 = mGlobalEnableBackUpIp;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        i3 = mGlobalEnableRefresh;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        try {
                            i3 = mGlobalEnableDNSLog;
                            break;
                        } catch (Throwable th) {
                            MethodCollector.o(423);
                            throw th;
                        }
                    default:
                        i3 = Integer.MIN_VALUE;
                        break;
                }
            } else {
                i3 = mGlobalForceExpiredTime;
            }
        }
        AVMDLLog.d("AVMDLDNSParser", a.a("****get value:%d for key:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        MethodCollector.o(423);
        return i3;
    }

    public void doParseHosts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.d("AVMDLDNSParser", "hosts is null, not need do batch host parse");
            return;
        }
        int length = strArr.length;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (IPCache.getInstance().get(strArr[i2]) != null) {
                    AVMDLLog.d("AVMDLDNSParser", a.a("for host:%s has dns info not need do batch parse", new Object[]{strArr[i2]}));
                    strArr[i2] = null;
                    length--;
                } else {
                    this.mLock.lock();
                    try {
                        if (this.mProcessors.get(strArr[i2]) != null) {
                            AVMDLLog.d("AVMDLDNSParser", a.a("for host:%s has processor not need do batch parse", new Object[]{strArr[i2]}));
                            strArr[i2] = null;
                            length--;
                        }
                    } finally {
                        this.mLock.unlock();
                    }
                }
            }
        }
        if (length == 0) {
            AVMDLLog.d("AVMDLDNSParser", "has no hosts need do batch parse");
        } else {
            sendBatchParseMsg(strArr);
        }
    }

    public void addHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        addListenerInternal(str, aVMDLDNSParserListener);
    }

    public void removeHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        removeListenerInternal(str, aVMDLDNSParserListener);
    }

    public void postParseHostMsg(String str, int i2) {
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(i2, str, (String) null, 0, (String) null);
        Message message = new Message();
        message.what = 5;
        message.obj = aVMDLDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public void setBackUpIP(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0, (String) null));
        }
    }

    /* JADX INFO: finally extract failed */
    private void removeListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        if (!TextUtils.isEmpty(str) && aVMDLDNSParserListener != null) {
            AVMDLLog.d("AVMDLDNSParser", a.a("---remove listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.d("AVMDLDNSParser", a.a("get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor != null) {
                    AVMDLLog.d("AVMDLDNSParser", a.a("remove listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.remove(aVMDLDNSParserListener);
                    if (aVMDLHostProcessor.mListeners.size() == 0) {
                        AVMDLLog.d("AVMDLDNSParser", a.a("listeners empty for processors", new Object[0]));
                    }
                }
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", a.a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    private void sendPreParseMsg(String str, long j2) {
        if (TextUtils.isEmpty(str) || j2 <= 0) {
            AVMDLLog.d("AVMDLDNSParser", "host is null or delayTimeMs invalid,not support preparse");
        } else if (mGlobalEnableRefresh > 0) {
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0, (String) null);
            Message message = new Message();
            message.obj = aVMDLDNSInfo;
            message.what = 4;
            message.obj = aVMDLDNSInfo;
            long j3 = j2 + 3000;
            AVMDLLog.d("AVMDLDNSParser", a.a("send preparse for host:%s delayTime:%d", new Object[]{aVMDLDNSInfo.mHost, Long.valueOf(j3)}));
            this.mHandler.sendMessageDelayed(message, j3);
        }
    }

    public static void setIntValue(int i2, int i3) {
        MethodCollector.i(406);
        AVMDLLog.d("AVMDLDNSParser", a.a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        synchronized (AVMDLDNSParser.class) {
            if (i2 != 10) {
                switch (i2) {
                    case 0:
                        mGlobalMainType = i3;
                        break;
                    case 1:
                        mGlobalBackType = i3;
                        break;
                    case 2:
                        mGlobalDefaultExpiredTime = i3;
                        break;
                    case 3:
                        mGlobalBackUpDelayedTime = i3;
                        break;
                    case 4:
                        mGlobalEnableParallel = i3;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        mGlobalEnableBackUpIp = i3;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        mGlobalEnableRefresh = i3;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        try {
                            mGlobalEnableDNSLog = i3;
                            break;
                        } catch (Throwable th) {
                            MethodCollector.o(406);
                            throw th;
                        }
                }
            } else {
                mGlobalForceExpiredTime = i3;
            }
        }
        MethodCollector.o(406);
    }

    public static void setStringValue(int i2, String str) {
        MethodCollector.i(590);
        AVMDLLog.d("AVMDLDNSParser", a.a("****set value:%s for key:%d", new Object[]{str, Integer.valueOf(i2)}));
        synchronized (AVMDLDNSParser.class) {
            if (i2 != 8) {
                if (i2 == 9) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            mGlobalGoogleDNSParseHost = str;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(590);
                        throw th;
                    }
                }
            } else if (!TextUtils.isEmpty(str)) {
                mGlobalOwnDNSParseHost = str;
            }
        }
        MethodCollector.o(590);
    }

    public void proccessPreParseMsg(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        long j2;
        if (mGlobalEnableRefresh <= 0) {
            AVMDLLog.d("AVMDLDNSParser", "not support preparse");
        } else if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.d("AVMDLDNSParser", a.a("proc pre msg  fail, info or host is null", new Object[0]));
        } else {
            AVMDLLog.d("AVMDLDNSParser", a.a("----proc pre parse msg what:%d host:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mHost}));
            AVMDLDNSInfo aVMDLDNSInfo2 = IPCache.getInstance().get(aVMDLDNSInfo.mHost);
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[2];
            objArr[0] = aVMDLDNSInfo2;
            if (aVMDLDNSInfo2 == null) {
                j2 = -1;
            } else {
                j2 = aVMDLDNSInfo2.mExpiredTime;
            }
            objArr[1] = Long.valueOf(j2);
            AVMDLLog.d("AVMDLDNSParser", a.a("cache:%s expiredT:%d", objArr));
            if (aVMDLDNSInfo2 == null || aVMDLDNSInfo2.mExpiredTime < currentTimeMillis) {
                AVMDLLog.d("AVMDLDNSParser", "add host for preparse");
                addListenerInternal(aVMDLDNSInfo.mHost, null);
            }
            AVMDLLog.d("AVMDLDNSParser", "****proc pre parse msg what:%d host:%s");
        }
    }

    public void processBatchParseMsg(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHosts == null || aVMDLDNSInfo.mHosts.length == 0) {
            AVMDLLog.d("AVMDLDNSParser", a.a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", a.a("----proc batch parse msg what:%d", new Object[]{Integer.valueOf(i2)}));
        if (mGlobalEnableParallel > 0 || mGlobalMainType == 2) {
            try {
                new HTTPDNSHosts(aVMDLDNSInfo.mHosts, null, 2, this.mHandler).start();
            } catch (Exception e2) {
                AVMDLLog.d("AVMDLDNSParser", a.a("parse end create httpdnshosts fail".concat(String.valueOf(e2)), new Object[0]));
            }
        } else {
            new LocalDNSHosts(aVMDLDNSInfo.mHosts, this.mHandler).start();
            AVMDLLog.d("AVMDLDNSParser", a.a("****end proc batch parser msg", new Object[0]));
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.d("AVMDLDNSParser", a.a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", a.a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            if (aVMDLHostProcessor != null) {
                AVMDLLog.d("AVMDLDNSParser", a.a("----get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
                aVMDLHostProcessor.processMsg(i2, aVMDLDNSInfo);
            } else {
                AVMDLLog.d("AVMDLDNSParser", a.a("****get processor null for host:%s", new Object[]{aVMDLDNSInfo.mHost}));
            }
            this.mLock.unlock();
            AVMDLLog.d("AVMDLDNSParser", a.a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            AVMDLLog.d("AVMDLDNSParser", a.a("---add listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.d("AVMDLDNSParser", a.a("get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor == null) {
                    aVMDLHostProcessor = new AVMDLHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime, mGlobalEnableParallel);
                    AVMDLLog.d("AVMDLDNSParser", a.a("create processor:%s", new Object[]{aVMDLHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (aVMDLDNSParserListener != null && !aVMDLHostProcessor.mListeners.containsKey(aVMDLDNSParserListener)) {
                    AVMDLLog.d("AVMDLDNSParser", a.a("add listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.put(aVMDLDNSParserListener, 1);
                }
                this.mProcessors.put(str, aVMDLHostProcessor);
                if (z) {
                    AVMDLLog.d("AVMDLDNSParser", a.a("new processor implement parse", new Object[0]));
                    aVMDLHostProcessor.processMsg(5, new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0, (String) null));
                }
                this.mLock.unlock();
                AVMDLLog.d("AVMDLDNSParser", a.a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.d("AVMDLDNSParser", a.a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", a.a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.d("AVMDLDNSParser", a.a("get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
            if (aVMDLHostProcessor != null && aVMDLHostProcessor.isValidSourceId(aVMDLDNSInfo.mId)) {
                aVMDLHostProcessor.processResult(i2, aVMDLDNSInfo);
                if (aVMDLHostProcessor.isEnd()) {
                    AVMDLLog.d("AVMDLDNSParser", a.a("processor end, notify result", new Object[0]));
                    for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                        if (aVMDLDNSParserListener != null) {
                            AVMDLLog.d("AVMDLDNSParser", a.a("listener:%s oncompletion fail", new Object[]{aVMDLDNSParserListener}));
                            aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, null, 0, null, aVMDLDNSInfo.mType);
                        }
                    }
                    aVMDLHostProcessor.mListeners.clear();
                    this.mProcessors.remove(aVMDLDNSInfo.mHost);
                } else {
                    AVMDLLog.d("AVMDLDNSParser", a.a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            AVMDLLog.d("AVMDLDNSParser", a.a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.d("AVMDLDNSParser", a.a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.d("AVMDLDNSParser", a.a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.d("AVMDLDNSParser", a.a("get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
            if (!(aVMDLHostProcessor == null || aVMDLHostProcessor.mListeners == null)) {
                for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                    if (aVMDLDNSParserListener != null) {
                        AVMDLLog.d("AVMDLDNSParser", a.a("listener:%s oncompletion suc", new Object[]{aVMDLDNSParserListener}));
                        aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
                    }
                }
                aVMDLHostProcessor.mListeners.clear();
                this.mProcessors.remove(aVMDLDNSInfo.mHost);
                AVMDLLog.d("AVMDLDNSParser", a.a("remove all listeners and remove host", new Object[0]));
            }
            sendPreParseMsg(aVMDLDNSInfo.mHost, aVMDLDNSInfo.mExpiredTime - System.currentTimeMillis());
            reportLog(aVMDLDNSInfo);
            this.mLock.unlock();
            AVMDLLog.d("AVMDLDNSParser", a.a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public static void updateDNSInfo(String str, String str2, long j2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AVMDLLog.d("AVMDLDNSParser", "ip direct info invalid");
            return;
        }
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(10, str, str2, (j2 + ((long) mGlobalDefaultExpiredTime)) * 1000, (String) null);
        AVMDLLog.d("AVMDLDNSParser", "server iplist, host = " + str + " type = 10 iplist = " + str2);
        IPCache.getInstance().put(str, aVMDLDNSInfo);
    }
}
