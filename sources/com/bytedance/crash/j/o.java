package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* access modifiers changed from: package-private */
public final class o extends GZIPOutputStream {
    static {
        Covode.recordClassIndex(16249);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.util.zip.DeflaterOutputStream, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public final void finish() {
    }

    public final void a() {
        super.close();
    }

    public final void b() {
        super.finish();
    }

    public o(OutputStream outputStream) {
        super(outputStream);
        MethodCollector.i(10955);
        MethodCollector.o(10955);
    }
}
