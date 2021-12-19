package com.bytedance.sdk.xbridge.protocol.a;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: b */
    public static final a f43939b = new a((byte) 0);

    /* renamed from: a */
    public final Object f43940a;

    static {
        Covode.recordClassIndex(26844);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26845);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(int i2, String str) {
            l.c(str, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            jSONObject.put("msg", str);
            jSONObject.put("data", (Object) null);
            return new b(jSONObject);
        }
    }

    public final String toString() {
        String jSONObject = a().toString();
        l.a((Object) jSONObject, "");
        return jSONObject;
    }

    public final JSONObject a() {
        Object obj = this.f43940a;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        HashMap<String, Object> hashMap = null;
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) this.f43940a).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    key = null;
                }
                String str = (String) key;
                if (str != null) {
                    jSONObject.put(str, entry.getValue());
                }
            }
            return jSONObject;
        }
        if (obj instanceof ReadableMap) {
            if (!(obj instanceof ReadableMap)) {
                obj = null;
            }
            ReadableMap readableMap = (ReadableMap) obj;
            if (readableMap != null) {
                hashMap = readableMap.toHashMap();
            }
            JSONObject jSONObject2 = new JSONObject();
            if (hashMap != null) {
                for (Map.Entry<String, Object> entry2 : hashMap.entrySet()) {
                    String key2 = entry2.getKey();
                    if (key2 != null) {
                        jSONObject2.put(key2, entry2.getValue());
                    }
                }
            }
        }
        return new JSONObject();
    }

    public b(Object obj) {
        l.c(obj, "");
        this.f43940a = obj;
    }
}
