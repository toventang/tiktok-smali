package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setOnApplyWindowInsetsListener {
    private static int AGRequest = 1;
    private static int getHeaders;

    static {
        Covode.recordClassIndex(2610);
    }

    public static void AGRequest(char[] cArr, char c2, char c3, char c4, char c5) {
        int i2 = AGRequest + 97;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
        char c6 = 58224;
        int i4 = 0;
        do {
            int i5 = getHeaders + 115;
            AGRequest = i5 % 128;
            int i6 = i5 % 2;
            cArr[1] = (char) (cArr[1] - (((cArr[0] + c6) ^ ((cArr[0] << 4) + c4)) ^ ((cArr[0] >>> 5) + c5)));
            cArr[0] = (char) (cArr[0] - (((cArr[1] >>> 5) + c3) ^ ((cArr[1] + c6) ^ ((cArr[1] << 4) + c2))));
            c6 = (char) (c6 - 40503);
            i4++;
        } while (i4 < 16);
        int i7 = getHeaders + 35;
        AGRequest = i7 % 128;
        int i8 = i7 % 2;
    }
}
