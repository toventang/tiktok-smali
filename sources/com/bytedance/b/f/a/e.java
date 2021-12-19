package com.bytedance.b.f.a;

import com.bytedance.b.g.a.a;
import com.bytedance.b.g.a.b;
import com.bytedance.b.g.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    a f26242a;

    static {
        Covode.recordClassIndex(15241);
    }

    @Override // com.bytedance.b.g.a.b
    public a a() {
        return this.f26242a;
    }

    public e() {
        com.bytedance.b.f.a.a.a.a().b();
        com.bytedance.b.f.a.a.a.a().a(new com.bytedance.b.f.a.a.b() {
            /* class com.bytedance.b.f.a.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15242);
            }

            @Override // com.bytedance.b.f.a.a.b
            public final void a(JSONObject jSONObject) {
                JSONObject optJSONObject;
                boolean z;
                e eVar = e.this;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("memory")) != null) {
                    long optLong = optJSONObject.optLong("collect_interval", 120);
                    double optDouble = optJSONObject.optDouble("reach_top_memory_rate", 0.8d);
                    boolean z2 = true;
                    if (optJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (optJSONObject.optInt("close_memory_collect") == 1) {
                        z2 = false;
                    }
                    eVar.f26242a = new a(optLong, optDouble, z, z2);
                    b.a.f26271a.a(eVar.a());
                }
            }
        });
    }
}
