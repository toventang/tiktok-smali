package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import c.b.d;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.codec.binary.Base64;

public final class cs {
    static {
        Covode.recordClassIndex(93403);
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

    public static void c(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        c(file2.getPath());
                    } else {
                        a(file2);
                    }
                }
                a(file);
            }
        }
    }

    public static String b(String str) {
        byte[] a2;
        MethodCollector.i(911);
        if (str.startsWith("content://")) {
            Uri parse = Uri.parse(str);
            a2 = a(d.a(com.bytedance.ies.ugc.appcontext.d.a(), parse), e.a(com.bytedance.ies.ugc.appcontext.d.a(), parse), str);
        } else {
            File file = new File(str);
            a2 = a(new FileInputStream(file), file.length(), file.getName());
        }
        String str2 = new String(Base64.encodeBase64(a2));
        MethodCollector.o(911);
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC, Splitter:B:27:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(java.lang.String r5) {
        /*
            r4 = 925(0x39d, float:1.296E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003a }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003a }
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r1 = r0 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            int r1 = r1 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            int r1 = r1 << 8
            int r0 = r2.read()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = r1 ^ r0
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        L_0x0034:
            r1 = move-exception
            r3 = r2
            goto L_0x0040
        L_0x0037:
            r0 = move-exception
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            r0.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x004e
        L_0x003f:
            r1 = move-exception
        L_0x0040:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x004e:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0058:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.cs.d(java.lang.String):java.lang.String");
    }

    private static boolean a(File file) {
        MethodCollector.i(917);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(917);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(917);
        return delete;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String a(File file, String str) {
        MethodCollector.i(892);
        try {
            String a2 = a(new FileInputStream(file), str);
            MethodCollector.o(892);
            return a2;
        } catch (FileNotFoundException unused) {
            MethodCollector.o(892);
            return null;
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

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[Catch:{ Exception -> 0x0044 }, LOOP:0: B:11:0x0028->B:13:0x002f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[EDGE_INSN: B:14:0x0034->B:15:? ?: BREAK  , SYNTHETIC, Splitter:B:14:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060 A[SYNTHETIC, Splitter:B:36:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.InputStream r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.cs.a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static boolean a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(902);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    a(inputStream);
                    a(outputStream);
                    MethodCollector.o(902);
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                a(inputStream);
                a(outputStream);
                MethodCollector.o(902);
                return false;
            } catch (Throwable th) {
                a(inputStream);
                a(outputStream);
                MethodCollector.o(902);
                throw th;
            }
        }
    }

    private static byte[] a(InputStream inputStream, long j2, String str) {
        MethodCollector.i(912);
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        if (i3 >= i2) {
            inputStream.close();
            MethodCollector.o(912);
            return bArr;
        }
        IOException iOException = new IOException("Could not completely read file ".concat(String.valueOf(str)));
        MethodCollector.o(912);
        throw iOException;
    }
}
