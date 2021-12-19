package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setSystemGestureExclusionRects {
    private static int getBody = 1;
    private static int getMethod;

    static {
        Covode.recordClassIndex(2617);
    }

    public static void AGRequest(char[] cArr, char[] cArr2, int i2) {
        int i3 = getBody + 55;
        int i4 = i3 % 128;
        getMethod = i4;
        int i5 = i3 % 2;
        int i6 = (i2 + 2) % 4;
        char c2 = (char) (((cArr[i2 % 4] * 32718) + cArr2[i6]) % 65535);
        int i7 = (i2 + 3) % 4;
        cArr2[i7] = (char) (((cArr[i7] * 32718) + cArr2[i6]) / 65535);
        cArr[i7] = c2;
        int i8 = i4 + 89;
        getBody = i8 % 128;
        int i9 = i8 % 2;
    }

    public static char[] getBody(long j2, char[] cArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        int i5 = getBody + 77;
        getMethod = i5 % 128;
        if (i5 % 2 != 0) {
            cArr2 = new char[cArr.length];
            i2 = 3;
            i3 = 1;
            i4 = 1;
        } else {
            cArr2 = new char[cArr.length];
            i2 = 4;
            i3 = 0;
            i4 = 0;
        }
        while (i3 < cArr.length) {
            int i6 = getBody + 11;
            int i7 = i6 % 128;
            getMethod = i7;
            int i8 = i6 % 2;
            if (((j2 >>> i3) & 1) == 1) {
                int i9 = i7 + 47;
                getBody = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[i4] = cArr[i3];
                    i4++;
                    i3++;
                } else {
                    cArr2[i4] = cArr[i3];
                    i4++;
                    i3++;
                }
            }
            if (i2 < cArr2.length) {
                int i10 = i7 + 115;
                getBody = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2[i2] = cArr[i3];
                    i2 += 68;
                } else {
                    cArr2[i2] = cArr[i3];
                    i2++;
                }
                i3++;
            }
            cArr2[i4] = cArr[i3];
            i4++;
            i3++;
        }
        return cArr2;
    }
}
