package com.bytedance.android.livesdk.browser.jsbridge.d;

import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements d {
    static {
        Covode.recordClassIndex(8027);
    }

    private static int a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            a aVar = (a) com.bytedance.android.livesdk.util.a.a(jSONObject.toString(), (Type) a.class);
            if (aVar == null) {
                return 1;
            }
            aVar.f23024f = a.EnumC0505a.FromWeb;
            u.a().b().a(aVar);
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        int i2;
        if ("follow".equals(hVar.f35533d.getString(StringSet.type))) {
            i2 = a(hVar.f35533d.getJSONObject("args"));
        } else {
            i2 = 0;
        }
        try {
            jSONObject.put("code", i2);
        } catch (JSONException unused) {
        }
    }
}
