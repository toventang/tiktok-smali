package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class c extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f47070a;

    static {
        Covode.recordClassIndex(28631);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        this.out.close();
    }

    public c(OutputStream outputStream) {
        super(outputStream);
        MethodCollector.i(1584);
        MethodCollector.o(1584);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i2) {
        MethodCollector.i(1587);
        this.out.write(i2);
        this.f47070a++;
        MethodCollector.o(1587);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        MethodCollector.i(1585);
        this.out.write(bArr, i2, i3);
        this.f47070a += (long) i3;
        MethodCollector.o(1585);
    }
}
