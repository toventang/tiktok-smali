package com.ss.android.ml;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f59923a;

    /* renamed from: b  reason: collision with root package name */
    private static char[] f59924b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(37036);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String a(String str) {
        int indexOf;
        String b2 = b(str);
        if (!TextUtils.isEmpty(b2) && (indexOf = b2.indexOf(".")) != -1) {
            return b2.substring(0, indexOf);
        }
        return "";
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(f59924b[(b2 & 240) >> 4]);
                sb.append(f59924b[b2 & 15]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            int lastIndexOf = path.lastIndexOf(47);
            if (lastIndexOf == -1) {
                return "";
            }
            return path.substring(lastIndexOf + 1);
        } catch (MalformedURLException e2) {
            k.a("ml#evaluator", "Utils getName error!", e2);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[SYNTHETIC, Splitter:B:26:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b A[SYNTHETIC, Splitter:B:33:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r10) {
        /*
            r9 = 11621(0x2d65, float:1.6284E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r9)
            boolean r0 = r10.isFile()
            java.lang.String r8 = ""
            if (r0 != 0) goto L_0x0011
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r9)
            return r8
        L_0x0011:
            r7 = 0
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r6]
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0047 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0047 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0047 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0047 }
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
            java.lang.String r0 = b(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r9)
            return r0
        L_0x0041:
            r0 = move-exception
            r7 = r3
            goto L_0x0059
        L_0x0044:
            r2 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x0047:
            r2 = move-exception
        L_0x0048:
            java.lang.String r1 = "ml#evaluator"
            java.lang.String r0 = "Utils getFileMD5 error!"
            com.ss.android.ml.k.a(r1, r0, r2)     // Catch:{ all -> 0x0058 }
            if (r7 == 0) goto L_0x0054
            r7.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r9)
            return r8
        L_0x0058:
            r0 = move-exception
        L_0x0059:
            if (r7 == 0) goto L_0x005e
            r7.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.t.a(java.io.File):java.lang.String");
    }

    private static String b(byte[] bArr) {
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

    private static boolean c(File file) {
        MethodCollector.i(11444);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11444);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11444);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[SYNTHETIC, Splitter:B:18:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(java.io.File r5) {
        /*
            r4 = 11779(0x2e03, float:1.6506E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            long r1 = r5.length()
            int r0 = (int) r1
            byte[] r3 = new byte[r0]
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r2.<init>(r5)     // Catch:{ all -> 0x0033 }
            int r1 = r2.read(r3)     // Catch:{ all -> 0x0030 }
            r0 = -1
            if (r1 == r0) goto L_0x0025
            r2.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0021:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x0025:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "EOF reached while trying to read the whole file"
            r1.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x0030:
            r1 = move-exception
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r1 = move-exception
        L_0x0034:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.t.b(java.io.File):byte[]");
    }

    public static void a(Throwable th) {
        h hVar = i.a().f59856b.f59862f;
        if (hVar != null) {
            hVar.a(th);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0017 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0017 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r10v12, resolved type: java.io.BufferedOutputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r10v13, resolved type: java.io.BufferedOutputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r12, java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.t.a(java.io.File, java.io.File):java.lang.String");
    }
}
