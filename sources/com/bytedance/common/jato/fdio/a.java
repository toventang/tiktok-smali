package com.bytedance.common.jato.fdio;

import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(15838);
    }

    public static void a(final String str) {
        d.b().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15839);
            }

            public final void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_or_preload", str);
                        d.a().a("fdio_monitor_3", jSONObject, (JSONObject) null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void b(final String str) {
        d.b().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(15840);
            }

            public final void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_reason", str);
                        d.a().a("fdio_monitor_3", jSONObject, (JSONObject) null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }
}
