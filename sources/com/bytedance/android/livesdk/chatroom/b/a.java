package com.bytedance.android.livesdk.chatroom.b;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(8295);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r3 == null) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC, Splitter:B:27:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r5, android.graphics.Bitmap r6) {
        /*
            r4 = 10507(0x290b, float:1.4723E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0025 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0025 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r0 = 100
            r6.compress(r1, r0, r2)     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001a:
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x001f:
            r1 = move-exception
            r3 = r2
            goto L_0x002d
        L_0x0022:
            r0 = move-exception
            r3 = r2
            goto L_0x0026
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            r0.printStackTrace()     // Catch:{ all -> 0x002a }
            goto L_0x0039
        L_0x002a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0035
        L_0x002d:
            r3.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0035:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x0039:
            if (r3 == 0) goto L_0x0043
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0043:
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.b.a.a(java.lang.String, android.graphics.Bitmap):boolean");
    }
}
