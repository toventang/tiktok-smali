package com.bytedance.geckox.buffer.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public UpdatePackage f29747a;

    /* renamed from: b  reason: collision with root package name */
    public long f29748b;

    /* renamed from: c  reason: collision with root package name */
    public long f29749c;

    /* renamed from: d  reason: collision with root package name */
    private a f29750d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.geckox.f.a f29751e;

    static {
        Covode.recordClassIndex(17272);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    private b(a aVar) {
        MethodCollector.i(7979);
        this.f29750d = aVar;
        MethodCollector.o(7979);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f29750d.a(i2);
        a(4);
    }

    private void a(int i2) {
        long j2 = this.f29749c + ((long) i2);
        this.f29749c = j2;
        com.bytedance.geckox.f.a aVar = this.f29751e;
        if (aVar != null) {
            aVar.a(this.f29747a, this.f29748b, j2);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f29750d.a(bArr);
        a(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        this.f29750d.a(bArr, i2, i3);
        a(i3);
    }

    public b(a aVar, com.bytedance.geckox.f.a aVar2, UpdatePackage updatePackage, long j2) {
        this(aVar);
        this.f29751e = aVar2;
        this.f29747a = updatePackage;
        this.f29748b = j2;
    }
}
