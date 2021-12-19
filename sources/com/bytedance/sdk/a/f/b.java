package com.bytedance.sdk.a.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.h.a.i;
import com.bytedance.sdk.a.h.a.j;
import com.bytedance.sdk.a.h.a.n;
import com.bytedance.sdk.a.m.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.account.c;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(26481);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static c.a f43181a = new c.a();

        static {
            Covode.recordClassIndex(26482);
        }

        public static void a(JSONObject jSONObject, f fVar) {
            fVar.f43457b = c.a.a(jSONObject);
        }

        public static com.bytedance.sdk.a.n.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            c cVar = new c(jSONObject, jSONObject2);
            cVar.a();
            return cVar;
        }

        public static e a(f fVar, boolean z) {
            e eVar = new e(z, 0);
            eVar.f43073d = fVar.f43438g;
            eVar.f43075f = fVar.f43439h;
            eVar.f43083k = fVar.f43459d;
            eVar.f43084l = fVar.f43460e;
            eVar.f43085m = fVar.f43461f;
            eVar.f43082j = fVar.f43457b;
            return eVar;
        }

        public static void a(f fVar, JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has("error_code")) {
                    fVar.f43438g = jSONObject.optInt("error_code", fVar.f43438g);
                } else if (jSONObject.has("code")) {
                    fVar.f43438g = jSONObject.optInt("code", fVar.f43438g);
                }
                fVar.f43439h = jSONObject.optString("description");
                String optString = jSONObject.optString(StringSet.name);
                if ("connect_switch".equals(optString) || "connect_exist".equals(optString)) {
                    fVar.f43459d = jSONObject.optString("description");
                    fVar.f43460e = jSONObject.optString("dialog_tips");
                    fVar.f43461f = jSONObject.optString("auth_token");
                }
                if (fVar.f43438g == 1075) {
                    fVar.f43444m = jSONObject.optLong("apply_time");
                    fVar.p = jSONObject.optString("avatar_url");
                    fVar.o = jSONObject.optString("nick_name");
                    fVar.f43443l = jSONObject.optString("token");
                    fVar.n = jSONObject.optLong("cancel_time");
                }
                if (fVar.f43438g == 1041) {
                    fVar.q = new com.bytedance.sdk.a.m.b();
                    com.bytedance.sdk.a.m.b bVar = fVar.q;
                    bVar.f43445a = jSONObject.optString("screen_name");
                    bVar.f43446b = jSONObject.optString("avatar_url");
                    bVar.f43447c = jSONObject.optString("last_login_time");
                    bVar.f43448d = jSONObject.optString("mobile");
                    bVar.f43449e = jSONObject.optString("platform_screen_name_current");
                    bVar.f43450f = jSONObject.optString("platform_screen_name_conflict");
                }
            }
        }
    }

    public static void a(i iVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            iVar.f43279h = jSONObject.optInt("error_code", iVar.f43279h);
        } else if (jSONObject.has("code")) {
            iVar.f43279h = jSONObject.optInt("code", iVar.f43279h);
        }
        iVar.f43281j = jSONObject.optString("description");
        if (iVar instanceof i) {
            iVar.f43282k = jSONObject.optString("captcha");
            iVar.f43283l = jSONObject.optString("alert_text");
        }
        if (iVar.f43279h == 1001 && (iVar instanceof n)) {
            ((n) iVar).f43304c = jSONObject.optString("dialog_tips");
        }
        if (iVar.f43279h == 1057 && (iVar instanceof n)) {
            n nVar = (n) iVar;
            nVar.f43304c = jSONObject.optString("dialog_tips");
            nVar.f43305d = jSONObject.optString("next_url");
        }
        if (iVar.f43279h == 1057 && (iVar instanceof j)) {
            j jVar = (j) iVar;
            jVar.f43286b = jSONObject.optString("dialog_tips");
            jVar.f43287c = jSONObject.optString("next_url");
        }
        if (iVar.f43279h == 1075) {
            iVar.o = jSONObject.optLong("apply_time");
            iVar.r = jSONObject.optString("avatar_url");
            iVar.q = jSONObject.optString("nick_name");
            iVar.n = jSONObject.optString("token");
            iVar.p = jSONObject.optLong("cancel_time");
        }
    }

    public static void a(com.bytedance.sdk.a.m.a aVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            aVar.f43438g = jSONObject.optInt("error_code", aVar.f43438g);
        } else if (jSONObject.has("code")) {
            aVar.f43438g = jSONObject.optInt("code", aVar.f43438g);
        }
        aVar.f43439h = jSONObject.optString("description");
        if (aVar.f43438g == 1075) {
            aVar.f43444m = jSONObject.optLong("apply_time");
            aVar.p = jSONObject.optString("avatar_url");
            aVar.o = jSONObject.optString("nick_name");
            aVar.f43443l = jSONObject.optString("token");
            aVar.n = jSONObject.optLong("cancel_time");
        }
    }

    public static a.C1046a a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        a.C1046a aVar = new a.C1046a();
        if (!TextUtils.isEmpty(str)) {
            aVar.a("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.a("access_token", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.a("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.a("code", str4);
        }
        if (!TextUtils.isEmpty(null)) {
            aVar.a("profile_key", (String) null);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVar.a("platform_app_id", str5);
        }
        if (map != null && !map.isEmpty()) {
            for (String str6 : map.keySet()) {
                if (!TextUtils.isEmpty(str6)) {
                    aVar.a(str6, map.get(str6));
                }
            }
        }
        return aVar;
    }
}
