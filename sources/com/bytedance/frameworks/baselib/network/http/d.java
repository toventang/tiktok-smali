package com.bytedance.frameworks.baselib.network.http;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;

public final class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f29090a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.retrofit2.client.d f29091b;

    static {
        Covode.recordClassIndex(17034);
    }

    public d() {
        MethodCollector.i(4579);
        MethodCollector.o(4579);
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return super.available();
    }

    public final boolean markSupported() {
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return super.markSupported();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            InputStream inputStream = this.f29090a;
            if (inputStream != null) {
                inputStream.close();
            }
            com.bytedance.retrofit2.client.d dVar = this.f29091b;
            if (dVar != null) {
                dVar.b();
            }
        } catch (Throwable unused) {
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        MethodCollector.i(4749);
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            int read = inputStream.read();
            MethodCollector.o(4749);
            return read;
        }
        MethodCollector.o(4749);
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        MethodCollector.i(4615);
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            inputStream.reset();
            MethodCollector.o(4615);
            return;
        }
        super.reset();
        MethodCollector.o(4615);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            return inputStream.skip(j2);
        }
        return super.skip(j2);
    }

    public final synchronized void mark(int i2) {
        MethodCollector.i(4612);
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            inputStream.mark(i2);
            MethodCollector.o(4612);
            return;
        }
        super.mark(i2);
        MethodCollector.o(4612);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        MethodCollector.i(4584);
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            int read = inputStream.read(bArr);
            MethodCollector.o(4584);
            return read;
        }
        int read2 = super.read(bArr);
        MethodCollector.o(4584);
        return read2;
    }

    public d(InputStream inputStream, com.bytedance.retrofit2.client.d dVar) {
        MethodCollector.i(4497);
        this.f29090a = inputStream;
        this.f29091b = dVar;
        MethodCollector.o(4497);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(4599);
        InputStream inputStream = this.f29090a;
        if (inputStream != null) {
            int read = inputStream.read(bArr, i2, i3);
            MethodCollector.o(4599);
            return read;
        }
        int read2 = super.read(bArr, i2, i3);
        MethodCollector.o(4599);
        return read2;
    }
}
