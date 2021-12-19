package com.bytedance.android.livesdk.browser.d;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final h f14382a;

    static {
        Covode.recordClassIndex(7965);
    }

    p(h hVar) {
        this.f14382a = hVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        h hVar = this.f14382a;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "1");
            jSONObject.put("args", jSONObject2);
            hVar.a("H5_loginStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
