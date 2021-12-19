package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.f;
import com.bytedance.ies.xbridge.n;
import h.a.ag;
import h.f.b.l;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f14816a = new x();

    public static final class e implements com.bytedance.ies.xbridge.b.b {
        static {
            Covode.recordClassIndex(8219);
        }

        @Override // com.bytedance.ies.xbridge.b.b
        public final String a() {
            return "DEFAULT";
        }

        e() {
        }
    }

    private x() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map.Entry f14818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.jsbridge2.x f14819c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14820d;

        static {
            Covode.recordClassIndex(8213);
        }

        a(String str, Map.Entry entry, com.bytedance.ies.web.jsbridge2.x xVar, int i2) {
            this.f14817a = str;
            this.f14818b = entry;
            this.f14819c = xVar;
            this.f14820d = i2;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            return new com.bytedance.ies.web.jsbridge2.e<JSONObject, JSONObject>(this) {
                /* class com.bytedance.android.livesdk.browser.jsbridge.x.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f14821a;

                static {
                    Covode.recordClassIndex(8214);
                }

                @Override // com.bytedance.ies.web.jsbridge2.e
                public final void onTerminate() {
                    ((com.bytedance.ies.xbridge.c) this.f14821a.f14818b.getValue()).a().f();
                }

                {
                    this.f14821a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
                @Override // com.bytedance.ies.web.jsbridge2.e
                public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
                    com.bytedance.ies.xbridge.e eVar;
                    JSONObject jSONObject2 = jSONObject;
                    l.d(jSONObject2, "");
                    l.d(gVar, "");
                    com.bytedance.android.live.core.c.a.a(3, "XbridgeManager", "xbridge start,fun name:" + this.f14821a.f14817a);
                    jSONObject2.put("func", this.f14821a.f14817a);
                    com.bytedance.ies.xbridge.b a2 = ((com.bytedance.ies.xbridge.c) this.f14821a.f14818b.getValue()).a();
                    com.bytedance.ies.xbridge.model.a.a.d dVar = new com.bytedance.ies.xbridge.model.a.a.d(jSONObject2);
                    AnonymousClass1 r2 = new b.AbstractC0814b(this) {
                        /* class com.bytedance.android.livesdk.browser.jsbridge.x.a.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f14822a;

                        static {
                            Covode.recordClassIndex(8215);
                        }

                        {
                            this.f14822a = r1;
                        }

                        @Override // com.bytedance.ies.xbridge.b.AbstractC0814b
                        public final void a(Map<String, Object> map) {
                            Object obj;
                            l.d(map, "");
                            com.bytedance.android.live.core.c.a.a(3, "XbridgeManager", "xbridge end,fun name:" + this.f14822a.f14821a.f14817a);
                            if (this.f14822a.f14821a.f14820d == 1 && (obj = map.get("data")) != null && (obj instanceof Map)) {
                                map.remove("data");
                                map.putAll((Map) obj);
                            }
                            this.f14822a.finishWithRawResult(new JSONObject(map));
                        }
                    };
                    if (this.f14821a.f14820d == 1) {
                        eVar = com.bytedance.ies.xbridge.e.LYNX;
                    } else {
                        eVar = com.bytedance.ies.xbridge.e.WEB;
                    }
                    a2.a(dVar, r2, eVar);
                }
            };
        }
    }

    public static final class c implements com.bytedance.ies.xbridge.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f14825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.jsbridge2.x f14826b;

        static {
            Covode.recordClassIndex(8217);
        }

        @Override // com.bytedance.ies.xbridge.b.a
        public final String a() {
            return this.f14826b.toString();
        }

        c(Activity activity, com.bytedance.ies.web.jsbridge2.x xVar) {
            this.f14825a = activity;
            this.f14826b = xVar;
        }
    }

    public static final class d implements com.bytedance.ies.xbridge.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.b f14827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f14828b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.model.b.c f14829c;

        static {
            Covode.recordClassIndex(8218);
        }

        @Override // com.bytedance.ies.xbridge.c
        public final com.bytedance.ies.xbridge.b a() {
            this.f14827a.a(this.f14829c);
            com.bytedance.ies.xbridge.b bVar = this.f14827a;
            l.b(bVar, "");
            return bVar;
        }

        d(com.bytedance.ies.xbridge.b bVar, f fVar, com.bytedance.ies.xbridge.model.b.c cVar) {
            this.f14827a = bVar;
            this.f14828b = fVar;
            this.f14829c = cVar;
        }
    }

    static {
        Covode.recordClassIndex(8212);
    }

    public static final class b implements b.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f14823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.jsbridge2.x f14824b;

        static {
            Covode.recordClassIndex(8216);
        }

        b(Activity activity, com.bytedance.ies.web.jsbridge2.x xVar) {
            this.f14823a = activity;
            this.f14824b = xVar;
        }

        @Override // com.bytedance.ies.xbridge.b.d
        public final void a(String str, n nVar) {
            JSONObject jSONObject;
            l.d(str, "");
            if (nVar != null) {
                jSONObject = com.bytedance.ies.xbridge.o.c.a(nVar);
            } else {
                jSONObject = new JSONObject();
            }
            if (!this.f14824b.f35715f) {
                this.f14824b.a(str, jSONObject);
            }
        }
    }

    public static void a(Activity activity, com.bytedance.ies.web.jsbridge2.x xVar, int i2) {
        Collection<Class> values;
        l.d(activity, "");
        l.d(xVar, "");
        com.bytedance.ies.xbridge.model.b.c cVar = new com.bytedance.ies.xbridge.model.b.c();
        cVar.a(Context.class, activity);
        cVar.b(com.bytedance.ies.xbridge.b.b.class, new e());
        cVar.b(b.d.class, new b(activity, xVar));
        cVar.b(com.bytedance.ies.xbridge.b.a.class, new c(activity, xVar));
        k kVar = (k) com.bytedance.android.live.t.a.a(k.class);
        if (kVar != null) {
            kVar.c();
        }
        f fVar = new f();
        Map map = com.bytedance.ies.xbridge.a.a(com.bytedance.ies.xbridge.e.ALL, "DEFAULT");
        if (!(map == null || (values = map.values()) == null)) {
            for (Class cls : values) {
                com.bytedance.ies.xbridge.b bVar = (com.bytedance.ies.xbridge.b) cls.newInstance();
                fVar.a(bVar.b(), new d(bVar, fVar, cVar));
            }
        }
        for (Map.Entry entry : ag.c(fVar.a().f35944a).entrySet()) {
            String str = (String) entry.getKey();
            xVar.a(str, (e.b) new a(str, entry, xVar, i2));
        }
    }
}
