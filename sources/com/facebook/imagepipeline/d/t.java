package com.facebook.imagepipeline.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class t implements n {

    /* renamed from: a  reason: collision with root package name */
    private static t f47823a;

    static {
        Covode.recordClassIndex(28965);
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void a(h<?, ?> hVar) {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void b() {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void b(h<?, ?> hVar) {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void c() {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void d() {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void e() {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void f() {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void g() {
    }

    private t() {
    }

    public static synchronized t a() {
        t tVar;
        synchronized (t.class) {
            MethodCollector.i(10670);
            if (f47823a == null) {
                f47823a = new t();
            }
            tVar = f47823a;
            MethodCollector.o(10670);
        }
        return tVar;
    }
}
