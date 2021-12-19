package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.a.d;
import com.google.firebase.a.e;

public final class u implements d<j> {
    static {
        Covode.recordClassIndex(30889);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.a.b
    public final void a(Object obj, e eVar) {
        j jVar = (j) obj;
        e eVar2 = eVar;
        if (jVar.f49358b != null) {
            eVar2.a("mobileSubtype", jVar.f49358b.name());
        }
        if (jVar.f49357a != null) {
            eVar2.a("networkType", jVar.f49357a.name());
        }
    }
}
