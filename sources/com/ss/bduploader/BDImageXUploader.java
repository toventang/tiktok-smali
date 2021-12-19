package com.ss.bduploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.net.BDUploadDNSParser;
import java.io.File;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

public class BDImageXUploader implements Handler.Callback {
    private static boolean IsErred = true;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private int mImageNum;
    private BDImageXUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mStartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _close(long j2);

    private final native long _create(int i2);

    private static native long _getLongValue(long j2, int i2);

    private static native String _getStrByKeyAndIndex(long j2, int i2, int i3);

    private static native String _getStringValue(long j2, int i2);

    private static native void _setFileName(long j2, int i2, String[] strArr);

    private static native void _setFilePaths(long j2, int i2, String[] strArr);

    private static native void _setInt64Value(long j2, int i2, long j3);

    private static native void _setIntValue(long j2, int i2, int i3);

    private static native void _setObject(long j2, int i2, Object obj);

    private static native void _setStringValue(long j2, int i2, String str);

    private static native void _start(long j2);

    private static native void _stop(long j2);

    public static int com_ss_bduploader_BDImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static class LogInfo {
        private int code;
        private String info;

        static {
            Covode.recordClassIndex(100643);
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
        return IsErred;
    }

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(100642);
        if (!BDUploadUtil.initInternal()) {
        }
    }

