package com.bytedance.l.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.j;
import com.ss.android.ugc.aweme.live.livehostimpl.w;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements j {
    static {
        Covode.recordClassIndex(24554);
    }

    /* renamed from: com.bytedance.l.b.a$a  reason: collision with other inner class name */
    public static class C0976a {

        /* renamed from: a  reason: collision with root package name */
        public static j f39760a = new a();

        static {
            Covode.recordClassIndex(24555);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static com.bytedance.android.live.base.b.a f39761a = new w();

        static {
            Covode.recordClassIndex(24556);
        }
    }

    private static JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2160");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            com.bytedance.android.live.core.c.a.a(6, "LiveOuterSlardarMonitor", e2.getMessage());
        }
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.aweme.live.j
    public final void a(String str, int i2, Map<String, Object> map) {
        if (b.f39761a != null) {
            JSONObject a2 = a(map);
            if (b.f39761a != null) {
                b.f39761a.a(str, i2, a(a2));
            }
        }
    }
}
