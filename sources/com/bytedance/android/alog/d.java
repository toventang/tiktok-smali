package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(3254);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            r4 = 2878(0xb3e, float:4.033E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            java.lang.String r0 = "/proc/self/cmdline"
            r1.<init>(r0)     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            r2.<init>(r1)     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x003b, all -> 0x002d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003b, all -> 0x002d }
            if (r0 != 0) goto L_0x003d
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x003b, all -> 0x002d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003b, all -> 0x002d }
            if (r0 != 0) goto L_0x003d
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        L_0x002d:
            r0 = move-exception
            goto L_0x0031
        L_0x002f:
            r0 = move-exception
            r2 = r3
        L_0x0031:
            if (r2 == 0) goto L_0x0036
            r2.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x003a:
            r2 = r3
        L_0x003b:
            if (r2 == 0) goto L_0x0040
        L_0x003d:
            r2.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.d.a():java.lang.String");
    }

    static String a(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str;
    }
}
