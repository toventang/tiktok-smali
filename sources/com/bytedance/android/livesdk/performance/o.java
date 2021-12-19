package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class o {

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, a> f20282a = new HashMap<>();

    static {
        Covode.recordClassIndex(11969);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f20283a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f20284b;

        static {
            Covode.recordClassIndex(11970);
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("active", 1);
                Map<String, String> map = this.f20284b;
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, String> entry : this.f20284b.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public final String toString() {
            return "Module: " + this.f20283a + " : " + this.f20284b.toString();
        }

        public a(String str, Map<String, String> map) {
            this.f20283a = str;
            this.f20284b = map;
        }
    }
}
