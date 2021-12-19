package com.ss.ugc.effectplatform.task.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.a.c.f;
import d.a.f.c;
import h.f.b.l;

public final class d implements c<e, f> {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a.c.d f153801a;

    static {
        Covode.recordClassIndex(102583);
    }

    public d(com.ss.ugc.effectplatform.a.c.d dVar) {
        this.f153801a = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // d.a.f.c
    public final /* synthetic */ f a(e eVar) {
        e eVar2 = eVar;
        l.c(eVar2, "");
        com.ss.ugc.effectplatform.a.c.d dVar = this.f153801a;
        if (dVar != null) {
            f fetchFromNetwork = dVar.fetchFromNetwork(eVar2);
            if (fetchFromNetwork.f153440a == 200) {
                return fetchFromNetwork;
            }
            throw new com.ss.ugc.effectplatform.f.d(fetchFromNetwork.f153440a, fetchFromNetwork.f153443d);
        }
        throw new com.ss.ugc.effectplatform.f.d(3, "networker is null!");
    }
}
