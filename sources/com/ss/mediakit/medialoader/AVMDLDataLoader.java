package com.ss.mediakit.medialoader;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.mediakit.net.AVMDLDNSInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.mediakit.net.AVMDLMultiNetwork;
import com.ss.mediakit.net.IPCache;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

public class AVMDLDataLoader implements Handler.Callback {
    private static boolean isSupportQueryEncode = true;
    private static Context mGlobalApplicationContext;
    private static AVMDLDataLoader mInstance;
    private static volatile boolean mIsLibraryLoaded;
    private static volatile boolean mIsMdlTtnetPluginLoaded;
    private boolean isSupportGetAuth;
    private AVMDLDataLoaderConfigure mConfigure;
    private long mEndTime;
    private LoaderListener mEventListener;
    private long mHandle;
    private Handler mHandler;
    private AVMDLDataLoaderListener mLiveListener;
    public Handler mLogHandler;
    private Thread mMsgThread;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mSartTime;
    private AVMDLStartCompleteListener mStartCompleteListener;
    private volatile int mState = -1;
    private AVMDLTaskEventListener mTaskListener;
    private AVMDLDataLoaderListener mVodListener;
    private Map<String, AVMDLCopyOperation> mWaitingCopyItem;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _addDataSource(long j2, int i2, String str);

    private static native void _cancel(long j2, String str);

    private static native void _cancelAll(long j2);

    private static native void _cancelAllPreloadWaitReqs(long j2);

    private static native void _clearAllCaches(long j2);

    private static native long _clearAndGetCachesByUsedTime(long j2, long j3, int i2);

    private static native void _clearCachesByUsedTime(long j2, long j3);

    private static native void _clearNetinfoCache(long j2);

    private static native void _close(long j2);

    private static native int _copyFile(long j2, String str, String str2);

    private final native long _create();

    private static native void _downloadResource(long j2, String str);

    private static native String _encodeUrl(String str, int i2);

    private static native void _forceRemoveCacheFile(long j2, String str);

    private static native String _getAuth(long j2, String str);

    private static native String _getCDNLog(long j2, String str);

    private static native int _getIsFileCacheComplete(long j2, String str);

    private static native long _getLongValue(long j2, int i2);

    private static native long _getLongValueByStr(long j2, String str, int i2);

    private static native long _getLongValueByStrStr(long j2, String str, String str2, int i2);

    private static native String _getStringValue(long j2, int i2);

    private static native String _getStringValueByStr(long j2, String str, int i2);

    private static native String _getStringValueByStrStr(long j2, String str, String str2, int i2);

    private static native void _makeFileAutoDeleteFlag(long j2, String str, int i2);

    private static native String _makeTsFileKey(String str, String str2);

    private static native int _onCellularAlwaysUp(long j2, long j3, int i2);

    private static native int _onInitMultiNetworkEnv(long j2, int i2);

    private static native void _p2pPredown(long j2, String str);

    private static native void _preConnectByHost(long j2, String str, int i2);

    private static native void _preloadGroupResource(long j2, String str, String str2, int i2, int i3);

    private static native void _preloadResource(long j2, String str, int i2);

    private static native void _preloadResourceWithOffset(long j2, String str, int i2, int i3);

    private static native void _removeCacheFile(long j2, String str);

    private static native void _resumeFileWriteIO(long j2);

    private static native void _setInt64Value(long j2, int i2, long j3);

    private static native void _setInt64ValueByStrKey(long j2, int i2, String str, long j3);

    private static native void _setIntValue(long j2, int i2, int i3);

    private static native void _setStringValue(long j2, int i2, String str);

    private static native int _start(long j2);

    private static native void _stop(long j2);

    private static native void _suspendedDownload(long j2, String str);

    private static native int _tryDownloadPlayReqByKey(long j2, String str);

    private static native void _updateDNSInfo(long j2, String str, String str2, long j3, String str3, int i2);

    public static int com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    private boolean isNotifyInfo(int i2) {
        return i2 == 4 || i2 == 20 || i2 == 50 || i2 == 8 || i2 == 3 || i2 == 21 || i2 == 51 || i2 == 7 || i2 == 22 || i2 == 52 || i2 == 901 || i2 == 24 || i2 == 902;
    }

    public boolean isRunning() {
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(101114);
    }

    public static Context getApplicationContext() {
        Context context;
        MethodCollector.i(2061);
        synchronized (AVMDLDataLoader.class) {
            try {
                context = mGlobalApplicationContext;
            } finally {
                MethodCollector.o(2061);
            }
        }
        return context;
    }

    private void hijack() {
        AVMDLLog.d("ttmn", "----hijack start");
        AVMDLDNSParser.processHijack();
        AVMDLLog.d("ttmn", "hijack clear net cache: ");
        clearNetinfoCache();
        AVMDLLog.d("ttmn", "****hijack end");
    }

