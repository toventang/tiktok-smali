package com.ss.android.ugc.tools.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.a.a.c.a;
import c.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.tools.utils.h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class i {
    static {
        Covode.recordClassIndex(98751);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!h.f149997b || !h.b(str)) {
            return new File(str).exists();
        }
        return h.a(str, (h.b) null);
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        a(str2, true);
        return b(str, str2);
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(2291);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    a((Closeable) inputStream);
                    a(outputStream);
                    MethodCollector.o(2291);
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                a((Closeable) inputStream);
                a(outputStream);
                MethodCollector.o(2291);
                return false;
            } catch (Throwable th) {
                a((Closeable) inputStream);
                a(outputStream);
                MethodCollector.o(2291);
                throw th;
            }
        }
    }

    private static boolean a() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public static long a(Context context) {
        return d.b(context);
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static int b(File file) {
        try {
            return e(file);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean c(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    public static File b(Context context) {
        File d2;
        if (Environment.isExternalStorageEmulated() || (d2 = d(context)) == null) {
            return c(context);
        }
        c(d2);
        return d2;
    }

    private static File c(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private static File d(Context context) {
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

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str) && a()) {
            File file = new File(str);
            if (!file.exists() || !d(file)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void c(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    } else {
                        d(file2);
                    }
                }
            }
        }
    }

    private static int e(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            return 0;
        }
        File[] listFiles = file.listFiles();
        int i2 = 0;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                i2 += e(file2);
            } else if (file2.isFile() && file2.exists()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.InputStream r7) {
        /*
            r6 = 2287(0x8ef, float:3.205E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r2 = new char[r0]     // Catch:{ Exception -> 0x0030 }
        L_0x0014:
            r0 = -1
            int r1 = r3.read(r2)     // Catch:{ Exception -> 0x0030 }
            if (r0 == r1) goto L_0x0020
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0014
        L_0x0020:
            r3.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0028:
            java.lang.String r0 = r5.toString()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x0030:
            r0 = move-exception
            goto L_0x0036
        L_0x0032:
            r1 = move-exception
            goto L_0x003c
        L_0x0034:
            r0 = move-exception
            r3 = r4
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x004a
        L_0x003a:
            r1 = move-exception
            r4 = r3
        L_0x003c:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0046:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r1
        L_0x004a:
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.i.a(java.io.InputStream):java.lang.String");
    }

    private static boolean d(File file) {
        MethodCollector.i(2244);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2244);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2244);
        return delete;
    }

    public static void a(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            a(file2);
                        } else {
                            d(file2);
                        }
                    }
                    d(file);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
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
    private static boolean b(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.i.b(java.lang.String, java.lang.String):boolean");
    }

    private static void a(File file, a<File, Boolean> aVar) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            a(file2, aVar);
                        } else if (aVar.a(file2).booleanValue()) {
                            d(file2);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, a<File, Boolean> aVar) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2, aVar);
                    } else if (aVar.a(file2).booleanValue()) {
                        d(file2);
                    }
                }
            }
        }
    }

    public static void a(String str, h.b bVar) {
        if (TextUtils.isEmpty(str)) {
            bVar.a(false);
        } else if (!h.f149997b || !h.b(str)) {
            bVar.a(Boolean.valueOf(new File(str).exists()));
        } else {
            h.a(str, bVar);
        }
    }
}
