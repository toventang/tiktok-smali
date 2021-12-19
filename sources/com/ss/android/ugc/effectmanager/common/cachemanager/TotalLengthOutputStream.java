package com.ss.android.ugc.effectmanager.common.cachemanager;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class TotalLengthOutputStream extends FilterOutputStream {
    private long length;

    static {
        Covode.recordClassIndex(95274);
    }

    public final long getLength() {
        return this.length;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        this.out.close();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TotalLengthOutputStream(OutputStream outputStream) {
        super(outputStream);
        l.c(outputStream, "");
        MethodCollector.i(506);
        MethodCollector.o(506);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i2) {
        MethodCollector.i(500);
        this.out.write(i2);
        this.length++;
        MethodCollector.o(500);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        MethodCollector.i(504);
        this.out.write(bArr, i2, i3);
        this.length += (long) i3;
        MethodCollector.o(504);
    }
}