    public static boolean tryLoadVcnverifylib() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn ");
            AVMDLLog.d("vcn", "load vcnverify fail");
            return false;
        }
        AVMDLLog.d("vcn", "load vcnverify suc");
        return true;
    }

    public int start() {
        if (this.mState == 1) {
            return 0;
        }
        initNativeHandle();
        new Thread(new Runnable() {
            /* class com.ss.mediakit.medialoader.AVMDLDataLoader.AnonymousClass2 */

            static {
                Covode.recordClassIndex(101116);
            }

            public void run() {
                AVMDLDataLoader.this.startInternal();
            }
        }).start();
        return 0;
    }

    public static AVMDLDataLoader getInstance() {
        MethodCollector.i(2067);
        if (mInstance == null) {
            synchronized (AVMDLDataLoader.class) {
                try {
                    if (mInstance == null) {
                        try {
                            mInstance = new AVMDLDataLoader(null);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmdl", "create native exception".concat(String.valueOf(e2)));
                            mInstance = null;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2067);
                    throw th;
                }
            }
        }
        AVMDLDataLoader aVMDLDataLoader = mInstance;
        MethodCollector.o(2067);
        return aVMDLDataLoader;
    }

    public static synchronized void loadAVMDLBaseLibrary() {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.i(316);
            try {
                com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlbase");
                MethodCollector.o(316);
            } catch (UnsatisfiedLinkError e2) {
                com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdlbase library: ".concat(String.valueOf(e2)));
                MethodCollector.o(316);
            } catch (Throwable th) {
                com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdlbase library: ".concat(String.valueOf(th)));
                MethodCollector.o(316);
            }
        }
    }

    public static synchronized boolean tryLoadTTNetLoaderPlugin() {
        boolean z;
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.i(318);
            if (!mIsMdlTtnetPluginLoaded) {
                try {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlttnet");
                    mIsMdlTtnetPluginLoaded = true;
                } catch (UnsatisfiedLinkError e2) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdl ttnet plugin library: ".concat(String.valueOf(e2)));
                } catch (Throwable th) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl ttnet plugin library: ".concat(String.valueOf(th)));
                }
            }
            z = mIsMdlTtnetPluginLoaded;
            MethodCollector.o(318);
        }
        return z;
    }

    public void cancelAll() {
        MethodCollector.i(358);
        if (this.mState != 1) {
            MethodCollector.o(358);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _cancelAll(j2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(358);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(358);
    }

    public void cancelAllPreloadWaitReqs() {
        MethodCollector.i(360);
        if (this.mState != 1) {
            MethodCollector.o(360);
            return;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _cancelAllPreloadWaitReqs(j2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(360);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(360);
    }

    public void clearAllCaches() {
        MethodCollector.i(364);
        if (this.mState != 1) {
            MethodCollector.o(364);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _clearAllCaches(j2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(364);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(364);
    }

    public void clearNetinfoCache() {
        MethodCollector.i(829);
        if (this.mState != 1) {
            MethodCollector.o(829);
            return;
        }
        IPCache.getInstance().clear();
        this.mWriteLock.lock();
        try {
            _clearNetinfoCache(this.mHandle);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(829);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(829);
    }

    public long getAllCacheSize() {
        MethodCollector.i(612);
        long j2 = -1;
        if (this.mState != 1) {
            MethodCollector.o(612);
            return -1;
        }
        this.mReadLock.lock();
        try {
            long j3 = this.mHandle;
            if (j3 != 0) {
                j2 = _getLongValue(j3, 100);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(612);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(612);
        return j2;
    }

    public String getLocalAddr() {
        MethodCollector.i(611);
        String str = null;
        if (this.mState != 1) {
            MethodCollector.o(611);
            return null;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                str = _getStringValue(j2, 4);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(611);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(611);
        return str;
    }

    public int onInitMultiNetworkEnv() {
        MethodCollector.i(1077);
        AVMDLLog.d("AVMDLDataLoader", "start on init multinetwork env");
        this.mWriteLock.lock();
        int i2 = -1;
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                i2 = _onInitMultiNetworkEnv(j2, Build.VERSION.SDK_INT);
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(1077);
            throw th;
        }
        this.mWriteLock.unlock();
        AVMDLLog.d("AVMDLDataLoader", "end on init multinetwork env");
        MethodCollector.o(1077);
        return i2;
    }

    public void resumeFileWriteIO() {
        MethodCollector.i(1064);
        if (this.mState != 1) {
            MethodCollector.o(1064);
            return;
        }
        AVMDLLog.d("AVMDLDataLoader", "resume file write io: ");
        this.mWriteLock.lock();
        try {
            if (this.mConfigure.mMaxFileMemCacheSize > 0) {
                _resumeFileWriteIO(this.mHandle);
                this.mConfigure.mMaxFileMemCacheSize = 0;
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(1064);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(1064);
    }

    public void stop() {
        MethodCollector.i(352);
        if (this.mState != 1) {
            MethodCollector.o(352);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _stop(j2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(352);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(352);
    }

    private void initNativeHandle() {
        MethodCollector.i(275);
        if (this.mHandle != 0) {
            MethodCollector.o(275);
            return;
        }
        try {
            this.mHandle = _create();
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0 && this.mHandler == null) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
                MethodCollector.o(275);
                return;
            }
            this.mHandler = new Handler(Looper.getMainLooper(), this);
        }
        MethodCollector.o(275);
    }

    public void close() {
        MethodCollector.i(355);
        if (this.mState != 1) {
            MethodCollector.o(355);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _close(j2);
                this.mHandle = 0;
                this.mState = 5;
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
                Handler handler2 = this.mLogHandler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.mLogHandler.getLooper().quit();
                    this.mLogHandler = null;
                    this.mMsgThread = null;
                }
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(355);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(355);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        r12 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        com.ss.mediakit.medialoader.AVMDLLog.d("BENCHMARKIO", "test fileio exception:".concat(java.lang.String.valueOf(r2)));
        r2.printStackTrace();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch:{ Exception -> 0x00bd, all -> 0x00c7 }, LOOP:0: B:15:0x0070->B:33:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int testFileIOSpeed() {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.testFileIOSpeed():int");
    }

    public void startInternal() {
        MethodCollector.i(337);
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                initLogThread(this);
                if (this.mHandle != 0) {
                    setConfigureInternal(this.mConfigure);
                    if (_start(this.mHandle) >= 0) {
                        this.mState = 1;
                    }
                }
            }
            this.mWriteLock.unlock();
            if (this.mConfigure.mEnableBenchMarkIOSpeed > 0) {
                int testFileIOSpeed = testFileIOSpeed();
                AVMDLLog.d("BENCHMARKIO", a.a("test io average speed:%d", new Object[]{Integer.valueOf(testFileIOSpeed)}));
                if (testFileIOSpeed > 0) {
                    setIntValue(1508, testFileIOSpeed);
                }
            }
            AVMDLStartCompleteListener aVMDLStartCompleteListener = this.mStartCompleteListener;
            if (aVMDLStartCompleteListener != null) {
                aVMDLStartCompleteListener.onStartComplete();
            }
            if (this.mState == 1 && this.mConfigure.mEnableCellularUp > 0) {
                AVMDLLog.d("AVMDLDataLoader", "start try up cellular");
                AVMDLMultiNetwork.alwayUpCellular(getApplicationContext());
                AVMDLLog.d("AVMDLDataLoader", "end try up cellular");
            }
            MethodCollector.o(337);
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(337);
            throw th;
        }
    }

    public void setStartCompleteListener(AVMDLStartCompleteListener aVMDLStartCompleteListener) {
        this.mStartCompleteListener = aVMDLStartCompleteListener;
    }

    public void doParseHosts(String[] strArr) {
        AVMDLDNSParser.getInstance().doParseHosts(strArr);
    }

    public static void com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    private String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public synchronized void setTaskEventListener(AVMDLTaskEventListener aVMDLTaskEventListener) {
        MethodCollector.i(1091);
        this.mTaskListener = aVMDLTaskEventListener;
        MethodCollector.o(1091);
    }

    public static void initApplicationContext(Context context) {
        MethodCollector.i(2060);
        synchronized (AVMDLDataLoader.class) {
            try {
                if (mGlobalApplicationContext == null) {
                    mGlobalApplicationContext = context;
                }
            } finally {
                MethodCollector.o(2060);
            }
        }
    }

    private void initLogThread(final Handler.Callback callback) {
        if (this.mMsgThread == null) {
            AnonymousClass1 r1 = new Thread() {
                /* class com.ss.mediakit.medialoader.AVMDLDataLoader.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101115);
                }

                public void run() {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    AVMDLDataLoader.this.mLogHandler = new Handler(callback);
                    Looper.loop();
                }
            };
            this.mMsgThread = r1;
            r1.setName("mdl_log_handler");
            this.mMsgThread.start();
        }
    }

    public int asyncCopyOperation(AVMDLCopyOperation aVMDLCopyOperation) {
        Handler handler;
        if (this.mState != 1 || (handler = this.mLogHandler) == null) {
            return -1;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 23;
        obtainMessage.obj = aVMDLCopyOperation;
        obtainMessage.sendToTarget();
        return 0;
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
                aVMDLDataLoaderConfigure.ParseJsonConfig();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setEventListener(LoaderListener loaderListener) {
        this.mWriteLock.lock();
        try {
            this.mEventListener = loaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void cancel(String str) {
        MethodCollector.i(362);
        if (this.mState != 1) {
            MethodCollector.o(362);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _cancel(j2, str);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(362);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(362);
    }

    public void downloadResource(String str) {
        MethodCollector.i(837);
        if (this.mState != 1) {
            MethodCollector.o(837);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(837);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _downloadResource(j2, str);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(837);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(837);
        }
    }

    public void forceRemoveFileCache(String str) {
        MethodCollector.i(377);
        if (this.mState != 1) {
            MethodCollector.o(377);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(377);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _forceRemoveCacheFile(j2, str);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(377);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(377);
        }
    }

    public String getAuth(String str) {
        MethodCollector.i(976);
        String str2 = null;
        if (this.mState != 1 || !this.isSupportGetAuth) {
            MethodCollector.o(976);
            return null;
        }
        this.mReadLock.lock();
        try {
            str2 = _getAuth(this.mHandle, str);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            this.isSupportGetAuth = false;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(976);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(976);
        return str2;
    }

    public String getStringValue(int i2) {
        MethodCollector.i(582);
        String str = null;
        if (this.mState != 1) {
            MethodCollector.o(582);
            return null;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                str = _getStringValue(j2, i2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(582);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(582);
        return str;
    }

    public void removeFileCache(String str) {
        MethodCollector.i(372);
        if (this.mState != 1) {
            MethodCollector.o(372);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(372);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _removeCacheFile(j2, str);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(372);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(372);
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mVodListener = aVMDLDataLoaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void suspendDownload(String str) {
        MethodCollector.i(835);
        if (this.mState != 1) {
            MethodCollector.o(835);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _suspendedDownload(j2, str);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(835);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(835);
    }

    public void tryToClearCachesByUsedTime(long j2) {
        MethodCollector.i(366);
        if (this.mState != 1) {
            MethodCollector.o(366);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j3 = this.mHandle;
            if (j3 != 0) {
                _clearCachesByUsedTime(j3, j2);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(366);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(366);
    }

    private AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mMsgThread = null;
        this.isSupportGetAuth = true;
        this.mStartCompleteListener = null;
        this.mWaitingCopyItem = new HashMap();
        this.mTaskListener = null;
        initNativeHandle();
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        if (this.mHandle != 0) {
            initLogThread(this);
            this.mConfigure = aVMDLDataLoaderConfigure;
            this.mState = 0;
            this.isSupportGetAuth = true;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    public static boolean com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(348);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(348);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(348);
        return delete;
    }

    public static synchronized int init(boolean z) {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.i(309);
            if (mIsLibraryLoaded) {
                MethodCollector.o(309);
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!z) {
                if (!com.bytedance.e.a.a.a()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn ");
                }
                loadAVMDLBaseLibrary();
                try {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e2) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e2)));
                } catch (Throwable th) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th)));
                }
                if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcnverify lib ");
                }
                tryLoadTTNetLoaderPlugin();
            }
            if (!mIsLibraryLoaded) {
                MethodCollector.o(309);
                return -1;
            }
            MethodCollector.o(309);
            return 0;
        }
    }

    public String getCDNLog(String str) {
        MethodCollector.i(989);
        String str2 = null;
        if (this.mState != 1) {
            MethodCollector.o(989);
            return null;
        }
        this.mReadLock.lock();
        try {
            str2 = _getCDNLog(this.mHandle, str);
        } catch (UnsatisfiedLinkError e2) {
            AVMDLLog.d("AVMDLDataLoader", "not support get cdnlog," + e2.toString());
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(989);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(989);
        return str2;
    }

    public long getCacheSize(String str) {
        MethodCollector.i(588);
        long j2 = -1;
        if (this.mState != 1) {
            MethodCollector.o(588);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(588);
            return -1;
        } else {
            this.mReadLock.lock();
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    j2 = _getLongValueByStr(j3, str, 103);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.o(588);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.o(588);
            return j2;
        }
    }

    public String getStringCacheInfo(String str) {
        MethodCollector.i(602);
        String str2 = null;
        if (this.mState != 1) {
            MethodCollector.o(602);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(602);
            return null;
        } else {
            this.mReadLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    str2 = _getStringValueByStr(j2, str, 101);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.o(602);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.o(602);
            return str2;
        }
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 23) {
            AVMDLCopyOperation aVMDLCopyOperation = (AVMDLCopyOperation) message.obj;
            if (aVMDLCopyOperation == null) {
                return true;
            }
            copyInternal(aVMDLCopyOperation);
            return true;
        }
        if (i2 == 3 || i2 == 51) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj;
            if (this.mWaitingCopyItem.size() > 0 && aVMDLDataLoaderNotifyInfo != null) {
                handleCopyMsg(aVMDLDataLoaderNotifyInfo);
            }
        }
        if (i2 == 12 || i2 == 9) {
            return postMessage(this.mLiveListener, message);
        }
        if (i2 == 71 || i2 == 72 || i2 == 73 || i2 == 74) {
            return postMessage(this.mEventListener, message);
        }
        return postMessage(this.mVodListener, message);
    }

    public int onCellularAlwaysUp(long j2) {
        MethodCollector.i(1071);
        AVMDLLog.d("AVMDLDataLoader", "start on cellular netId: ".concat(String.valueOf(j2)));
        this.mWriteLock.lock();
        int i2 = -1;
        try {
            long j3 = this.mHandle;
            if (j3 != 0) {
                i2 = _onCellularAlwaysUp(j3, j2, Build.VERSION.SDK_INT);
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(1071);
            throw th;
        }
        this.mWriteLock.unlock();
        AVMDLLog.d("AVMDLDataLoader", "end on cellular netId: " + j2 + " ret: " + i2);
        MethodCollector.o(1071);
        return i2;
    }

    public long tryQuickGetCacheSize(String str) {
        MethodCollector.i(591);
        long j2 = -1;
        if (this.mState != 1) {
            MethodCollector.o(591);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(591);
            return -1;
        } else {
            this.mReadLock.lock();
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    j2 = _getLongValueByStr(j3, str, 106);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.o(591);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.o(591);
            return j2;
        }
    }

    private void copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        MethodCollector.i(333);
        if (aVMDLCopyOperation == null || TextUtils.isEmpty(aVMDLCopyOperation.mFileKey) || TextUtils.isEmpty(aVMDLCopyOperation.mDestPath)) {
            AVMDLLog.d("AVMDLDataLoader", "copy file invalid filekey or destpath is null");
            if (!(aVMDLCopyOperation == null || aVMDLCopyOperation.mListener == null)) {
                aVMDLCopyOperation.mListener.onCopyComplete(false, -1, "invalid parameter");
            }
            MethodCollector.o(333);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                int _getIsFileCacheComplete = _getIsFileCacheComplete(j2, aVMDLCopyOperation.mFileKey);
                if (_getIsFileCacheComplete == 1) {
                    int copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath);
                    AVMDLLog.d("AVMDLDataLoader", "copy file result: ".concat(String.valueOf(copyFile)));
                    if (aVMDLCopyOperation.mListener != null) {
                        if (copyFile == 0) {
                            aVMDLCopyOperation.mListener.onCopyComplete(true, 0, "copy success.");
                        } else {
                            aVMDLCopyOperation.mListener.onCopyComplete(false, -5, "copy failed.copy error code ".concat(String.valueOf(copyFile)));
                        }
                    }
                } else if (_getIsFileCacheComplete == -1) {
                    if (aVMDLCopyOperation.mListener != null) {
                        aVMDLCopyOperation.mListener.onCopyComplete(false, -6, "cache file have empty hole.");
                    }
                } else if (aVMDLCopyOperation.mWaitIfCaching) {
                    int _tryDownloadPlayReqByKey = _tryDownloadPlayReqByKey(this.mHandle, aVMDLCopyOperation.mFileKey);
                    AVMDLLog.d("AVMDLDataLoader", "try download play " + aVMDLCopyOperation.mFileKey + " result: " + _tryDownloadPlayReqByKey);
                    if (_tryDownloadPlayReqByKey == 0) {
                        this.mWaitingCopyItem.put(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation);
                    } else if (aVMDLCopyOperation.mListener != null) {
                        aVMDLCopyOperation.mListener.onCopyComplete(false, -4, "file key not playing.");
                    }
                } else if (aVMDLCopyOperation.mListener != null) {
                    aVMDLCopyOperation.mListener.onCopyComplete(false, -3, "cache not finish.");
                }
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            if (aVMDLCopyOperation.mListener != null) {
                aVMDLCopyOperation.mListener.onCopyComplete(false, -2, "medialoader not running");
            }
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(333);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(333);
    }

    private void handleCopyMsg(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo != null) {
            if (aVMDLDataLoaderNotifyInfo.what == 3 || aVMDLDataLoaderNotifyInfo.what == 51) {
                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (split.length >= 4) {
                    long longValue = Long.valueOf(split[0]).longValue();
                    long longValue2 = Long.valueOf(split[1]).longValue();
                    if (longValue2 > 0 || aVMDLDataLoaderNotifyInfo.what == 4) {
                        String str = split[2];
                        if (this.mWaitingCopyItem.containsKey(str)) {
                            AVMDLCopyOperation aVMDLCopyOperation = this.mWaitingCopyItem.get(str);
                            if (longValue == longValue2) {
                                if (aVMDLCopyOperation != null) {
                                    int copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath);
                                    if (aVMDLCopyOperation.mListener == null) {
                                        return;
                                    }
                                    if (copyFile == 0) {
                                        aVMDLCopyOperation.mListener.onCopyComplete(true, 0, "copy success.");
                                    } else {
                                        aVMDLCopyOperation.mListener.onCopyComplete(false, -5, "copy failed.");
                                    }
                                }
                            } else if (aVMDLDataLoaderNotifyInfo.what == 51 && aVMDLCopyOperation.mListener != null) {
                                aVMDLCopyOperation.mListener.onCopyComplete(false, -3, "copy failed.");
                            }
                        }
                    }
                }
            }
        }
    }

    public static String queryComponentEncode(String str) {
        MethodCollector.i(1085);
        if (!isSupportQueryEncode || TextUtils.isEmpty(str)) {
            MethodCollector.o(1085);
            return null;
        }
        AVMDLLog.d("AVMDLDataLoader", "before encode, src: ".concat(String.valueOf(str)));
        try {
            String _encodeUrl = _encodeUrl(str, 4);
            MethodCollector.o(1085);
            return _encodeUrl;
        } catch (UnsatisfiedLinkError e2) {
            isSupportQueryEncode = false;
            AVMDLLog.d("AVMDLDataLoader", "query ComponentEncode:err " + e2.getMessage());
            AVMDLLog.d("AVMDLDataLoader", "query ComponentEncode:stacktrace " + e2.getStackTrace());
            MethodCollector.o(1085);
            return null;
        } catch (Exception e3) {
            AVMDLLog.d("AVMDLDataLoader", "query ComponentEncode:err " + e3.getMessage());
            AVMDLLog.d("AVMDLDataLoader", "query ComponentEncode:stacktrace " + e3.getStackTrace());
            MethodCollector.o(1085);
            return null;
        }
    }

    public AVMDLFileInfo getCacheInfo(String str) {
        UnsatisfiedLinkError e2;
        MethodCollector.i(609);
        AVMDLFileInfo aVMDLFileInfo = null;
        if (this.mState != 1) {
            MethodCollector.o(609);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(609);
            return null;
        } else {
            this.mReadLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    String[] split = _getStringValueByStr(j2, str, 101).split(",");
                    if (split.length >= 3) {
                        AVMDLFileInfo aVMDLFileInfo2 = new AVMDLFileInfo();
                        try {
                            aVMDLFileInfo2.mFilePath = split[2];
                            if (!TextUtils.isEmpty(split[0])) {
                                aVMDLFileInfo2.mCacheSize = Long.valueOf(split[0]).longValue();
                            }
                            if (!TextUtils.isEmpty(split[1])) {
                                aVMDLFileInfo2.mContentLenght = Long.valueOf(split[1]).longValue();
                            }
                            aVMDLFileInfo = aVMDLFileInfo2;
                        } catch (UnsatisfiedLinkError e3) {
                            e2 = e3;
                            aVMDLFileInfo = aVMDLFileInfo2;
                            try {
                                e2.printStackTrace();
                                this.mReadLock.unlock();
                                MethodCollector.o(609);
                                return aVMDLFileInfo;
                            } catch (Throwable th) {
                                this.mReadLock.unlock();
                                MethodCollector.o(609);
                                throw th;
                            }
                        }
                    }
                }
            } catch (UnsatisfiedLinkError e4) {
                e2 = e4;
                e2.printStackTrace();
                this.mReadLock.unlock();
                MethodCollector.o(609);
                return aVMDLFileInfo;
            }
            this.mReadLock.unlock();
            MethodCollector.o(609);
            return aVMDLFileInfo;
        }
    }

    public long getLongValue(int i2) {
        int i3;
        MethodCollector.i(417);
        long j2 = -1;
        if (i2 == 7218 || i2 == 7390 || i2 == 9407 || i2 == 7402) {
            long j3 = this.mHandle;
            if (j3 != 0) {
                j2 = _getLongValue(j3, i2);
            }
            MethodCollector.o(417);
            return j2;
        } else if (this.mState != 1) {
            AVMDLLog.d("ttmn", "getLongValue key: " + i2 + " result: -1");
            MethodCollector.o(417);
            return -1;
        } else if (this.mConfigure == null) {
            AVMDLLog.d("ttmn", "getLongValue key: " + i2 + " result: -998");
            MethodCollector.o(417);
            return -998;
        } else {
            this.mReadLock.lock();
            switch (i2) {
                case 8100:
                    i3 = this.mConfigure.mLiveLoaderEnable;
                    j2 = (long) i3;
                    break;
                case 8101:
                    i3 = this.mConfigure.mLiveP2pAllow;
                    j2 = (long) i3;
                    break;
                case 8102:
                    i3 = this.mConfigure.mLiveEnableMdlProto;
                    j2 = (long) i3;
                    break;
                case 8103:
                    i3 = this.mConfigure.mLiveLoaderType;
                    j2 = (long) i3;
                    break;
                default:
                    try {
                        long j4 = this.mHandle;
                        if (j4 != 0) {
                            j2 = _getLongValue(j4, i2);
                            break;
                        }
                    } catch (UnsatisfiedLinkError e2) {
                        e2.printStackTrace();
                        break;
                    } catch (Throwable th) {
                        this.mReadLock.unlock();
                        MethodCollector.o(417);
                        throw th;
                    }
                    break;
            }
            this.mReadLock.unlock();
            AVMDLLog.d("ttmn", "getLongValue key: " + i2 + " result: " + j2);
            MethodCollector.o(417);
            return j2;
        }
    }

    public void p2pPredown(String str) {
        MethodCollector.i(1002);
        if (this.mState != 1) {
            MethodCollector.o(1002);
        } else if (this.mConfigure.mLoaderType <= 0) {
            AVMDLLog.d("AVMDLDataLoader", "not enable p2p,not need p2ppredown, configure loader type" + this.mConfigure.mLoaderType);
            MethodCollector.o(1002);
        } else {
            String encodeUrl = encodeUrl(str);
            if (TextUtils.isEmpty(encodeUrl)) {
                AVMDLLog.d("AVMDLDataLoader", "encode url null, not need p2p predown");
                MethodCollector.o(1002);
                return;
            }
            AVMDLLog.d("AVMDLDataLoader", "p2p predown start");
            this.mReadLock.lock();
            try {
                _p2pPredown(this.mHandle, encodeUrl);
            } catch (UnsatisfiedLinkError e2) {
                AVMDLLog.d("AVMDLDataLoader", "p2p predown exception" + e2.toString());
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.o(1002);
                throw th;
            }
            this.mReadLock.unlock();
            AVMDLLog.d("AVMDLDataLoader", "p2p predown end");
            MethodCollector.o(1002);
        }
    }

    public void onEventInfo(Object obj) {
        String str;
        if (this.mState == 1 && this.mLogHandler != null) {
            LoaderEventInfo loaderEventInfo = new LoaderEventInfo();
            loaderEventInfo.what = 74;
            try {
                HashMap hashMap = (HashMap) obj;
                if (hashMap.containsKey("what")) {
                    loaderEventInfo.what = ((Integer) hashMap.get("what")).intValue();
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains What" + loaderEventInfo.what);
                }
                if (hashMap.containsKey("taskType")) {
                    loaderEventInfo.taskType = ((Integer) hashMap.get("taskType")).intValue();
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains taskType" + loaderEventInfo.taskType);
                }
                if (hashMap.containsKey("off")) {
                    loaderEventInfo.off = ((Long) hashMap.get("off")).longValue();
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains off" + loaderEventInfo.off);
                }
                if (hashMap.containsKey("endOff")) {
                    loaderEventInfo.endOff = ((Long) hashMap.get("endOff")).longValue();
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains endOff" + loaderEventInfo.endOff);
                }
                if (hashMap.containsKey("fileHash")) {
                    loaderEventInfo.fileHash = String.valueOf(hashMap.get("fileHash"));
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains fileHash" + loaderEventInfo.fileHash);
                }
                if (hashMap.containsKey("bytesLoaded")) {
                    loaderEventInfo.bytesLoaded = ((Long) hashMap.get("bytesLoaded")).longValue();
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains bytesLoaded" + loaderEventInfo.bytesLoaded);
                }
                if (hashMap.containsKey("headers")) {
                    str = String.valueOf(hashMap.get("headers"));
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] eventMap contains headers".concat(String.valueOf(str)));
                } else {
                    str = "";
                }
                if (str != "") {
                    String[] split = str.split("\r\n");
                    for (String str2 : split) {
                        String[] split2 = str2.split(":");
                        loaderEventInfo.mHeaders.put(split2[0], split2[1]);
                    }
                } else {
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI] what" + loaderEventInfo.what);
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI]no headers");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            Message obtainMessage = this.mLogHandler.obtainMessage();
            obtainMessage.what = loaderEventInfo.what;
            obtainMessage.obj = loaderEventInfo;
            obtainMessage.sendToTarget();
        }
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        MethodCollector.i(301);
        if (this.mHandle == 0 || aVMDLDataLoaderConfigure == null) {
            MethodCollector.o(301);
            return;
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
            String createFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
            if (!TextUtils.isEmpty(createFilePathBaseDir)) {
                _setStringValue(this.mHandle, 9, createFilePathBaseDir);
            }
            if (TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                aVMDLDataLoaderConfigure.mNetCacheDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "netCache");
            }
            _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
        }
        if (!TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
            _setStringValue(this.mHandle, 5510, aVMDLDataLoaderConfigure.mNetCacheDir);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mAppInfo)) {
            _setStringValue(this.mHandle, 10, aVMDLDataLoaderConfigure.mAppInfo);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDownloadDir)) {
            _setStringValue(this.mHandle, 7300, aVMDLDataLoaderConfigure.mDownloadDir);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlExtensionOptsStr)) {
            _setStringValue(this.mHandle, 7500, aVMDLDataLoaderConfigure.mMdlExtensionOptsStr);
        }
        _setIntValue(this.mHandle, 8001, aVMDLDataLoaderConfigure.mLiveP2pAllow);
        _setIntValue(this.mHandle, 8000, aVMDLDataLoaderConfigure.mLiveLoaderType);
        _setIntValue(this.mHandle, 8005, aVMDLDataLoaderConfigure.mLiveWatchDurationThreshold);
        _setIntValue(this.mHandle, 8006, aVMDLDataLoaderConfigure.mLiveCacheThresholdHttpToP2p);
        _setIntValue(this.mHandle, 8007, aVMDLDataLoaderConfigure.mLiveCacheThresholdP2pToHttp);
        _setIntValue(this.mHandle, 8008, aVMDLDataLoaderConfigure.mLiveMaxTrySwitchP2pTimes);
        _setIntValue(this.mHandle, 8009, aVMDLDataLoaderConfigure.mLiveWaitP2pReadyThreshold);
        _setIntValue(this.mHandle, 8010, aVMDLDataLoaderConfigure.mLiveMobileUploadAllow);
        _setIntValue(this.mHandle, 8011, aVMDLDataLoaderConfigure.mLiveMobileDownloadAllow);
        _setIntValue(this.mHandle, 8012, aVMDLDataLoaderConfigure.mLiveRecvDataTimeout);
        _setStringValue(this.mHandle, 8021, aVMDLDataLoaderConfigure.mLiveContainerString);
        _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
        _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
        _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
        _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
        _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
        _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
        _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
        _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
        _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
        if (aVMDLDataLoaderConfigure.mMaxCacheAge > 0) {
            _setIntValue(this.mHandle, 104, aVMDLDataLoaderConfigure.mMaxCacheAge);
        }
        _setIntValue(this.mHandle, 111, aVMDLDataLoaderConfigure.mEnableMaxCacheAgeForAllDir);
        _setIntValue(this.mHandle, 1030, aVMDLDataLoaderConfigure.mPreloadStrategy);
        _setIntValue(this.mHandle, 1040, aVMDLDataLoaderConfigure.mPreloadWaitListType);
        _setIntValue(this.mHandle, 105, aVMDLDataLoaderConfigure.mEnablePreloadReUse);
        _setIntValue(this.mHandle, 700, aVMDLDataLoaderConfigure.mEnableExternDNS);
        _setIntValue(this.mHandle, 701, aVMDLDataLoaderConfigure.mEnableSocketReuse);
        _setIntValue(this.mHandle, 703, aVMDLDataLoaderConfigure.mControlCDNRangeType);
        _setIntValue(this.mHandle, 702, aVMDLDataLoaderConfigure.mSocketIdleTimeOut);
        _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
        _setIntValue(this.mHandle, 8216, aVMDLDataLoaderConfigure.mLoaderFactoryP2PLevel);
        _setIntValue(this.mHandle, 1502, aVMDLDataLoaderConfigure.mTestSpeedTypeVersion);
        _setIntValue(this.mHandle, 1504, aVMDLDataLoaderConfigure.mCheckSumLevel);
        _setIntValue(this.mHandle, 1505, aVMDLDataLoaderConfigure.mEncryptVersion);
        _setIntValue(this.mHandle, 1507, aVMDLDataLoaderConfigure.mSpeedCoefficientValue);
        _setIntValue(this.mHandle, 900, aVMDLDataLoaderConfigure.mMaxIpCountEachDomain);
        _setIntValue(this.mHandle, 901, aVMDLDataLoaderConfigure.mEnableIpBucket);
        _setIntValue(this.mHandle, 902, aVMDLDataLoaderConfigure.mErrorStateTrustTime);
        _setIntValue(this.mHandle, 2508, aVMDLDataLoaderConfigure.mEnablePreconnect);
        _setIntValue(this.mHandle, 2509, aVMDLDataLoaderConfigure.mPreconnectNum);
        _setIntValue(this.mHandle, 2510, aVMDLDataLoaderConfigure.mEnableLoaderPreempt);
        _setIntValue(this.mHandle, 2511, aVMDLDataLoaderConfigure.mNextDownloadThreshold);
        _setIntValue(this.mHandle, 7216, aVMDLDataLoaderConfigure.mOnlyUseCdn);
        _setIntValue(this.mHandle, 3511, aVMDLDataLoaderConfigure.mAccessCheckLevel);
        _setIntValue(this.mHandle, 5511, aVMDLDataLoaderConfigure.mEnableSessionReuse);
        _setIntValue(this.mHandle, 5512, aVMDLDataLoaderConfigure.mMaxTlsVersion);
        _setIntValue(this.mHandle, 6512, aVMDLDataLoaderConfigure.mCheckPreloadLevel);
        _setIntValue(this.mHandle, 8217, aVMDLDataLoaderConfigure.mXYLibValue);
        _setIntValue(this.mHandle, 7340, aVMDLDataLoaderConfigure.mEnableP2PPreDown);
        _setIntValue(this.mHandle, 7341, aVMDLDataLoaderConfigure.mEnablePlayLog);
        _setIntValue(this.mHandle, 7342, aVMDLDataLoaderConfigure.mEnableNetScheduler);
        _setIntValue(this.mHandle, 7358, aVMDLDataLoaderConfigure.mEnableCacheReqRange);
        _setIntValue(this.mHandle, 7343, aVMDLDataLoaderConfigure.mNetSchedulerBlockAllNetErr);
        _setIntValue(this.mHandle, 7344, aVMDLDataLoaderConfigure.mNetSchedulerBlockErrCount);
        _setIntValue(this.mHandle, 7345, aVMDLDataLoaderConfigure.mNetSChedulerBlockDurationMs);
        _setIntValue(this.mHandle, 7346, aVMDLDataLoaderConfigure.mFirstRangeLeftThreshold);
        _setIntValue(this.mHandle, 7394, aVMDLDataLoaderConfigure.mNetSchedulerBlockHostIpErrCount);
        _setIntValue(this.mHandle, 5513, aVMDLDataLoaderConfigure.mMaxFileMemCacheSize);
        _setIntValue(this.mHandle, 5515, aVMDLDataLoaderConfigure.mMaxFileMemCacheNum);
        _setIntValue(this.mHandle, 110, aVMDLDataLoaderConfigure.mWriteFileNotifyIntervalMS);
        _setIntValue(this.mHandle, 7359, aVMDLDataLoaderConfigure.mP2PPreDownPeerCount);
        _setIntValue(this.mHandle, 7372, aVMDLDataLoaderConfigure.mP2PFirstRangeLoaderType);
        if (aVMDLDataLoaderConfigure.mSocketSendBufferKB > 0) {
            _setIntValue(this.mHandle, 7220, aVMDLDataLoaderConfigure.mSocketSendBufferKB);
        }
        if (aVMDLDataLoaderConfigure.mRingBufferSizeKB > 0) {
            _setIntValue(this.mHandle, 7221, aVMDLDataLoaderConfigure.mRingBufferSizeKB);
        }
        _setIntValue(this.mHandle, 7222, aVMDLDataLoaderConfigure.mEnableFileCacheV2);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpABTestId)) {
            _setStringValue(this.mHandle, 7223, aVMDLDataLoaderConfigure.mVdpABTestId);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpGroupId)) {
            _setStringValue(this.mHandle, 7224, aVMDLDataLoaderConfigure.mVdpGroupId);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mNetSchedulerConfigStr)) {
            _setStringValue(this.mHandle, 7403, aVMDLDataLoaderConfigure.mNetSchedulerConfigStr);
        }
        _setIntValue(this.mHandle, 7225, aVMDLDataLoaderConfigure.mAlogEnable);
        _setIntValue(this.mHandle, 7226, aVMDLDataLoaderConfigure.mEnableSyncDnsForPcdn);
        _setIntValue(this.mHandle, 7228, aVMDLDataLoaderConfigure.mEnableFileRingBuffer);
        _setIntValue(this.mHandle, 7332, aVMDLDataLoaderConfigure.mEnableLazyBufferpool);
        _setIntValue(this.mHandle, 7334, aVMDLDataLoaderConfigure.mEnableNewBufferpool);
        _setIntValue(this.mHandle, 7335, aVMDLDataLoaderConfigure.mNewBufferPoolBlockSize);
        _setIntValue(this.mHandle, 7336, aVMDLDataLoaderConfigure.mNewBufferPoolResidentSize);
        _setIntValue(this.mHandle, 7337, aVMDLDataLoaderConfigure.mNewBufferPoolGrowBlockCount);
        _setIntValue(this.mHandle, 7229, aVMDLDataLoaderConfigure.mEnableUseFileExtendLoaderBuffer);
        _setIntValue(this.mHandle, 7330, aVMDLDataLoaderConfigure.mMaxIPV6Num);
        _setIntValue(this.mHandle, 7331, aVMDLDataLoaderConfigure.mMaxIPV4Num);
        _setIntValue(this.mHandle, 1510, aVMDLDataLoaderConfigure.mForbidByPassCookie);
        _setIntValue(this.mHandle, 7333, aVMDLDataLoaderConfigure.mSessionTimeout);
        _setIntValue(this.mHandle, 7339, aVMDLDataLoaderConfigure.mEnablePlayInfoCache);
        _setIntValue(this.mHandle, 7347, aVMDLDataLoaderConfigure.mEnableDownloaderLog);
        _setIntValue(this.mHandle, 7348, aVMDLDataLoaderConfigure.mEnableTTNetLoader);
        _setIntValue(this.mHandle, 7349, aVMDLDataLoaderConfigure.mTTNetLoaderCronetBufSizeKB);
        _setIntValue(this.mHandle, 7357, aVMDLDataLoaderConfigure.mIsAllowTryTheLastUrl);
        _setIntValue(this.mHandle, 7368, aVMDLDataLoaderConfigure.mSpeedSampleInterval);
        _setIntValue(this.mHandle, 7400, aVMDLDataLoaderConfigure.mUseNewSpeedTestForSingle);
        _setIntValue(this.mHandle, 7391, aVMDLDataLoaderConfigure.mEnableIOManager);
        _setIntValue(this.mHandle, 7369, aVMDLDataLoaderConfigure.mEnableLoaderSeek);
        _setIntValue(this.mHandle, 7370, aVMDLDataLoaderConfigure.mGlobalSpeedSampleInterval);
        _setIntValue(this.mHandle, 7362, aVMDLDataLoaderConfigure.mEnableDynamicTimeout);
        _setIntValue(this.mHandle, 7360, aVMDLDataLoaderConfigure.mSocketInitialTimeout);
        _setIntValue(this.mHandle, 7361, aVMDLDataLoaderConfigure.mMaxSocketReuseCount);
        _setIntValue(this.mHandle, 7371, aVMDLDataLoaderConfigure.mEnableReportTaskLog);
        _setInt64Value(this.mHandle, 8218, aVMDLDataLoaderConfigure.mP2PStragetyLevel);
        _setInt64Value(this.mHandle, 7363, aVMDLDataLoaderConfigure.mConnectPoolStragetyValue);
        _setIntValue(this.mHandle, 7364, aVMDLDataLoaderConfigure.mMaxAliveHostNum);
        _setIntValue(this.mHandle, 7392, aVMDLDataLoaderConfigure.mFileExtendSizeKB);
        _setIntValue(this.mHandle, 7393, aVMDLDataLoaderConfigure.mMinAllowSpeed);
        _setIntValue(this.mHandle, 7395, aVMDLDataLoaderConfigure.mEnableOwnVDPPreloadNotify);
        _setIntValue(this.mHandle, 8219, aVMDLDataLoaderConfigure.mEnableEarlyData);
        _setIntValue(this.mHandle, 8220, aVMDLDataLoaderConfigure.mEnableSpeedPredict);
        _setIntValue(this.mHandle, 7404, aVMDLDataLoaderConfigure.mEnableUseOriginalUrl);
        _setIntValue(this.mHandle, 7405, aVMDLDataLoaderConfigure.mEnableLoaderLogExtractUrls);
        _setIntValue(this.mHandle, 7406, aVMDLDataLoaderConfigure.mMaxLoaderLogNum);
        _setIntValue(this.mHandle, 7407, aVMDLDataLoaderConfigure.mCheckContentTypeMethod);
        _setInt64Value(this.mHandle, 7397, aVMDLDataLoaderConfigure.mMonitorMinAllowLoadSize);
        _setInt64Value(this.mHandle, 7396, aVMDLDataLoaderConfigure.mMonitorTimeInternal);
        _setStringValue(this.mHandle, 7398, aVMDLDataLoaderConfigure.mSocketTraingCenterConfigStr);
        _setStringValue(this.mHandle, 7399, aVMDLDataLoaderConfigure.mCacheDirListsStr);
        _setStringValue(this.mHandle, 8221, aVMDLDataLoaderConfigure.mP2PConfigStr);
        _setIntValue(this.mHandle, 7401, aVMDLDataLoaderConfigure.mSocketRecvBufferSize);
        _setIntValue(this.mHandle, 8215, aVMDLDataLoaderConfigure.mEnableCellularUp);
        _setIntValue(this.mHandle, 7408, aVMDLDataLoaderConfigure.mCloseThreadPool);
        if (aVMDLDataLoaderConfigure.mEnableEventInfo > 0) {
            _setIntValue(this.mHandle, 9999, aVMDLDataLoaderConfigure.mEnableEventInfo);
        }
        if (aVMDLDataLoaderConfigure.mEnableStorageModule > 0) {
            _setIntValue(this.mHandle, 10000, aVMDLDataLoaderConfigure.mEnableStorageModule);
            if (aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM > 0) {
                _setIntValue(this.mHandle, 10001, aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM);
            }
            if (aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS > 0) {
                _setIntValue(this.mHandle, 10002, aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS);
            }
            if (aVMDLDataLoaderConfigure.mStoRingBufferSizeKB > 0) {
                _setIntValue(this.mHandle, 10003, aVMDLDataLoaderConfigure.mStoRingBufferSizeKB);
            }
            if (aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1 > 0) {
                _setIntValue(this.mHandle, 10004, aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1);
            }
            if (aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec > 0) {
                _setIntValue(this.mHandle, 10006, aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec);
            }
        }
        if (aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2 > 0) {
            _setIntValue(this.mHandle, 10005, aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2);
        }
        _setIntValue(this.mHandle, 9400, aVMDLDataLoaderConfigure.mIgnorePlayInfo);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSettingsDomain)) {
            _setStringValue(this.mHandle, 9401, aVMDLDataLoaderConfigure.mSettingsDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDmDomain)) {
            _setStringValue(this.mHandle, 9402, aVMDLDataLoaderConfigure.mDmDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mForesightDomain)) {
            _setStringValue(this.mHandle, 9403, aVMDLDataLoaderConfigure.mForesightDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDomains)) {
            _setStringValue(this.mHandle, 9404, aVMDLDataLoaderConfigure.mDomains);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyDomain)) {
            _setStringValue(this.mHandle, 9405, aVMDLDataLoaderConfigure.mKeyDomain);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyToken)) {
            _setStringValue(this.mHandle, 9406, aVMDLDataLoaderConfigure.mKeyToken);
        }
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr)) {
            _setStringValue(this.mHandle, 7501, aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr);
        }
        _setIntValue(this.mHandle, 11000, aVMDLDataLoaderConfigure.mEnableP2pUpload);
        _setIntValue(this.mHandle, 11002, aVMDLDataLoaderConfigure.mDevDiskSizeMB);
        _setIntValue(this.mHandle, 11004, aVMDLDataLoaderConfigure.mDevMemorySizeMB);
        if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpExtGlobalInfo)) {
            _setStringValue(this.mHandle, 11001, aVMDLDataLoaderConfigure.mVdpExtGlobalInfo);
        }
        AVMDLDNSParser.setIntValue(0, this.mConfigure.mDNSMainType);
        AVMDLDNSParser.setIntValue(1, this.mConfigure.mDNSBackType);
        AVMDLDNSParser.setIntValue(2, this.mConfigure.mDefaultExpiredTime);
        AVMDLDNSParser.setIntValue(3, this.mConfigure.mMainToBackUpDelayedTime);
        MethodCollector.o(301);
    }

    public void setListener(int i2, AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        if (i2 == 107) {
            try {
                this.mLiveListener = aVMDLDataLoaderListener;
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
        }
        this.mWriteLock.unlock();
    }

    private boolean postMessage(AVMDLDataLoaderListener aVMDLDataLoaderListener, Message message) {
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo;
        if (message.what == 701) {
            AVMDLLog.d("ttmn", "receive hijack err: ");
            hijack();
            return true;
        }
        if (!(aVMDLDataLoaderListener == null || message.obj == null || (aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj) == null)) {
            aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
        return true;
    }

    public int copyFile(String str, String str2) {
        MethodCollector.i(325);
        int i2 = -1;
        if (this.mState != 1) {
            MethodCollector.o(325);
            return -1;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                i2 = _copyFile(j2, str, str2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(325);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(325);
        return i2;
    }

    public long getInt64Value(int i2, long j2) {
        if (i2 == 8003 || i2 == 8004) {
            AVMDLDataLoaderListener aVMDLDataLoaderListener = this.mLiveListener;
            if (aVMDLDataLoaderListener != null) {
                return aVMDLDataLoaderListener.getInt64Value(i2, j2);
            }
            AVMDLLog.e("ttmn", "getInt64Value mLiveListener is nullptr, code: ".concat(String.valueOf(i2)));
        }
        AVMDLLog.d("ttmn", "getInt64Value code: " + i2 + " defaultValue: " + j2);
        return j2;
    }

    public String getStringValueByStr(String str, int i2) {
        MethodCollector.i(593);
        String str2 = null;
        if (this.mState != 1) {
            MethodCollector.o(593);
            return null;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                str2 = _getStringValueByStr(j2, str, i2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            MethodCollector.o(593);
            throw th;
        }
        this.mReadLock.unlock();
        MethodCollector.o(593);
        return str2;
    }

    public void makeFileAutoDeleteFlag(String str, int i2) {
        MethodCollector.i(381);
        if (this.mState != 1) {
            MethodCollector.o(381);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(381);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _makeFileAutoDeleteFlag(j2, str, i2);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(381);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(381);
        }
    }

    public void preConnectByHost(String str, int i2) {
        MethodCollector.i(833);
        if (this.mState != 1) {
            MethodCollector.o(833);
            return;
        }
        this.mWriteLock.lock();
        try {
            _preConnectByHost(this.mHandle, str, i2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(833);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(833);
    }

    public void setBackUpIp(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0, (String) null));
        }
    }

    public void setIntValue(int i2, int i3) {
        MethodCollector.i(817);
        if (this.mState != 1) {
            MethodCollector.o(817);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _setIntValue(j2, i2, i3);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(817);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(817);
    }

    public void setLongValue(int i2, long j2) {
        MethodCollector.i(403);
        if (this.mState != 1) {
            MethodCollector.o(403);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j3 = this.mHandle;
            if (j3 != 0) {
                _setInt64Value(j3, i2, j2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(403);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(403);
    }

    public void setStringValue(int i2, String str) {
        MethodCollector.i(391);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(391);
        } else if (this.mState != 1) {
            MethodCollector.o(391);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _setStringValue(j2, i2, str);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(391);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(391);
        }
    }

    private String createFilePathBaseDir(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str3 = str + str2;
        } else {
            str3 = str + "/" + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str3;
    }

    public static String makeTsFileKey(String str, String str2) {
        MethodCollector.i(1086);
        try {
            String _makeTsFileKey = _makeTsFileKey(str, str2);
            MethodCollector.o(1086);
            return _makeTsFileKey;
        } catch (UnsatisfiedLinkError e2) {
            AVMDLLog.e("AVMDLDataLoader", "makeTsFileKey failed, native not support: " + e2.getMessage());
            MethodCollector.o(1086);
            return null;
        } catch (Exception e3) {
            AVMDLLog.e("AVMDLDataLoader", "makeTsFileKey failed, other reason:  " + e3.getMessage());
            MethodCollector.o(1086);
            return null;
        }
    }

    private boolean postMessage(LoaderListener loaderListener, Message message) {
        LoaderEventInfo loaderEventInfo;
        if (!(loaderListener == null || message.obj == null || (loaderEventInfo = (LoaderEventInfo) message.obj) == null)) {
            if (message.what == 71) {
                loaderListener.onLoaderTaskStart(loaderEventInfo);
                AVMDLLog.d("ttmn", "receive eventLog KeyIsLoaderEventStart");
            } else if (message.what == 72) {
                loaderListener.onLoaderTaskCancel(loaderEventInfo);
                AVMDLLog.d("ttmn", "receive eventLog KeyIsLoaderEventCancel");
            } else if (message.what == 73) {
                loaderListener.onLoaderTaskCompleted(loaderEventInfo);
                AVMDLLog.d("ttmn", "receive eventLog KeyIsLoaderEventCompleted");
            } else {
                AVMDLLog.d("ttmn", "receive eventLog fail");
            }
        }
        return true;
    }

    public void addDataSource(int i2, String str) {
        MethodCollector.i(1062);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(1062);
            return;
        }
        AVMDLLog.d("AVMDLDataLoader", "addDataSource: id: " + i2 + ", queyr: " + str);
        this.mWriteLock.lock();
        try {
            _addDataSource(this.mHandle, i2, str);
        } catch (Exception | UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(1062);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(1062);
    }

    public long getLongValueByStr(String str, int i2) {
        MethodCollector.i(592);
        long j2 = -1;
        if (this.mState != 1) {
            MethodCollector.o(592);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(592);
            return -1;
        } else {
            this.mWriteLock.lock();
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    j2 = _getLongValueByStr(j3, str, i2);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(592);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(592);
            return j2;
        }
    }

    public void preloadResource(String str, int i2) {
        MethodCollector.i(383);
        if (this.mState != 1) {
            MethodCollector.o(383);
        } else if (TextUtils.isEmpty(str) || i2 == 0) {
            MethodCollector.o(383);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _preloadResource(j2, str, i2);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(383);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(383);
        }
    }

    public long tryToClearAndGetCachesByUsedTime(long j2, boolean z) {
        MethodCollector.i(371);
        int i2 = 1;
        long j3 = 0;
        if (this.mState != 1) {
            MethodCollector.o(371);
            return 0;
        }
        this.mWriteLock.lock();
        try {
            long j4 = this.mHandle;
            if (j4 != 0) {
                if (!z) {
                    i2 = 0;
                }
                j3 = _clearAndGetCachesByUsedTime(j4, j2, i2);
            }
        } catch (UnsatisfiedLinkError e2) {
            com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("testcacheinterface", "call exception" + e2.getMessage());
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(371);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(371);
        return j3;
    }

    public static synchronized int init(boolean z, boolean z2) {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.i(313);
            if (mIsLibraryLoaded) {
                MethodCollector.o(313);
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!z) {
                if (!com.bytedance.e.a.a.a()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn ");
                }
                loadAVMDLBaseLibrary();
                try {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e2) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e2)));
                } catch (Throwable th) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th)));
                }
                if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcnverify lib ");
                }
                if (z2) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to load pcdn lib");
                    try {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlp2p");
                    } catch (UnsatisfiedLinkError e3) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdlp2p library: ".concat(String.valueOf(e3)));
                    } catch (Throwable th2) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
                    }
                }
                tryLoadTTNetLoaderPlugin();
            }
            if (!mIsLibraryLoaded) {
                MethodCollector.o(313);
                return -1;
            }
            MethodCollector.o(313);
            return 0;
        }
    }

    public long getCacheSize(String str, String str2) {
        MethodCollector.i(585);
        long j2 = -1;
        if (this.mState != 1) {
            MethodCollector.o(585);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(585);
            return -1;
        } else if (TextUtils.isEmpty(str2)) {
            MethodCollector.o(585);
            return -1;
        } else {
            this.mReadLock.lock();
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    j2 = _getLongValueByStrStr(j3, str, str2, 103);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.o(585);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.o(585);
            return j2;
        }
    }

    public String getStringCacheInfo(String str, String str2) {
        MethodCollector.i(608);
        String str3 = null;
        if (this.mState != 1) {
            MethodCollector.o(608);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(608);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            MethodCollector.o(608);
            return null;
        } else {
            this.mReadLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    str3 = _getStringValueByStrStr(j2, str, str2, 101);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                MethodCollector.o(608);
                throw th;
            }
            this.mReadLock.unlock();
            MethodCollector.o(608);
            return str3;
        }
    }

    public void onLogInfo(int i2, int i3, String str) {
        onLogInfo(i2, i3, -1, str);
    }

    public String getStringValueByStrkey(int i2, long j2, String str) {
        if (this.mState != 1) {
            return null;
        }
        if (i2 != 1503) {
            if ((i2 == 1506 || i2 == 1509) && this.mVodListener != null && !TextUtils.isEmpty(str)) {
                return this.mVodListener.getStringValue(i2, j2, str);
            }
            return null;
        } else if (this.mVodListener == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            return this.mVodListener.getCheckSumInfo(str);
        }
    }

    public void onNotify(int i2, long j2, int i3) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i2;
            aVMDLDataLoaderNotifyInfo.parameter = j2;
            aVMDLDataLoaderNotifyInfo.code = (long) i3;
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.what = i2;
            obtainMessage.sendToTarget();
        }
    }

    public void setInt64ValueByStrKey(int i2, String str, long j2) {
        MethodCollector.i(397);
        if (this.mState != 1) {
            MethodCollector.o(397);
            return;
        }
        this.mWriteLock.lock();
        try {
            long j3 = this.mHandle;
            if (j3 != 0) {
                _setInt64ValueByStrKey(j3, i2, str, j2);
            }
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(397);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(397);
    }

    private double testFileIO(String str, int i2, RandomAccessFile randomAccessFile) {
        MethodCollector.i(351);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(351);
            return -1.0d;
        }
        long currentTimeMillis = System.currentTimeMillis();
        randomAccessFile.seek((long) i2);
        byte[] bArr = new byte[4096];
        int i3 = 0;
        do {
            Thread.sleep(5);
            randomAccessFile.write(bArr, 0, 1024);
            i3++;
        } while (i3 < 200);
        long currentTimeMillis2 = ((System.currentTimeMillis() - currentTimeMillis) - 1000) + 0;
        if (currentTimeMillis2 > 0) {
            AVMDLLog.d("BENCHMARKIO", a.a("size:%d costtime:%d", new Object[]{819200, Long.valueOf(currentTimeMillis2)}));
            double d2 = (double) (819200 / currentTimeMillis2);
            MethodCollector.o(351);
            return d2;
        }
        MethodCollector.o(351);
        return -1.0d;
    }

    public void preloadResource(String str, int i2, int i3) {
        MethodCollector.i(385);
        if (this.mState != 1) {
            MethodCollector.o(385);
        } else if (TextUtils.isEmpty(str) || i3 == 0) {
            MethodCollector.o(385);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _preloadResourceWithOffset(j2, str, i2, i3);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(385);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(385);
        }
    }

    public static synchronized int init(boolean z, boolean z2, boolean z3) {
        synchronized (AVMDLDataLoader.class) {
            MethodCollector.i(315);
            if (mIsLibraryLoaded) {
                MethodCollector.o(315);
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!z) {
                if (!com.bytedance.e.a.a.a()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn ");
                }
                if (z3) {
                    try {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlv2");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e2) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "load avmdlv2 failed: ".concat(String.valueOf(e2)));
                    }
                }
                if (!mIsLibraryLoaded) {
                    try {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdl");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e3) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e3)));
                    } catch (Throwable th) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th)));
                    }
                    if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcnverify lib ");
                    }
                    if (z2) {
                        com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "try to load pcdn lib");
                        try {
                            com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlp2p");
                        } catch (UnsatisfiedLinkError e4) {
                            com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdlp2p library: ".concat(String.valueOf(e4)));
                        } catch (Throwable th2) {
                            com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
                        }
                    }
                    tryLoadTTNetLoaderPlugin();
                }
            }
            if (!mIsLibraryLoaded) {
                MethodCollector.o(315);
                return -1;
            }
            MethodCollector.o(315);
            return 0;
        }
    }

    public void preloadGroupResource(String str, String str2, int i2, int i3) {
        MethodCollector.i(387);
        if (this.mState != 1) {
            MethodCollector.o(387);
        } else if (TextUtils.isEmpty(str2) || i3 == 0) {
            MethodCollector.o(387);
        } else {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _preloadGroupResource(j2, str, str2, i2, i3);
                }
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                MethodCollector.o(387);
                throw th;
            }
            this.mWriteLock.unlock();
            MethodCollector.o(387);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:44|(1:46)(2:48|(1:50))|47|51|(2:52|53)|54|56|57|58|59|60|(1:63)(1:62)|64|(1:66)(1:86)|67|(1:69)|70|(1:72)(1:85)|73|(1:75)(1:84)|76|(1:78)(1:83)|79|(1:81)|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a1, code lost:
        if (0 != 1) goto L_0x0088;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x010e */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLogInfo(int r15, int r16, int r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.onLogInfo(int, int, int, java.lang.String):void");
    }

    public void updateDNSInfo(String str, String str2, long j2, String str3, int i2) {
        MethodCollector.i(967);
        if (this.mState != 1) {
            MethodCollector.o(967);
            return;
        }
        this.mWriteLock.lock();
        try {
            _updateDNSInfo(this.mHandle, str, str2, j2, str3, i2);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            MethodCollector.o(967);
            throw th;
        }
        this.mWriteLock.unlock();
        MethodCollector.o(967);
    }

    public synchronized void onTaskEvent(int i2, String str, int i3, int i4, String str2) {
        JSONObject jSONObject;
        MethodCollector.i(1089);
        if (this.mTaskListener == null) {
            MethodCollector.o(1089);
        } else if (!AVMDLTaskEventID.taskTypeIsValid(i3)) {
            MethodCollector.o(1089);
        } else if (!AVMDLTaskEventID.eventTypeIsValid(i4)) {
            MethodCollector.o(1089);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.o(1089);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception unused) {
                }
                this.mTaskListener.onTaskEventNotify(i2, str, i3, i4, jSONObject);
                MethodCollector.o(1089);
            }
            jSONObject = null;
            this.mTaskListener.onTaskEventNotify(i2, str, i3, i4, jSONObject);
            MethodCollector.o(1089);
        }
    }
}
