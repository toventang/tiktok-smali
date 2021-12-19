package com.bytedance.android.livesdk.lynx.b;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxEnv;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a */
    public static final a f18757a = new a();

    /* renamed from: com.bytedance.android.livesdk.lynx.b.a$a */
    public enum EnumC0392a {
        INIT_FAILED("LynxInitFailed"),
        RUNTIME_NOT_FOUND("RuntimeRetrieveFailed"),
        LOAD_FAILED("OnLoadFailed");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(11097);
        }

        private EnumC0392a(String str) {
            this.type = str;
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(11096);
    }

    public static void a(long j2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_container_type", "lynx");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", System.currentTimeMillis() - j2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("virtual_aid", "99999");
        jSONObject3.put("platform", 3);
        com.bytedance.android.livesdk.lynx.b.a.a.f18759a.a("hybrid_container_init_duration", null, jSONObject, jSONObject2, null, jSONObject3);
    }

    public static void b(Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a("ttlive_lynx_error", 0, map);
    }

    public static void a(String str) {
        l.d(str, "");
        c.a("ttlive_lynx_business_type_not_specified", 0, ag.a(v.a("url", str)));
    }

    public static void a(Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a("ttlive_lynx_update_page", 0, map);
    }

    public static void b(long j2, Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a(d.b("ttlive_lynx_page_load"), 1, j2, map);
    }

    public static void c(long j2, Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a("ttlive_lynx_first_screen", 0, j2, map);
    }

    public static void a(int i2, Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a("ttlive_lynx_offline", i2, map);
        Object obj = map.get("path");
        if (!(obj instanceof String)) {
            obj = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("offline", String.valueOf(i2));
        jSONObject.put("live_container_type", "lynx");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "99999");
        jSONObject2.put("platform", 3);
        com.bytedance.android.livesdk.lynx.b.a.a.f18759a.a("template_offline", (String) obj, jSONObject, null, null, jSONObject2);
    }

    public static void a(long j2, Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a("ttlive_lynx_page_start", 0, j2, map);
    }

    public static void a(int i2, long j2, Map<String, Object> map) {
        l.d(map, "");
        l.b(LynxEnv.b(), "");
        map.put("lynx_version", "2.1.5-rc.33-cxxshared");
        c.a(d.a("ttlive_lynx_page_load"), i2, j2, map);
    }

    public static void a(EnumC0392a aVar, String str, String str2) {
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        c.a("ttlive_lynx_fallback", 1, ag.a(v.a(StringSet.type, aVar.getType()), v.a("error_message", str), v.a("path", str2), v.a("url", str2)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, aVar.getType());
        jSONObject.put("error_message", str);
        jSONObject.put("path", str2);
        jSONObject.put("url", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "99999");
        com.bytedance.android.livesdk.lynx.b.a.a.f18759a.a("lynx_fallback", str2, null, null, jSONObject, jSONObject2);
    }
}