    public void close() {
        MethodCollector.i(4121);
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
            MethodCollector.o(4121);
        }
    }

    public BDImageXUploader() {
        MethodCollector.i(4792);
        if (IsErred) {
            BDUploadUtil.initInternal();
        }
        try {
            this.mHandle = _create(1);
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
            MethodCollector.o(4792);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.o(4792);
        throw exc;
    }

    public void start() {
        MethodCollector.i(3638);
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
            MethodCollector.o(3638);
        }
    }

    public void stop() {
        MethodCollector.i(4001);
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                com_ss_bduploader_BDImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "before java stop");
                _stop(this.mHandle);
                addLogToManager(_getStringValue(this.mHandle, 100));
                this.mState = 4;
                com_ss_bduploader_BDImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "after java stop");
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(4001);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDImageXUploaderListener bDImageXUploaderListener) {
        this.mListener = bDImageXUploaderListener;
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setServiceID(String str) {
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

    public void SetExtraParams(JSONObject jSONObject) {
        if (this.mHandle != 0 && jSONObject != null) {
            setStringValue(61, jSONObject.toString());
        }
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setDataTransportProtocol(int i2) {
        MethodCollector.i(946);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(946);
            return;
        }
        _setIntValue(j2, 411, i2);
        MethodCollector.o(946);
    }

    public void setEnableHttps(int i2) {
        MethodCollector.i(2863);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(2863);
            return;
        }
        _setIntValue(j2, 19, i2);
        MethodCollector.o(2863);
    }

    public void setFileRetryCount(int i2) {
        MethodCollector.i(618);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(618);
            return;
        }
        _setIntValue(j2, 6, i2);
        MethodCollector.o(618);
    }

    public void setMaxConcurrentFileNum(int i2) {
        MethodCollector.i(1259);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(1259);
            return;
        }
        _setIntValue(j2, 400, i2);
        MethodCollector.o(1259);
    }

    public void setMaxFailTime(int i2) {
        MethodCollector.i(3557);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(3557);
            return;
        }
        _setIntValue(j2, 13, i2);
        MethodCollector.o(3557);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(55, mapToString);
        }
    }

    public void setPreUpload(boolean z) {
        MethodCollector.i(792);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(792);
            return;
        }
        _setIntValue(j2, 80, z ? 1 : 0);
        MethodCollector.o(792);
    }

    public void setProcessActionType(int i2) {
        MethodCollector.i(610);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(610);
            return;
        }
        _setIntValue(j2, 65, i2);
        MethodCollector.o(610);
    }

    public void setRWTimeout(int i2) {
        MethodCollector.i(1142);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(1142);
            return;
        }
        _setIntValue(j2, 7, i2);
        MethodCollector.o(1142);
    }

    public void setScenesTag(String str) {
        MethodCollector.i(843);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(843);
            return;
        }
        _setStringValue(j2, 85, str);
        MethodCollector.o(843);
    }

    public void setServerParameter(String str) {
        MethodCollector.i(1117);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(1117);
            return;
        }
        _setStringValue(j2, 16, str);
        MethodCollector.o(1117);
    }

    public void setSliceRetryCount(int i2) {
        MethodCollector.i(1274);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(1274);
            return;
        }
        _setIntValue(j2, 5, i2);
        MethodCollector.o(1274);
    }

    public void setSliceSize(int i2) {
        MethodCollector.i(1158);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(1158);
            return;
        }
        _setIntValue(j2, 8, i2);
        MethodCollector.o(1158);
    }

    public void setSliceThreshold(int i2) {
        MethodCollector.i(856);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(856);
            return;
        }
        _setIntValue(j2, 402, i2);
        MethodCollector.o(856);
    }

    public void setSocketNum(int i2) {
        MethodCollector.i(1178);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(1178);
            return;
        }
        _setIntValue(j2, 9, i2);
        MethodCollector.o(1178);
    }

    public void setTranTimeOutUnit(int i2) {
        MethodCollector.i(3577);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(3577);
            return;
        }
        _setIntValue(j2, 64, i2);
        MethodCollector.o(3577);
    }

    public void setUploadDomain(String str) {
        if (this.mHandle != 0 && str != null) {
            setStringValue(46, str);
        }
    }

    private void setContextDir(String str) {
        MethodCollector.i(1031);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(1031);
            return;
        }
        String str2 = str + File.separator + BDUploadUtil.SpeedTestcontextDir;
        BDUploadUtil.createDir(str2);
        _setStringValue(this.mHandle, 418, str2);
        MethodCollector.o(1031);
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
            BDImageXInfo bDImageXInfo = (BDImageXInfo) message.obj;
            if (bDImageXInfo != null) {
                j2 = bDImageXInfo.mProgress;
            } else {
                j2 = 0;
            }
            this.mListener.onNotify(i2, j2, bDImageXInfo);
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

    public void setOpenBoe(boolean z) {
        MethodCollector.i(737);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(737);
        } else if (z) {
            _setIntValue(j2, 67, 1);
            MethodCollector.o(737);
        } else {
            _setIntValue(j2, 67, 0);
            MethodCollector.o(737);
        }
    }

    public void setSDKConfigDir(String str) {
        MethodCollector.i(979);
        if (this.mHandle == 0 || str == null) {
            MethodCollector.o(979);
            return;
        }
        BDUploadUtil.createDir(str);
        _setStringValue(this.mHandle, 417, str);
        setContextDir(str);
        MethodCollector.o(979);
    }

    public void setTraceId(String str) {
        MethodCollector.i(702);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(702);
            return;
        }
        _setStringValue(this.mHandle, 69, str);
        MethodCollector.o(702);
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null || uuid.length() <= 0) {
            uuid = "invalid_uuid";
        }
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            jSONObject.put("uuid", uuid);
            jSONObject.remove("event");
            jSONObject.put("event", "bd_image_upload_all");
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("image_array");
                if (jSONArray != null) {
                    jSONObject.remove("image_array");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.remove("event");
                        jSONObject2.put("event", "bd_image_upload_single");
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject3.get(next));
                        }
                        jSONObject2.put("uuid", uuid);
                        UploadEventManager.instance.addEvent(jSONObject2);
                    }
                }
            } catch (Exception unused) {
                com_ss_bduploader_BDImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "get image_array failed");
            }
        } catch (Exception unused2) {
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
    }

    public int checkNet(int i2, int i3) {
        BDImageXUploaderListener bDImageXUploaderListener = this.mListener;
        if (bDImageXUploaderListener != null) {
            return bDImageXUploaderListener.imageXUploadCheckNetState(i2, i3);
        }
        return 1;
    }

    public void setFileName(int i2, String[] strArr) {
        MethodCollector.i(820);
        long j2 = this.mHandle;
        if (j2 == 0 || strArr == null || i2 <= 0) {
            MethodCollector.o(820);
            return;
        }
        _setFileName(j2, i2, strArr);
        MethodCollector.o(820);
    }

    public void setNetworkType(int i2, int i3) {
        MethodCollector.i(900);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(900);
            return;
        }
        _setIntValue(j2, i2, i3);
        MethodCollector.o(900);
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(1075);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(1075);
            return;
        }
        _setStringValue(j2, i2, str);
        MethodCollector.o(1075);
    }

    public void setFilePath(int i2, String[] strArr) {
        MethodCollector.i(908);
        long j2 = this.mHandle;
        if (j2 == 0 || strArr == null || i2 <= 0) {
            MethodCollector.o(908);
            return;
        }
        this.mImageNum = i2;
        _setFilePaths(j2, i2, strArr);
        _setIntValue(this.mHandle, 81, 0);
        MethodCollector.o(908);
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i2) {
        MethodCollector.i(755);
        long j2 = this.mHandle;
        if (j2 == 0 || bDMediaDataReader == null || i2 <= 0) {
            MethodCollector.o(755);
            return;
        }
        _setIntValue(j2, 71, i2);
        _setIntValue(this.mHandle, 81, 2);
        _setObject(this.mHandle, 201, bDMediaDataReader);
        MethodCollector.o(755);
    }

    public void onLogInfoSync(int i2, int i3, String str) {
        BDImageXUploaderListener bDImageXUploaderListener = this.mListener;
        if (bDImageXUploaderListener != null) {
            bDImageXUploaderListener.onLog(i2, i3, str);
        }
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

    private void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i2, int i3) {
        MethodCollector.i(767);
        if (this.mHandle == 0 || bDMediaDataReader == null || i2 <= 0) {
            MethodCollector.o(767);
            return;
        }
        setMediaDataReader(bDMediaDataReader, i2);
        _setIntValue(this.mHandle, 81, i3);
        MethodCollector.o(767);
    }

    public void onNotify(int i2, long j2, int i3, String str) {
        MethodCollector.i(30);
        if (this.mState != 1) {
            MethodCollector.o(30);
            return;
        }
        BDImageXInfo bDImageXInfo = null;
        int i4 = (int) j2;
        if (i2 == 0) {
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i2 == 1) {
            bDImageXInfo = new BDImageXInfo(null, (long) i3, i4, null, null);
        } else if (i2 == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            addLogToManager(_getStringValue(this.mHandle, 100));
            this.mState = 2;
        } else if (i2 == 6) {
            this.mEndTime = System.currentTimeMillis();
            bDImageXInfo = new BDImageXInfo(_getStrByKeyAndIndex(this.mHandle, 409, i4), 0, i4, _getStrByKeyAndIndex(this.mHandle, 410, i4), _getStrByKeyAndIndex(this.mHandle, 407, i4));
        } else if (i2 == 7) {
            bDImageXInfo = new BDImageXInfo(null, (long) i3, i4, null, null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i2;
        obtainMessage.obj = bDImageXInfo;
        obtainMessage.sendToTarget();
        MethodCollector.o(30);
    }
}
