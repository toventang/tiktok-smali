package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.bytedance.ies.web.jsbridge2.w;
import java.util.Set;
import org.json.JSONObject;

public final class aa implements d {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f35563a;

    /* renamed from: b  reason: collision with root package name */
    private am f35564b;

    static {
        Covode.recordClassIndex(21257);
    }

    aa(am amVar, Set<String> set) {
        this.f35563a = set;
        this.f35564b = amVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (this.f35563a.contains(hVar.f35532c)) {
            jSONObject.put("code", "-1");
            return;
        }
        hVar.f35538i = false;
        w.a a2 = w.a();
        a2.f35701c = hVar.f35532c;
        a2.f35700b = hVar.f35530a;
        a2.f35702d = hVar.f35533d.toString();
        a2.f35703e = hVar.f35531b;
        a2.f35699a = String.valueOf(hVar.f35534e);
        a2.f35704f = hVar.f35535f;
        a2.f35705g = hVar.f35536g;
        this.f35564b.a(a2.a());
    }
}
