package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.i;
import h.f.a.b;
import h.f.b.l;
import h.n;
import h.z;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public volatile h f34414a = h.f34395c;

    /* renamed from: b  reason: collision with root package name */
    private final b<h, z> f34415b;

    static {
        Covode.recordClassIndex(20558);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.ies.powerlist.page.h, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(b<? super h, z> bVar) {
        l.c(bVar, "");
        this.f34415b = bVar;
    }

    private final void a(h hVar) {
        if (!l.a(hVar, this.f34414a)) {
            this.f34414a = hVar;
            this.f34415b.invoke(this.f34414a);
        }
    }

    public final void a(d dVar, e eVar, Object obj) {
        i dVar2;
        Object obj2;
        l.c(dVar, "");
        l.c(eVar, "");
        int i2 = l.f34416a[dVar.ordinal()];
        if (i2 == 1) {
            dVar2 = new i.d(eVar);
        } else if (i2 == 2) {
            dVar2 = new i.c(eVar);
        } else if (i2 == 3) {
            dVar2 = new i.a(eVar);
        } else if (i2 == 4) {
            if (!(obj instanceof Exception)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            Exception exc = (Exception) obj2;
            if (exc == null) {
                exc = new Exception();
            }
            dVar2 = new i.b(eVar, exc);
        } else {
            throw new n();
        }
        a(new h(dVar2, this.f34414a.f34398b.a(dVar, eVar, obj)));
    }
}
