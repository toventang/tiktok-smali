package com.bytedance.jedi.a.h;

import com.bytedance.covode.number.Covode;
import f.a.t;
import h.f.b.l;
import h.z;

public abstract class a<V, RESP> extends com.bytedance.jedi.a.f.a<z, V, z, RESP> implements d<V, RESP> {
    static {
        Covode.recordClassIndex(24055);
    }

    public abstract t<RESP> b();

    @Override // com.bytedance.jedi.a.h.d
    public final t<RESP> a() {
        return c(z.f158842a);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ z b(z zVar) {
        l.d(zVar, "");
        return z.f158842a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(z zVar) {
        l.d(zVar, "");
        return b();
    }
}
