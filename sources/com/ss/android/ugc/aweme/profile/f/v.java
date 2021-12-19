package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;

public final class v {
    static {
        Covode.recordClassIndex(75178);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r3 == null) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[SYNTHETIC, Splitter:B:34:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r6, int r7, int r8) {
        /*
            r5 = 9254(0x2426, float:1.2968E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            if (r7 <= 0) goto L_0x000a
            if (r8 > 0) goto L_0x000e
        L_0x000a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x000e:
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0035 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0035 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            r0 = 1
            r1.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            android.graphics.BitmapFactory.decodeStream(r2, r3, r1)     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            int r0 = r1.outWidth     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            if (r7 > r0) goto L_0x0027
            int r0 = r1.outHeight     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            if (r8 <= r0) goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x002f:
            r0 = move-exception
            r3 = r2
            goto L_0x003d
        L_0x0032:
            r0 = move-exception
            r3 = r2
            goto L_0x0036
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x0044
        L_0x003a:
            r0 = move-exception
            if (r3 == 0) goto L_0x0040
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.f.v.a(java.lang.String, int, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x004b A[SYNTHETIC, Splitter:B:35:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r6, android.net.Uri r7, int r8, int r9) {
        /*
            r5 = 9255(0x2427, float:1.2969E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            if (r8 <= 0) goto L_0x000a
            if (r9 > 0) goto L_0x000e
        L_0x000a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x000e:
            r3 = 0
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch:{ FileNotFoundException -> 0x003a }
            java.io.InputStream r2 = r0.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x003a }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0037, all -> 0x0034 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0037, all -> 0x0034 }
            r0 = 1
            r1.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x0037, all -> 0x0034 }
            android.graphics.BitmapFactory.decodeStream(r2, r3, r1)     // Catch:{ FileNotFoundException -> 0x0037, all -> 0x0034 }
            int r0 = r1.outWidth     // Catch:{ FileNotFoundException -> 0x0037, all -> 0x0034 }
            if (r8 > r0) goto L_0x002a
            int r0 = r1.outHeight     // Catch:{ FileNotFoundException -> 0x0037, all -> 0x0034 }
            if (r9 <= r0) goto L_0x002b
        L_0x002a:
            r4 = 1
        L_0x002b:
            if (r2 == 0) goto L_0x0030
            r2.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0034:
            r0 = move-exception
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
            goto L_0x0049
        L_0x003f:
            r0 = move-exception
        L_0x0040:
            if (r3 == 0) goto L_0x0045
            r3.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            r3.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.f.v.a(android.content.Context, android.net.Uri, int, int):boolean");
    }
}
