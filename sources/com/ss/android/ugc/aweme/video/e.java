package com.ss.android.ugc.aweme.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Context f143371a;

    static {
        Covode.recordClassIndex(93829);
    }

    public static boolean a(String str, String str2) {
        MethodCollector.i(2109);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            MethodCollector.o(2109);
            return true;
        }
        try {
            FileWriter fileWriter = new FileWriter(str, false);
            fileWriter.write(str2);
            fileWriter.flush();
            fileWriter.close();
            MethodCollector.o(2109);
            return true;
        } catch (Exception unused) {
            MethodCollector.o(2109);
            return false;
        }
    }

    public static String c() {
        return c(f143371a).getPath();
    }

    public static boolean e() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public static long f() {
        if (!d()) {
            return 0;
        }
        return d.b(com.bytedance.ies.ugc.appcontext.d.a());
    }

    public static File a() {
        if (!d() || !e()) {
            return null;
        }
        File file = new File(b(f143371a), "video");
        a(file);
        file.getAbsolutePath();
        return file;
    }

    public static File b() {
        if (!d() || !e()) {
            return null;
        }
        File file = new File(b(f143371a), "picture");
        a(file);
        file.getAbsolutePath();
        return file;
    }

    public static boolean d() {
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return h(f143371a);
        }
    }

    public static void a(Context context) {
        Objects.requireNonNull(context);
        f143371a = context;
    }

    public static void a(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static File b(Context context) {
        File d2 = d(context);
        if (d2 == null) {
            return e(context);
        }
        return d2;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static File c(Context context) {
        File f2;
        if (Environment.isExternalStorageEmulated() || (f2 = g(context)) == null) {
            f2 = f(context);
        } else {
            a(f2);
        }
        f2.getAbsolutePath();
        return f2;
    }

    private static File d(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    private static File e(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private static File g(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str) && e()) {
            File file = new File(str);
            if (!file.exists() || !c(file)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void e(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        c(file2);
                    }
                }
            }
        }
    }

    private static File f(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    public static void b(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            b(file2);
                        } else {
                            c(file2);
                        }
                    }
                    c(file);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean c(File file) {
        MethodCollector.i(2091);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(2091);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2091);
        return delete;
    }

    public static long d(String str) {
        long j2;
        long j3 = 0;
        try {
            if (e()) {
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            File[] listFiles = file.listFiles();
                            if (listFiles == null) {
                                return 0;
                            }
                            for (File file2 : listFiles) {
                                if (file2.isFile()) {
                                    j2 = file2.length();
                                } else if (file2.isDirectory()) {
                                    j2 = d(file2.getAbsolutePath());
                                }
                                j3 += j2;
                            }
                            return j3;
                        }
                    }
                }
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045 A[SYNTHETIC, Splitter:B:30:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.String r7) {
        /*
            r6 = 2116(0x844, float:2.965E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 0
            if (r0 == 0) goto L_0x0010
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        L_0x0010:
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0042, all -> 0x0038 }
            r4.<init>(r7)     // Catch:{ Exception -> 0x0042, all -> 0x0038 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r3.<init>()     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r0]     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
        L_0x001e:
            int r1 = r4.read(r2)     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r0 = -1
            if (r1 == r0) goto L_0x002a
            r0 = 0
            r3.append(r2, r0, r1)     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            goto L_0x001e
        L_0x002a:
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0043, all -> 0x0035 }
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x0035:
            r0 = move-exception
            r5 = r4
            goto L_0x0039
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r5.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        L_0x0042:
            r4 = r5
        L_0x0043:
            if (r4 == 0) goto L_0x0048
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.e.f(java.lang.String):java.lang.String");
    }

    public static File a(String str) {
        if (!d() || !e() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(b(f143371a), str);
        a(file);
        file.getAbsolutePath();
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[Catch:{ Exception -> 0x0095 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean h(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.e.h(android.content.Context):boolean");
    }

    public static void b(String str, String str2) {
        a(str, str2, true);
    }

    public static File a(File file, String str) {
        if (!d() || !e() || TextUtils.isEmpty(str)) {
            return null;
        }
        if (file == null) {
            file = b(f143371a);
        }
        File file2 = new File(file, str);
        a(file2);
        file2.getAbsolutePath();
        return file2;
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        a(str2, true);
        return d(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0096, code lost:
        if (r11 == null) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[SYNTHETIC, Splitter:B:42:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006c A[Catch:{ IOException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0071 A[Catch:{ IOException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0076 A[Catch:{ IOException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b7 A[SYNTHETIC, Splitter:B:80:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00bc A[Catch:{ IOException -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00c1 A[Catch:{ IOException -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00c6 A[Catch:{ IOException -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.e.d(java.lang.String, java.lang.String):boolean");
    }

    public static File a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                file.mkdirs();
            } else {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return file;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2164);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2164);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(String str, String str2, boolean z) {
        File[] listFiles;
        if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                File file2 = new File(str2);
                if (!file2.exists() || !file2.isDirectory()) {
                    file2.mkdirs();
                }
                for (File file3 : listFiles) {
                    if (!z || !file3.isDirectory()) {
                        d(file3.getPath(), str2 + file3.getName());
                    } else {
                        a(file3.getPath(), str2 + file3.getName() + File.separator, z);
                    }
                }
            }
        }
    }
}
