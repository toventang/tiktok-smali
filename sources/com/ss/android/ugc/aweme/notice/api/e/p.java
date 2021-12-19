package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;
import org.json.JSONObject;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f112733a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final p f112734b = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(72464);
    }

    public static void a(String str) {
        l.d(str, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", str);
            try {
                jSONObject2.put("enter_from", (String) h.m.p.c((CharSequence) h.m.p.c(str, new String[]{"em="}).get(1), new String[]{"&"}).get(0));
            } catch (Exception e2) {
                a.a((Throwable) e2);
            }
            b.a("aweme_long_connection_status", jSONObject, (JSONObject) null, jSONObject2);
        } catch (Exception e3) {
            a.a(e3);
        }
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        f112733a = str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("error_type", str2);
        jSONObject.put("status", 1);
        JSONObject jSONObject2 = new JSONObject();
        if (str3 != null) {
            jSONObject2.put("message", str3);
        }
        b.a("aweme_long_connection_status", jSONObject, (JSONObject) null, jSONObject2);
    }
}
