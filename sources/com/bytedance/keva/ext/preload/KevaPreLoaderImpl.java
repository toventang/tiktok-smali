package com.bytedance.keva.ext.preload;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.IKevaPreLoader;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* access modifiers changed from: package-private */
public final class KevaPreLoaderImpl implements IKevaPreLoader {
    private final FixedSizeCache<String, Integer> mCache;
    private final boolean mEnableRecord;
    private final Executor mExecutor;
    private volatile boolean mIsPreloading;
    private final long mLastModifiedTime;
    private final String mName;
    private final long mPreloadConfigExpiredInMills;
    private final Object mPreloadEndLock = new Object();
    private final File mPreloadFile;
    private final long mPreloadTimeInMills;
    private boolean mRecordEnd;
    private final long mStartTickMills;
    private final File mWorkDir;

    static {
        Covode.recordClassIndex(24536);
    }

    public static int com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.keva.IKevaPreLoader
    public final void preload() {
        this.mExecutor.execute(new KevaPreLoaderImpl$$Lambda$1(this));
    }

    private String getCurrentProcessPreloadFileName() {
        return getCurrentProcessName() + ":keva-preload-list";
    }

    /* access modifiers changed from: private */
    /* renamed from: recordEnd */
    public void bridge$lambda$0$KevaPreLoaderImpl() {
        MethodCollector.i(8332);
        synchronized (this) {
            try {
                this.mRecordEnd = true;
                writeCache2File();
            } finally {
                MethodCollector.o(8332);
            }
        }
    }

    private String checkParentDirs() {
        String absolutePath = this.mWorkDir.getAbsolutePath();
        if (!new File(absolutePath).exists()) {
            return null;
        }
        String str = absolutePath + "/repo";
        if (new File(str).exists()) {
            return str;
        }
        return null;
    }

