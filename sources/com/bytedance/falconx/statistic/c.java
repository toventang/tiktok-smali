package com.bytedance.falconx.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

public class c extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f28807a;

    static {
        Covode.recordClassIndex(16935);
    }

    public void a(IOException iOException) {
    }

    public boolean markSupported() {
        return this.f28807a.markSupported();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f28807a.available();
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        try {
            this.f28807a.close();
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        MethodCollector.i(4295);
        try {
            int read = this.f28807a.read();
            MethodCollector.o(4295);
            return read;
        } catch (IOException e2) {
            a(e2);
            MethodCollector.o(4295);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        MethodCollector.i(4280);
        try {
            this.f28807a.reset();
            MethodCollector.o(4280);
        } catch (IOException e2) {
            a(e2);
            MethodCollector.o(4280);
            throw e2;
        }
    }

    public c(InputStream inputStream) {
        MethodCollector.i(4258);
        this.f28807a = inputStream;
        MethodCollector.o(4258);
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f28807a.skip(j2);
        } catch (IOException e2) {
            a(e2);
            throw e2;
        }
    }

    public synchronized void mark(int i2) {
        MethodCollector.i(4274);
        this.f28807a.mark(i2);
        MethodCollector.o(4274);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        MethodCollector.i(4262);
        try {
            int read = this.f28807a.read(bArr);
            MethodCollector.o(4262);
            return read;
        } catch (IOException e2) {
            a(e2);
            MethodCollector.o(4262);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        MethodCollector.i(4264);
        try {
            int read = this.f28807a.read(bArr, i2, i3);
            MethodCollector.o(4264);
            return read;
        } catch (IOException e2) {
            a(e2);
            MethodCollector.o(4264);
            throw e2;
        }
    }
}
