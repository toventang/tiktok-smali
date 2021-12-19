package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class gc extends rm {
    private static int getHeaders;
    private static int getMethod = 1;

    static {
        Covode.recordClassIndex(2541);
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getUrl(int[] iArr) {
        int i2 = getHeaders;
        int i3 = i2 + 99;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        iArr[1] = iArr[1] + 59;
        int i5 = i2 + 63;
        getMethod = i5 % 128;
        if (i5 % 2 == 0) {
            throw new NullPointerException("hashCode");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int[] getBody(byte[] bArr) {
        int i2 = getHeaders + 111;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        int[] iArr = {getBody(bArr, 24), 1084384731, getBody(bArr, 0), getBody(bArr, 4), -691363443, 1757941256, getBody(bArr, 16), getBody(bArr, 8), 1288772461, -533505181, getBody(bArr, 20), -990770722, getBody(bArr, 12), -204142500, getBody(bArr, 28), 2118679623};
        int i4 = getMethod + 47;
        getHeaders = i4 % 128;
        if (i4 % 2 == 0) {
            z = true;
        }
        if (z) {
            return iArr;
        }
        throw new NullPointerException("hashCode");
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getBody(int[] iArr, int[] iArr2) {
        int i2 = 16;
        int[] iArr3 = new int[16];
        int i3 = 16;
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            iArr3[i4] = iArr[i4];
            i3 = i4;
        }
        int i5 = 20;
        do {
            getBody(iArr3, 3, 0, 2, 1);
            getBody(iArr3, 5, 7, 4, 6);
            getBody(iArr3, 9, 11, 8, 10);
            getBody(iArr3, 14, 12, 13, 15);
            getBody(iArr3, 3, 5, 9, 14);
            getBody(iArr3, 0, 7, 11, 12);
            getBody(iArr3, 2, 4, 8, 13);
            getBody(iArr3, 1, 6, 10, 15);
            i5 -= 2;
            int i6 = getMethod + 63;
            getHeaders = i6 % 128;
            int i7 = i6 % 2;
        } while (i5 > 0);
        int i8 = 16;
        while (true) {
            int i9 = i8 - 1;
            if (i8 <= 0) {
                break;
            }
            int i10 = getMethod + 101;
            getHeaders = i10 % 128;
            int i11 = i10 % 2;
            iArr3[i9] = iArr3[i9] + iArr[i9];
            i8 = i9;
        }
        while (true) {
            int i12 = i2 - 1;
            if (i2 > 0) {
                int i13 = getMethod + 17;
                getHeaders = i13 % 128;
                int i14 = i13 % 2;
                getUrl(iArr2, i12 * 4, iArr3[i12]);
                i2 = i12;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getBody(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = getMethod + 7;
        getHeaders = i6 % 128;
        int i7 = i6 % 2;
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = AGRequest(iArr[i5] ^ iArr[i2], 7);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = AGRequest(iArr[i3] ^ iArr[i4], 5);
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = AGRequest(iArr[i2] ^ iArr[i5], 15);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = AGRequest(iArr[i3] ^ iArr[i4], 14);
        int i8 = getHeaders + 107;
        getMethod = i8 % 128;
        int i9 = i8 % 2;
    }
}
