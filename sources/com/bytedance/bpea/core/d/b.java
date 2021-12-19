package com.bytedance.bpea.core.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26661a = new a((byte) 0);

    static {
        Covode.recordClassIndex(15705);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(15706);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
            l.c(jSONObject, "");
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                l.a((Object) keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        }
    }
}
