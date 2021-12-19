package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class setLabelFor {
    private static int getBody;
    private static int getHeaders = 1;

    static {
        Covode.recordClassIndex(2601);
    }

    private static void getMethod(int[] iArr) {
        int i2 = getBody;
        int i3 = i2 + 77;
        getHeaders = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
            i4 = 1;
        }
        int i5 = i2 + 51;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        while (i4 < iArr.length / 2) {
            int i7 = getHeaders + 121;
            getBody = i7 % 128;
            int i8 = i7 % 2;
            int i9 = iArr[i4];
            iArr[i4] = iArr[(iArr.length - i4) - 1];
            iArr[(iArr.length - i4) - 1] = i9;
            i4++;
        }
        int i10 = getHeaders + 117;
        getBody = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void getMethod(int i2, int i3, boolean z, int i4, int[] iArr, int[][] iArr2, int[] iArr3) {
        int i5 = getHeaders + 19;
        getBody = i5 % 128;
        if (i5 % 2 == 0 ? !z : !z) {
            getMethod(iArr);
        }
        int i6 = getBody + 13;
        getHeaders = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < i4) {
            int i9 = i2 ^ iArr[i8];
            int[] iArr4 = iArr2[0];
            int i10 = iArr4[i9 >>> 24] + iArr2[1][(i9 >>> 16) & 255];
            int i11 = i3 ^ ((iArr2[2][(i9 >>> 8) & 255] ^ i10) + iArr2[3][i9 & 255]);
            i8++;
            i3 = i9;
            i2 = i11;
        }
        int i12 = i2 ^ iArr[iArr.length - 2];
        int i13 = i3 ^ iArr[iArr.length - 1];
        if (!z) {
            int i14 = getBody + 11;
            getHeaders = i14 % 128;
            int i15 = i14 % 2;
            getMethod(iArr);
        }
        iArr3[0] = i13;
        iArr3[1] = i12;
    }
}
