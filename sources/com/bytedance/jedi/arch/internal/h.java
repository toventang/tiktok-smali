package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ag;
import f.a.t;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class h<S> implements ag<S> {

    /* renamed from: a  reason: collision with root package name */
    private final ag<S> f39501a;

    static {
        Covode.recordClassIndex(24303);
    }

    @Override // com.bytedance.jedi.arch.ag
    public final S a() {
        return this.f39501a.a();
    }

    @Override // com.bytedance.jedi.arch.ag
    public final t<S> b() {
        return this.f39501a.b();
    }

    public h(ag<S> agVar) {
        l.c(agVar, "");
        this.f39501a = agVar;
    }

    @Override // com.bytedance.jedi.arch.ag
    public final void a(b<? super S, z> bVar) {
        l.c(bVar, "");
        this.f39501a.a(bVar);
    }

    @Override // com.bytedance.jedi.arch.ag
    public final void b(b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        this.f39501a.b(bVar);
    }

    @Override // com.bytedance.jedi.arch.ag
    public final void c(b<? super S, ? extends S> bVar) {
        l.c(bVar, "");
        this.f39501a.c(bVar);
    }
}
