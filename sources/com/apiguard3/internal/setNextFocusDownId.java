package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class setNextFocusDownId extends FilterInputStream {
    private static int addHeader = 1;
    private static int url;
    private long[] AGRequest;
    private int AGRequest$Builder = Integer.MAX_VALUE;
    private byte[] getBody;
    private final int getHeaders;
    private short getMethod;
    private long[] getUrl;
    private int method;
    private int newBuilder;

    static {
        Covode.recordClassIndex(2605);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i2 = url + 89;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        getMethod();
        int i4 = this.method - this.newBuilder;
        int i5 = url + 37;
        addHeader = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean markSupported() {
        int i2 = url;
        int i3 = i2 + 65;
        addHeader = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        addHeader = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i2 = addHeader + 29;
        url = i2 % 128;
        int i3 = i2 % 2;
        getMethod();
        int i4 = this.newBuilder;
        if (i4 < this.method) {
            byte[] bArr = this.getBody;
            this.newBuilder = i4 + 1;
            return bArr[i4] & 255;
        }
        int i5 = addHeader + 23;
        url = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    private void getHeaders() {
        int i2 = url + 37;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        long[] jArr = this.AGRequest;
        long[] jArr2 = this.getUrl;
        short s = this.getMethod;
        int i4 = (s + 2) % 4;
        int i5 = (s + 3) % 4;
        jArr2[i5] = ((jArr[i5] * 2147483085) + jArr2[i4]) / 2147483647L;
        jArr[i5] = ((jArr[s % 4] * 2147483085) + jArr2[i4]) % 2147483647L;
        int i6 = 0;
        while (i6 < this.getHeaders) {
            byte[] bArr = this.getBody;
            bArr[i6] = (byte) ((int) (((long) bArr[i6]) ^ ((this.AGRequest[this.getMethod] >> (i6 << 3)) & 255)));
            i6++;
            int i7 = url + 99;
            addHeader = i7 % 128;
            int i8 = i7 % 2;
        }
        this.getMethod = (short) ((this.getMethod + 1) % 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1 >= 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (r1 >= 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        r0 = new java.lang.IllegalStateException("unexpected block size");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1658);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getMethod() {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setNextFocusDownId.getMethod():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        MethodCollector.i(1655);
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
            int i2 = url + 111;
            addHeader = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = url + 29;
        addHeader = i4 % 128;
        int i5 = i4 % 2;
        MethodCollector.o(1655);
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            int i6 = addHeader + 117;
            url = i6 % 128;
            int i7 = i6 % 2;
            getMethod();
            int i8 = this.newBuilder;
            if (i8 < this.method) {
                byte[] bArr2 = this.getBody;
                this.newBuilder = i8 + 1;
                bArr[i5] = bArr2[i8];
                int i9 = addHeader + 99;
                url = i9 % 128;
                int i10 = i9 % 2;
            } else if (i5 != i2) {
                return i3 - (i4 - i5);
            } else {
                int i11 = url + 35;
                addHeader = i11 % 128;
                int i12 = i11 % 2;
                return -1;
            }
        }
        return i3;
    }

    public setNextFocusDownId(InputStream inputStream, int i2, int i3, short s, int i4, int i5) {
        super(inputStream);
        MethodCollector.i(1651);
        int min = Math.min(Math.max((int) s, 4), 8);
        this.getHeaders = min;
        this.getBody = new byte[min];
        this.AGRequest = new long[4];
        this.getUrl = new long[4];
        this.newBuilder = min;
        this.method = min;
        this.AGRequest = setAccessibilityTraversalAfter.getBody(i2 ^ i5, min ^ i5);
        this.getUrl = setAccessibilityTraversalAfter.getBody(i3 ^ i5, i4 ^ i5);
        MethodCollector.o(1651);
    }
}
