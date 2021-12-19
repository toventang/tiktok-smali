package com.bytedance.ies.xbridge.platform.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.d;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private final e f36391a = e.WEB;

    static {
        Covode.recordClassIndex(21800);
    }

    @Override // com.bytedance.ies.xbridge.d
    public final e a() {
        return this.f36391a;
    }

    public static n a(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        return new com.bytedance.ies.xbridge.platform.b.b.d(a.a(map));
    }

    public static final class a implements com.bytedance.ies.web.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.platform.b.a.a f36393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f36394c;

        static {
            Covode.recordClassIndex(21801);
        }

        public a(b bVar, com.bytedance.ies.xbridge.platform.b.a.a aVar, f fVar) {
            this.f36392a = bVar;
            this.f36393b = aVar;
            this.f36394c = fVar;
        }

        @Override // com.bytedance.ies.web.a.d
        public final void call(final h hVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = hVar.f35533d;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("func", hVar.f35532c);
            hVar.f35538i = false;
            b bVar = this.f36392a;
            String str = hVar.f35532c;
            l.a((Object) str, "");
            bVar.a(str, new com.bytedance.ies.xbridge.platform.b.b.d(jSONObject2), new b.AbstractC0814b(this) {
                /* class com.bytedance.ies.xbridge.platform.b.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f36396a;

                static {
                    Covode.recordClassIndex(21802);
                }

                @Override // com.bytedance.ies.xbridge.b.AbstractC0814b
                public final void a(Map<String, Object> map) {
                    l.c(map, "");
                    this.f36396a.f36393b.a(hVar.f35531b, new JSONObject(map));
                }

                {
                    this.f36396a = r1;
                }
            }, this.f36394c);
        }
    }
}
