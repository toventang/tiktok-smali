package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class rf extends rm {
    private static int getHeaders;
    private static int getMethod = 1;

    static {
        Covode.recordClassIndex(2564);
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getUrl(int[] iArr) {
        int i2 = getMethod;
        int i3 = i2 + 49;
        getHeaders = i3 % 128;
        if (i3 % 2 == 0) {
            iArr[7] = iArr[7] + 82;
        } else {
            iArr[2] = iArr[2] / 109;
        }
        int i4 = i2 + 53;
        getHeaders = i4 % 128;
        if (i4 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int[] getBody(byte[] bArr) {
        char c2;
        int i2 = getHeaders + 109;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = {1028213265, 885417151, getBody(bArr, 12), -96508859, getBody(bArr, 8), getBody(bArr, 20), getBody(bArr, 0), getBody(bArr, 4), 1913507172, getBody(bArr, 28), getBody(bArr, 16), 220856283, getBody(bArr, 24), 260493787, -1057634678, 397208795};
        int i4 = getHeaders + 113;
        getMethod = i4 % 128;
        if (i4 % 2 != 0) {
            c2 = '_';
        } else {
            c2 = 3;
        }
        if (c2 != 3) {
            return iArr;
        }
        throw new NullPointerException("hashCode");
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int AGRequest(int i2, int i3) {
        int i4 = getHeaders + 29;
        int i5 = i4 % 128;
        getMethod = i5;
        int i6 = i4 % 2;
        int i7 = (i2 >>> (32 - i3)) | (i2 << i3);
        int i8 = i5 + 75;
        getHeaders = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getBody(int[] iArr, int[] iArr2) {
        int i2 = getMethod + 49;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 16;
        int[] iArr3 = new int[16];
        int i5 = 16;
        while (true) {
            int i6 = i5 - 1;
            if (i5 <= 0) {
                break;
            }
            iArr3[i6] = iArr[i6];
            i5 = i6;
        }
        int i7 = 16;
        do {
            getBody(iArr3, 2, 0, 1, 3);
            getBody(iArr3, 5, 4, 7, 6);
            getBody(iArr3, 10, 9, 8, 11);
            getBody(iArr3, 12, 13, 15, 14);
            getBody(iArr3, 2, 5, 10, 12);
            getBody(iArr3, 0, 4, 9, 13);
            getBody(iArr3, 1, 7, 8, 15);
            getBody(iArr3, 3, 6, 11, 14);
            i7 -= 2;
        } while (i7 > 0);
        int i8 = 16;
        while (true) {
            int i9 = i8 - 1;
            if (i8 <= 0) {
                break;
            }
            iArr3[i9] = iArr3[i9] + iArr[i9];
            i8 = i9;
        }
        int i10 = getMethod + 9;
        getHeaders = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            int i12 = i4 - 1;
            if (i4 > 0) {
                int i13 = getMethod + 59;
                getHeaders = i13 % 128;
                int i14 = i13 % 2;
                getUrl(iArr2, i12 * 4, iArr3[i12]);
                i4 = i12;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getBody(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = getMethod;
        int i7 = i6 + 117;
        getHeaders = i7 % 128;
        int i8 = i7 % 2;
        iArr[i2] = iArr[i2] + iArr[i3];
        int i9 = iArr[i5] ^ iArr[i2];
        iArr[i5] = (i9 >>> 17) | (i9 << 15);
        iArr[i4] = iArr[i4] + iArr[i5];
        int i10 = iArr[i3] ^ iArr[i4];
        iArr[i3] = (i10 >>> 22) | (i10 << 10);
        iArr[i2] = iArr[i2] + iArr[i3];
        int i11 = iArr[i2] ^ iArr[i5];
        iArr[i5] = (i11 >>> 26) | (i11 << 6);
        iArr[i4] = iArr[i4] + iArr[i5];
        int i12 = iArr[i3] ^ iArr[i4];
        iArr[i3] = (i12 >>> 23) | (i12 << 9);
        int i13 = i6 + 65;
        getHeaders = i13 % 128;
        int i14 = i13 % 2;
    }
}
