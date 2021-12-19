package com.ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttuploader.net.TTUploadDNSParser;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

public class TTVideoUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int currentType;
    int headerIndex;
    private TTVideoUploaderAbstractListener mAbstractListener = null;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private String[] mHeaders;
    private Lock mHeadersLock = new ReentrantLock();
    private boolean mIsTestSpeed;
    private JSONObject mJsonInfo;
    private TTVideoUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _cancelUpload(long j2);

    private static native String _close(long j2, int i2);

    private final native long _create(int i2);

    private static native long _getLongValue(long j2, int i2);

    private static native String _getStringValue(long j2, int i2);

    private static native void _mergeUpload(long j2);

    private static native void _setContext(long j2, String str);

    private static native void _setInt64Value(long j2, int i2, long j3);

    private static native void _setIntValue(long j2, int i2, int i3);

    private static native void _setObject(long j2, int i2, Object obj);

    private static native void _setPoster(long j2, float f2);

    private static native void _setStringValue(long j2, int i2, String str);

    private static native void _start(long j2);

    private static native void _startSpeedTest(long j2, int i2, int i3, int i4);

    private static native String _stop(long j2);

    private static native void _stopSpeedTest(long j2);

    public static int com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static class LogInfo {
        private int code;
        private String info;

        static {
            Covode.recordClassIndex(101409);
        }

        public int getCode() {
            return this.code;
        }

        public String getInfo() {
            return this.info;
        }

        public LogInfo(int i2, String str) {
            this.code = i2;
            this.info = str;
        }
    }

    public static boolean isError() {
        return IsErrored;
    }

    public void close() {
        close(0);
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(101408);
        if (!TTUploadUtil.initInternal()) {
        }
    }

    public void allowMergeUpload() {
        MethodCollector.i(5256);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5256);
            return;
        }
        _mergeUpload(j2);
        MethodCollector.o(5256);
    }

    public void cancelUpload() {
        MethodCollector.i(5604);
        this.mWriteLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.mWriteLock.unlock();
            MethodCollector.o(5604);
            return;
        }
        _cancelUpload(j2);
        this.mWriteLock.unlock();
        MethodCollector.o(5604);
    }

    public void start() {
        MethodCollector.i(4888);
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.o(4888);
        }
    }

    public void stopSpeedTest() {
        MethodCollector.i(5760);
        this.mReadLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.mReadLock.unlock();
            MethodCollector.o(5760);
            return;
        }
        _stopSpeedTest(j2);
        this.mReadLock.unlock();
        MethodCollector.o(5760);
    }

    public void stop() {
        MethodCollector.i(4988);
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                addLogToManager(_stop(this.mHandle));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(4988);
        }
    }

    public TTVideoUploader() {
        MethodCollector.i(3450);
        try {
            this.mHandle = _create(0);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            getDNSIP();
            this.mState = 0;
            this.mIsTestSpeed = false;
            this.mHeaders = new String[20];
            int i2 = 0;
            do {
                this.mHeaders[i2] = null;
                i2++;
            } while (i2 < 20);
            this.headerIndex = 0;
            String uuid = UUID.randomUUID().toString();
            if (uuid != null && uuid.length() > 0) {
                _setStringValue(this.mHandle, 90, uuid);
            }
            String uuid2 = UUID.randomUUID().toString();
            if (uuid2 != null && uuid2.length() > 0) {
                _setStringValue(this.mHandle, 91, uuid2);
            }
            MethodCollector.o(3450);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.o(3450);
        throw exc;
    }

    public void setAbstractListener(TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener) {
        this.mAbstractListener = tTVideoUploaderAbstractListener;
    }

    public void setCurrentType(int i2) {
        this.currentType = i2;
    }

    public void setExternLogInfo(JSONObject jSONObject) {
        this.mJsonInfo = jSONObject;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTVideoUploaderListener tTVideoUploaderListener) {
        this.mListener = tTVideoUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    public void setVideoUploadDomain(String str) {
        setStringValue(3, str);
    }

    public String getStringFromExtern(int i2) {
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener != null) {
            return tTVideoUploaderListener.getStringFromExtern(i2);
        }
        return null;
    }

    public void setTestSpeed(boolean z) {
        if (this.mHandle != 0) {
            this.mIsTestSpeed = z;
        }
    }

    public int switchNetType(int i2) {
        TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener = this.mAbstractListener;
        if (tTVideoUploaderAbstractListener == null || !tTVideoUploaderAbstractListener.switchNetType(i2)) {
            return 0;
        }
        return 1;
    }

    private void setDeviceID(long j2) {
        MethodCollector.i(5075);
        long j3 = this.mHandle;
        if (j3 == 0 || j2 <= 0) {
            MethodCollector.o(5075);
            return;
        }
        _setInt64Value(j3, 66, j2);
        MethodCollector.o(5075);
    }

    public void setAliveMaxFailTime(int i2) {
        MethodCollector.i(4581);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4581);
            return;
        }
        _setIntValue(j2, 22, i2);
        MethodCollector.o(4581);
    }

    public void setAuthorization(String str) {
        MethodCollector.i(3497);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3497);
            return;
        }
        _setStringValue(j2, 15, str);
        MethodCollector.o(3497);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = TTUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setContext(String str) {
        MethodCollector.i(5826);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(5826);
            return;
        }
        _setContext(j2, str);
        MethodCollector.o(5826);
    }

    public void setEnableExternDNS(int i2) {
        MethodCollector.i(4367);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4367);
            return;
        }
        _setIntValue(j2, 21, i2);
        MethodCollector.o(4367);
    }

    public void setEnableExternNet(int i2) {
        MethodCollector.i(4789);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4789);
            return;
        }
        _setIntValue(j2, 26, i2);
        MethodCollector.o(4789);
    }

    public void setEnableFiletryHttps(int i2) {
        MethodCollector.i(4439);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4439);
            return;
        }
        _setIntValue(j2, 25, i2);
        MethodCollector.o(4439);
    }

    public void setEnableHttps(int i2) {
        MethodCollector.i(4347);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4347);
            return;
        }
        _setIntValue(j2, 19, i2);
        MethodCollector.o(4347);
    }

    public void setEnableKeepAlive(int i2) {
        MethodCollector.i(4364);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4364);
            return;
        }
        _setIntValue(j2, 20, i2);
        MethodCollector.o(4364);
    }

    public void setEnableLinkTurbo(int i2) {
        MethodCollector.i(5824);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5824);
            return;
        }
        _setIntValue(j2, 82, i2);
        MethodCollector.o(5824);
    }

    public void setEnableMutiTask(int i2) {
        MethodCollector.i(4794);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4794);
            return;
        }
        _setIntValue(j2, 29, i2);
        MethodCollector.o(4794);
    }

    public void setEnablePostMethod(int i2) {
        MethodCollector.i(4369);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4369);
            return;
        }
        _setIntValue(j2, 23, i2);
        MethodCollector.o(4369);
    }

    public void setEnableQuic(int i2) {
        MethodCollector.i(4790);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4790);
            return;
        }
        _setIntValue(j2, 28, i2);
        MethodCollector.o(4790);
    }

    public void setEnableServerHost(int i2) {
        MethodCollector.i(4165);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4165);
            return;
        }
        _setIntValue(j2, 17, i2);
        MethodCollector.o(4165);
    }

    public void setEnableUpHost(int i2) {
        MethodCollector.i(4161);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(4161);
            return;
        }
        _setIntValue(j2, 18, i2);
        MethodCollector.o(4161);
    }

    public void setEvStateEnable(boolean z) {
        MethodCollector.i(5493);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5493);
            return;
        }
        _setIntValue(j2, 79, z ? 1 : 0);
        MethodCollector.o(5493);
    }

    public void setExternFileReader(TTExternFileReader tTExternFileReader) {
        MethodCollector.i(4775);
        long j2 = this.mHandle;
        if (j2 == 0 || tTExternFileReader == null) {
            MethodCollector.o(4775);
            return;
        }
        _setObject(j2, 200, tTExternFileReader);
        MethodCollector.o(4775);
    }

    public void setExternMinSIze(int i2) {
        MethodCollector.i(5490);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(5490);
            return;
        }
        _setIntValue(j2, 77, i2);
        MethodCollector.o(5490);
    }

    public void setExternNetInfo(String str) {
        MethodCollector.i(3993);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3993);
            return;
        }
        _setStringValue(j2, 41, str);
        MethodCollector.o(3993);
    }

    public void setFileRetryCount(int i2) {
        MethodCollector.i(4771);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4771);
            return;
        }
        _setIntValue(j2, 6, i2);
        MethodCollector.o(4771);
    }

    public void setMaxFailTime(int i2) {
        MethodCollector.i(4773);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4773);
            return;
        }
        _setIntValue(j2, 13, i2);
        MethodCollector.o(4773);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader) {
        MethodCollector.i(4782);
        long j2 = this.mHandle;
        if (j2 == 0 || tTMediaDataReader == null) {
            MethodCollector.o(4782);
            return;
        }
        _setObject(j2, 201, tTMediaDataReader);
        MethodCollector.o(4782);
    }

    public void setNewHttpProxyLoader(int i2) {
        MethodCollector.i(3991);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(3991);
            return;
        }
        _setIntValue(j2, 40, i2);
        MethodCollector.o(3991);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(mapToString)) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPoster(float f2) {
        MethodCollector.i(4697);
        long j2 = this.mHandle;
        if (j2 == 0 || f2 < 0.0f) {
            MethodCollector.o(4697);
            return;
        }
        _setPoster(j2, f2);
        MethodCollector.o(4697);
    }

    public void setPreUploadEncryptionMode(int i2) {
        MethodCollector.i(5257);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5257);
            return;
        }
        _setIntValue(j2, 74, i2);
        MethodCollector.o(5257);
    }

    public void setResponeTimeOut(int i2) {
        MethodCollector.i(5389);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(5389);
            return;
        }
        _setIntValue(j2, 76, i2);
        MethodCollector.o(5389);
    }

    public void setScenesTag(String str) {
        MethodCollector.i(5830);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(5830);
            return;
        }
        _setStringValue(j2, 85, str);
        MethodCollector.o(5830);
    }

    public void setServerParameter(String str) {
        MethodCollector.i(3757);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3757);
            return;
        }
        _setStringValue(j2, 16, str);
        MethodCollector.o(3757);
    }

    public void setSingleHostTotalTimeout(int i2) {
        MethodCollector.i(5879);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(5879);
            return;
        }
        _setIntValue(j2, 89, i2);
        MethodCollector.o(5879);
    }

    public void setSliceReTryCount(int i2) {
        MethodCollector.i(4769);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4769);
            return;
        }
        _setIntValue(j2, 5, i2);
        MethodCollector.o(4769);
    }

    public void setSliceSize(int i2) {
        MethodCollector.i(4705);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4705);
            return;
        }
        _setIntValue(j2, 8, i2);
        MethodCollector.o(4705);
    }

    public void setSliceTimeout(int i2) {
        MethodCollector.i(4703);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4703);
            return;
        }
        _setIntValue(j2, 7, i2);
        MethodCollector.o(4703);
    }

    public void setSocketNum(int i2) {
        MethodCollector.i(4767);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4767);
            return;
        }
        _setIntValue(j2, 9, i2);
        MethodCollector.o(4767);
    }

    public void setTTExternLoader(TTExternNetLoader tTExternNetLoader) {
        MethodCollector.i(4774);
        long j2 = this.mHandle;
        if (j2 == 0 || tTExternNetLoader == null) {
            MethodCollector.o(4774);
            return;
        }
        _setObject(j2, 27, tTExternNetLoader);
        MethodCollector.o(4774);
    }

    public void setTcpOpenTimeOutMilliSec(int i2) {
        MethodCollector.i(4630);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4630);
            return;
        }
        _setIntValue(j2, 24, i2);
        MethodCollector.o(4630);
    }

    public void setTranTimeOutUnit(int i2) {
        MethodCollector.i(4880);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(4880);
            return;
        }
        _setIntValue(j2, 64, i2);
        MethodCollector.o(4880);
    }

    public void setUserRefrence(String str) {
        MethodCollector.i(4797);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(4797);
            return;
        }
        _setStringValue(j2, 62, str);
        MethodCollector.o(4797);
    }

    public void setVideoObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
    }

    private void setTraceId(String str) {
        MethodCollector.i(5085);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(5085);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.o(5085);
    }

    public boolean handleMessage(Message message) {
        long j2;
        int i2 = message.what;
        if (message.obj instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) message.obj;
            onLogInfoSync(i2, logInfo.getCode(), logInfo.getInfo());
            return true;
        } else if (this.mListener == null) {
            return true;
        } else {
            TTVideoInfo tTVideoInfo = (TTVideoInfo) message.obj;
            if (tTVideoInfo != null) {
                j2 = tTVideoInfo.mProgress;
            } else {
                j2 = 0;
            }
            this.mListener.onNotify(i2, j2, tTVideoInfo);
            return true;
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle != 0 && treeMap != null && (mapToJSON = TTUploadUtil.mapToJSON(treeMap)) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("custom_config", mapToJSON);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    setStringValue(63, jSONObject2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setEnableBigFile(int i2) {
        MethodCollector.i(4356);
        if (this.mHandle == 0 || i2 < 0) {
            MethodCollector.o(4356);
            return;
        }
        com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "TTVideoUploader-222222!");
        _setIntValue(this.mHandle, 83, i2);
        MethodCollector.o(4356);
    }

    public void setEnableLogCallBack(boolean z) {
        MethodCollector.i(5254);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5254);
        } else if (z) {
            _setIntValue(j2, 78, 1);
            MethodCollector.o(5254);
        } else {
            _setIntValue(j2, 78, 0);
            MethodCollector.o(5254);
        }
    }

    public void setOpenBoe(boolean z) {
        MethodCollector.i(5087);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5087);
        } else if (z) {
            _setIntValue(j2, 67, 1);
            MethodCollector.o(5087);
        } else {
            _setIntValue(j2, 67, 0);
            MethodCollector.o(5087);
        }
    }

    public void setOpenResume(boolean z) {
        MethodCollector.i(4499);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4499);
        } else if (z) {
            _setIntValue(j2, 70, 1);
            MethodCollector.o(4499);
        } else {
            _setIntValue(j2, 70, 0);
            MethodCollector.o(4499);
        }
    }

    public void setPrivateVideo(boolean z) {
        MethodCollector.i(5828);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5828);
        } else if (z) {
            _setIntValue(j2, 88, 1);
            MethodCollector.o(5828);
        } else {
            _setIntValue(j2, 88, 0);
            MethodCollector.o(5828);
        }
    }

    public void close(int i2) {
        MethodCollector.i(4996);
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                String _close = _close(this.mHandle, i2);
                if (i2 != 0) {
                    addLogToManager(_close);
                }
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(4996);
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (map.get(69) != null && (map.get(69) instanceof String)) {
            String str = (String) map.get(69);
            if (str != null && !str.isEmpty()) {
                setTraceId(str);
            }
        } else if (map.get(66) != null && (map.get(66) instanceof Long)) {
            long longValue = ((Long) map.get(66)).longValue();
            if (longValue > 0) {
                setDeviceID(longValue);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
            JSONObject jSONObject2 = this.mJsonInfo;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, this.mJsonInfo.get(next));
                }
            }
            String str2 = "";
            try {
                this.mHeadersLock.lock();
                for (int i2 = 0; i2 < 20; i2++) {
                    if (!TextUtils.isEmpty(this.mHeaders[i2])) {
                        str2 = str2 + "#" + this.mHeaders[i2];
                    }
                }
                this.mHeadersLock.unlock();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("cdn_headers", str2);
                }
            } catch (Throwable th) {
                this.mHeadersLock.unlock();
                throw th;
            }
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (!this.mIsTestSpeed) {
            UploadEventManager.instance.addEvent(jSONObject);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TTVideoUploader(int r9) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTVideoUploader.<init>(int):void");
    }

    public int checkNet(int i2, int i3) {
        com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "checketNet");
        TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
        if (tTVideoUploaderListener == null) {
            return 1;
        }
        return tTVideoUploaderListener.videoUploadCheckNetState(i2, i3);
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(3495);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3495);
            return;
        }
        _setStringValue(j2, i2, str);
        MethodCollector.o(3495);
    }

    public void setNetworkRoutMode(int i2, int i3) {
        MethodCollector.i(5822);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(5822);
            return;
        }
        _setIntValue(j2, 86, i2);
        _setIntValue(this.mHandle, 87, i3);
        com_ss_ttuploader_TTVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_v("ttmn", "weight".concat(String.valueOf(i3)));
        MethodCollector.o(5822);
    }

    public void onLogInfo(int i2, int i3, String str) {
        if (this.mState == 1) {
            LogInfo logInfo = new LogInfo(i3, str);
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i2;
            obtainMessage.obj = logInfo;
            obtainMessage.sendToTarget();
        }
    }

    public void startSpeedTest(int i2, int i3, int i4) {
        MethodCollector.i(5608);
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _startSpeedTest(this.mHandle, i2, i3, i4);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.o(5608);
        }
    }

    public void onLogInfoSync(int i2, int i3, String str) {
        JSONObject jSONObject;
        JSONException e2;
        if (i2 == 102) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.mHeadersLock.lock();
                    if (this.headerIndex >= 20) {
                        this.headerIndex = 0;
                    }
                    String[] strArr = this.mHeaders;
                    int i4 = this.headerIndex;
                    strArr[i4] = str;
                    this.headerIndex = i4 + 1;
                    return;
                } finally {
                    this.mHeadersLock.unlock();
                }
            }
        } else if (i2 == 104) {
            if (this.mAbstractListener != null) {
                Map<String, String> hashMap = new HashMap<>(20);
                try {
                    jSONObject = new JSONObject(str);
                    try {
                        JSONObject jSONObject2 = this.mJsonInfo;
                        if (jSONObject2 != null) {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                jSONObject.put(next, this.mJsonInfo.get(next));
                            }
                        }
                        hashMap = TTUploadUtil.jsonToHashMap(jSONObject);
                    } catch (JSONException e3) {
                        e2 = e3;
                        e2.printStackTrace();
                        this.mAbstractListener.onEventLog(jSONObject);
                        this.mAbstractListener.onEventLogMap(hashMap);
                        return;
                    }
                } catch (JSONException e4) {
                    e2 = e4;
                    jSONObject = null;
                    e2.printStackTrace();
                    this.mAbstractListener.onEventLog(jSONObject);
                    this.mAbstractListener.onEventLogMap(hashMap);
                    return;
                }
                this.mAbstractListener.onEventLog(jSONObject);
                this.mAbstractListener.onEventLogMap(hashMap);
                return;
            }
            return;
        } else if (i2 == 105) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener != null) {
                tTVideoUploaderAbstractListener.onSpeedVidContext(0, i3, str);
                return;
            }
            return;
        } else if (i2 == 106) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener2 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener2 != null) {
                tTVideoUploaderAbstractListener2.onSpeedVidContext(1, i3, str);
                return;
            }
            return;
        } else if (i2 == 110) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener3 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener3 != null) {
                tTVideoUploaderAbstractListener3.onSpeedVidContext(2, i3, str);
                return;
            }
            return;
        } else if (i2 == 113) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener4 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener4 != null) {
                tTVideoUploaderAbstractListener4.onSpeedVidContext(3, i3, str);
                return;
            }
            return;
        } else if (i2 == 111) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener5 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener5 != null) {
                tTVideoUploaderAbstractListener5.onSpeedVidContext(4, i3, str);
                return;
            }
            return;
        } else if (i2 == 112) {
            TTVideoUploaderAbstractListener tTVideoUploaderAbstractListener6 = this.mAbstractListener;
            if (tTVideoUploaderAbstractListener6 != null) {
                tTVideoUploaderAbstractListener6.onSpeedVidContext(5, i3, str);
                return;
            }
            return;
        } else if (i2 == 103) {
            long time = new Date().getTime() / 1000;
            TTVideoUploaderListener tTVideoUploaderListener = this.mListener;
            if (tTVideoUploaderListener != null) {
                tTVideoUploaderListener.onUploadVideoStage(i3, time);
            }
        }
        TTVideoUploaderListener tTVideoUploaderListener2 = this.mListener;
        if (tTVideoUploaderListener2 != null) {
            tTVideoUploaderListener2.onLog(i2, i3, str);
        }
    }

    public void onNotify(int i2, long j2, int i3) {
        MethodCollector.i(3471);
        if (this.mState != 1) {
            MethodCollector.o(3471);
            return;
        }
        TTVideoInfo tTVideoInfo = null;
        if (i2 == 0) {
            this.mEndTime = System.currentTimeMillis();
            String _getStringValue = _getStringValue(this.mHandle, 10);
            String _getStringValue2 = _getStringValue(this.mHandle, 11);
            String _getStringValue3 = _getStringValue(this.mHandle, 12);
            String _getStringValue4 = _getStringValue(this.mHandle, 300);
            String _getStringValue5 = _getStringValue(this.mHandle, 51);
            String _getStringValue6 = _getStringValue(this.mHandle, 50);
            String _getStringValue7 = _getStringValue(this.mHandle, 52);
            String _getStringValue8 = _getStringValue(this.mHandle, 53);
            String _getStringValue9 = _getStringValue(this.mHandle, 57);
            String _getStringValue10 = _getStringValue(this.mHandle, 58);
            String _getStringValue11 = _getStringValue(this.mHandle, 59);
            String _getStringValue12 = _getStringValue(this.mHandle, 68);
            if (this.currentType == 1) {
                tTVideoInfo = new TTVideoInfo(_getStringValue5, _getStringValue6, _getStringValue7, _getStringValue8, j2, _getStringValue9, _getStringValue10, _getStringValue11);
            } else {
                tTVideoInfo = new TTVideoInfo(_getStringValue, _getStringValue2, _getStringValue3, j2, _getStringValue4, _getStringValue12);
            }
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            tTVideoInfo.mLog = addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i2 == 1) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j2, null, null);
        } else if (i2 == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            String _getStringValue13 = _getStringValue(this.mHandle, 100);
            tTVideoInfo = new TTVideoInfo(null, null, null, j2, _getStringValue(this.mHandle, 14), null);
            addLogToManager(_getStringValue13);
            this.mState = 2;
        } else if (i2 == 3) {
            addLogToManager(_getStringValue(this.mHandle, 100));
            tTVideoInfo = new TTVideoInfo(null, null, null, j2, _getStringValue(this.mHandle, 14), null);
        } else if (i2 == 105) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j2, _getStringValue(this.mHandle, 14), null);
        } else if (i2 == 106) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j2, _getStringValue(this.mHandle, 14), null);
            this.mState = 2;
        } else if (i2 == 108) {
            tTVideoInfo = new TTVideoInfo(null, null, null, j2, _getStringValue(this.mHandle, 14), null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i2;
        obtainMessage.obj = tTVideoInfo;
        obtainMessage.sendToTarget();
        MethodCollector.o(3471);
    }
}
