package com.bytedance.android.ecommerce.b;

import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.h.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class f extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7022a = "OnEventMethod";

    static {
        Covode.recordClassIndex(3363);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.onEvent";
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final String b() {
        return "pipo.onEvent";
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        super.a(nVar, bVar, eVar);
        String f2 = nVar.f("event_name");
        n h2 = nVar.h("params");
        JSONObject jSONObject = new JSONObject();
        if (h2 != null) {
            Map<String, Object> b2 = h2.b();
            for (String str : b2.keySet()) {
                try {
                    jSONObject.put(str, b2.get(str));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        c.f7063a.f().a(f2, jSONObject);
        a.a((Object) "success", bVar);
    }
}
