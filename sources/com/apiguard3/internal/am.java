package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public final class am extends rm {
    private static int getHeaders = 1;
    private static int getUrl;

    static {
        Covode.recordClassIndex(2534);
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final void getUrl(int[] iArr) {
        int i2 = getHeaders;
        int i3 = i2 + 3;
        getUrl = i3 % 128;
        int i4 = i3 % 2;
        iArr[4] = iArr[4] + 74;
        int i5 = i2 + 105;
        getUrl = i5 % 128;
        int i6 = i5 % 2;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int[] getBody(byte[] bArr) {
        int i2 = getHeaders + 125;
        getUrl = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = {-1076250137, getBody(bArr, 0), getBody(bArr, 16), -2103817776, 689986455, getBody(bArr, 24), -130502824, getBody(bArr, 4), getBody(bArr, 28), getBody(bArr, 8), getBody(bArr, 20), 352784487, -1320011084, -1247062252, -598473541, getBody(bArr, 12)};
        int i4 = getHeaders + 21;
        getUrl = i4 % 128;
        int i5 = i4 % 2;
        return iArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.apiguard3.internal.rm
    public final int AGRequest(int i2, int i3) {
        int i4 = getHeaders + 81;
        int i5 = i4 % 128;
        getUrl = i5;
        int i6 = i4 % 2;
        int i7 = (i2 >>> (32 - i3)) | (i2 << i3);
        int i8 = i5 + 81;
        getHeaders = i8 % 128;
        int i9 = i8 % 2;
        return i7;
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
            int i5 = getHeaders + 83;
            getUrl = i5 % 128;
            int i6 = i5 % 2;
            iArr3[i4] = iArr[i4];
            i3 = i4;
        }
        int i7 = 14;
        do {
            int i8 = getHeaders + 11;
            getUrl = i8 % 128;
            int i9 = i8 % 2;
            getBody(iArr3, 3, 2, 0, 1);
            getBody(iArr3, 7, 4, 6, 5);
            getBody(iArr3, 9, 8, 11, 10);
            getBody(iArr3, 15, 13, 12, 14);
            getBody(iArr3, 3, 7, 9, 15);
            getBody(iArr3, 2, 4, 8, 13);
            getBody(iArr3, 0, 6, 11, 12);
            getBody(iArr3, 1, 5, 10, 14);
            i7 -= 2;
        } while (i7 > 0);
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
    public final void getBody(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = getHeaders + 1;
        int i7 = i6 % 128;
        getUrl = i7;
        int i8 = i6 % 2;
        iArr[i2] = iArr[i2] + iArr[i3];
        int i9 = iArr[i5] ^ iArr[i2];
        iArr[i5] = (i9 >>> 15) | (i9 << 17);
        iArr[i4] = iArr[i4] + iArr[i5];
        int i10 = iArr[i3] ^ iArr[i4];
        iArr[i3] = (i10 >>> 22) | (i10 << 10);
        iArr[i2] = iArr[i2] + iArr[i3];
        int i11 = iArr[i2] ^ iArr[i5];
        iArr[i5] = (i11 >>> 24) | (i11 << 8);
        iArr[i4] = iArr[i4] + iArr[i5];
        int i12 = iArr[i3] ^ iArr[i4];
        iArr[i3] = (i12 >>> 27) | (i12 << 5);
        int i13 = i7 + 43;
        getHeaders = i13 % 128;
        int i14 = i13 % 2;
    }
}
