package com.ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.net.BDUploadDNSParser;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

public class BDVideoUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int headerIndex;
    private BDVideoUploaderAbstractListener mAbstractListener = null;
    private long mEndTime;
    private boolean mFinish = false;
    private long mHandle;
    private Handler mHandler;
    private String[] mHeaders;
    private Lock mHeadersLock = new ReentrantLock();
    private JSONObject mJsonInfo;
    private BDVideoUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _cancelUpload(long j2);

    private static native void _close(long j2);

    private final native long _create();

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

    private static native void _stop(long j2);

    public static int com_ss_bduploader_BDVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static class LogInfo {
        private int code;
        private String info;

        static {
            Covode.recordClassIndex(100666);
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

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(100665);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    private void parseLog() {
        MethodCollector.i(875);
        if (this.mFinish) {
            MethodCollector.o(875);
            return;
        }
        this.mFinish = true;
        addLogToManager(_getStringValue(this.mHandle, 100));
        MethodCollector.o(875);
    }

    public void allowMergeUpload() {
        MethodCollector.i(1174);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(1174);
            return;
        }
        _mergeUpload(j2);
        MethodCollector.o(1174);
    }

    public void cancelUpload() {
        MethodCollector.i(2977);
        this.mWriteLock.lock();
        long j2 = this.mHandle;
        if (j2 == 0) {
            this.mWriteLock.unlock();
            MethodCollector.o(2977);
            return;
        }
        _cancelUpload(j2);
        this.mWriteLock.unlock();
        MethodCollector.o(2977);
    }

    public void close() {
        MethodCollector.i(846);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _stop(j2);
                parseLog();
                _close(this.mHandle);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(846);
        }
    }

    public void stop() {
        MethodCollector.i(798);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _stop(j2);
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                parseLog();
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(798);
        }
    }

    public void start() {
        MethodCollector.i(756);
        this.mReadLock.lock();
        if (BDUploadUtil.sdkConfigDir != null && BDUploadUtil.sdkConfigDir.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
            setDiskResumeDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mFinish = false;
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.o(756);
        }
    }

    public BDVideoUploader() {
        MethodCollector.i(5021);
        if (IsErrored) {
            BDUploadUtil.initInternal();
        }
        try {
            this.mHandle = _create();
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
            this.mState = 0;
            getDNSIP();
            this.mHeaders = new String[20];
            int i2 = 0;
            do {
                this.mHeaders[i2] = null;
                i2++;
            } while (i2 < 20);
            this.headerIndex = 0;
            String uuid = UUID.randomUUID().toString();
            if (uuid != null && uuid.length() > 0) {
                _setStringValue(this.mHandle, 86, uuid);
            }
            String uuid2 = UUID.randomUUID().toString();
            if (uuid2 != null && uuid2.length() > 0) {
                _setStringValue(this.mHandle, 87, uuid2);
            }
            setTraceId(UUID.randomUUID().toString());
            MethodCollector.o(5021);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.o(5021);
        throw exc;
    }

    public void setAbstractListener(BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener) {
        this.mAbstractListener = bDVideoUploaderAbstractListener;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDVideoUploaderListener bDVideoUploaderListener) {
        this.mListener = bDVideoUploaderListener;
    }

    public void setPathName(String str) {
        setStringValue(0, str);
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

    public String getStringFromExtern(int i2) {
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener != null) {
            return bDVideoUploaderListener.getStringFromExtern(i2);
        }
        return null;
    }

    public void setAliveMaxFailTime(int i2) {
        MethodCollector.i(3644);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(3644);
            return;
        }
        _setIntValue(j2, 22, i2);
        MethodCollector.o(3644);
    }

    public void setAuthType(int i2) {
        MethodCollector.i(4800);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4800);
            return;
        }
        _setIntValue(j2, 416, i2);
        MethodCollector.o(4800);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setContext(String str) {
        MethodCollector.i(3003);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3003);
            return;
        }
        _setContext(j2, str);
        MethodCollector.o(3003);
    }

    public void setDataTransportProtocol(int i2) {
        MethodCollector.i(4168);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4168);
            return;
        }
        _setIntValue(j2, 411, i2);
        MethodCollector.o(4168);
    }

    public void setDiskResumeOption(int i2) {
        MethodCollector.i(4975);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4975);
            return;
        }
        _setIntValue(j2, 302, i2);
        MethodCollector.o(4975);
    }

    public void setEnableBigFile(int i2) {
        MethodCollector.i(3337);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(3337);
            return;
        }
        _setIntValue(j2, 83, i2);
        MethodCollector.o(3337);
    }

    public void setEnableExternDNS(int i2) {
        MethodCollector.i(3611);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(3611);
            return;
        }
        _setIntValue(j2, 21, i2);
        MethodCollector.o(3611);
    }

    public void setEnableFiletryHttps(int i2) {
        MethodCollector.i(3635);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(3635);
            return;
        }
        _setIntValue(j2, 25, i2);
        MethodCollector.o(3635);
    }

    public void setEnableHttps(int i2) {
        MethodCollector.i(3303);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(3303);
            return;
        }
        _setIntValue(j2, 19, i2);
        MethodCollector.o(3303);
    }

    public void setEnableKeepAlive(int i2) {
        MethodCollector.i(3588);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(3588);
            return;
        }
        _setIntValue(j2, 20, i2);
        MethodCollector.o(3588);
    }

    public void setExternFileReader(BDExternalFileReader bDExternalFileReader) {
        MethodCollector.i(644);
        long j2 = this.mHandle;
        if (j2 == 0 || bDExternalFileReader == null) {
            MethodCollector.o(644);
            return;
        }
        _setObject(j2, 200, bDExternalFileReader);
        MethodCollector.o(644);
    }

    public void setExternMinSIze(int i2) {
        MethodCollector.i(4004);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(4004);
            return;
        }
        _setIntValue(j2, 77, i2);
        MethodCollector.o(4004);
    }

    public void setExternalReaderMode(int i2) {
        MethodCollector.i(4317);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4317);
            return;
        }
        _setIntValue(j2, 412, i2);
        MethodCollector.o(4317);
    }

    public void setFileRetryCount(int i2) {
        MethodCollector.i(9);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(9);
            return;
        }
        _setIntValue(j2, 6, i2);
        MethodCollector.o(9);
    }

    public void setMaxFailTime(int i2) {
        MethodCollector.i(637);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(637);
            return;
        }
        _setIntValue(j2, 13, i2);
        MethodCollector.o(637);
    }

    public void setMaxUploadSpeedThresh(int i2) {
        MethodCollector.i(4467);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4467);
            return;
        }
        _setIntValue(j2, 413, i2);
        MethodCollector.o(4467);
    }

    public void setObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = BDUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(mapToString)) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPoster(float f2) {
        MethodCollector.i(3705);
        long j2 = this.mHandle;
        if (j2 == 0 || f2 < 0.0f) {
            MethodCollector.o(3705);
            return;
        }
        _setPoster(j2, f2);
        MethodCollector.o(3705);
    }

    public void setPreUploadEncryptionMode(int i2) {
        MethodCollector.i(22);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(22);
            return;
        }
        _setIntValue(j2, 74, i2);
        MethodCollector.o(22);
    }

    public void setPrivateVideo(boolean z) {
        MethodCollector.i(4521);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(4521);
            return;
        }
        _setIntValue(j2, 414, z ? 1 : 0);
        MethodCollector.o(4521);
    }

    public void setProcessActionType(int i2) {
        MethodCollector.i(3249);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(3249);
            return;
        }
        _setIntValue(j2, 65, i2);
        MethodCollector.o(3249);
    }

    public void setQueryAuth(String str) {
        MethodCollector.i(3164);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3164);
            return;
        }
        _setStringValue(j2, 15, str);
        MethodCollector.o(3164);
    }

    public void setRWTimeout(int i2) {
        MethodCollector.i(4049);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4049);
            return;
        }
        _setIntValue(j2, 7, i2);
        MethodCollector.o(4049);
    }

    public void setResponseTimeOut(int i2) {
        MethodCollector.i(3989);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(3989);
            return;
        }
        _setIntValue(j2, 76, i2);
        MethodCollector.o(3989);
    }

    public void setScenesTag(String str) {
        MethodCollector.i(732);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(732);
            return;
        }
        _setStringValue(j2, 85, str);
        MethodCollector.o(732);
    }

    public void setServerParameter(String str) {
        MethodCollector.i(3182);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(3182);
            return;
        }
        _setStringValue(j2, 16, str);
        MethodCollector.o(3182);
    }

    public void setSliceReTryCount(int i2) {
        MethodCollector.i(4404);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4404);
            return;
        }
        _setIntValue(j2, 5, i2);
        MethodCollector.o(4404);
    }

    public void setSliceSize(int i2) {
        MethodCollector.i(4118);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4118);
            return;
        }
        _setIntValue(j2, 8, i2);
        MethodCollector.o(4118);
    }

    public void setSocketNum(int i2) {
        MethodCollector.i(4350);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(4350);
            return;
        }
        _setIntValue(j2, 9, i2);
        MethodCollector.o(4350);
    }

    public void setSpeedTestThresh(int i2) {
        MethodCollector.i(3427);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(3427);
            return;
        }
        _setIntValue(j2, 406, i2);
        MethodCollector.o(3427);
    }

    public void setSpeedTestValue(int i2) {
        MethodCollector.i(3418);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(3418);
            return;
        }
        _setIntValue(j2, 405, i2);
        MethodCollector.o(3418);
    }

    public void setTcpOpenTimeOutMilliSec(int i2) {
        MethodCollector.i(3675);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(3675);
            return;
        }
        _setIntValue(j2, 24, i2);
        MethodCollector.o(3675);
    }

    public void setTranTimeOutUnit(int i2) {
        MethodCollector.i(716);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(716);
            return;
        }
        _setIntValue(j2, 64, i2);
        MethodCollector.o(716);
    }

    public void setUploadDomain(String str) {
        if (this.mHandle != 0 && str != null) {
            setStringValue(46, str);
        }
    }

    public void setUserReference(String str) {
        MethodCollector.i(5073);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(5073);
            return;
        }
        _setStringValue(j2, 62, str);
        MethodCollector.o(5073);
    }

    private void setContextDir(String str) {
        MethodCollector.i(5328);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(5328);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.o(5328);
    }

    private void setDiskResumeDir(String str) {
        MethodCollector.i(4627);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(4627);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.DiskResumeConfigDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 303, str2);
        MethodCollector.o(4627);
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
            BDVideoInfo bDVideoInfo = (BDVideoInfo) message.obj;
            if (bDVideoInfo != null) {
                j2 = bDVideoInfo.mProgress;
            } else {
                j2 = 0;
            }
            this.mListener.onNotify(i2, j2, bDVideoInfo);
            return true;
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject mapToJSON;
        if (this.mHandle != 0 && treeMap != null && (mapToJSON = BDUploadUtil.mapToJSON(treeMap)) != null) {
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

    public void setDiskResumeUniqueKey(String str) {
        MethodCollector.i(4681);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(4681);
            return;
        }
        _setStringValue(this.mHandle, 301, str);
        MethodCollector.o(4681);
    }

    public void setEnableLogCallBack(boolean z) {
        MethodCollector.i(1161);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(1161);
        } else if (z) {
            _setIntValue(j2, 78, 1);
            MethodCollector.o(1161);
        } else {
            _setIntValue(j2, 78, 0);
            MethodCollector.o(1161);
        }
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader) {
        MethodCollector.i(648);
        long j2 = this.mHandle;
        if (j2 == 0 || bDMediaDataReader == null) {
            MethodCollector.o(648);
            return;
        }
        _setIntValue(j2, 81, 2);
        _setObject(this.mHandle, 201, bDMediaDataReader);
        MethodCollector.o(648);
    }

    public void setOpenBoe(boolean z) {
        MethodCollector.i(1128);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(1128);
        } else if (z) {
            _setIntValue(j2, 67, 1);
            MethodCollector.o(1128);
        } else {
            _setIntValue(j2, 67, 0);
            MethodCollector.o(1128);
        }
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.i(5172);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(5172);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.o(5172);
    }

    public void setTraceId(String str) {
        MethodCollector.i(1113);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(1113);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.o(1113);
    }

    /* JADX INFO: finally extract failed */
    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
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
        UploadEventManager.instance.addEvent(jSONObject);
        return jSONObject;
    }

    public int checkNet(int i2, int i3) {
        com_ss_bduploader_BDVideoUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "checketNet");
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener == null) {
            return 1;
        }
        return bDVideoUploaderListener.videoUploadCheckNetState(i2, i3);
    }

    public void setNetworkType(int i2, int i3) {
        MethodCollector.i(3406);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(3406);
            return;
        }
        _setIntValue(j2, i2, i3);
        MethodCollector.o(3406);
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(2907);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(2907);
            return;
        }
        _setStringValue(j2, i2, str);
        MethodCollector.o(2907);
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

    public void onLogInfoSync(int i2, int i3, String str) {
        JSONObject jSONObject;
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
                new HashMap(20);
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    JSONObject jSONObject3 = this.mJsonInfo;
                    if (jSONObject3 != null) {
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, this.mJsonInfo.get(next));
                        }
                    }
                    BDUploadUtil.jsonToHashMap(jSONObject2);
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                return;
            }
        } else if (i2 == 103) {
            long time = new Date().getTime() / 1000;
            BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
            if (bDVideoUploaderListener != null) {
                bDVideoUploaderListener.onUploadVideoStage(i3, time);
            }
        } else if (i2 == 107) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = null;
            }
            UploadEventManager.instance.addEvent(jSONObject);
            BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener = this.mAbstractListener;
            if (bDVideoUploaderAbstractListener != null) {
                bDVideoUploaderAbstractListener.onEventLog();
            }
        }
        BDVideoUploaderListener bDVideoUploaderListener2 = this.mListener;
        if (bDVideoUploaderListener2 != null) {
            bDVideoUploaderListener2.onLog(i2, i3, str);
        }
    }

    public void onNotify(int i2, long j2, int i3, String str) {
        MethodCollector.i(419);
        if (this.mState != 1) {
            MethodCollector.o(419);
            return;
        }
        BDVideoInfo bDVideoInfo = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    String dnsip = getDNSIP();
                    if (dnsip != null && !dnsip.isEmpty()) {
                        setStringValue(75, dnsip);
                    }
                    bDVideoInfo = new BDVideoInfo(null, null, j2, _getStringValue(this.mHandle, 415), _getStringValue(this.mHandle, 14), null, null);
                    parseLog();
                    this.mState = 2;
                } else if (i2 == 3) {
                    parseLog();
                    bDVideoInfo = new BDVideoInfo(null, null, j2, null, _getStringValue(this.mHandle, 14), null, null);
                } else if (i2 == 108) {
                    bDVideoInfo = new BDVideoInfo(null, null, j2, null, _getStringValue(this.mHandle, 14), null, null);
                } else if (i2 != 120) {
                    if (i2 == 121) {
                        String dnsip2 = getDNSIP();
                        if (dnsip2 != null && !dnsip2.isEmpty()) {
                            setStringValue(75, dnsip2);
                        }
                        bDVideoInfo = new BDVideoInfo(null, null, j2, _getStringValue(this.mHandle, 415), _getStringValue(this.mHandle, 14), null, null);
                        parseLog();
                        this.mState = 2;
                    }
                }
            }
            bDVideoInfo = new BDVideoInfo(null, null, j2, null, null, null, null);
        } else {
            this.mEndTime = System.currentTimeMillis();
            bDVideoInfo = new BDVideoInfo(_getStringValue(this.mHandle, 10), _getStringValue(this.mHandle, 12), j2, null, _getStringValue(this.mHandle, 300), _getStringValue(this.mHandle, 68), _getStringValue(this.mHandle, 407));
            String dnsip3 = getDNSIP();
            if (dnsip3 != null && !dnsip3.isEmpty()) {
                setStringValue(75, dnsip3);
            }
            parseLog();
            this.mState = 3;
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i2;
        obtainMessage.obj = bDVideoInfo;
        obtainMessage.sendToTarget();
        MethodCollector.o(419);
    }
}
