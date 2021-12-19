package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class p extends d {

    /* renamed from: b  reason: collision with root package name */
    private d f35687b;

    static {
        Covode.recordClassIndex(21310);
    }

    p(d dVar) {
        this.f35687b = dVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.web.jsbridge2.d
    public final void a(w wVar, ab abVar) {
        h hVar = new h();
        hVar.f35532c = wVar.f35692d;
        hVar.f35533d = new JSONObject(wVar.f35693e);
        hVar.f35531b = wVar.f35694f;
        hVar.f35530a = wVar.f35691c;
        hVar.f35534e = 0;
        hVar.f35535f = wVar.f35695g;
        hVar.f35536g = wVar.f35696h;
        hVar.f35538i = true;
        if (abVar.f35566b != null) {
            hVar.f35537h = abVar.f35566b.toString();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            this.f35687b.call(hVar, jSONObject);
        } catch (Exception unused) {
        }
        if (hVar.f35538i) {
            String jSONObject2 = jSONObject.toString();
            if (!abVar.f35568d) {
                k.a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + abVar.f35565a + ", stub: " + abVar.hashCode()));
            }
            abVar.hashCode();
            abVar.f35567c.a(jSONObject2);
            abVar.f35568d = false;
            if (k.f35671a) {
                jSONObject.optInt("code", 0);
            }
        }
    }
}
