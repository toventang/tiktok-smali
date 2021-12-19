package com.bytedance.common.utility.c;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(15886);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC, Splitter:B:14:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC, Splitter:B:23:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.lang.String r6) {
        /*
            r5 = 776(0x308, float:1.087E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.lang.String r1 = "getprop "
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.lang.Process r0 = r2.exec(r0)     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.lang.String r0 = "UTF-8"
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            r0 = 1024(0x400, float:1.435E-42)
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x0045, all -> 0x003b }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0046, all -> 0x0038 }
            r3.close()     // Catch:{ IOException -> 0x0046, all -> 0x0038 }
            r3.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x0038:
            r0 = move-exception
            r4 = r3
            goto L_0x003c
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            if (r4 == 0) goto L_0x0041
            r4.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0045:
            r3 = r4
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.c.a.a(java.lang.String):java.lang.String");
    }
}
