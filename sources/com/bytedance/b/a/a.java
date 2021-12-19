package com.bytedance.b.a;

import com.bytedance.b.a.b.d;
import com.bytedance.b.h.b;
import com.bytedance.b.j.c;
import com.bytedance.b.k.a.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile com.bytedance.b.a.a.a f25831a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f25832b;

    /* renamed from: c  reason: collision with root package name */
    private static com.bytedance.b.k.a.a<b> f25833c;

    static {
        Covode.recordClassIndex(15083);
        com.bytedance.b.k.a.a<b> aVar = new com.bytedance.b.k.a.a<>(1000);
        f25833c = aVar;
        aVar.f26315b = new a.AbstractC0561a<b>() {
            /* class com.bytedance.b.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15084);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.b.k.a.a.AbstractC0561a
            public final /* synthetic */ void a(b bVar) {
                com.bytedance.b.k.b.b.a("APM-CommonEvent", "evicted Monitorable ".concat(String.valueOf(bVar)));
            }
        };
    }

    private static synchronized void a() {
        com.bytedance.b.a.a.b bVar;
        synchronized (a.class) {
            if (!f25832b && (bVar = (com.bytedance.b.a.a.b) c.a(com.bytedance.b.a.a.b.class)) != null) {
                a(bVar.a());
                f25832b = true;
            }
        }
    }

    public static void a(d dVar) {
        if (com.bytedance.b.e.a.a.r()) {
            dVar.c();
        }
        com.bytedance.b.h.a.a(dVar);
    }

    public static synchronized void a(com.bytedance.b.a.a.a aVar) {
        synchronized (a.class) {
            if (aVar != null) {
                if (f25831a != aVar) {
                    f25831a = aVar;
                    while (!f25833c.f26314a.isEmpty()) {
                        T poll = f25833c.f26314a.poll();
                        if (poll instanceof com.bytedance.b.a.b.a) {
                            a((com.bytedance.b.a.b.a) poll);
                        } else if (poll instanceof com.bytedance.b.a.b.b) {
                            a((com.bytedance.b.a.b.b) poll);
                        }
                    }
                }
            }
        }
    }

    public static void a(com.bytedance.b.a.b.a aVar) {
        if (aVar != null) {
            if (f25831a == null) {
                f25833c.a(aVar);
                a();
            } else if (f25831a.a(aVar.f25836a)) {
                if (com.bytedance.b.e.a.a.r()) {
                    com.bytedance.apm.d.a.a("service_monitor", aVar.c(), true);
                }
                com.bytedance.b.h.a.a(aVar);
                if (!com.bytedance.b.e.a.a.r()) {
                }
            } else if (com.bytedance.b.e.a.a.r()) {
                com.bytedance.apm.d.a.a("service_monitor", aVar.c(), false);
            }
        }
    }

    public static void a(com.bytedance.b.a.b.b bVar) {
        if (bVar != null) {
            if (f25831a == null) {
                f25833c.a(bVar);
                a();
            } else if (f25831a.b(bVar.f25842a)) {
                if (com.bytedance.b.e.a.a.r()) {
                    com.bytedance.apm.d.a.a(bVar.f25842a, bVar.c(), true);
                }
                com.bytedance.b.h.a.a(bVar);
            } else if (com.bytedance.b.e.a.a.r()) {
                com.bytedance.apm.d.a.a(bVar.f25842a, bVar.c(), false);
            }
        }
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(str, 0, jSONObject, jSONObject2, jSONObject3);
    }

    public static void b(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(str, i2, jSONObject, jSONObject2, jSONObject3);
    }

    public static void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(new com.bytedance.b.a.b.a(str, i2, null, jSONObject, jSONObject2, jSONObject3));
    }
}
