package com.ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.f.a;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f118882a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f118883b;

    static {
        Covode.recordClassIndex(77233);
    }

    public static boolean a(Context context) {
        b(context);
        return f118882a;
    }

    private static void b(Context context) {
        MethodCollector.i(6825);
        if (!f118883b) {
            synchronized (e.class) {
                try {
                    if (!f118883b) {
                        if (context == null || !a.a(context)) {
                            f118883b = true;
                        } else {
                            f118883b = c(context);
                        }
                    }
                } finally {
                    MethodCollector.o(6825);
                }
            }
            return;
        }
        MethodCollector.o(6825);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (com.ss.android.ugc.aweme.performance.i.b() != false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ all -> 0x005a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(android.content.Context r5) {
        /*
            r2 = 0
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.b.a()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "optimize_push_process"
            r3 = 1
            int r4 = r1.a(r3, r0, r3)     // Catch:{ all -> 0x005a }
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.b.a()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "optimize_push_process_v2"
            int r1 = r1.a(r3, r0, r2)     // Catch:{ all -> 0x005a }
            r0 = 4
            if (r4 != r0) goto L_0x001a
            goto L_0x003a
        L_0x001a:
            if (r4 == r3) goto L_0x003f
            com.ss.android.ugc.aweme.performance.i.a(r5)     // Catch:{ all -> 0x005a }
            r0 = 3
            if (r4 != r0) goto L_0x0031
            boolean r0 = com.ss.android.ugc.aweme.performance.i.a()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003a
            if (r1 != r3) goto L_0x003c
            boolean r0 = com.ss.android.ugc.aweme.utils.br.a()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003a
            goto L_0x003c
        L_0x0031:
            r0 = 2
            if (r4 != r0) goto L_0x003c
            boolean r0 = com.ss.android.ugc.aweme.performance.i.b()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            com.ss.android.ugc.aweme.push.downgrade.e.f118882a = r0     // Catch:{ all -> 0x005a }
        L_0x003f:
            boolean r0 = com.ss.android.ugc.aweme.push.downgrade.e.f118882a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0056
            java.lang.Boolean r0 = com.ss.android.ugc.aweme.feed.s.a()     // Catch:{ all -> 0x005a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0054
            boolean r0 = com.ss.android.ugc.aweme.ug.g.a()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r0 = 0
            goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            com.ss.android.ugc.aweme.push.downgrade.e.f118882a = r0     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.push.downgrade.e.c(android.content.Context):boolean");
    }
}
