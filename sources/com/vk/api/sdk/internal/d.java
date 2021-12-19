package com.vk.api.sdk.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.c.a;
import com.vk.api.sdk.c.b;
import com.vk.api.sdk.c.c;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f156349a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(103832);
    }

    public static a a(JSONArray jSONArray, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                l.a((Object) jSONObject, "");
                a a2 = a(jSONObject, (String) null);
                if (!(a2 instanceof b)) {
                    return a2;
                }
                int code = ((b) a2).getCode();
                if (code == 1 || code == 14 || code == 17 || code == 4 || code == 5 || code == 6 || code == 9 || code == 10 || code == 24 || code == 25) {
                    return a2;
                }
                arrayList.add(a2);
            }
            return new b(Integer.MIN_VALUE, str, false, "", null, arrayList, null, 64, null);
        } catch (JSONException e2) {
            return new c(e2);
        }
    }

    public static a a(JSONObject jSONObject, String str) {
        String str2 = str;
        String str3 = "";
        l.c(jSONObject, str3);
        try {
            int i2 = jSONObject.getInt("error_code");
            Bundle bundle = null;
            if (i2 == 5) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ban_info");
                if (optJSONObject != null) {
                    bundle = new Bundle();
                    bundle.putString("user_ban_info", optJSONObject.toString());
                }
            } else if (i2 == 14) {
                bundle = new Bundle();
                bundle.putString("captcha_sid", jSONObject.getString("captcha_sid"));
                bundle.putString("captcha_img", jSONObject.getString("captcha_img"));
            } else if (i2 == 17) {
                bundle = new Bundle();
                bundle.putString("validation_url", jSONObject.getString("redirect_uri"));
            } else if (i2 == 24) {
                bundle = new Bundle();
                bundle.putString("confirmation_text", jSONObject.getString("confirmation_text"));
            } else if (i2 == 3609) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("extend_hash", jSONObject.optString("extend_hash", null));
                bundle = bundle2;
            }
            l.c(jSONObject, str3);
            if (str2 == null && (str2 = jSONObject.optString("method")) == null) {
                str2 = str3;
            }
            int i3 = jSONObject.getInt("error_code");
            String optString = jSONObject.optString("error_msg");
            if (optString == null) {
                optString = str3;
            }
            if (jSONObject.has("error_text")) {
                String optString2 = jSONObject.optString("error_text");
                if (optString2 != null) {
                    str3 = optString2;
                }
                return new b(i3, str2, true, str3, bundle, null, optString, 32, null);
            }
            String optString3 = jSONObject.optString("error_msg");
            if (optString3 != null) {
                str3 = optString3;
            }
            return new b(i3, str2, false, str3 + " | by [" + str2 + ']', bundle, null, str3, 32, null);
        } catch (Exception e2) {
            return new c(e2);
        }
    }
}
