package com.bytedance.bdturing.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f26472a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(15562);
    }

    public static void a(String str, String str2) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        l.c(str, "");
        l.c(str2, "");
        JSONObject optJSONObject5 = c.f26468a.optJSONObject("sms");
        if (!(optJSONObject5 == null || (optJSONObject4 = optJSONObject5.optJSONObject("host")) == null)) {
            optJSONObject4.put(str, str2);
        }
        JSONObject optJSONObject6 = c.f26468a.optJSONObject("qa");
        if (!(optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("host")) == null)) {
            optJSONObject3.put(str, str2);
        }
        JSONObject optJSONObject7 = c.f26468a.optJSONObject("verify");
        if (!(optJSONObject7 == null || (optJSONObject2 = optJSONObject7.optJSONObject("host")) == null)) {
            optJSONObject2.put(str, str2);
        }
        JSONObject optJSONObject8 = c.f26468a.optJSONObject("self_unpunish");
        if (optJSONObject8 != null && (optJSONObject = optJSONObject8.optJSONObject("host")) != null) {
            optJSONObject.put(str, str2);
        }
    }
}
