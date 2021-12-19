package com.bytedance.bdturing;

import android.text.TextUtils;
import com.bytedance.bdturing.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static long f26465a;

    static {
        Covode.recordClassIndex(15556);
    }

    public enum a {
        CLOSE_REASON_MASK("mask_click_close"),
        CLOSE_REASON_BACK("back_close"),
        CLOSE_REASON_APP("app_close"),
        CLOSE_FB_MASK("close_fb_mask"),
        CLOSE_FB_CLOSE("close_fb_close"),
        CLOSE_FB_FEEDBACK("close_fb_feedback"),
        CLOSE_FB_SYSTEM("close_fb_system");
        
        private String name;

        public final String getName() {
            return this.name;
        }

        static {
            Covode.recordClassIndex(15557);
        }

        private a(String str) {
            this.name = str;
        }
    }

    public static void a() {
        f26465a = System.currentTimeMillis();
    }

    public static void b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "pop");
            a("turing_verify_sdk", jSONObject);
        } catch (JSONException e2) {
            g.a(e2);
        }
    }

    public static void c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "system_low");
            a("turing_verify_sdk", jSONObject);
        } catch (JSONException e2) {
            g.a(e2);
        }
    }

    public static void a(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i2);
            jSONObject.put("key", "orientation");
            a("turing_verify_sdk", jSONObject);
        } catch (JSONException e2) {
            g.a(e2);
        }
    }

    public static void a(int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - f26465a);
            jSONObject.put("result", i2);
            jSONObject.put("custom", str);
            jSONObject.put("key", "load_webview");
            a("turing_verify_sdk", jSONObject);
        } catch (JSONException e2) {
            g.a(e2);
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                c cVar = a.C0562a.f26400a.f26393a;
                jSONObject.put("params_for_special", "turing");
                if (cVar != null) {
                    jSONObject.put("sdk_version", cVar.f26411f);
                    jSONObject.put("host_app_id", cVar.f26407b);
                }
                cVar.u.a(str, jSONObject);
                if (g.a()) {
                    g.d(jSONObject.toString());
                }
            } catch (Exception e2) {
                g.a(e2);
            }
        }
    }
}
