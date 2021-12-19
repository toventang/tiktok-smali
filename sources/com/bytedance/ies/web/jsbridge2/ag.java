package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.n;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class ag implements n.a.AbstractC0809a {

    /* renamed from: a  reason: collision with root package name */
    private final ae f35609a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35610b;

    static {
        Covode.recordClassIndex(21273);
    }

    ag(ae aeVar, String str) {
        this.f35609a = aeVar;
        this.f35610b = str;
    }

    @Override // com.bytedance.ies.web.jsbridge2.n.a.AbstractC0809a
    public final void a(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        ae aeVar = this.f35609a;
        String str2 = this.f35610b;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optInt("status") == 0) {
                JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                if (optJSONObject3 == null) {
                    optJSONObject = null;
                } else {
                    optJSONObject = optJSONObject3.optJSONObject("packages");
                }
                if (optJSONObject == null || TextUtils.isEmpty(str)) {
                    aeVar.f35593b.h().b("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str2);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(str);
                JSONObject optJSONObject4 = jSONObject2.optJSONObject("data");
                if (optJSONObject4 == null || (optJSONObject2 = optJSONObject4.optJSONObject("packages")) == null) {
                    aeVar.f35593b.h().b("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str2);
                    return;
                }
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    optJSONObject2.put(next, optJSONObject.getJSONArray(next));
                }
                String jSONObject3 = jSONObject2.toString();
                aeVar.f35593b.h().b("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", jSONObject3);
                ae.a(jSONObject3, TimeLineEvent.b.N, (String) null);
            }
        } catch (JSONException e2) {
            k.b(e2);
            new TimeLineEvent.a().a(TimeLineEvent.b.G, e2.getClass().getSimpleName()).a(TimeLineEvent.b.H, e2.getMessage()).a(TimeLineEvent.b.f35549c, str2).a(TimeLineEvent.b.f35551e, str).a(TimeLineEvent.b.ae, x.f35708g);
        }
    }
}
