package com.bytedance.framwork.core.b.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f29476a;

    static {
        Covode.recordClassIndex(17171);
    }

    public static String a() {
        String str = f29476a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b2 = b();
        f29476a = b2;
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b() {
        /*
            r6 = 10081(0x2761, float:1.4126E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004b }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004b }
            r2.<init>(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004b }
            r4.<init>(r3)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
        L_0x0035:
            int r0 = r4.read()     // Catch:{ all -> 0x004c }
            if (r0 <= 0) goto L_0x0040
            char r0 = (char) r0     // Catch:{ all -> 0x004c }
            r1.append(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0035
        L_0x0040:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004c }
            r4.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x004b:
            r4 = r5
        L_0x004c:
            if (r4 == 0) goto L_0x0051
            r4.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.b.e.d.b():java.lang.String");
    }
}
