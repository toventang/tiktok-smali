package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

public class al extends FilterInputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private static final short f197 = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f198;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f199 = 8;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f200;

    /* renamed from: ɩ  reason: contains not printable characters */
    private byte[] f201 = new byte[8];

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f202;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f203 = 8;

    /* renamed from: Ι  reason: contains not printable characters */
    private byte[] f204 = new byte[8];

    /* renamed from: ι  reason: contains not printable characters */
    private byte[] f205 = new byte[8];

    /* renamed from: І  reason: contains not printable characters */
    private int f206;

    /* renamed from: і  reason: contains not printable characters */
    private int f207 = Integer.MAX_VALUE;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f208;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f209;

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        m155();
        return this.f203 - this.f199;
    }

    static {
        Covode.recordClassIndex(2722);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        m155();
        int i2 = this.f199;
        if (i2 >= this.f203) {
            return -1;
        }
        byte[] bArr = this.f204;
        this.f199 = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m155() {
        MethodCollector.i(35);
        if (this.f207 == Integer.MAX_VALUE) {
            this.f207 = ((FilterInputStream) this).in.read();
        }
        int i2 = 8;
        if (this.f199 == 8) {
            byte[] bArr = this.f204;
            int i3 = this.f207;
            bArr[0] = (byte) i3;
            if (i3 >= 0) {
                int i4 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.f204, i4, 8 - i4);
                    if (read <= 0) {
                        break;
                    }
                    i4 += read;
                } while (i4 < 8);
                if (i4 >= 8) {
                    m156();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f207 = read2;
                    this.f199 = 0;
                    if (read2 < 0) {
                        i2 = 8 - (this.f204[7] & 255);
                    }
                    this.f203 = i2;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("unexpected block size");
                    MethodCollector.o(35);
                    throw illegalStateException;
                }
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("unexpected block size");
                MethodCollector.o(35);
                throw illegalStateException2;
            }
        }
        int i5 = this.f203;
        MethodCollector.o(35);
        return i5;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m156() {
        if (this.f206 == 3) {
            byte[] bArr = this.f204;
            System.arraycopy(bArr, 0, this.f201, 0, bArr.length);
        }
        byte[] bArr2 = this.f204;
        int i2 = ((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i3 = (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i4 = 0;
        while (true) {
            int i5 = this.f198;
            if (i4 >= i5) {
                break;
            }
            short s = f197;
            i3 -= ((((i5 - i4) * s) + i2) ^ ((i2 << 4) + this.f200)) ^ ((i2 >>> 5) + this.f209);
            i2 -= (((i3 << 4) + this.f208) ^ ((s * (i5 - i4)) + i3)) ^ ((i3 >>> 5) + this.f202);
            i4++;
        }
        byte[] bArr3 = this.f204;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i3 >> 24);
        bArr3[5] = (byte) (i3 >> 16);
        bArr3[6] = (byte) (i3 >> 8);
        bArr3[7] = (byte) i3;
        if (this.f206 == 3) {
            int i6 = 0;
            do {
                byte[] bArr4 = this.f204;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.f205[i6]);
                i6++;
            } while (i6 < 8);
            byte[] bArr5 = this.f201;
            System.arraycopy(bArr5, 0, this.f205, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        MethodCollector.i(3576);
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        MethodCollector.o(3576);
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            m155();
            int i6 = this.f199;
            if (i6 < this.f203) {
                byte[] bArr2 = this.f204;
                this.f199 = i6 + 1;
                bArr[i5] = bArr2[i6];
            } else if (i5 == i2) {
                return -1;
            } else {
                return i3 - (i4 - i5);
            }
        }
        return i3;
    }

    public al(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4) {
        super(inputStream);
        MethodCollector.i(2951);
        this.f198 = Math.min(Math.max(i3, 5), 16);
        this.f206 = i4;
        if (i4 == 3) {
            System.arraycopy(bArr, 0, this.f205, 0, 8);
        }
        long j2 = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i2 == 0) {
            this.f208 = (int) j2;
            long j3 = j2 >> 3;
            short s = f197;
            this.f202 = (int) ((((long) s) * j3) >> 32);
            this.f200 = (int) (j2 >> 32);
            this.f209 = (int) (j3 + ((long) s));
            MethodCollector.o(2951);
            return;
        }
        int i5 = (int) j2;
        this.f208 = i5;
        this.f202 = i5 * i2;
        this.f200 = i5 ^ i2;
        this.f209 = (int) (j2 >> 32);
        MethodCollector.o(2951);
    }
}
