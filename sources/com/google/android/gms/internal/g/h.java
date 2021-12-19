package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f50606a;

    /* renamed from: b  reason: collision with root package name */
    private long f50607b = -1;

    static {
        Covode.recordClassIndex(31583);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f50606a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MethodCollector.i(5913);
        if (this.f50606a == 0) {
            MethodCollector.o(5913);
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f50606a--;
        }
        MethodCollector.o(5913);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        MethodCollector.i(6065);
        if (!this.in.markSupported()) {
            IOException iOException = new IOException("Mark not supported");
            MethodCollector.o(6065);
            throw iOException;
        } else if (this.f50607b != -1) {
            this.in.reset();
            this.f50606a = this.f50607b;
            MethodCollector.o(6065);
        } else {
            IOException iOException2 = new IOException("Mark not set");
            MethodCollector.o(6065);
            throw iOException2;
        }
    }

    public h(InputStream inputStream) {
        super(inputStream);
        MethodCollector.i(5834);
        d.a(inputStream);
        this.f50606a = 1048577;
        MethodCollector.o(5834);
    }

    public final synchronized void mark(int i2) {
        MethodCollector.i(5910);
        this.in.mark(i2);
        this.f50607b = this.f50606a;
        MethodCollector.o(5910);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        long skip = this.in.skip(Math.min(j2, this.f50606a));
        this.f50606a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(5994);
        long j2 = this.f50606a;
        if (j2 == 0) {
            MethodCollector.o(5994);
            return -1;
        }
        int read = this.in.read(bArr, i2, (int) Math.min((long) i3, j2));
        if (read != -1) {
            this.f50606a -= (long) read;
        }
        MethodCollector.o(5994);
        return read;
    }
}
