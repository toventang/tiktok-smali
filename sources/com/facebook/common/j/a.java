package com.facebook.common.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f47123a;

    /* renamed from: b  reason: collision with root package name */
    private int f47124b;

    static {
        Covode.recordClassIndex(28673);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(this.in.available(), this.f47123a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MethodCollector.i(1452);
        if (this.f47123a == 0) {
            MethodCollector.o(1452);
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f47123a--;
        }
        MethodCollector.o(1452);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f47124b != -1) {
            this.in.reset();
            this.f47123a = this.f47124b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public final void mark(int i2) {
        if (this.in.markSupported()) {
            this.in.mark(i2);
            this.f47124b = this.f47123a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        long skip = this.in.skip(Math.min(j2, (long) this.f47123a));
        this.f47123a = (int) (((long) this.f47123a) - skip);
        return skip;
    }

    public a(InputStream inputStream, int i2) {
        super(inputStream);
        MethodCollector.i(1442);
        if (inputStream == null) {
            NullPointerException nullPointerException = new NullPointerException();
            MethodCollector.o(1442);
            throw nullPointerException;
        } else if (i2 >= 0) {
            this.f47123a = i2;
            this.f47124b = -1;
            MethodCollector.o(1442);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("limit must be >= 0");
            MethodCollector.o(1442);
            throw illegalArgumentException;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(1457);
        int i4 = this.f47123a;
        if (i4 == 0) {
            MethodCollector.o(1457);
            return -1;
        }
        int read = this.in.read(bArr, i2, Math.min(i3, i4));
        if (read > 0) {
            this.f47123a -= read;
        }
        MethodCollector.o(1457);
        return read;
    }
}
