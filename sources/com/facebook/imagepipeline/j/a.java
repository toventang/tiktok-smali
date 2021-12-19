package com.facebook.imagepipeline.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.a.a.e;
import com.facebook.imagepipeline.common.b;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final b f47982a;

    /* renamed from: b  reason: collision with root package name */
    private e f47983b;

    static {
        Covode.recordClassIndex(29015);
    }

    @Override // com.facebook.imagepipeline.j.c
    public final boolean c() {
        return true;
    }

    public final synchronized e d() {
        e eVar;
        MethodCollector.i(2145);
        eVar = this.f47983b;
        MethodCollector.o(2145);
        return eVar;
    }

    @Override // com.facebook.imagepipeline.j.c
    public final synchronized boolean a() {
        MethodCollector.i(2141);
        if (this.f47983b == null) {
            MethodCollector.o(2141);
            return true;
        }
        MethodCollector.o(2141);
        return false;
    }

    @Override // com.facebook.imagepipeline.j.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.i(2140);
        synchronized (this) {
            try {
                e eVar = this.f47983b;
                if (eVar != null) {
                    this.f47983b = null;
                    eVar.b();
                    MethodCollector.o(2140);
                }
            } finally {
                MethodCollector.o(2140);
            }
        }
    }

    @Override // com.facebook.imagepipeline.j.c
    public final synchronized int b() {
        MethodCollector.i(2143);
        if (a()) {
            MethodCollector.o(2143);
            return 0;
        }
        int sizeInBytes = this.f47983b.f47649a.getSizeInBytes();
        MethodCollector.o(2143);
        return sizeInBytes;
    }

    @Override // com.facebook.imagepipeline.j.f
    public final synchronized int getHeight() {
        MethodCollector.i(2139);
        if (a()) {
            MethodCollector.o(2139);
            return 0;
        }
        int height = this.f47983b.f47649a.getHeight();
        MethodCollector.o(2139);
        return height;
    }

    @Override // com.facebook.imagepipeline.j.f
    public final synchronized int getWidth() {
        MethodCollector.i(2138);
        if (a()) {
            MethodCollector.o(2138);
            return 0;
        }
        int width = this.f47983b.f47649a.getWidth();
        MethodCollector.o(2138);
        return width;
    }

    public a(e eVar, b bVar) {
        this.f47983b = eVar;
        this.f47982a = bVar;
    }
}
