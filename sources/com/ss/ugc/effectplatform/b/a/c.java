package com.ss.ugc.effectplatform.b.a;

import com.bytedance.covode.number.Covode;
import d.a.d.a.g;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class c extends g {

    /* renamed from: b  reason: collision with root package name */
    private final g f153513b;

    /* renamed from: c  reason: collision with root package name */
    private final a<z> f153514c;

    static {
        Covode.recordClassIndex(102359);
    }

    @Override // d.a.d.a.k, d.a.d.a.g
    public final void a() {
        try {
            this.f153513b.a();
        } catch (Exception unused) {
            this.f153514c.invoke();
        }
    }

    @Override // d.a.d.a.g
    public final void c() {
        try {
            this.f153513b.c();
        } catch (Exception unused) {
            this.f153514c.invoke();
        }
    }

    public c(g gVar, a<z> aVar) {
        l.c(gVar, "");
        l.c(aVar, "");
        this.f153513b = gVar;
        this.f153514c = aVar;
        a(gVar.b());
    }

    @Override // d.a.d.a.g
    public final void a(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        try {
            this.f153513b.a(bArr, i2, i3);
        } catch (Exception unused) {
            this.f153514c.invoke();
        }
    }
}
