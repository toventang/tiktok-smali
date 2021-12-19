package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class sc extends rm {
    private static int getHeaders = 1;
    private static int getMethod;

    static {
        Covode.recordClassIndex(2566);
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getUrl(int[] iArr) {
        int i2 = getHeaders;
        int i3 = i2 + 113;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        iArr[15] = iArr[15] + 68;
        int i5 = i2 + 121;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int[] getBody(byte[] bArr) {
        int i2 = getMethod + 75;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        int[] iArr = {788219237, 1289391221, -1140365098, -263010167, 724521378, getBody(bArr, 12), getBody(bArr, 16), getBody(bArr, 0), getBody(bArr, 24), -2044206312, getBody(bArr, 20), -1368185624, getBody(bArr, 8), 885228236, getBody(bArr, 28), getBody(bArr, 4)};
        int i4 = getHeaders + 65;
        getMethod = i4 % 128;
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
    public final int AGRequest(int i2, int i3) {
        int i4 = getMethod;
        int i5 = i4 + 29;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i2 >>> (32 - i3)) | (i2 << i3);
        int i8 = i4 + 89;
        getHeaders = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int getBody(byte[] bArr, int i2) {
        int i3 = getMethod;
        int i4 = i3 + 31;
        getHeaders = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        int i7 = i3 + 57;
        getHeaders = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getBody(int[] iArr, int[] iArr2) {
        boolean z;
        int i2 = 16;
        int[] iArr3 = new int[16];
        int i3 = 16;
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                break;
            }
            int i5 = getMethod + 13;
            getHeaders = i5 % 128;
            int i6 = i5 % 2;
            iArr3[i4] = iArr[i4];
            i3 = i4;
        }
        int i7 = 22;
        do {
            getBody(iArr3, 3, 1, 0, 2);
            getBody(iArr3, 4, 5, 7, 6);
            getBody(iArr3, 10, 11, 9, 8);
            getBody(iArr3, 12, 15, 14, 13);
            getBody(iArr3, 0, 7, 11, 12);
            getBody(iArr3, 2, 6, 10, 14);
            getBody(iArr3, 3, 5, 9, 13);
            getBody(iArr3, 1, 4, 8, 15);
            i7 -= 2;
        } while (i7 > 0);
        int i8 = getHeaders + 11;
        getMethod = i8 % 128;
        int i9 = i8 % 2;
        int i10 = 16;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            iArr3[i11] = iArr3[i11] + iArr[i11];
            i10 = i11;
        }
        while (true) {
            int i12 = i2 - 1;
            if (i2 > 0) {
                getUrl(iArr2, i12 * 4, iArr3[i12]);
                i2 = i12;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getUrl(int[] iArr, int i2, int i3) {
        int i4 = getMethod + 51;
        int i5 = i4 % 128;
        getHeaders = i5;
        int i6 = i4 % 2;
        iArr[i2] = i3;
        int i7 = i3 >>> 8;
        iArr[i2 + 1] = i7;
        int i8 = i7 >>> 8;
        iArr[i2 + 2] = i8;
        iArr[i2 + 3] = i8 >>> 8;
        int i9 = i5 + 47;
        getMethod = i9 % 128;
        int i10 = i9 % 2;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getBody(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = getHeaders + 77;
        int i7 = i6 % 128;
        getMethod = i7;
        int i8 = i6 % 2;
        iArr[i2] = iArr[i2] + iArr[i3];
        int i9 = iArr[i5] ^ iArr[i2];
        iArr[i5] = (i9 >>> 14) | (i9 << 18);
        iArr[i4] = iArr[i4] + iArr[i5];
        int i10 = iArr[i3] ^ iArr[i4];
        iArr[i3] = (i10 >>> 19) | (i10 << 13);
        iArr[i2] = iArr[i2] + iArr[i3];
        int i11 = iArr[i2] ^ iArr[i5];
        iArr[i5] = (i11 >>> 21) | (i11 << 11);
        iArr[i4] = iArr[i4] + iArr[i5];
        int i12 = iArr[i3] ^ iArr[i4];
        iArr[i3] = (i12 >>> 28) | (i12 << 4);
        int i13 = i7 + 59;
        getHeaders = i13 % 128;
        int i14 = i13 % 2;
    }
}
