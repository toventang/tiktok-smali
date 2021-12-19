package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setNextFocusUpId {
    private static int getBody;
    private static int getHeaders = 1;

    static {
        Covode.recordClassIndex(2609);
    }

    public static void getHeaders(char[] cArr, char[] cArr2, int i2) {
        int i3 = getHeaders + 73;
        int i4 = i3 % 128;
        getBody = i4;
        int i5 = i3 % 2;
        int i6 = (i2 + 2) % 4;
        char c2 = (char) (((cArr[i2 % 4] * 32718) + cArr2[i6]) % 65535);
        int i7 = (i2 + 3) % 4;
        cArr2[i7] = (char) (((cArr[i7] * 32718) + cArr2[i6]) / 65535);
        cArr[i7] = c2;
        int i8 = i4 + 47;
        getHeaders = i8 % 128;
        int i9 = i8 % 2;
    }
}
