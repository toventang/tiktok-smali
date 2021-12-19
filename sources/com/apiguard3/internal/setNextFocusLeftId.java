package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class setNextFocusLeftId extends FilterInputStream {
    private static final short AGRequest = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));
    private static int get = 0;
    private static int put;
    private int AGRequest$Builder = 8;
    private int addHeader;
    private int delete;
    private int getBody = 8;
    private byte[] getHeaders = new byte[8];
    private byte[] getMethod = new byte[8];
    private byte[] getUrl = new byte[8];
    private int head;
    private int method;
    private int newBuilder = Integer.MAX_VALUE;
    private int post;
    private int url;

    public final boolean markSupported() {
        int i2 = get + 23;
        put = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i2 = put + 79;
        get = i2 % 128;
        int i3 = i2 % 2;
        getMethod();
        int i4 = this.AGRequest$Builder - this.getBody;
        int i5 = get + 3;
        put = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        Covode.recordClassIndex(2607);
        put = 1;
        int i2 = get + 21;
        put = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i2 = put + 61;
        get = i2 % 128;
        int i3 = i2 % 2;
        getMethod();
        int i4 = this.getBody;
        if (i4 < this.AGRequest$Builder) {
            byte[] bArr = this.getHeaders;
            this.getBody = i4 + 1;
            int i5 = bArr[i4] & 255;
            int i6 = put + 101;
            get = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
        int i8 = get + 15;
        put = i8 % 128;
        int i9 = i8 % 2;
        return -1;
    }

    private void getBody() {
        int i2 = put + 39;
        int i3 = i2 % 128;
        get = i3;
        int i4 = 2;
        int i5 = i2 % 2;
        int i6 = 3;
        if (this.url == 3) {
            int i7 = i3 + 21;
            put = i7 % 128;
            if (i7 % 2 != 0) {
                byte[] bArr = this.getHeaders;
                System.arraycopy(bArr, 0, this.getMethod, 0, bArr.length);
            } else {
                byte[] bArr2 = this.getHeaders;
                System.arraycopy(bArr2, 1, this.getMethod, 1, bArr2.length);
            }
        }
        byte[] bArr3 = this.getHeaders;
        int i8 = ((bArr3[0] << 24) & -16777216) + ((bArr3[1] << 16) & 16711680) + ((bArr3[2] << 8) & 65280) + (bArr3[3] & 255);
        int i9 = (-16777216 & (bArr3[4] << 24)) + (16711680 & (bArr3[5] << 16)) + (65280 & (bArr3[6] << 8)) + (bArr3[7] & 255);
        int i10 = get + 99;
        put = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            int i13 = this.addHeader;
            if (i12 >= i13) {
                break;
            }
            int i14 = get + 67;
            put = i14 % 128;
            int i15 = i14 % i4;
            short s = AGRequest;
            i9 -= ((((i13 - i12) * s) + i8) ^ ((i8 << 4) + this.delete)) ^ ((i8 >>> 5) + this.post);
            i8 -= (((i9 << 4) + this.method) ^ ((s * (i13 - i12)) + i9)) ^ ((i9 >>> 5) + this.head);
            i12++;
            i4 = 2;
            i6 = 3;
        }
        byte[] bArr4 = this.getHeaders;
        bArr4[0] = (byte) (i8 >> 24);
        bArr4[1] = (byte) (i8 >> 16);
        bArr4[i4] = (byte) (i8 >> 8);
        bArr4[i6] = (byte) i8;
        bArr4[4] = (byte) (i9 >> 24);
        bArr4[5] = (byte) (i9 >> 16);
        bArr4[6] = (byte) (i9 >> 8);
        bArr4[7] = (byte) i9;
        if (this.url == i6) {
            int i16 = 0;
            do {
                byte[] bArr5 = this.getHeaders;
                bArr5[i16] = (byte) (bArr5[i16] ^ this.getUrl[i16]);
                i16++;
            } while (i16 < 8);
            byte[] bArr6 = this.getMethod;
            System.arraycopy(bArr6, 0, this.getUrl, 0, bArr6.length);
        }
    }

    private int getMethod() {
        MethodCollector.i(1665);
        int i2 = put + 113;
        get = i2 % 128;
        int i3 = i2 % 2;
        if (this.newBuilder == Integer.MAX_VALUE) {
            this.newBuilder = ((FilterInputStream) this).in.read();
            int i4 = get + 97;
            put = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = 1;
        int i7 = 8;
        if (this.getBody == 8) {
            byte[] bArr = this.getHeaders;
            int i8 = this.newBuilder;
            bArr[0] = (byte) i8;
            if (i8 >= 0) {
                int i9 = put + 63;
                get = i9 % 128;
                int i10 = i9 % 2;
                do {
                    int read = ((FilterInputStream) this).in.read(this.getHeaders, i6, 8 - i6);
                    if (read <= 0) {
                        break;
                    }
                    i6 += read;
                } while (i6 < 8);
                if (i6 >= 8) {
                    getBody();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.newBuilder = read2;
                    this.getBody = 0;
                    if (read2 < 0) {
                        i7 = 8 - (this.getHeaders[7] & 255);
                        int i11 = put + 21;
                        get = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    this.AGRequest$Builder = i7;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("unexpected block size");
                    MethodCollector.o(1665);
                    throw illegalStateException;
                }
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("unexpected block size");
                MethodCollector.o(1665);
                throw illegalStateException2;
            }
        }
        int i13 = this.AGRequest$Builder;
        MethodCollector.o(1665);
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        char c2;
        long j3;
        MethodCollector.i(1663);
        int i2 = get + 113;
        put = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = '@';
        } else {
            c2 = '2';
        }
        if (c2 != '2') {
            j3 = 0;
        } else {
            j3 = 1;
        }
        while (j3 < j2) {
            int i3 = put + 3;
            get = i3 % 128;
            int i4 = i3 % 2;
            if (read() == -1) {
                break;
            }
            j3++;
        }
        MethodCollector.o(1663);
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            int i6 = get + 25;
            put = i6 % 128;
            int i7 = i6 % 2;
            getMethod();
            int i8 = this.getBody;
            if (i8 < this.AGRequest$Builder) {
                byte[] bArr2 = this.getHeaders;
                this.getBody = i8 + 1;
                bArr[i5] = bArr2[i8];
            } else {
                int i9 = get;
                int i10 = i9 + 55;
                put = i10 % 128;
                int i11 = i10 % 2;
                if (i5 != i2) {
                    return i3 - (i4 - i5);
                }
                int i12 = i9 + 75;
                put = i12 % 128;
                int i13 = i12 % 2;
                return -1;
            }
        }
        return i3;
    }

    public setNextFocusLeftId(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4) {
        super(inputStream);
        MethodCollector.i(1662);
        this.addHeader = Math.min(Math.max(i3, 5), 16);
        this.url = i4;
        if (i4 == 3) {
            System.arraycopy(bArr, 0, this.getUrl, 0, 8);
        }
        long j2 = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i2 == 0) {
            this.method = (int) j2;
            long j3 = j2 >> 3;
            short s = AGRequest;
            this.head = (int) ((((long) s) * j3) >> 32);
            this.delete = (int) (j2 >> 32);
            this.post = (int) (j3 + ((long) s));
            MethodCollector.o(1662);
            return;
        }
        int i5 = (int) j2;
        this.method = i5;
        this.head = i5 * i2;
        this.delete = i5 ^ i2;
        this.post = (int) (j2 >> 32);
        MethodCollector.o(1662);
    }
}
