package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class setDrawingCacheQuality extends FilterInputStream {
    private static int head = 1;
    private static int put;
    private byte[] AGRequest;
    private int AGRequest$Builder;
    private int addHeader = Integer.MAX_VALUE;
    private byte[] getBody;
    private final int getHeaders;
    private byte[] getMethod;
    private setKeepScreenOn getUrl;
    private int method;
    private int[] newBuilder;
    private int url;

    static {
        Covode.recordClassIndex(2586);
    }

    public final boolean markSupported() {
        int i2 = put;
        int i3 = i2 + 53;
        head = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        head = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i2;
        int i3 = head + 107;
        put = i3 % 128;
        if (i3 % 2 == 0) {
            getBody();
            i2 = this.AGRequest$Builder - this.method;
        } else {
            getBody();
            i2 = this.AGRequest$Builder >> this.method;
        }
        int i4 = head + 85;
        put = i4 % 128;
        int i5 = i4 % 2;
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i2 = put + 35;
        head = i2 % 128;
        int i3 = i2 % 2;
        getBody();
        int i4 = this.method;
        if (i4 < this.AGRequest$Builder) {
            byte[] bArr = this.AGRequest;
            this.method = i4 + 1;
            int i5 = bArr[i4] & 255;
            int i6 = put + 75;
            head = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
        int i8 = head + 7;
        put = i8 % 128;
        int i9 = i8 % 2;
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r0 = ((java.io.FilterInputStream) r8).in.read(r8.AGRequest, r6, 8 - r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r0 <= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r6 >= 8) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r1 >= 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r6 < 8) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        getUrl();
        r0 = ((java.io.FilterInputStream) r8).in.read();
        r8.addHeader = r0;
        r8.method = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r0 >= 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r3 = 8 - (r8.AGRequest[7] & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r8.AGRequest$Builder = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r0 = new java.lang.IllegalStateException("unexpected block size");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2646);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r1 >= 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getBody() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setDrawingCacheQuality.getBody():int");
    }

    private void getUrl() {
        int i2 = head + 59;
        put = i2 % 128;
        int i3 = i2 % 2;
        if (this.url == 2) {
            byte[] bArr = this.AGRequest;
            System.arraycopy(bArr, 0, this.getMethod, 0, bArr.length);
            int i4 = put + 93;
            head = i4 % 128;
            int i5 = i4 % 2;
        }
        byte[] bArr2 = this.AGRequest;
        setLabelFor.getMethod(((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.getHeaders, this.getUrl.getUrl, this.getUrl.getMethod, this.newBuilder);
        int[] iArr = this.newBuilder;
        int i6 = iArr[0];
        int i7 = iArr[1];
        byte[] bArr3 = this.AGRequest;
        bArr3[0] = (byte) (i6 >> 24);
        bArr3[1] = (byte) (i6 >> 16);
        bArr3[2] = (byte) (i6 >> 8);
        bArr3[3] = (byte) i6;
        bArr3[4] = (byte) (i7 >> 24);
        bArr3[5] = (byte) (i7 >> 16);
        bArr3[6] = (byte) (i7 >> 8);
        bArr3[7] = (byte) i7;
        if (this.url == 2) {
            int i8 = 0;
            do {
                byte[] bArr4 = this.AGRequest;
                bArr4[i8] = (byte) (bArr4[i8] ^ this.getBody[i8]);
                i8++;
                int i9 = put + 107;
                head = i9 % 128;
                int i10 = i9 % 2;
            } while (i8 < 8);
            byte[] bArr5 = this.getMethod;
            System.arraycopy(bArr5, 0, this.getBody, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        boolean z;
        long j3;
        MethodCollector.i(2645);
        int i2 = head + 13;
        put = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j3 = 0;
        } else {
            j3 = 1;
        }
        while (j3 < j2) {
            int i3 = head + 85;
            put = i3 % 128;
            int i4 = i3 % 2;
            if (read() == -1) {
                break;
            }
            int i5 = put + 53;
            head = i5 % 128;
            if (i5 % 2 == 0) {
                j3 /= 0;
            } else {
                j3++;
            }
        }
        MethodCollector.o(2645);
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = head + 77;
        put = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = i2; i7 < i4; i7++) {
            getBody();
            int i8 = this.method;
            if (i8 < this.AGRequest$Builder) {
                byte[] bArr2 = this.AGRequest;
                this.method = i8 + 1;
                bArr[i7] = bArr2[i8];
            } else {
                int i9 = head;
                int i10 = i9 + 85;
                put = i10 % 128;
                if (i10 % 2 == 0) {
                    if (i7 == i2) {
                        return -1;
                    }
                } else if (i7 == i2) {
                    return -1;
                }
                int i11 = i3 - (i4 - i7);
                int i12 = i9 + 25;
                put = i12 % 128;
                int i13 = i12 % 2;
                return i11;
            }
        }
        return i3;
    }

    public setDrawingCacheQuality(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z, int i3) {
        super(inputStream);
        MethodCollector.i(2644);
        int min = Math.min(Math.max(i2, 3), 16);
        this.getHeaders = min;
        this.AGRequest = new byte[8];
        byte[] bArr2 = new byte[8];
        this.getBody = bArr2;
        this.getMethod = new byte[8];
        this.newBuilder = new int[2];
        this.method = 8;
        this.AGRequest$Builder = 8;
        this.url = i3;
        if (i3 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getUrl = new setKeepScreenOn(iArr, min, true, false);
        MethodCollector.o(2644);
    }
}
