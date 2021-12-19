package com.ss.android.ugc.aweme.df;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import java.io.File;

public final class g {
    static {
        Covode.recordClassIndex(49828);
    }

    public static void a(String str) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        a(file2.getPath());
                    } else {
                        a(file2);
                    }
                }
                a(file);
            }
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(2223);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2223);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2223);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC, Splitter:B:27:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r5) {
        /*
            r4 = 2231(0x8b7, float:3.126E-42)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.df.g.b(java.lang.String):java.lang.String");
    }
}
