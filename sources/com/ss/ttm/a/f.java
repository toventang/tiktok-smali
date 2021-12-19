package com.ss.ttm.a;

import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f151895a;

    static {
        Covode.recordClassIndex(101281);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r3 != null) goto L_0x0040;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC, Splitter:B:17:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a() {
        /*
            r6 = 266(0x10a, float:3.73E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String[] r0 = com.ss.ttm.a.f.f151895a
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "null"
            java.lang.String[] r5 = new java.lang.String[]{r0, r0, r0, r0}
            java.lang.String r0 = "/proc/version"
            r4 = 2
            r1 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ all -> 0x0032 }
            r1 = 0
            r0 = r0[r4]     // Catch:{ all -> 0x0032 }
            r5[r1] = r0     // Catch:{ all -> 0x0032 }
            r2.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0040
        L_0x0032:
            r1 = r2
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            if (r3 == 0) goto L_0x0043
            goto L_0x0040
        L_0x003e:
            if (r3 == 0) goto L_0x0043
        L_0x0040:
            r3.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = 1
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r5[r1] = r0
            java.lang.String r0 = android.os.Build.MODEL
            r5[r4] = r0
            r1 = 3
            java.lang.String r0 = android.os.Build.DISPLAY
            r5[r1] = r0
            com.ss.ttm.a.f.f151895a = r5
        L_0x0053:
            java.lang.String[] r0 = com.ss.ttm.a.f.f151895a
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.a.f.a():java.lang.String[]");
    }
}
