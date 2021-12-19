package com.ss.ugc.effectplatform.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.e.d;
import com.ss.ugc.effectplatform.e.f;
import com.ss.ugc.effectplatform.e.g;
import com.ss.ugc.effectplatform.e.h;
import com.ss.ugc.effectplatform.task.aj;
import com.ss.ugc.effectplatform.task.k;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a f153432a;

    static {
        Covode.recordClassIndex(102311);
    }

    public c(a aVar) {
        l.c(aVar, "");
        this.f153432a = aVar;
    }

    @Override // com.ss.ugc.effectplatform.a.a
    public final aj<com.ss.ugc.effectplatform.task.c.a> a(b bVar) {
        l.c(bVar, "");
        d.a aVar = new d.a();
        V v = this.f153432a.r.f156544a;
        if (v == null) {
            l.a();
        }
        return new k(bVar, aVar.a((com.ss.ugc.effectplatform.a.c.d) v).a(new g(bVar, this.f153432a)).a(new h(bVar.f153427a)).a(f.EFFECT).a(), this.f153432a);
    }
}
