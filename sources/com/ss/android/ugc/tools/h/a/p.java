package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public abstract class p implements f<q, z, o> {
    static {
        Covode.recordClassIndex(98279);
    }

    public abstract void a(String str, long j2);

    public abstract void a(String str, long j2, Exception exc, Integer num);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.tools.h.a.f
    public final /* synthetic */ void a(q qVar, int i2) {
        l.d(qVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.ss.android.ugc.tools.h.a.f
    public final /* synthetic */ void a(q qVar, z zVar) {
        l.d(qVar, "");
        l.d(zVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
    @Override // com.ss.android.ugc.tools.h.a.f
    public final /* synthetic */ void a(q qVar, Exception exc, o oVar, long j2) {
        q qVar2 = qVar;
        o oVar2 = oVar;
        l.d(qVar2, "");
        l.d(oVar2, "");
        a(qVar2.f149219a, j2, oVar2.f149218b, oVar2.f149217a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
    @Override // com.ss.android.ugc.tools.h.a.f
    public final /* synthetic */ void a(q qVar, z zVar, o oVar, long j2) {
        q qVar2 = qVar;
        l.d(qVar2, "");
        l.d(zVar, "");
        l.d(oVar, "");
        a(qVar2.f149219a, j2);
    }
}
