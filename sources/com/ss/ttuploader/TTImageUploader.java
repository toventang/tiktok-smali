package com.ss.ttuploader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttuploader.net.TTUploadDNSParser;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

public class TTImageUploader implements Handler.Callback {
    private static boolean IsErrored = true;
    int currentType;
    private TTImageUploaderAbstractListener mAbstractListener = null;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private int mImageNum;
    private TTImageUploaderListener mListener = null;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _allowUpload(long j2);

    private static native long _getLongValue(long j2, int i2);

    private static native void _imageUploaderClose(long j2);

    private final native long _imageUploaderCreate(int i2);

    private static native String _imageUploaderGetImageMetaInfo(long j2, int i2);

    private static native String _imageUploaderGetImageUri(long j2, int i2);

    private static native String _imageUploaderGetStringValue(long j2, int i2);

    private static native void _imageUploaderSetFileData(long j2, int i2, byte[][] bArr);

    private static native void _imageUploaderSetFileName(long j2, int i2, String[] strArr);

    private static native void _imageUploaderSetFilePath(long j2, int i2, String[] strArr);

    private static native void _imageUploaderSetIntValue(long j2, int i2, int i3);

    private static native void _imageUploaderSetStringValue(long j2, int i2, String str);

    private static native void _imageUploaderStart(long j2);

    private static native String _imageUploaderStop(long j2);

    private static native void _setInt64Value(long j2, int i2, long j3);

    private static native void _setObject(long j2, int i2, Object obj);

    public static int com_ss_ttuploader_TTImageUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    static {
        Covode.recordClassIndex(101387);
        if (!TTUploadUtil.initInternal()) {
        }
    }

