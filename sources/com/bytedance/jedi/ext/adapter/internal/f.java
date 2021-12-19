package com.bytedance.jedi.ext.adapter.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<JediViewHolderProxy> f39743a = a.f39747a;

    /* renamed from: b  reason: collision with root package name */
    public final b f39744b;

    /* renamed from: c  reason: collision with root package name */
    public final g f39745c;

    /* renamed from: d  reason: collision with root package name */
    public final d f39746d;

    static {
        Covode.recordClassIndex(24483);
    }

    static final class a extends m implements h.f.a.a<JediViewHolderProxy> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39747a = new a();

        static {
            Covode.recordClassIndex(24484);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ JediViewHolderProxy invoke() {
            return new JediViewHolderProxy();
        }
    }

    public f(d dVar) {
        l.c(dVar, "");
        this.f39746d = dVar;
        b bVar = new b();
        dVar.f39738b = bVar;
        this.f39744b = bVar;
        g gVar = new g(dVar);
        dVar.f39739c = gVar;
        this.f39745c = gVar;
    }
}
