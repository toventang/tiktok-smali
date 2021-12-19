package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONException;
import org.json.JSONObject;

final class d implements com.bytedance.push.c.d {
    static {
        Covode.recordClassIndex(95097);
    }

    d() {
    }

    @Override // com.bytedance.push.c.d
    public final void a(String str, JSONObject jSONObject) {
        r.a(str, jSONObject);
    }

    private static void a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b.a(str, jSONObject);
    }

    @Override // com.bytedance.push.c.d
    public final void a(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        String str4;
        String str5 = "";
        c.a(context, str, str2, str3, j2, j3, jSONObject);
        a("log_red_badge", "show", new com.ss.android.ugc.awemepushlib.f.c().a("count", String.valueOf(j2)).a());
        if (TextUtils.equals(str2, "red_badge") && j2 > 0) {
            r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("show").setValue(String.valueOf(j2)));
            com.ss.android.ugc.aweme.co.b.b().a(context, "red_point_count", j2);
        }
        try {
            if (TextUtils.equals(str2, "red_badge")) {
                com.ss.android.ugc.awemepushlib.f.c a2 = new com.ss.android.ugc.awemepushlib.f.c().a("label", str3).a("category", str).a("value", Long.valueOf(j2)).a("ext_value", Long.valueOf(j3));
                if (jSONObject == null) {
                    str4 = str5;
                } else {
                    str4 = jSONObject.toString();
                }
                o.a(str2, a2.a("ext_json", str4).a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        q.a(context, str, str2, str3, j2, j3, jSONObject);
        a("log_red_badge", "show", new com.ss.android.ugc.awemepushlib.f.c().a("count", String.valueOf(j2)).a());
        if (TextUtils.equals(str2, "red_badge") && j2 > 0) {
            r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("show").setValue(String.valueOf(j2)));
            com.ss.android.ugc.aweme.co.b.b().a(context, "red_point_count", j2);
        }
        try {
            if (TextUtils.equals(str2, "red_badge")) {
                com.ss.android.ugc.awemepushlib.f.c a3 = new com.ss.android.ugc.awemepushlib.f.c().a("label", str3).a("category", str).a("value", Long.valueOf(j2)).a("ext_value", Long.valueOf(j3));
                if (jSONObject != null) {
                    str5 = jSONObject.toString();
                }
                o.a(str2, a3.a("ext_json", str5).a());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
