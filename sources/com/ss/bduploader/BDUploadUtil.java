package com.ss.bduploader;

import android.content.Context;
import android.os.SystemClock;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class BDUploadUtil {
    public static String DiskResumeConfigDir = "DiskResumeConfigDir";
    public static String SpeedTestcontextDir = "SpeedTestcontextDir";
    public static VideoEventEngineUploader eventEngineUploader = null;
    private static volatile boolean mIsLibraryLoaded;
    private static final ReentrantLock mLock = new ReentrantLock();
    private static volatile BDLibraryLoaderProxy mProxy;
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;
    public static String sdkConfigDir;

    public static int com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    static {
        Covode.recordClassIndex(100662);
    }

    private static boolean loadVcn() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn");
        }
        if (VcnlibloadWrapper.tryLoadVcnverifylib()) {
            return true;
        }
        com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn verify");
        return true;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (BDUploadUtil.class) {
            MethodCollector.i(28);
            if (SystemClock.elapsedRealtime() - mServerIPTime < 300000) {
                MethodCollector.o(28);
                return;
            }
            new Thread(new Runnable() {
                /* class com.ss.bduploader.BDUploadUtil.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100663);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            BDUploadUtil.mServerIP = byName.getHostAddress();
                            BDUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            }).start();
            MethodCollector.o(28);
        }
    }

    public static synchronized boolean initInternal() {
        boolean z;
        synchronized (BDUploadUtil.class) {
            MethodCollector.i(4020);
            if (!loadLibrary()) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", a.a("proxy library load fail", new Object[0]));
                MethodCollector.o(4020);
                return false;
            }
            com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_d("ttmn", "use defaullt loadLibrary()");
            if (mProxy != null) {
                z = true;
            } else {
                z = false;
            }
            if (systemLoadInit(z) != 1) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", a.a("library has not been loaded", new Object[0]));
                MethodCollector.o(4020);
                return false;
            }
            com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_d("ttmn", "init()");
            MethodCollector.o(4020);
            return true;
        }
    }

    private static boolean loadLibrary() {
        boolean z;
        boolean z2 = true;
        if (mProxy == null) {
            return true;
        }
        if (mProxy != null && !mIsLibraryLoaded) {
            boolean a2 = com.bytedance.e.a.a.a();
            boolean loadLibrary = mProxy.loadLibrary("ttopenssl");
            if (a2 || loadLibrary) {
                z = true;
            } else {
                z = false;
            }
            mProxy.loadLibrary("vcn");
            mProxy.loadLibrary("vcnverify");
            boolean loadLibrary2 = mProxy.loadLibrary("bdvideouploader");
            if (!z || !loadLibrary2) {
                z2 = false;
            }
            mIsLibraryLoaded = z2;
        }
        return mIsLibraryLoaded;
    }

    public static void setVideoEventUpload(VideoEventEngineUploader videoEventEngineUploader) {
        eventEngineUploader = videoEventEngineUploader;
    }

    public static void com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static void setSDKConfigDir(String str) {
        String str2 = sdkConfigDir;
        if (str2 == null || str2.length() <= 0) {
            sdkConfigDir = str;
        }
    }

    public static Map<String, String> jsonToHashMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String valueOf = String.valueOf(keys.next());
            hashMap.put(valueOf, jSONObject.optString(valueOf));
        }
        return hashMap;
    }

    public static void setLoadProxy(BDLibraryLoaderProxy bDLibraryLoaderProxy) {
        ReentrantLock reentrantLock = mLock;
        reentrantLock.lock();
        if (bDLibraryLoaderProxy != null) {
            try {
                mProxy = bDLibraryLoaderProxy;
            } catch (Throwable th) {
                mLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!com.bytedance.common.utility.m.a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!com.bytedance.common.utility.m.a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int createDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_v("ttmn", str + " has already exists");
            return 1;
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        if (file.mkdirs()) {
            com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_d("ttmn", str + "create success");
            return 1;
        }
        com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", str + " failed");
        return -1;
    }

    private static int systemLoadInit(boolean z) {
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!z) {
            if (!com.bytedance.e.a.a.a()) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "load boringssl fail!");
            }
            if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn");
            }
            if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load vcn verify");
            }
            try {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "load openssl");
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("ttopenssl");
            } catch (UnsatisfiedLinkError e2) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load openssl library: ".concat(String.valueOf(e2)));
            } catch (Throwable th) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading openssl library: ".concat(String.valueOf(th)));
            }
            try {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bdvideouploader");
                mIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "Can't load avmdl library: ".concat(String.valueOf(e3)));
            } catch (Throwable th2) {
                com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", "other exception when loading avmdl library: ".concat(String.valueOf(th2)));
            }
        }
        if (!mIsLibraryLoaded) {
            return -1;
        }
        return 1;
    }
}
