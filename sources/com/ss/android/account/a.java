package com.ss.android.account;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public class a extends com.bytedance.sdk.a.n.a {
    public String p;
    public String q;
    public String r;

    static {
        Covode.recordClassIndex(36159);
    }

    public a() {
    }

    @Override // com.bytedance.sdk.a.n.a
    public void a() {
        super.a();
        JSONObject jSONObject = this.o;
        if (jSONObject.has(StringSet.name)) {
            this.p = jSONObject.optString(StringSet.name);
        } else if (jSONObject.has("username")) {
            this.p = jSONObject.optString("username");
        }
        this.r = jSONObject.optString("avatar_url");
        this.q = jSONObject.optString("description");
    }

    public a(JSONObject jSONObject) {
        super(jSONObject);
    }

    public a(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
