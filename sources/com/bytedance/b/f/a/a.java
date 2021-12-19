package com.bytedance.b.f.a;

import com.bytedance.b.a.a.b;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    volatile com.bytedance.b.a.a.a f26219a;

    static {
        Covode.recordClassIndex(15228);
    }

    @Override // com.bytedance.b.a.a.b
    public final com.bytedance.b.a.a.a a() {
        return this.f26219a;
    }

    public a() {
        com.bytedance.b.f.a.a.a.a().b();
        com.bytedance.b.f.a.a.a.a().a(new com.bytedance.b.f.a.a.b() {
            /* class com.bytedance.b.f.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15229);
            }

            @Override // com.bytedance.b.f.a.a.b
            public final void a(JSONObject jSONObject) {
                a aVar = a.this;
                JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("allow_service_name");
                    HashSet hashSet = new HashSet();
                    if (optJSONObject2 != null) {
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            hashSet.add(keys.next());
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("allow_log_type");
                    if (optJSONObject3 != null) {
                        Iterator<String> keys2 = optJSONObject3.keys();
                        while (keys2.hasNext()) {
                            String next = keys2.next();
                            if (optJSONObject3.optInt(next) == 1) {
                                hashSet2.add(next);
                            }
                        }
                    }
                    aVar.f26219a = new com.bytedance.b.a.a.a(hashSet, hashSet2);
                    if (com.bytedance.b.e.a.a.r()) {
                        com.bytedance.b.a.a.a aVar2 = aVar.f26219a;
                    }
                    com.bytedance.b.a.a.a(aVar.f26219a);
                }
            }
        });
    }
}
