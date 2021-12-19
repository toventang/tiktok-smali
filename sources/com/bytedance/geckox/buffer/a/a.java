package com.bytedance.geckox.buffer.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;

public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.geckox.buffer.a f29745a;

    /* renamed from: b  reason: collision with root package name */
    private long f29746b;

    static {
        Covode.recordClassIndex(17271);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
    }

    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f29745a.d();
    }

    @Override // java.io.InputStream
    public final int available() {
        long b2 = this.f29745a.b() - this.f29745a.c();
        if (b2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b2;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        MethodCollector.i(7231);
        this.f29745a.b(this.f29746b);
        MethodCollector.o(7231);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        return this.f29745a.a(j2);
    }

    public a(com.bytedance.geckox.buffer.a aVar) {
        MethodCollector.i(7154);
        this.f29745a = aVar;
        MethodCollector.o(7154);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f29745a.b(bArr);
    }

    public final synchronized void mark(int i2) {
        MethodCollector.i(7181);
        this.f29746b = (long) i2;
        MethodCollector.o(7181);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        return this.f29745a.b(bArr, i2, i3);
    }
}
