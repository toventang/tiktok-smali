package com.benchmark.tools;

import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public final class b {
    static {
        Covode.recordClassIndex(3056);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static long b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                b(file);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058 A[SYNTHETIC, Splitter:B:32:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r9) {
        /*
            r8 = 1155(0x483, float:1.618E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r8)
            boolean r0 = r9.isFile()
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x0011
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r7
        L_0x0011:
            r1 = 0
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r6]
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0047 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0047 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0047 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0047 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0047 }
        L_0x0026:
            r2 = 0
            int r1 = r3.read(r5, r2, r6)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            r0 = -1
            if (r1 == r0) goto L_0x0032
            r4.update(r5, r2, r1)     // Catch:{ Exception -> 0x0044, all -> 0x0041 }
            goto L_0x0026
        L_0x0032:
            r3.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            byte[] r0 = r4.digest()
            java.lang.String r0 = a(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r0
        L_0x0041:
            r0 = move-exception
            r1 = r3
            goto L_0x004d
        L_0x0044:
            r0 = move-exception
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            r0.printStackTrace()     // Catch:{ all -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            throw r0
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.tools.b.a(java.io.File):java.lang.String");
    }

    private static boolean b(File file) {
        MethodCollector.i(1148);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1148);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1148);
        return delete;
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            cArr2[i2] = cArr[(b2 >>> 4) & 15];
            i2 = i3 + 1;
            cArr2[i3] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }
}
