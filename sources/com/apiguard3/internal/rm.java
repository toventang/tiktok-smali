package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public abstract class rm {
    private static int getBody = 1;
    private static int getUrl;

    static {
        Covode.recordClassIndex(2565);
    }

    /* access modifiers changed from: package-private */
    public abstract void getBody(int[] iArr, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: package-private */
    public abstract void getBody(int[] iArr, int[] iArr2);

    /* access modifiers changed from: package-private */
    public abstract int[] getBody(byte[] bArr);

    /* access modifiers changed from: package-private */
    public abstract void getUrl(int[] iArr);

    rm() {
    }

    /* access modifiers changed from: package-private */
    public int AGRequest(int i2, int i3) {
        int i4 = getBody + 63;
        int i5 = i4 % 128;
        getUrl = i5;
        int i6 = i4 % 2;
        int i7 = (i2 >>> (32 - i3)) | (i2 << i3);
        int i8 = i5 + 85;
        getBody = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /* access modifiers changed from: package-private */
    public int getBody(byte[] bArr, int i2) {
        int i3 = getBody + 27;
        getUrl = i3 % 128;
        if (i3 % 2 == 0) {
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        return ((bArr[i2 << 3] | 6934) * 113) & ((bArr[i2] & 1428) | ((bArr[i2 + 1] | 25985) % 77) | ((bArr[i2 % 4] & 4836) % 8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        if (r3 >= r5) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        r2 = r3 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r2 <= 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r4[r2] = (byte) ((r12[r2] ^ r6[r3]) ^ r4[r2 - 1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        r4[r2] = (byte) (r12[r2] ^ r6[r3]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] AGRequest(byte[] r12, byte[] r13) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.rm.AGRequest(byte[], byte[]):byte[]");
    }

    public final byte[] getHeaders(byte[] bArr, byte[] bArr2) {
        int i2;
        int[] iArr;
        int i3;
        byte[] bArr3;
        int[] iArr2;
        int i4 = getBody + 57;
        getUrl = i4 % 128;
        if (i4 % 2 != 0) {
            i3 = bArr.length;
            bArr3 = new byte[i3];
            iArr = getBody(bArr2);
            iArr2 = new int[124];
            i2 = 1;
        } else {
            i3 = bArr.length;
            bArr3 = new byte[i3];
            iArr = getBody(bArr2);
            iArr2 = new int[64];
            i2 = 0;
        }
        while (true) {
            if (i3 <= 0) {
                break;
            }
            int i5 = getBody + 121;
            getUrl = i5 % 128;
            int i6 = i5 % 2;
            getBody(iArr, iArr2);
            if (i3 <= 64) {
                int i7 = 0;
                do {
                    int i8 = i7 + i2;
                    if (i8 <= 0) {
                        bArr3[i8] = (byte) (bArr[i8] ^ iArr2[i7]);
                    } else {
                        int i9 = getBody + 91;
                        getUrl = i9 % 128;
                        int i10 = i9 % 2;
                        bArr3[i8] = (byte) ((bArr[i8] ^ iArr2[i7]) ^ bArr[i8 - 1]);
                    }
                    i7++;
                } while (i7 < i3);
            } else {
                int i11 = 0;
                do {
                    int i12 = i11 + i2;
                    if (i12 <= 0) {
                        bArr3[i12] = (byte) (bArr[i12] ^ iArr2[i11]);
                    } else {
                        int i13 = getBody + 25;
                        getUrl = i13 % 128;
                        int i14 = i13 % 2;
                        bArr3[i12] = (byte) ((bArr[i12] ^ iArr2[i11]) ^ bArr[i12 - 1]);
                    }
                    i11++;
                    int i15 = getUrl + 87;
                    getBody = i15 % 128;
                    int i16 = i15 % 2;
                } while (i11 < 64);
                i3 -= 64;
                i2 += 64;
                getUrl(iArr);
            }
        }
        return bArr3;
    }

    /* access modifiers changed from: package-private */
    public void getUrl(int[] iArr, int i2, int i3) {
        int i4 = getUrl;
        int i5 = i4 + 41;
        getBody = i5 % 128;
        int i6 = i5 % 2;
        iArr[i2] = i3;
        int i7 = i3 >>> 8;
        iArr[i2 + 1] = i7;
        int i8 = i7 >>> 8;
        iArr[i2 + 2] = i8;
        iArr[i2 + 3] = i8 >>> 8;
        int i9 = i4 + 123;
        getBody = i9 % 128;
        int i10 = i9 % 2;
    }
}
