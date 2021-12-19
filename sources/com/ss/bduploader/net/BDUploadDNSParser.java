package com.ss.bduploader.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.BDUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BDUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static BDUploadDNSParser mInstance;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, BDUploadHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    static {
        Covode.recordClassIndex(100679);
    }

    public BDUploadDNSParser() {
        HandlerThread handlerThread = new HandlerThread("BDUploadDNSParser");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.ss.bduploader.net.BDUploadDNSParser.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100680);
            }

            public void handleMessage(Message message) {
                BDUploadDNSInfo bDUploadDNSInfo;
                if (message.obj != null) {
                    bDUploadDNSInfo = (BDUploadDNSInfo) message.obj;
                } else {
                    bDUploadDNSInfo = null;
                }
                BDUploadLog.d("BDUploadDNSParser", a.a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
                int i2 = message.what;
                if (i2 == 1) {
                    BDUploadDNSParser.this.processParseMsg(message.what, bDUploadDNSInfo);
                } else if (i2 == 2) {
                    BDUploadDNSParser.this.proccessFailMsg(message.what, bDUploadDNSInfo);
                } else if (i2 == 3) {
                    BDUploadDNSParser.this.proccessSucMsg(message.what, bDUploadDNSInfo);
                }
                BDUploadLog.d("BDUploadDNSParser", a.a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), bDUploadDNSInfo}));
            }
        };
    }

    public static BDUploadDNSParser getInstance() {
        MethodCollector.i(228);
        if (mInstance == null) {
            synchronized (BDUploadDNSParser.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new BDUploadDNSParser();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(228);
                    throw th;
                }
            }
        }
        BDUploadDNSParser bDUploadDNSParser = mInstance;
        MethodCollector.o(228);
        return bDUploadDNSParser;
    }

    public void addHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        addListenerInternal(str, bDUploadDNSParserListener);
    }

    public void removeHost(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        removeListenerInternal(str, bDUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i2) {
        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(i2, str, null, 0, null);
        Message message = new Message();
        message.what = 0;
        message.obj = bDUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setIntValue(int i2, int i3) {
        BDUploadLog.d("BDUploadDNSParser", a.a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
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
    private void removeListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        if (!TextUtils.isEmpty(str) && bDUploadDNSParserListener != null) {
            BDUploadLog.d("BDUploadDNSParser", a.a("---remove listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
                BDUploadLog.d("BDUploadDNSParser", a.a("get processor:%s", new Object[]{bDUploadHostProcessor}));
                if (bDUploadHostProcessor != null) {
                    BDUploadLog.d("BDUploadDNSParser", a.a("remove listener", new Object[0]));
                    bDUploadHostProcessor.mListeners.remove(bDUploadDNSParserListener);
                    if (bDUploadHostProcessor.mListeners.size() == 0) {
                        BDUploadLog.d("BDUploadDNSParser", a.a("listeners empty remove host from processors", new Object[0]));
                        this.mProcessors.remove(str);
                    }
                }
                this.mLock.unlock();
                BDUploadLog.d("BDUploadDNSParser", a.a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i2, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.d("BDUploadDNSParser", a.a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", a.a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            if (bDUploadHostProcessor != null) {
                BDUploadLog.d("BDUploadDNSParser", a.a("----get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
                bDUploadHostProcessor.processMsg(i2, bDUploadDNSInfo);
            } else {
                BDUploadLog.d("BDUploadDNSParser", a.a("****get processor null for host:%s", new Object[]{bDUploadDNSInfo.mHost}));
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", a.a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, BDUploadDNSParserListener bDUploadDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            BDUploadLog.d("BDUploadDNSParser", a.a("---add listener:%s for host:%s", new Object[]{bDUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(str);
                BDUploadLog.d("BDUploadDNSParser", a.a("get processor:%s", new Object[]{bDUploadHostProcessor}));
                if (bDUploadHostProcessor == null) {
                    bDUploadHostProcessor = new BDUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                    BDUploadLog.d("BDUploadDNSParser", a.a("create processor:%s", new Object[]{bDUploadHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (bDUploadDNSParserListener != null && !bDUploadHostProcessor.mListeners.containsKey(bDUploadDNSParserListener)) {
                    BDUploadLog.d("BDUploadDNSParser", a.a("add listener", new Object[0]));
                    bDUploadHostProcessor.mListeners.put(bDUploadDNSParserListener, 1);
                }
                this.mProcessors.put(str, bDUploadHostProcessor);
                if (z) {
                    BDUploadLog.d("BDUploadDNSParser", a.a("new processor implement parse", new Object[0]));
                    bDUploadHostProcessor.processMsg(0, new BDUploadDNSInfo(mGlobalMainType, str, null, 0, null));
                }
                this.mLock.unlock();
                BDUploadLog.d("BDUploadDNSParser", a.a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i2, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.d("BDUploadDNSParser", a.a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", a.a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            BDUploadLog.d("BDUploadDNSParser", a.a("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
            if (bDUploadHostProcessor != null && bDUploadHostProcessor.isValidSourceId(bDUploadDNSInfo.mId)) {
                bDUploadHostProcessor.processResult(i2, bDUploadDNSInfo);
                if (bDUploadHostProcessor.isEnd()) {
                    BDUploadLog.d("BDUploadDNSParser", a.a("processor end, notify result", new Object[0]));
                    for (BDUploadDNSParserListener bDUploadDNSParserListener : bDUploadHostProcessor.mListeners.keySet()) {
                        if (bDUploadDNSParserListener != null) {
                            BDUploadLog.d("BDUploadDNSParser", a.a("listener:%s oncompletion fail", new Object[]{bDUploadDNSParserListener}));
                            bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, null, 0, null);
                        }
                    }
                    bDUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(bDUploadDNSInfo.mHost);
                } else {
                    BDUploadLog.d("BDUploadDNSParser", a.a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", a.a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i2, BDUploadDNSInfo bDUploadDNSInfo) {
        if (bDUploadDNSInfo == null || bDUploadDNSInfo.mHost == null) {
            BDUploadLog.d("BDUploadDNSParser", a.a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        BDUploadLog.d("BDUploadDNSParser", a.a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            BDUploadHostProcessor bDUploadHostProcessor = this.mProcessors.get(bDUploadDNSInfo.mHost);
            BDUploadLog.d("BDUploadDNSParser", a.a("get processor:%s host:%s", new Object[]{bDUploadHostProcessor, bDUploadDNSInfo.mHost}));
            if (!(bDUploadHostProcessor == null || bDUploadHostProcessor.mListeners == null)) {
                for (BDUploadDNSParserListener bDUploadDNSParserListener : bDUploadHostProcessor.mListeners.keySet()) {
                    if (bDUploadDNSParserListener != null) {
                        BDUploadLog.d("BDUploadDNSParser", a.a("listener:%s oncompletion suc", new Object[]{bDUploadDNSParserListener}));
                        bDUploadDNSParserListener.onCompletion(0, bDUploadDNSInfo.mHost, bDUploadDNSInfo.mIpList, bDUploadDNSInfo.mExpiredTime, null);
                    }
                }
                bDUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(bDUploadDNSInfo.mHost);
                BDUploadLog.d("BDUploadDNSParser", a.a("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            BDUploadLog.d("BDUploadDNSParser", a.a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }
}
