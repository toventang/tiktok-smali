package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public class aj {
    static {
        Covode.recordClassIndex(2720);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m153(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m152(int i2, int i3, boolean z, int i4, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            m153(iArr);
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i2 ^ iArr[i5];
            int[] iArr4 = iArr2[0];
            int i7 = iArr4[i6 >>> 24] + iArr2[1][(i6 >>> 16) & 255];
            int i8 = i3 ^ ((iArr2[2][(i6 >>> 8) & 255] ^ i7) + iArr2[3][i6 & 255]);
            i5++;
            i3 = i6;
            i2 = i8;
        }
        int i9 = i2 ^ iArr[iArr.length - 2];
        int i10 = i3 ^ iArr[iArr.length - 1];
        if (!z) {
            m153(iArr);
        }
        iArr3[0] = i10;
        iArr3[1] = i9;
    }
}
