package com.lynx.tasm.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.IOException;

public final class l {
    static {
        Covode.recordClassIndex(35484);
    }

    private static File a(Context context) {
        String str = ".lynx-font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            if (d.f107194b == null || !d.f107197e) {
                d.f107194b = context.getCacheDir();
            }
            File file = new File(d.f107194b, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    private static boolean a(File file) {
        MethodCollector.i(13861);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(13861);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(13861);
        return delete;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r4, byte[] r5) {
        /*
            r3 = 13960(0x3688, float:1.9562E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001d, all -> 0x0025 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x001d, all -> 0x0025 }
            r1.write(r5)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r1.flush()     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r0
        L_0x0019:
            r0 = move-exception
            r2 = r1
            goto L_0x0026
        L_0x001c:
            r2 = r1
        L_0x001d:
            r2.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r0
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.utils.l.a(java.io.File, byte[]):boolean");
    }

    public static Typeface a(Context context, byte[] bArr) {
        Typeface typeface;
        File a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!a(a2, bArr)) {
                return null;
            }
            String path = a2.getPath();
            if (TypeFaceOptimizer.getSwitch() && path != null) {
                if (TypeFaceLancet.cache.contains(path)) {
                    typeface = (Typeface) TypeFaceLancet.cache.get(path);
                } else {
                    typeface = Typeface.createFromFile(path);
                    if (typeface != null) {
                        TypeFaceLancet.cache.put(path, typeface);
                    }
                }
                a(a2);
                return typeface;
            }
            typeface = Typeface.createFromFile(path);
            a(a2);
            return typeface;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a(a2);
        }
    }
}