    private String getCurrentProcessName() {
        String[] split = getCurrentProcessNameSuffix().split(":");
        if (split.length < 2) {
            return "main";
        }
        String str = split[split.length - 1];
        int indexOf = str.indexOf(10);
        if (indexOf <= 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    private String getCurrentProcessNameSuffix() {
        Throwable th;
        MethodCollector.i(8327);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/" + ((long) Process.myPid()) + "/comm");
            try {
                byte[] bArr = new byte[64];
                int read = fileInputStream2.read(bArr);
                if (read <= 0) {
                    w("read comm failed = ".concat(String.valueOf(read)));
                    close(fileInputStream2);
                    MethodCollector.o(8327);
                    return "";
                }
                String str = new String(bArr);
                close(fileInputStream2);
                MethodCollector.o(8327);
                return str;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    e("getProcessName:", th);
                    return "";
                } finally {
                    close(fileInputStream);
                    MethodCollector.o(8327);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            e("getProcessName:", th);
            return "";
        }
    }

    private void writeCache2File() {
        if (checkParentDirs() != null && this.mCache.size() != 0) {
            File file = this.mPreloadFile;
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis() - this.mLastModifiedTime;
                d("exist preload file, duration = ".concat(String.valueOf(currentTimeMillis)));
                if (currentTimeMillis > this.mPreloadConfigExpiredInMills) {
                    if (this.mIsPreloading) {
                        this.mExecutor.execute(new KevaPreLoaderImpl$$Lambda$3(this, file));
                        return;
                    }
                    d("remove reload file = " + com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_storage_FileLancet_delete(file));
                }
            }
            d("preload file name = " + file.getName());
            doRealWrite(file);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b2 A[SYNTHETIC, Splitter:B:80:0x01b2] */
    /* renamed from: doPreload */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bridge$lambda$1$KevaPreLoaderImpl() {
        /*
        // Method dump skipped, instructions count: 505
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.ext.preload.KevaPreLoaderImpl.bridge$lambda$1$KevaPreLoaderImpl():void");
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void d(String str) {
        com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("PreloadMgr", str);
    }

    private void w(String str) {
        com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_w("PreloadMgr", str);
    }

    private void doRealWrite(File file) {
        this.mExecutor.execute(new KevaPreLoaderImpl$$Lambda$4(this, file, this.mCache.snapshot()));
    }

    public static boolean com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(8566);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(8566);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8566);
        return delete;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$writeCache2File$1$KevaPreLoaderImpl(File file) {
        MethodCollector.i(8593);
        d("wait preload end...");
        while (this.mIsPreloading) {
            synchronized (this.mPreloadEndLock) {
                try {
                    this.mPreloadEndLock.wait();
                    d("preload end");
                } catch (Throwable th) {
                    MethodCollector.o(8593);
                    throw th;
                }
            }
        }
        d("remove preload file = " + com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_storage_FileLancet_delete(file));
        doRealWrite(file);
        MethodCollector.o(8593);
    }

    private void e(String str, Throwable th) {
        com_bytedance_keva_ext_preload_KevaPreLoaderImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("PreloadMgr", str, th);
    }

    @Override // com.bytedance.keva.IKevaPreLoader
    public final synchronized void access(String str, int i2) {
        MethodCollector.i(8348);
        if (i2 == 1 || str == null || str.equals("")) {
            MethodCollector.o(8348);
        } else if (this.mRecordEnd || !this.mEnableRecord) {
            MethodCollector.o(8348);
        } else {
            if (System.currentTimeMillis() - this.mStartTickMills < this.mPreloadTimeInMills) {
                Integer num = this.mCache.get(str);
                if (num == null) {
                    this.mCache.put(str, 1);
                    MethodCollector.o(8348);
                    return;
                }
                this.mCache.put(str, Integer.valueOf(num.intValue() + 1));
            }
            MethodCollector.o(8348);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doRealWrite$2$KevaPreLoaderImpl(File file, Map map) {
        Throwable th;
        MethodCollector.i(8590);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            d("write to file = " + file.getAbsolutePath());
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream2.write((file.getName() + "\n").getBytes());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    bufferedOutputStream2.write((((String) ((Map.Entry) it.next()).getKey()) + "\n").getBytes());
                }
                d("write preload done");
                close(bufferedOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e("write file:", th);
                    close(bufferedOutputStream);
                    MethodCollector.o(8590);
                } catch (Throwable th3) {
                    close(bufferedOutputStream);
                    MethodCollector.o(8590);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            e("write file:", th);
            close(bufferedOutputStream);
            MethodCollector.o(8590);
        }
        MethodCollector.o(8590);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$doPreload$0$KevaPreLoaderImpl(String str, AtomicLong atomicLong, long j2) {
        Keva.getRepoSync(str, 0);
        atomicLong.decrementAndGet();
        if (atomicLong.get() == 0) {
            d("preload file duration = ".concat(String.valueOf(System.currentTimeMillis() - j2)));
        }
    }

    KevaPreLoaderImpl(File file, Executor executor, long j2, int i2, long j3) {
        boolean z;
        long j4 = 0;
        if (j2 <= 0) {
            throw new IllegalArgumentException("preloadTimeInMills <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("maxRepos <= 0");
        } else if (executor != null) {
            this.mPreloadConfigExpiredInMills = j3;
            this.mWorkDir = file;
            this.mPreloadTimeInMills = j2;
            this.mStartTickMills = System.currentTimeMillis();
            this.mCache = new FixedSizeCache<>(i2);
            String currentProcessPreloadFileName = getCurrentProcessPreloadFileName();
            this.mName = currentProcessPreloadFileName;
            File file2 = new File(file, currentProcessPreloadFileName);
            this.mPreloadFile = file2;
            j4 = file2.exists() ? file2.lastModified() : j4;
            this.mLastModifiedTime = j4;
            this.mExecutor = executor;
            if (System.currentTimeMillis() - j4 > j3) {
                z = true;
            } else {
                z = false;
            }
            this.mEnableRecord = z;
            if (z) {
                new Handler(Looper.getMainLooper()).postDelayed(new KevaPreLoaderImpl$$Lambda$0(this), j2);
            }
        } else {
            throw new IllegalArgumentException("executor = null");
        }
    }
}
