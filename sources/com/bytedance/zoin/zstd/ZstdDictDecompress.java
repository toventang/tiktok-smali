package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.zoin.zstd.a.a;

public class ZstdDictDecompress extends b {

    /* renamed from: c  reason: collision with root package name */
    private long f46313c;

    private native void free();

    private native void init(byte[] bArr, int i2, int i3);

    @Override // java.io.Closeable, com.bytedance.zoin.zstd.a, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    static {
        Covode.recordClassIndex(28281);
        a.a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.zoin.zstd.a
    public final void b() {
        MethodCollector.i(678);
        if (this.f46313c != 0) {
            free();
            this.f46313c = 0;
        }
        MethodCollector.o(678);
    }
}
