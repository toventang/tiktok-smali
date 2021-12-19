package com.ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BDNetworkRouter implements Handler.Callback {
    private static boolean IsErrored = true;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private BDNetworkRouterListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _close(long j2);

    private final native long _create(int i2);

    private static native void _setContext(long j2, String str);

    private static native void _setIntValue(long j2, int i2, int i3);

    private static native void _setStringValue(long j2, int i2, String str);

    private static native void _start(long j2);

    private static native void _stop(long j2);

    public void onLogInfo(int i2, int i3, String str) {
    }

    static {
        Covode.recordClassIndex(100649);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    public void close() {
        MethodCollector.i(3165);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _close(j2);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(3165);
        }
    }

    public void stop() {
        MethodCollector.i(2857);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _stop(j2);
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(2857);
        }
    }

    public void start() {
        MethodCollector.i(1265);
        this.mReadLock.lock();
        if (BDUploadUtil.sdkConfigDir != null && BDUploadUtil.sdkConfigDir.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.o(1265);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDNetworkRouterListener bDNetworkRouterListener) {
        this.mListener = bDNetworkRouterListener;
    }

    public void setRegionName(String str) {
        setStringValue(47, str);
    }

    public void setSpaceName(String str) {
        setStringValue(45, str);
    }

    public void setTopAccessKey(String str) {
        setStringValue(42, str);
    }

    public void setTopSecretKey(String str) {
        setStringValue(43, str);
    }

    public void setTopSessionToken(String str) {
        setStringValue(44, str);
    }

    public void setUploadDomain(String str) {
        setStringValue(46, str);
    }

    public boolean handleMessage(Message message) {
        if (this.mListener == null || !(message.obj instanceof BDNetworkRouteInfo)) {
            return true;
        }
        BDNetworkRouteInfo bDNetworkRouteInfo = (BDNetworkRouteInfo) message.obj;
        this.mListener.onRouteContext(bDNetworkRouteInfo.mContextType, bDNetworkRouteInfo.mSpeed, bDNetworkRouteInfo.mContext);
        return true;
    }

    public void setAuthType(int i2) {
        MethodCollector.i(3312);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(3312);
            return;
        }
        _setIntValue(j2, 416, i2);
        MethodCollector.o(3312);
    }

    public void setDataTransportProtocol(int i2) {
        MethodCollector.i(12);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(12);
            return;
        }
        _setIntValue(j2, 411, i2);
        MethodCollector.o(12);
    }

    public void setEnableExternDNS(int i2) {
        MethodCollector.i(395);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(395);
            return;
        }
        _setIntValue(j2, 21, i2);
        MethodCollector.o(395);
    }

    public void setEnableHttps(int i2) {
        MethodCollector.i(343);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(343);
            return;
        }
        _setIntValue(j2, 19, i2);
        MethodCollector.o(343);
    }

    public void setFileRetryCount(int i2) {
        MethodCollector.i(18);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(18);
            return;
        }
        _setIntValue(j2, 6, i2);
        MethodCollector.o(18);
    }

    public void setMaxFailTime(int i2) {
        MethodCollector.i(31);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(31);
            return;
        }
        _setIntValue(j2, 13, i2);
        MethodCollector.o(31);
    }

    public void setQueryAuth(String str) {
        MethodCollector.i(3361);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3361);
            return;
        }
        _setStringValue(j2, 15, str);
        MethodCollector.o(3361);
    }

    public void setRWTimeout(int i2) {
        MethodCollector.i(323);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(323);
            return;
        }
        _setIntValue(j2, 7, i2);
        MethodCollector.o(323);
    }

    public void setRouteWeight(int i2) {
        MethodCollector.i(1070);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(1070);
            return;
        }
        _setIntValue(j2, 408, i2);
        MethodCollector.o(1070);
    }

    public void setServerParameter(String str) {
        MethodCollector.i(932);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(932);
            return;
        }
        _setStringValue(j2, 16, str);
        MethodCollector.o(932);
    }

    public void setTcpOpenTimeOutMilliSec(int i2) {
        MethodCollector.i(33);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(33);
            return;
        }
        _setIntValue(j2, 24, i2);
        MethodCollector.o(33);
    }

    public void setTranTimeOutUnit(int i2) {
        MethodCollector.i(23);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(23);
            return;
        }
        _setIntValue(j2, 64, i2);
        MethodCollector.o(23);
    }

    private void setContextDir(String str) {
        MethodCollector.i(3666);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(3666);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.o(3666);
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.i(3608);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(3608);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.o(3608);
    }

    public void setTraceId(String str) {
        MethodCollector.i(986);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(986);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.o(986);
    }

    public BDNetworkRouter(int i2) {
        MethodCollector.i(4565);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mListener = null;
        if (IsErrored) {
            BDUploadUtil.initInternal();
        }
        if (Looper.myLooper() != null) {
            this.mHandler = new Handler(this);
        } else {
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        try {
            this.mHandle = _create(i2);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            MethodCollector.o(4565);
            return;
        }
        Exception exc = new Exception("create native network router fail");
        MethodCollector.o(4565);
        throw exc;
    }

    public int checkNet(int i2, int i3) {
        BDNetworkRouterListener bDNetworkRouterListener = this.mListener;
        if (bDNetworkRouterListener != null) {
            return bDNetworkRouterListener.networkRouteCheckNetState(i2, i3);
        }
        return 1;
    }

    private void setStringValue(int i2, String str) {
        MethodCollector.i(1118);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(1118);
            return;
        }
        _setStringValue(j2, i2, str);
        MethodCollector.o(1118);
    }

    public void setNetworkType(int i2, int i3) {
        MethodCollector.i(583);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(583);
            return;
        }
        _setIntValue(j2, i2, i3);
        MethodCollector.o(583);
    }

    public void onNotify(int i2, long j2, int i3, String str) {
        BDNetworkRouteInfo bDNetworkRouteInfo = new BDNetworkRouteInfo(str, i2, (int) j2);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i2;
            obtainMessage.obj = bDNetworkRouteInfo;
            obtainMessage.sendToTarget();
        }
    }
}
