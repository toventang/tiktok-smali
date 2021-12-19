package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setNextClusterForwardId {
    private static int getBody = 1;
    private static int getUrl;

    static {
        Covode.recordClassIndex(2604);
    }

    public static int AGRequest(int i2, int i3) {
        int i4 = getUrl + 19;
        int i5 = i4 % 128;
        getBody = i5;
        int i6 = i4 % 2 != 0 ? i2 / i3 : i2 >> i3;
        int i7 = i5 + 81;
        getUrl = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw new NullPointerException("hashCode");
    }

    public static int getBody(int i2, int i3) {
        int i4 = getBody + 81;
        getUrl = i4 % 128;
        return i4 % 2 == 0 ? i2 % i3 : i2 * i3;
    }

    public static int getBody(int i2, int i3, int i4) {
        int i5 = getBody + 23;
        int i6 = i5 % 128;
        getUrl = i6;
        int i7 = i5 % 2;
        int i8 = (i2 * i4) + i3;
        int i9 = i6 + 15;
        getBody = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    public static int getHeaders(int i2, int i3) {
        int i4 = getBody + 69;
        getUrl = i4 % 128;
        return i4 % 2 == 0 ? ((i2 + i3) - 1) % i3 : ((i2 * i3) << 0) >>> i3;
    }
}
