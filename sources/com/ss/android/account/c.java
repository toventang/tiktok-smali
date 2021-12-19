package com.ss.android.account;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class c extends a {
    public String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public long I;
    public String J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public String O;
    public String P;
    public String Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public String s;
    public String t;
    public long u;
    public String v;
    public String w;
    public boolean x;
    public String y;
    public String z;

    static {
        Covode.recordClassIndex(36167);
    }

    public c() {
    }

    @Override // com.bytedance.sdk.a.n.a, com.ss.android.account.a
    public final void a() {
        boolean z2;
        super.a();
        JSONObject jSONObject = this.o;
        this.B = jSONObject.optInt("can_be_found_by_phone");
        this.C = jSONObject.optInt("share_to_repost", -1);
        boolean z3 = true;
        this.D = jSONObject.optInt("user_privacy_extend") & 1;
        this.E = jSONObject.optInt("user_privacy_extend");
        this.L = jSONObject.optInt("gender");
        this.s = jSONObject.optString("screen_name");
        this.t = jSONObject.optString("verified_content");
        this.M = jSONObject.optBoolean("is_generated");
        this.N = jSONObject.optBoolean("user_verified");
        if (jSONObject.optInt("is_recommend_allowed") != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z2;
        this.y = jSONObject.optString("recommend_hint_message");
        this.z = jSONObject.optString("user_decoration");
        this.A = jSONObject.optString("user_auth_info");
        this.O = jSONObject.optString("birthday");
        this.P = jSONObject.optString("area");
        this.Q = jSONObject.optString("industry");
        this.S = jSONObject.optInt("is_blocked");
        this.R = jSONObject.optInt("is_blocking");
        this.T = jSONObject.optBoolean("is_toutiao");
        if (jSONObject.optInt("has_password") == 0) {
            z3 = false;
        }
        this.U = z3;
        JSONObject optJSONObject = jSONObject.optJSONObject("media");
        if (optJSONObject != null) {
            this.v = optJSONObject.optString("avatar_url");
            this.u = optJSONObject.optLong("id");
            this.w = optJSONObject.optString(StringSet.name);
            this.K = optJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        this.F = jSONObject.optInt("followings_count");
        this.G = jSONObject.optInt("followers_count");
        this.H = jSONObject.optInt("visit_count_recent");
        this.I = jSONObject.optLong("media_id");
        this.J = jSONObject.optString("bg_img_url");
        this.V = jSONObject.optInt("app_id");
    }

    public c(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static class a {
        static {
            Covode.recordClassIndex(36168);
        }

        public static c a(JSONObject jSONObject) {
            c cVar = new c(jSONObject);
            cVar.a();
            return cVar;
        }
    }

    public c(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
