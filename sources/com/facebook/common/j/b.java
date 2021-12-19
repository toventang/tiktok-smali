package com.facebook.common.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47125a;

    /* renamed from: b  reason: collision with root package name */
    private int f47126b;

    /* renamed from: c  reason: collision with root package name */
    private int f47127c;

    static {
        Covode.recordClassIndex(28674);
    }

    private int a() {
        int i2 = this.f47126b;
        byte[] bArr = this.f47125a;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.f47126b = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MethodCollector.i(4654);
        int read = this.in.read();
        if (read != -1) {
            MethodCollector.o(4654);
            return read;
        }
        int a2 = a();
        MethodCollector.o(4654);
        return a2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f47126b = this.f47127c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final void mark(int i2) {
        if (this.in.markSupported()) {
            super.mark(i2);
            this.f47127c = this.f47126b;
        }
    }

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        MethodCollector.i(4651);
        if (inputStream == null) {
            NullPointerException nullPointerException = new NullPointerException();
            MethodCollector.o(4651);
            throw nullPointerException;
        } else if (bArr != null) {
            this.f47125a = bArr;
            MethodCollector.o(4651);
        } else {
            NullPointerException nullPointerException2 = new NullPointerException();
            MethodCollector.o(4651);
            throw nullPointerException2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(4729);
        int read = this.in.read(bArr, i2, i3);
        if (read != -1) {
            MethodCollector.o(4729);
            return read;
        }
        int i4 = 0;
        if (i3 == 0) {
            MethodCollector.o(4729);
            return 0;
        }
        while (i4 < i3) {
            int a2 = a();
            if (a2 == -1) {
                break;
            }
            bArr[i2 + i4] = (byte) a2;
            i4++;
        }
        MethodCollector.o(4729);
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }
}