    public void allowContinueUpload() {
        MethodCollector.i(470);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(470);
            return;
        }
        _allowUpload(j2);
        MethodCollector.o(470);
    }

    public void close() {
        MethodCollector.i(453);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _imageUploaderClose(j2);
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(453);
        }
    }

    public void start() {
        MethodCollector.i(445);
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _imageUploaderStart(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
            MethodCollector.o(445);
        }
    }

    public void stop() {
        MethodCollector.i(450);
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                addLogToManager(_imageUploaderStop(j2));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
            MethodCollector.o(450);
        }
    }

    public TTImageUploader() {
        MethodCollector.i(374);
        if (IsErrored) {
            TTUploadUtil.initInternal();
        }
        try {
            this.mHandle = _imageUploaderCreate(0);
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
            MethodCollector.o(374);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.o(374);
        throw exc;
    }

    public void setAbstractListener(TTImageUploaderAbstractListener tTImageUploaderAbstractListener) {
        this.mAbstractListener = tTImageUploaderAbstractListener;
    }

    public void setCurrentType(int i2) {
        this.currentType = i2;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTImageUploaderListener tTImageUploaderListener) {
        this.mListener = tTImageUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setImageUploadDomain(String str) {
        setStringValue(3, str);
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setProcessAction(String str) {
        setStringValue(65, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    private void setDeviceID(long j2) {
        MethodCollector.i(455);
        long j3 = this.mHandle;
        if (j3 == 0 || j2 <= 0) {
            MethodCollector.o(455);
            return;
        }
        _setInt64Value(j3, 66, j2);
        MethodCollector.o(455);
    }

    public void extraParams(JSONObject jSONObject) {
        String jSONObject2;
        if (this.mHandle != 0 && jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
            setStringValue(61, jSONObject2);
        }
    }

    public boolean handleMessage(Message message) {
        long j2;
        int i2 = message.what;
        if (this.mListener == null) {
            return true;
        }
        TTImageInfo tTImageInfo = (TTImageInfo) message.obj;
        if (tTImageInfo != null) {
            j2 = tTImageInfo.mProgress;
        } else {
            j2 = 0;
        }
        this.mListener.onNotify(i2, j2, tTImageInfo);
        return true;
    }

    public void setAuthorization(String str) {
        MethodCollector.i(394);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(394);
            return;
        }
        _imageUploaderSetStringValue(j2, 15, str);
        MethodCollector.o(394);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = TTUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, mapToString);
        }
    }

    public void setEnableHttps(int i2) {
        MethodCollector.i(424);
        long j2 = this.mHandle;
        if (j2 == 0 || !(i2 == 0 || i2 == 1)) {
            MethodCollector.o(424);
            return;
        }
        _imageUploaderSetIntValue(j2, 19, i2);
        MethodCollector.o(424);
    }

    public void setFileRetryCount(int i2) {
        MethodCollector.i(416);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(416);
            return;
        }
        _imageUploaderSetIntValue(j2, 6, i2);
        MethodCollector.o(416);
    }

    public void setMaxFailTime(int i2) {
        MethodCollector.i(440);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(440);
            return;
        }
        _imageUploaderSetIntValue(j2, 13, i2);
        MethodCollector.o(440);
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String mapToString;
        if (this.mHandle != 0 && treeMap != null && (mapToString = TTUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(55, mapToString);
        }
    }

    public void setPreUpload(boolean z) {
        MethodCollector.i(460);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(460);
            return;
        }
        _imageUploaderSetIntValue(j2, 80, z ? 1 : 0);
        MethodCollector.o(460);
    }

    public void setPreheatUploader(boolean z) {
        MethodCollector.i(468);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(468);
            return;
        }
        _imageUploaderSetIntValue(j2, 74, z ? 1 : 0);
        MethodCollector.o(468);
    }

    public void setScenesTag(String str) {
        MethodCollector.i(467);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(467);
            return;
        }
        _imageUploaderSetStringValue(j2, 85, str);
        MethodCollector.o(467);
    }

    public void setServerParameter(String str) {
        MethodCollector.i(393);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(393);
            return;
        }
        _imageUploaderSetStringValue(j2, 16, str);
        MethodCollector.o(393);
    }

    public void setSliceReTryCount(int i2) {
        MethodCollector.i(415);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(415);
            return;
        }
        _imageUploaderSetIntValue(j2, 5, i2);
        MethodCollector.o(415);
    }

    public void setSliceSize(int i2) {
        MethodCollector.i(399);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(399);
            return;
        }
        _imageUploaderSetIntValue(j2, 8, i2);
        MethodCollector.o(399);
    }

    public void setSliceTimeout(int i2) {
        MethodCollector.i(396);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(396);
            return;
        }
        _imageUploaderSetIntValue(j2, 7, i2);
        MethodCollector.o(396);
    }

    public void setSocketNum(int i2) {
        MethodCollector.i(400);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 < 0) {
            MethodCollector.o(400);
            return;
        }
        _imageUploaderSetIntValue(j2, 9, i2);
        MethodCollector.o(400);
    }

    public void setTranTimeOutUnit(int i2) {
        MethodCollector.i(442);
        long j2 = this.mHandle;
        if (j2 == 0 || i2 <= 0) {
            MethodCollector.o(442);
            return;
        }
        _imageUploaderSetIntValue(j2, 64, i2);
        MethodCollector.o(442);
    }

    private void setTraceId(String str) {
        MethodCollector.i(456);
        if (this.mHandle == 0 || str == null || str.isEmpty()) {
            MethodCollector.o(456);
            return;
        }
        _imageUploaderSetStringValue(this.mHandle, 69, str);
        MethodCollector.o(456);
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
        } catch (Exception unused) {
            jSONObject = null;
        }
        UploadEventManager.instance.addImageEvent(jSONObject);
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

    public void setOpenBoe(boolean z) {
        MethodCollector.i(457);
        long j2 = this.mHandle;
        if (j2 == 0) {
            MethodCollector.o(457);
        } else if (z) {
            _imageUploaderSetIntValue(j2, 67, 1);
            MethodCollector.o(457);
        } else {
            _imageUploaderSetIntValue(j2, 67, 0);
            MethodCollector.o(457);
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

    public void setUploadToken(String str) {
        com_ss_ttuploader_TTImageUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", str);
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str.getBytes(), 2)));
                String string = jSONObject.getString("ApplyUploadToken");
                String string2 = jSONObject.getString("CommitUploadToken");
                if (string != null && !string.isEmpty()) {
                    setStringValue(83, string);
                }
                if (string2 != null && !string2.isEmpty()) {
                    setStringValue(84, string2);
                }
            } catch (JSONException e2) {
                com_ss_ttuploader_TTImageUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "uploadToken is encode json error !!!");
                e2.printStackTrace();
            }
        }
    }

    public TTImageUploader(int i2) {
        MethodCollector.i(7409);
        setCurrentType(i2);
        try {
            this.mHandle = _imageUploaderCreate(i2);
        } catch (Throwable th) {
            this.mHandle = 0;
            com_ss_ttuploader_TTImageUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", th.toString());
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
            MethodCollector.o(7409);
            return;
        }
        Exception exc = new Exception("create native uploader fail");
        MethodCollector.o(7409);
        throw exc;
    }

    public int checkNet(int i2, int i3) {
        TTImageUploaderAbstractListener tTImageUploaderAbstractListener = this.mAbstractListener;
        if (tTImageUploaderAbstractListener == null) {
            return -2;
        }
        return tTImageUploaderAbstractListener.imageUploadCheckNetState(i2, i3);
    }

    public void setFileName(int i2, String[] strArr) {
        MethodCollector.i(466);
        long j2 = this.mHandle;
        if (j2 == 0 || strArr == null || i2 <= 0) {
            MethodCollector.o(466);
            return;
        }
        _imageUploaderSetFileName(j2, i2, strArr);
        MethodCollector.o(466);
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(392);
        long j2 = this.mHandle;
        if (j2 == 0 || str == null) {
            MethodCollector.o(392);
            return;
        }
        _imageUploaderSetStringValue(j2, i2, str);
        MethodCollector.o(392);
    }

    public void setFileData(int i2, byte[][] bArr) {
        MethodCollector.i(390);
        long j2 = this.mHandle;
        if (j2 == 0 || bArr == null || i2 <= 0) {
            MethodCollector.o(390);
            return;
        }
        this.mImageNum = i2;
        _imageUploaderSetFileData(j2, i2, bArr);
        _imageUploaderSetIntValue(this.mHandle, 81, 0);
        MethodCollector.o(390);
    }

    public void setFilePath(int i2, String[] strArr) {
        MethodCollector.i(389);
        long j2 = this.mHandle;
        if (j2 == 0 || strArr == null || i2 <= 0) {
            MethodCollector.o(389);
            return;
        }
        this.mImageNum = i2;
        _imageUploaderSetFilePath(j2, i2, strArr);
        _imageUploaderSetIntValue(this.mHandle, 81, 0);
        MethodCollector.o(389);
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i2) {
        MethodCollector.i(458);
        long j2 = this.mHandle;
        if (j2 == 0 || tTMediaDataReader == null || i2 <= 0) {
            MethodCollector.o(458);
            return;
        }
        _imageUploaderSetIntValue(j2, 71, i2);
        _setObject(this.mHandle, 201, tTMediaDataReader);
        _imageUploaderSetIntValue(this.mHandle, 81, 2);
        MethodCollector.o(458);
    }

    public void onLogInfo(int i2, int i3, String str) {
        TTImageUploaderListener tTImageUploaderListener = this.mListener;
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i2, int i3) {
        MethodCollector.i(459);
        if (this.mHandle == 0 || tTMediaDataReader == null || i2 <= 0) {
            MethodCollector.o(459);
            return;
        }
        setMediaDataReader(tTMediaDataReader, i2);
        _imageUploaderSetIntValue(this.mHandle, 81, i3);
        MethodCollector.o(459);
    }

    public void onNotify(int i2, long j2, int i3) {
        MethodCollector.i(382);
        if (this.mState != 1) {
            MethodCollector.o(382);
            return;
        }
        TTImageInfo tTImageInfo = null;
        int i4 = (int) j2;
        if (i2 == 0) {
            String dnsip = getDNSIP();
            if (dnsip != null && !dnsip.isEmpty()) {
                setStringValue(75, dnsip);
            }
            addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
            this.mState = 3;
        } else if (i2 == 1) {
            tTImageInfo = new TTImageInfo(null, (long) i3, i4, null);
        } else if (i2 == 2) {
            String dnsip2 = getDNSIP();
            if (dnsip2 != null && !dnsip2.isEmpty()) {
                setStringValue(75, dnsip2);
            }
            addLogToManager(_imageUploaderGetStringValue(this.mHandle, 100));
            this.mState = 2;
        } else if (i2 == 3) {
            this.mEndTime = System.currentTimeMillis();
            String _imageUploaderGetStringValue = _imageUploaderGetStringValue(this.mHandle, 51);
            String _imageUploaderGetStringValue2 = _imageUploaderGetStringValue(this.mHandle, 50);
            String _imageUploaderGetStringValue3 = _imageUploaderGetStringValue(this.mHandle, 52);
            String _imageUploaderGetStringValue4 = _imageUploaderGetStringValue(this.mHandle, 53);
            String _imageUploaderGetStringValue5 = _imageUploaderGetStringValue(this.mHandle, 57);
            String _imageUploaderGetStringValue6 = _imageUploaderGetStringValue(this.mHandle, 58);
            String _imageUploaderGetImageUri = _imageUploaderGetImageUri(this.mHandle, i4);
            tTImageInfo = this.currentType == 1 ? new TTImageInfo(_imageUploaderGetStringValue, _imageUploaderGetStringValue2, _imageUploaderGetStringValue3, _imageUploaderGetStringValue4, _imageUploaderGetImageUri, _imageUploaderGetStringValue5, _imageUploaderGetStringValue6, _imageUploaderGetStringValue(this.mHandle, 59), 0, i4) : new TTImageInfo(_imageUploaderGetImageUri, 0, i4, _imageUploaderGetImageMetaInfo(this.mHandle, i4));
        } else if (i2 == 4) {
            tTImageInfo = new TTImageInfo(null, (long) i3, i4, null);
        }
        Message obtainMessage = this.mHandler.obtainMessage();
        obtainMessage.what = i2;
        obtainMessage.obj = tTImageInfo;
        obtainMessage.sendToTarget();
        MethodCollector.o(382);
    }
}
