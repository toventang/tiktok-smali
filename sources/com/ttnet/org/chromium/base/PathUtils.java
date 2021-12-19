package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PathUtils {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155166a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f155167b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static FutureTask<String[]> f155168c;

    /* renamed from: d  reason: collision with root package name */
    private static String f155169d;

    /* renamed from: e  reason: collision with root package name */
    private static String f155170e;

    private PathUtils() {
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f155171a = PathUtils.a();

        static {
            Covode.recordClassIndex(103271);
        }
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    static {
        Covode.recordClassIndex(103270);
    }

    public static String getCacheDirectory() {
        if (f155166a || f155168c != null) {
            return a.f155171a[2];
        }
        throw new AssertionError("setDataDirectorySuffix must be called first.");
    }

    public static String getDataDirectory() {
        if (f155166a || f155168c != null) {
            return a.f155171a[0];
        }
        throw new AssertionError("setDataDirectorySuffix must be called first.");
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = c.f155223a.getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    public static String getThumbnailCacheDirectory() {
        if (f155166a || f155168c != null) {
            return a.f155171a[1];
        }
        throw new AssertionError("setDataDirectorySuffix must be called first.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDownloadsDirectory() {
        /*
            com.ttnet.org.chromium.base.m r3 = com.ttnet.org.chromium.base.m.b()
            boolean r0 = com.ttnet.org.chromium.base.BuildInfo.a()     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r1 = getAllPrivateDownloadsDirectories()     // Catch:{ all -> 0x0024 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0024 }
            a(r2, r3)
            return r0
        L_0x0016:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = r0.getPath()
            a(r2, r3)
            return r0
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            a(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.getDownloadsDirectory():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getAllPrivateDownloadsDirectories() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 19
            com.ttnet.org.chromium.base.m r3 = com.ttnet.org.chromium.base.m.a()
            android.content.Context r1 = com.ttnet.org.chromium.base.c.f155223a     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ all -> 0x0046 }
            java.io.File[] r2 = r1.getExternalFilesDirs(r0)     // Catch:{ all -> 0x0046 }
            r0 = 0
            a(r0, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x001a:
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0039
            r0 = r2[r4]
            if (r0 == 0) goto L_0x0036
            r0 = r2[r4]
            java.lang.String r0 = r0.getAbsolutePath()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0036
            r0 = r2[r4]
            java.lang.String r0 = r0.getAbsolutePath()
            r1.add(r0)
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0039:
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            a(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.getAllPrivateDownloadsDirectories():java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a() {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.PathUtils.a():java.lang.String[]");
    }

    private static File a(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }
}
