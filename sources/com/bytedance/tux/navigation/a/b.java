package com.bytedance.tux.navigation.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import h.f.b.l;
import h.z;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public int f45193a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45194b = true;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.tux.c.a f45195c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super TuxIconView, z> f45196d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45197e = true;

    static {
        Covode.recordClassIndex(27545);
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45198a;

        static {
            Covode.recordClassIndex(27546);
        }

        @Override // com.bytedance.tux.navigation.a.d
        public final void a() {
            this.f45198a.invoke();
        }

        a(h.f.a.a aVar) {
            this.f45198a = aVar;
        }
    }

    private final void a() {
        this.f45193a = -1;
        this.f45195c = null;
        this.f45196d = null;
    }

    public final b a(int i2) {
        a();
        this.f45193a = i2;
        return this;
    }

    public final b a(com.bytedance.tux.c.a aVar) {
        l.c(aVar, "");
        a();
        this.f45195c = aVar;
        return this;
    }

    public final b a(d dVar) {
        l.c(dVar, "");
        this.f45199f = dVar;
        return this;
    }

    public final b a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.f45199f = new a(aVar);
        return this;
    }

    public final b a(h.f.a.b<? super TuxIconView, z> bVar) {
        l.c(bVar, "");
        a();
        this.f45196d = bVar;
        return this;
    }

    public final b a(Object obj) {
        l.c(obj, "");
        this.f45200g = obj;
        return this;
    }
}
