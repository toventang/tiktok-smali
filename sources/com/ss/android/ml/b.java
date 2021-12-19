package com.ss.android.ml;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final float f59848a = Float.intBitsToFloat(1056964608);

    static {
        Covode.recordClassIndex(36986);
    }

    public static void a(String str, Float[] fArr, int i2) {
        int i3;
        int i4;
        float intBitsToFloat;
        int i5 = 0;
        while (i5 < str.length() / 4 && i5 < i2) {
            char[] cArr = new char[4];
            int i6 = i5 * 4;
            str.getChars(i6, i6 + 4, cArr, 0);
            int parseInt = Integer.parseInt(new String(cArr), 16) & 65535;
            int i7 = 32768 & parseInt;
            int i8 = (parseInt >>> 10) & 31;
            int i9 = parseInt & 1023;
            if (i8 != 0) {
                i3 = i9 << 13;
                if (i8 == 31) {
                    i4 = 255;
                } else {
                    i4 = (i8 - 15) + 127;
                }
                intBitsToFloat = Float.intBitsToFloat(i3 | (i7 << 16) | (i4 << 23));
            } else if (i9 != 0) {
                intBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - f59848a;
                if (i7 != 0) {
                    intBitsToFloat = -intBitsToFloat;
                }
            } else {
                i3 = 0;
                i4 = 0;
                intBitsToFloat = Float.intBitsToFloat(i3 | (i7 << 16) | (i4 << 23));
            }
            fArr[i5] = Float.valueOf(intBitsToFloat);
            i5++;
        }
    }
}
