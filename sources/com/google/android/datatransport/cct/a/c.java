package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.a.d;
import com.google.firebase.a.e;

public final class c implements d<d> {
    static {
        Covode.recordClassIndex(30859);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.a.b
    public final void a(Object obj, e eVar) {
        d dVar = (d) obj;
        e eVar2 = eVar;
        if (dVar.f49307a != Integer.MIN_VALUE) {
            eVar2.a("sdkVersion", dVar.f49307a);
        }
        if (dVar.f49308b != null) {
            eVar2.a("model", dVar.f49308b);
        }
        if (dVar.f49309c != null) {
            eVar2.a("hardware", dVar.f49309c);
        }
        if (dVar.f49310d != null) {
            eVar2.a("device", dVar.f49310d);
        }
        if (dVar.f49311e != null) {
            eVar2.a("product", dVar.f49311e);
        }
        if (dVar.f49312f != null) {
            eVar2.a("osBuild", dVar.f49312f);
        }
        if (dVar.f49313g != null) {
            eVar2.a("manufacturer", dVar.f49313g);
        }
        if (dVar.f49314h != null) {
            eVar2.a("fingerprint", dVar.f49314h);
        }
    }
}
