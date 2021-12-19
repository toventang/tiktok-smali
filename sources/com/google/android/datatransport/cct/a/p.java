package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.a.d;
import com.google.firebase.a.e;

public final class p implements d<g> {
    static {
        Covode.recordClassIndex(30880);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.a.b
    public final void a(Object obj, e eVar) {
        g gVar = (g) obj;
        e eVar2 = eVar;
        eVar2.a("eventTimeMs", gVar.f49328a).a("eventUptimeMs", gVar.f49330c).a("timezoneOffsetSeconds", gVar.f49333f);
        if (gVar.f49331d != null) {
            eVar2.a("sourceExtension", gVar.f49331d);
        }
        if (gVar.f49332e != null) {
            eVar2.a("sourceExtensionJsonProto3", gVar.f49332e);
        }
        if (gVar.f49329b != Integer.MIN_VALUE) {
            eVar2.a("eventCode", gVar.f49329b);
        }
        if (gVar.f49334g != null) {
            eVar2.a("networkConnectionInfo", gVar.f49334g);
        }
    }
}
