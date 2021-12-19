package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

public class an extends FilterInputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private byte[] f211;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f212 = Integer.MAX_VALUE;

    /* renamed from: ǃ  reason: contains not printable characters */
    private ak f213;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f214;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f215;

    /* renamed from: Ι  reason: contains not printable characters */
    private byte[] f216;

    /* renamed from: ι  reason: contains not printable characters */
    private byte[] f217;

    /* renamed from: І  reason: contains not printable characters */
    private int[] f218;

    /* renamed from: і  reason: contains not printable characters */
    private int f219;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f220;

    static {
        Covode.recordClassIndex(2724);
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        m158();
        return this.f220 - this.f219;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        m158();
        int i2 = this.f219;
        if (i2 >= this.f220) {
            return -1;
        }
        byte[] bArr = this.f211;
        this.f219 = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m158() {
        MethodCollector.i(2127);
        if (this.f212 == Integer.MAX_VALUE) {
            this.f212 = ((FilterInputStream) this).in.read();
        }
        int i2 = 8;
        if (this.f219 == 8) {
            byte[] bArr = this.f211;
            int i3 = this.f212;
            bArr[0] = (byte) i3;
            if (i3 >= 0) {
                int i4 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.f211, i4, 8 - i4);
                    if (read <= 0) {
                        break;
                    }
                    i4 += read;
                } while (i4 < 8);
                if (i4 >= 8) {
                    m157();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.f212 = read2;
                    this.f219 = 0;
                    if (read2 < 0) {
                        i2 = 8 - (this.f211[7] & 255);
                    }
                    this.f220 = i2;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("unexpected block size");
                    MethodCollector.o(2127);
                    throw illegalStateException;
                }
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("unexpected block size");
                MethodCollector.o(2127);
                throw illegalStateException2;
            }
        }
        int i5 = this.f220;
        MethodCollector.o(2127);
        return i5;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m157() {
        if (this.f215 == 2) {
            byte[] bArr = this.f211;
            System.arraycopy(bArr, 0, this.f217, 0, bArr.length);
        }
        byte[] bArr2 = this.f211;
        aj.m152(((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.f214, this.f213.f194, this.f213.f195, this.f218);
        int[] iArr = this.f218;
        int i2 = iArr[0];
        int i3 = iArr[1];
        byte[] bArr3 = this.f211;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i3 >> 24);
        bArr3[5] = (byte) (i3 >> 16);
        bArr3[6] = (byte) (i3 >> 8);
        bArr3[7] = (byte) i3;
        if (this.f215 == 2) {
            int i4 = 0;
            do {
                byte[] bArr4 = this.f211;
                bArr4[i4] = (byte) (bArr4[i4] ^ this.f216[i4]);
                i4++;
            } while (i4 < 8);
            byte[] bArr5 = this.f217;
            System.arraycopy(bArr5, 0, this.f216, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        MethodCollector.i(2124);
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        MethodCollector.o(2124);
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            m158();
            int i6 = this.f219;
            if (i6 < this.f220) {
                byte[] bArr2 = this.f211;
                this.f219 = i6 + 1;
                bArr[i5] = bArr2[i6];
            } else if (i5 == i2) {
                return -1;
            } else {
                return i3 - (i4 - i5);
            }
        }
        return i3;
    }

    public an(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z, int i3) {
        super(inputStream);
        MethodCollector.i(2123);
        int min = Math.min(Math.max(i2, 3), 16);
        this.f214 = min;
        this.f211 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f216 = bArr2;
        this.f217 = new byte[8];
        this.f218 = new int[2];
        this.f219 = 8;
        this.f220 = 8;
        this.f215 = i3;
        if (i3 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f213 = new ak(iArr, min, true, z);
        MethodCollector.o(2123);
    }
}
