package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;

public final class x {
    static {
        Covode.recordClassIndex(86683);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0 <= 0) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(java.lang.String r6) {
        /*
            r5 = 9828(0x2664, float:1.3772E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r3 = 1
            r4.inJustDecodeBounds = r3
            android.graphics.BitmapFactory.decodeFile(r6, r4)
            r0 = 0
            r4.inJustDecodeBounds = r0
            int r0 = r4.outWidth
            int r2 = r4.outHeight
            if (r0 <= r2) goto L_0x002c
            r1 = 90
            if (r0 <= r1) goto L_0x002c
            int r0 = r4.outWidth
            int r0 = r0 / r1
        L_0x0020:
            if (r0 > 0) goto L_0x0038
        L_0x0022:
            r4.inSampleSize = r3
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r6, r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x002c:
            if (r0 >= r2) goto L_0x0037
            r0 = 110(0x6e, float:1.54E-43)
            if (r2 <= r0) goto L_0x0037
            int r0 = r4.outHeight
            int r0 = r0 / 110
            goto L_0x0020
        L_0x0037:
            r0 = 1
        L_0x0038:
            r3 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.x.a(java.lang.String):android.graphics.Bitmap");
    }
}
