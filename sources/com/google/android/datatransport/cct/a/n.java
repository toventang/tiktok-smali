package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.a.d;
import com.google.firebase.a.e;

public final class n implements d<f> {
    static {
        Covode.recordClassIndex(30877);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.a.b
    public final void a(Object obj, e eVar) {
        f fVar = (f) obj;
        e eVar2 = eVar;
        if (fVar.f49324a != null) {
            eVar2.a("clientType", fVar.f49324a.name());
        }
        if (fVar.f49325b != null) {
            eVar2.a("androidClientInfo", fVar.f49325b);
        }
    }
}
