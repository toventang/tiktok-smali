package com.ss.ugc.live.a.a.d;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.b.b;
import com.ss.ugc.live.a.a.b.c;

public final class e implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    private static d<String> f154020a;

    /* renamed from: b  reason: collision with root package name */
    private static d<String> f154021b;

    /* renamed from: c  reason: collision with root package name */
    private b f154022c = new c();

    static {
        Covode.recordClassIndex(102715);
    }

    private d<String> a(com.ss.ugc.live.a.a.e eVar) {
        return new b(new c(this.f154022c, eVar.f154025a));
    }

    @Override // com.ss.ugc.live.a.a.d.a
    public final d<String> a(com.ss.ugc.live.a.a.c cVar, com.ss.ugc.live.a.a.e eVar) {
        if (!cVar.f154009f) {
            d<String> dVar = f154021b;
            if (dVar != null) {
                return dVar;
            }
            d<String> a2 = a(eVar);
            f154021b = a2;
            return a2;
        }
        d<String> dVar2 = f154020a;
        if (dVar2 != null) {
            return dVar2;
        }
        f fVar = new f(a(eVar));
        f154020a = fVar;
        return fVar;
    }
}
