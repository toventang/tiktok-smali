package com.facebook.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class e implements com.facebook.internal.b.e {

    /* renamed from: a  reason: collision with root package name */
    private static e f48591a;

    static {
        Covode.recordClassIndex(29293);
    }

    private e() {
    }

    public static synchronized e b() {
        e eVar;
        synchronized (e.class) {
            MethodCollector.i(481);
            if (f48591a == null) {
                f48591a = new e();
            }
            eVar = f48591a;
            MethodCollector.o(481);
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.facebook.internal.b.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<com.facebook.internal.b.a> a() {
        /*
            r8 = this;
            java.lang.String r7 = "facebooksdk.monitoring.persistedlogs"
            r6 = 495(0x1ef, float:6.94E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.facebook.internal.ae.a()
            android.content.Context r4 = com.facebook.m.f48921g
            r3 = 0
            java.io.FileInputStream r1 = r4.openFileInput(r7)     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0044, all -> 0x0034 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ Exception -> 0x0043, all -> 0x0031 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0043, all -> 0x0031 }
            com.facebook.internal.ad.a(r2)
            java.io.File r0 = r4.getFileStreamPath(r7)     // Catch:{ Exception -> 0x004f }
            a(r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x004f
        L_0x0031:
            r1 = move-exception
            r3 = r2
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            com.facebook.internal.ad.a(r3)
            java.io.File r0 = r4.getFileStreamPath(r7)     // Catch:{ Exception -> 0x003f }
            a(r0)     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r1
        L_0x0043:
            r3 = r2
        L_0x0044:
            com.facebook.internal.ad.a(r3)
            java.io.File r0 = r4.getFileStreamPath(r7)     // Catch:{ Exception -> 0x0050 }
            a(r0)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0050
        L_0x004f:
            r5 = r1
        L_0x0050:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b.a.e.a():java.util.Collection");
    }

    private static boolean a(File file) {
        MethodCollector.i(505);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(505);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(505);
        return delete;
    }
}
