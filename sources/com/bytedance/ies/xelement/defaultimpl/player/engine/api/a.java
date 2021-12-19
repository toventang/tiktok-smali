package com.bytedance.ies.xelement.defaultimpl.player.engine.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b;
import h.z;

public final class a implements b<f, n> {
    static {
        Covode.recordClassIndex(22199);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.f.a.b] */
    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b
    public final /* synthetic */ void a(f fVar, h.f.a.b<? super n, z> bVar) {
        n nVar;
        f fVar2 = fVar;
        if (fVar2 == null) {
            nVar = null;
        } else {
            nVar = new n(fVar2.getPlayUrl(), fVar2.getLocalPath(), fVar2.getPlayModel(), 12);
        }
        bVar.invoke(nVar);
    }
}
