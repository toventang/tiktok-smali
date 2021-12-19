package com.bytedance.ies.xbridge.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f36365a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(21787);
    }

    public static JSONObject a(n nVar) {
        l.c(nVar, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.ies.xbridge.l a2 = nVar.a();
        while (a2.a()) {
            String b2 = a2.b();
            switch (d.f36367b[nVar.j(b2).ordinal()]) {
                case 1:
                    m g2 = nVar.g(b2);
                    if (g2 == null) {
                        break;
                    } else {
                        jSONObject.put(b2, a(g2));
                        break;
                    }
                case 2:
                    n h2 = nVar.h(b2);
                    if (h2 == null) {
                        break;
                    } else {
                        jSONObject.put(b2, a(h2));
                        break;
                    }
                case 3:
                    jSONObject.put(b2, nVar.f(b2));
                    break;
                case 4:
                    jSONObject.put(b2, nVar.c(b2));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    jSONObject.put(b2, nVar.e(b2));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    jSONObject.put(b2, nVar.d(b2));
                    break;
            }
        }
        return jSONObject;
    }

    public static JSONArray a(m mVar) {
        l.c(mVar, "");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = mVar.b().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            switch (d.f36366a[mVar.h(i2).ordinal()]) {
                case 1:
                    m e2 = mVar.e(i2);
                    if (e2 == null) {
                        break;
                    } else {
                        jSONArray.put(a(e2));
                        break;
                    }
                case 2:
                    n f2 = mVar.f(i2);
                    if (f2 == null) {
                        break;
                    } else {
                        jSONArray.put(a(f2));
                        break;
                    }
                case 3:
                    jSONArray.put(mVar.d(i2));
                    break;
                case 4:
                    jSONArray.put(mVar.b(i2));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    jSONArray.put(mVar.c(i2));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    jSONArray.put(mVar.a(i2));
                    break;
            }
            i2 = i3;
        }
        return jSONArray;
    }
}
