package com.ss.ttuploader.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttuploader.TTUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TTUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static TTUploadDNSParser mInstance;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, TTUploadHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    static {
        Covode.recordClassIndex(101430);
    }

    public TTUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread("TTUploadDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.ss.ttuploader.net.TTUploadDNSParser.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101431);
            }

            public void handleMessage(Message message) {
                TTUploadDNSInfo tTUploadDNSInfo;
                if (message.obj != null) {
                    tTUploadDNSInfo = (TTUploadDNSInfo) message.obj;
                } else {
                    tTUploadDNSInfo = null;
                }
                TTUploadLog.d("TTUploadDNSParser", a.a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), tTUploadDNSInfo}));
                int i2 = message.what;
                if (i2 == 1) {
                    TTUploadDNSParser.this.processParseMsg(message.what, tTUploadDNSInfo);
                } else if (i2 == 2) {
                    TTUploadDNSParser.this.proccessFailMsg(message.what, tTUploadDNSInfo);
                } else if (i2 == 3) {
                    TTUploadDNSParser.this.proccessSucMsg(message.what, tTUploadDNSInfo);
                }
                TTUploadLog.d("TTUploadDNSParser", a.a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), tTUploadDNSInfo}));
            }
        };
    }

    public static TTUploadDNSParser getInstance() {
        MethodCollector.i(2137);
        if (mInstance == null) {
            synchronized (TTUploadDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new TTUploadDNSParser();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2137);
                    throw th;
                }
            }
        }
        TTUploadDNSParser tTUploadDNSParser = mInstance;
        MethodCollector.o(2137);
        return tTUploadDNSParser;
    }

    public void addHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        addListenerInternal(str, tTUploadDNSParserListener);
    }

    public void removeHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        removeListenerInternal(str, tTUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i2) {
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(i2, str, null, 0, null);
        Message message = new Message();
        message.what = 0;
        message.obj = tTUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setIntValue(int i2, int i3) {
        TTUploadLog.d("TTUploadDNSParser", a.a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        if (i2 == 0) {
            mGlobalMainType = i3;
        } else if (i2 == 1) {
            mGlobalBackType = i3;
        } else if (i2 == 2) {
            mGlobalDefaultExpiredTime = i3;
        } else if (i2 == 3) {
            mGlobalBackUpDelayedTime = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    private void removeListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        if (!TextUtils.isEmpty(str) && tTUploadDNSParserListener != null) {
            TTUploadLog.d("TTUploadDNSParser", a.a("---remove listener:%s for host:%s", new Object[]{tTUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(str);
                TTUploadLog.d("TTUploadDNSParser", a.a("get processor:%s", new Object[]{tTUploadHostProcessor}));
                if (tTUploadHostProcessor != null) {
                    TTUploadLog.d("TTUploadDNSParser", a.a("remove listener", new Object[0]));
                    tTUploadHostProcessor.mListeners.remove(tTUploadDNSParserListener);
                    if (tTUploadHostProcessor.mListeners.size() == 0) {
                        TTUploadLog.d("TTUploadDNSParser", a.a("listeners empty remove host from processors", new Object[0]));
                        this.mProcessors.remove(str);
                    }
                }
                this.mLock.unlock();
                TTUploadLog.d("TTUploadDNSParser", a.a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i2, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.d("TTUploadDNSParser", a.a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.d("TTUploadDNSParser", a.a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i2), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            if (tTUploadHostProcessor != null) {
                TTUploadLog.d("TTUploadDNSParser", a.a("----get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
                tTUploadHostProcessor.processMsg(i2, tTUploadDNSInfo);
            } else {
                TTUploadLog.d("TTUploadDNSParser", a.a("****get processor null for host:%s", new Object[]{tTUploadDNSInfo.mHost}));
            }
            this.mLock.unlock();
            TTUploadLog.d("TTUploadDNSParser", a.a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            TTUploadLog.d("TTUploadDNSParser", a.a("---add listener:%s for host:%s", new Object[]{tTUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(str);
                TTUploadLog.d("TTUploadDNSParser", a.a("get processor:%s", new Object[]{tTUploadHostProcessor}));
                if (tTUploadHostProcessor == null) {
                    tTUploadHostProcessor = new TTUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                    TTUploadLog.d("TTUploadDNSParser", a.a("create processor:%s", new Object[]{tTUploadHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (tTUploadDNSParserListener != null && !tTUploadHostProcessor.mListeners.containsKey(tTUploadDNSParserListener)) {
                    TTUploadLog.d("TTUploadDNSParser", a.a("add listener", new Object[0]));
                    tTUploadHostProcessor.mListeners.put(tTUploadDNSParserListener, 1);
                }
                this.mProcessors.put(str, tTUploadHostProcessor);
                if (z) {
                    TTUploadLog.d("TTUploadDNSParser", a.a("new processor implement parse", new Object[0]));
                    tTUploadHostProcessor.processMsg(0, new TTUploadDNSInfo(mGlobalMainType, str, null, 0, null));
                }
                this.mLock.unlock();
                TTUploadLog.d("TTUploadDNSParser", a.a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i2, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.d("TTUploadDNSParser", a.a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.d("TTUploadDNSParser", a.a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i2), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.d("TTUploadDNSParser", a.a("get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
            if (tTUploadHostProcessor != null && tTUploadHostProcessor.isValidSourceId(tTUploadDNSInfo.mId)) {
                tTUploadHostProcessor.processResult(i2, tTUploadDNSInfo);
                if (tTUploadHostProcessor.isEnd()) {
                    TTUploadLog.d("TTUploadDNSParser", a.a("processor end, notify result", new Object[0]));
                    for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                        if (tTUploadDNSParserListener != null) {
                            TTUploadLog.d("TTUploadDNSParser", a.a("listener:%s oncompletion fail", new Object[]{tTUploadDNSParserListener}));
                            tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, null, 0, null);
                        }
                    }
                    tTUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(tTUploadDNSInfo.mHost);
                } else {
                    TTUploadLog.d("TTUploadDNSParser", a.a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            TTUploadLog.d("TTUploadDNSParser", a.a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i2, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.d("TTUploadDNSParser", a.a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.d("TTUploadDNSParser", a.a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i2), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.d("TTUploadDNSParser", a.a("get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
            if (!(tTUploadHostProcessor == null || tTUploadHostProcessor.mListeners == null)) {
                for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                    if (tTUploadDNSParserListener != null) {
                        TTUploadLog.d("TTUploadDNSParser", a.a("listener:%s oncompletion suc", new Object[]{tTUploadDNSParserListener}));
                        tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, tTUploadDNSInfo.mIpList, tTUploadDNSInfo.mExpiredTime, null);
                    }
                }
                tTUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(tTUploadDNSInfo.mHost);
                TTUploadLog.d("TTUploadDNSParser", a.a("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            TTUploadLog.d("TTUploadDNSParser", a.a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }
}
