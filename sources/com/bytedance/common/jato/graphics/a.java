package com.bytedance.common.jato.graphics;

import com.bytedance.common.jato.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(15857);
    }

    public static void a(final String str) {
        d.b().execute(new Runnable() {
            /* class com.bytedance.common.jato.graphics.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15858);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trim_memory", str);
                    d.a().a("graphics_memory", jSONObject, (JSONObject) null);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
