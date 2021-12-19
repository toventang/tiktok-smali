package com.bytedance.tux.b;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.k.c;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Map<e, Map<Integer, Object>> f44692b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(27322);
    }

    @Override // com.bytedance.tux.b.d
    public final b a() {
        if (this.f44692b.isEmpty()) {
            return super.a();
        }
        return new b(this.f44669a, this.f44692b);
    }

    public static b a(i iVar) {
        l.c(iVar, "");
        h hVar = new h();
        Boolean valueOf = Boolean.valueOf(iVar.f44695c);
        if (valueOf.booleanValue()) {
            boolean booleanValue = valueOf.booleanValue();
            c<Boolean> r = g.r();
            hVar.f44669a.put(Integer.valueOf(r.f44668a), Boolean.valueOf(booleanValue));
        }
        c<?> cVar = iVar.f44694b;
        if (cVar != null) {
            hVar.f44669a.put(Integer.valueOf(g.s().f44668a), cVar);
        }
        return hVar.a();
    }

    public final void a(e eVar, b<? super d, z> bVar) {
        l.c(eVar, "");
        l.c(bVar, "");
        d dVar = new d();
        bVar.invoke(dVar);
        this.f44692b.put(eVar, dVar.a().f44666a);
    }
}
