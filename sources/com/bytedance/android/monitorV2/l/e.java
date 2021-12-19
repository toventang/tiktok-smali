package com.bytedance.android.monitorV2.l;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24020a = new a((byte) 0);

    static {
        Covode.recordClassIndex(14160);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14161);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                f.a(jSONObject2, "pid", f.c(jSONObject, "pid"));
                f.a(jSONObject2, "bid", f.c(jSONObject, "bid"));
                JSONObject d2 = f.d(jSONObject, "context");
                if (d2 != null) {
                    Iterator<String> keys = d2.keys();
                    l.a((Object) keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = d2.get(next);
                        if (obj != null && !(obj instanceof String)) {
                            f.a(d2, next, obj.toString());
                        }
                    }
                    f.a(jSONObject2, "context", d2);
                }
                f.a(jSONObject2, "env", f.e(jSONObject, "env"));
                f.a(jSONObject2, "release", f.c(jSONObject, "release"));
            }
            return jSONObject2;
        }
    }
}
