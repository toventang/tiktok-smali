package com.ss.android.ugc.aweme.app;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;

public final class ad {
    static {
        Covode.recordClassIndex(40912);
    }

    public static long a(Context context) {
        if (f.a(context)) {
            return Thread.currentThread().getId();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[SYNTHETIC, Splitter:B:17:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(int r6) {
        /*
            r5 = 2262(0x8d6, float:3.17E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x003f }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x003f }
            r2.<init>(r0)     // Catch:{ all -> 0x003f }
            r3.<init>(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0040 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0040 }
        L_0x0033:
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r1
        L_0x003f:
            r3 = r4
        L_0x0040:
            if (r3 == 0) goto L_0x004a
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.ad.a(int):java.lang.String");
    }
}
