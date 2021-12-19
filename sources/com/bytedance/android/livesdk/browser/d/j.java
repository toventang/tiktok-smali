package com.bytedance.android.livesdk.browser.d;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import f.a.d.f;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final h f14376a;

    static {
        Covode.recordClassIndex(7959);
    }

    j(h hVar) {
        this.f14376a = hVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        h hVar = this.f14376a;
        a aVar = (a) obj;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put(StringSet.type, "follow");
                jSONObject2.put("user_id", String.valueOf(aVar.f23019a));
                jSONObject2.put("follow_status", aVar.a());
                jSONObject.put("args", jSONObject2);
                hVar.a("H5_userStatusChange", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
