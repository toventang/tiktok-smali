package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.z;

public abstract class l implements g<q, z, o> {
    static {
        Covode.recordClassIndex(98275);
    }

    public abstract void a(String str, String str2, p pVar);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.ss.android.ugc.tools.h.a.g
    public final /* synthetic */ void a(q qVar, f<q, z, o> fVar) {
        q qVar2 = qVar;
        h.f.b.l.d(qVar2, "");
        h.f.b.l.d(fVar, "");
        if (fVar instanceof p) {
            a(qVar2.f149219a, qVar2.f149220b, (p) fVar);
        }
    }
}
