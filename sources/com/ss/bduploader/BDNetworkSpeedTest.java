package com.ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

public class BDNetworkSpeedTest implements Handler.Callback {
    private static boolean IsErrored = true;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private BDNetworkSpeedTestListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _close(long j2);

    private final native long _create();

    private static native void _setIntValue(long j2, int i2, int i3);

    private static native void _setStringValue(long j2, int i2, String str);

    private static native void _start(long j2);

    private static native void _stop(long j2);

    public void onLogInfo(int i2, int i3, String str) {
    }

    static {
        Covode.recordClassIndex(100651);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    public void close() {
        MethodCollector.i(13);
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
            MethodCollector.o(13);
        }
    }

    public void stop() {
        MethodCollector.i(5096);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _stop(j2);
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(5096);
        }
    }

    public BDNetworkSpeedTest() {
        MethodCollector.i(3990);
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
            this.mHandle = _create();
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            MethodCollector.o(3990);
            return;
        }
        Exception exc = new Exception("create native speed tester fail");
        MethodCollector.o(3990);
        throw exc;
    }

    public void start() {
        MethodCollector.i(5026);
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
            MethodCollector.o(5026);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDNetworkSpeedTestListener bDNetworkSpeedTestListener) {
        this.mListener = bDNetworkSpeedTestListener;
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
        if (this.mListener == null || !(message.obj instanceof BDNetworkSpeedTestInfo)) {
            return true;
        }
        BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = (BDNetworkSpeedTestInfo) message.obj;
        this.mListener.onSpeedTestContext(bDNetworkSpeedTestInfo.mContextType, bDNetworkSpeedTestInfo.mSpeed, bDNetworkSpeedTestInfo.mContext);
        return true;
    }

    public void setAuthType(int i2) {
        MethodCollector.i(921);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(921);
            return;
        }
        _setIntValue(j2, 416, i2);
        MethodCollector.o(921);
    }

    public void setDataTransportProtocol(int i2) {
        MethodCollector.i(26);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(26);
            return;
        }
        _setIntValue(j2, 411, i2);
        MethodCollector.o(26);
    }

    public void setEnableExternDNS(int i2) {
        MethodCollector.i(340);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(340);
            return;
        }
        _setIntValue(j2, 21, i2);
        MethodCollector.o(340);
    }

    public void setEnableHttps(int i2) {
        MethodCollector.i(321);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(321);
            return;
        }
        _setIntValue(j2, 19, i2);
        MethodCollector.o(321);
    }

    public void setFileRetryCount(int i2) {
        MethodCollector.i(17);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(17);
            return;
        }
        _setIntValue(j2, 6, i2);
        MethodCollector.o(17);
    }

    public void setMaxFailTime(int i2) {
        MethodCollector.i(29);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(29);
            return;
        }
        _setIntValue(j2, 13, i2);
        MethodCollector.o(29);
    }

    public void setQueryAuth(String str) {
        MethodCollector.i(942);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(942);
            return;
        }
        _setStringValue(j2, 15, str);
        MethodCollector.o(942);
    }

    public void setRWTimeout(int i2) {
        MethodCollector.i(34);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(34);
            return;
        }
        _setIntValue(j2, 7, i2);
        MethodCollector.o(34);
    }

    public void setServerParameter(String str) {
        MethodCollector.i(862);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(862);
            return;
        }
        _setStringValue(j2, 16, str);
        MethodCollector.o(862);
    }

    public void setTcpOpenTimeOutMilliSec(int i2) {
        MethodCollector.i(32);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(32);
            return;
        }
        _setIntValue(j2, 24, i2);
        MethodCollector.o(32);
    }

    public void setTranTimeOutUnit(int i2) {
        MethodCollector.i(21);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(21);
            return;
        }
        _setIntValue(j2, 64, i2);
        MethodCollector.o(21);
    }

    private void setContextDir(String str) {
        MethodCollector.i(1079);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(1079);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.o(1079);
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.i(1017);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(1017);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.o(1017);
    }

    public void setTraceId(String str) {
        MethodCollector.i(4739);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(4739);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.o(4739);
    }

    public int checkNet(int i2, int i3) {
        BDNetworkSpeedTestListener bDNetworkSpeedTestListener = this.mListener;
        if (bDNetworkSpeedTestListener != null) {
            return bDNetworkSpeedTestListener.speedTestCheckNetState(i2, i3);
        }
        return 1;
    }

    public void setNetworkType(int i2, int i3) {
        MethodCollector.i(365);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(365);
            return;
        }
        _setIntValue(j2, i2, i3);
        MethodCollector.o(365);
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(4795);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(4795);
            return;
        }
        _setStringValue(j2, i2, str);
        MethodCollector.o(4795);
    }

    public void onNotify(int i2, long j2, int i3, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str).getJSONObject("upload_log");
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
        BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = new BDNetworkSpeedTestInfo(str, i2, (int) j2);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i2;
            obtainMessage.obj = bDNetworkSpeedTestInfo;
            obtainMessage.sendToTarget();
        }
    }
}
