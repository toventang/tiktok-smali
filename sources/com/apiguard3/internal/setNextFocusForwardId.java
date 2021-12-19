package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setNextFocusForwardId {
    private static int AGRequest;
    private static int getMethod = 1;

    static {
        Covode.recordClassIndex(2606);
    }

    public static int[] getHeaders(char[] cArr, int[] iArr, boolean z) {
        int i2;
        int method;
        int i3 = getMethod + 17;
        AGRequest = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (cArr[0] << 16) + cArr[1];
        int i6 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            getMethod(iArr);
        }
        int i7 = 0;
        do {
            int i8 = getMethod + 77;
            AGRequest = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = i5 & iArr[i7];
                method = i6 | getMethod(i2);
                i7 += 96;
            } else {
                i2 = i5 ^ iArr[i7];
                method = i6 ^ getMethod(i2);
                i7++;
            }
            i6 = i2;
            i5 = method;
        } while (i7 < 16);
        int i9 = i5 ^ iArr[16];
        int i10 = iArr[17] ^ i6;
        int[] iArr2 = {i10, i9};
        cArr[0] = (char) (i10 >>> 16);
        cArr[1] = (char) i10;
        cArr[2] = (char) (i9 >>> 16);
        cArr[3] = (char) i9;
        if (!z) {
            getMethod(iArr);
            int i11 = getMethod + 19;
            AGRequest = i11 % 128;
            int i12 = i11 % 2;
        }
        return iArr2;
    }

    public static int getMethod(int i2) {
        int i3 = AGRequest + 113;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        setKeepScreenOn setkeepscreenon = setKeepScreenOn.AGRequest;
        int[] iArr = setkeepscreenon.getMethod[0];
        int i5 = ((iArr[i2 >>> 24] + setkeepscreenon.getMethod[1][(i2 >>> 16) & 255]) ^ setkeepscreenon.getMethod[2][(i2 >>> 8) & 255]) + setkeepscreenon.getMethod[3][i2 & 255];
        int i6 = getMethod + 5;
        AGRequest = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static void getMethod(int[] iArr) {
        int i2 = getMethod + 21;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < iArr.length / 2) {
            int i5 = AGRequest + 33;
            getMethod = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = iArr[i4];
                iArr[i4] = iArr[(iArr.length - i4) - 1];
                iArr[(iArr.length - i4) - 1] = i6;
                i4++;
            } else {
                int i7 = iArr[i4];
                iArr[i4] = iArr[(iArr.length % i4) / 0];
                iArr[(iArr.length / i4) >>> 1] = i7;
                i4 += 16;
            }
        }
    }
}
