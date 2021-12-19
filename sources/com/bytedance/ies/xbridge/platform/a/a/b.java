package com.bytedance.ies.xbridge.platform.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.e;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.b.d;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.n;
import h.a.ag;
import h.f.b.ad;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f36369a = new b();

    public static final class a extends e {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.model.b.c f36370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f36371c = false;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f36372d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.b f36373e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b f36374f;

        /* renamed from: g  reason: collision with root package name */
        private final com.bytedance.ies.xbridge.b f36375g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f36376h;

        /* renamed from: i  reason: collision with root package name */
        private k.a f36377i;

        static {
            Covode.recordClassIndex(21791);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
        public final boolean aY_() {
            return this.f36376h;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
        public final k.a b() {
            return this.f36377i;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.q
        public final String d() {
            return this.f36375g.b();
        }

        @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
        public final void a() {
            super.a();
            this.f36375g.f();
        }

        public final i e() {
            return (i) this.f32005a.c(i.class);
        }

        /* renamed from: com.bytedance.ies.xbridge.platform.a.a.b$a$b  reason: collision with other inner class name */
        public static final class C0876b implements com.bytedance.ies.xbridge.b.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f36383a;

            static {
                Covode.recordClassIndex(21794);
            }

            @Override // com.bytedance.ies.xbridge.b.a
            public final String a() {
                z a2;
                String str;
                i e2 = this.f36383a.e();
                if (e2 == null || (a2 = e2.a()) == null || (str = a2.f32074a) == null) {
                    return "";
                }
                return str;
            }

            C0876b(a aVar) {
                this.f36383a = aVar;
            }
        }

        public final com.bytedance.ies.xbridge.e f() {
            com.bytedance.ies.bullet.service.f.a.b.b bVar;
            i e2 = e();
            if (e2 == null || (bVar = e2.b()) == null) {
                bVar = com.bytedance.ies.bullet.service.f.a.b.b.RN;
            }
            int i2 = c.f36387b[bVar.ordinal()];
            if (i2 == 1) {
                return com.bytedance.ies.xbridge.e.LYNX;
            }
            if (i2 == 2) {
                return com.bytedance.ies.xbridge.e.RN;
            }
            if (i2 != 3) {
                return com.bytedance.ies.xbridge.e.RN;
            }
            return com.bytedance.ies.xbridge.e.WEB;
        }

        /* renamed from: com.bytedance.ies.xbridge.platform.a.a.b$a$a  reason: collision with other inner class name */
        public static final class C0875a implements b.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f36378a;

            static {
                Covode.recordClassIndex(21792);
            }

            C0875a(a aVar) {
                this.f36378a = aVar;
            }

            @Override // com.bytedance.ies.xbridge.b.d
            public final void a(String str, n nVar) {
                l.c(str, "");
                i e2 = this.f36378a.e();
                if (e2 != null) {
                    e2.onEvent(new p(str, nVar) {
                        /* class com.bytedance.ies.xbridge.platform.a.a.b.a.C0875a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        public final JSONObject f36379a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f36380b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ n f36381c;

                        /* renamed from: d  reason: collision with root package name */
                        private final String f36382d;

                        static {
                            Covode.recordClassIndex(21793);
                        }

                        @Override // com.bytedance.ies.bullet.c.c.a.p
                        public final String a() {
                            return this.f36382d;
                        }

                        @Override // com.bytedance.ies.bullet.c.c.a.p
                        public final /* bridge */ /* synthetic */ Object b() {
                            return this.f36379a;
                        }

                        {
                            JSONObject jSONObject;
                            this.f36380b = r2;
                            this.f36381c = r3;
                            this.f36382d = r2;
                            if (r3 != null) {
                                jSONObject = com.bytedance.ies.xbridge.o.c.a(r3);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            this.f36379a = jSONObject;
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.ies.bullet.c.c.a.e
        public final void a(k.a aVar) {
            l.c(aVar, "");
            this.f36377i = aVar;
        }

        public static final class c implements b.AbstractC0814b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f36384a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k.b f36385b;

            static {
                Covode.recordClassIndex(21795);
            }

            @Override // com.bytedance.ies.xbridge.b.AbstractC0814b
            public final void a(Map<String, Object> map) {
                int i2;
                LinkedHashMap linkedHashMap;
                IHostLogDepend iHostLogDepend;
                com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
                String str = "";
                l.c(map, str);
                Object obj = map.get("code");
                h.z zVar = null;
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 1;
                }
                Object obj2 = map.get("msg");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str2 = (String) obj2;
                if (str2 != null) {
                    str = str2;
                }
                try {
                    Object obj3 = map.get("data");
                    if (!ad.g(obj3)) {
                        obj3 = null;
                    }
                    Object obj4 = (Map) obj3;
                    if (obj4 == null) {
                        obj4 = new LinkedHashMap();
                    }
                    linkedHashMap = q.m223constructorimpl(obj4);
                } catch (Throwable th) {
                    linkedHashMap = q.m223constructorimpl(r.a(th));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (q.m228isFailureimpl(linkedHashMap)) {
                    linkedHashMap = linkedHashMap2;
                }
                if (i2 != 1) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("code", Integer.valueOf(i2));
                    linkedHashMap3.put("error_message", str);
                    linkedHashMap3.put("method_name", this.f36384a.d());
                    linkedHashMap3.put("bridge_data", linkedHashMap);
                    linkedHashMap3.put("platform", this.f36384a.f().name());
                    k.b bVar2 = this.f36385b;
                    Object obj5 = map.get("data");
                    if (obj5 == null && (obj5 = ag.a()) == null) {
                        throw new w("null cannot be cast to non-null type");
                    }
                    bVar2.a(i2, str, new JSONObject((Map) obj5));
                    try {
                        com.bytedance.ies.xbridge.base.runtime.depend.b bVar3 = (com.bytedance.ies.xbridge.base.runtime.depend.b) this.f36384a.f36370b.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
                        if (!((bVar3 == null || (iHostLogDepend = bVar3.f35873b) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostLogDepend = bVar.f35873b) == null))) {
                            zVar = iHostLogDepend.reportJSBError(this.f36384a.f36370b, linkedHashMap3);
                        }
                        q.m223constructorimpl(zVar);
                    } catch (Throwable th2) {
                        q.m223constructorimpl(r.a(th2));
                    }
                } else {
                    this.f36385b.a(new JSONObject(map));
                }
            }

            c(a aVar, k.b bVar) {
                this.f36384a = aVar;
                this.f36385b = bVar;
            }
        }

        @Override // com.bytedance.ies.bullet.c.c.a.k
        public final void a(JSONObject jSONObject, k.b bVar) {
            n a2;
            l.c(jSONObject, "");
            l.c(bVar, "");
            com.bytedance.ies.xbridge.e f2 = f();
            if (this.f36371c) {
                l.c(f2, "");
                d dVar = d.f36388a.get(f2);
                if (dVar != null && dVar.a(f2)) {
                    a2 = dVar.a(jSONObject);
                    if (a2 != null) {
                        this.f36375g.a(a2, new c(this, bVar), f2);
                        return;
                    }
                    bVar.a(-3, "Unsupported platform type");
                }
            }
            Iterator it = this.f36372d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar2 = (d) it.next();
                if (dVar2.a(f2)) {
                    a2 = dVar2.a(jSONObject);
                    break;
                }
            }
            bVar.a(-3, "Unsupported platform type");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.ies.xbridge.model.b.c cVar, List list, com.bytedance.ies.xbridge.b bVar, com.bytedance.ies.bullet.c.e.a.b bVar2, com.bytedance.ies.bullet.c.e.a.b bVar3) {
            super(bVar3);
            k.a aVar;
            this.f36370b = cVar;
            this.f36372d = list;
            this.f36373e = bVar;
            this.f36374f = bVar2;
            cVar.a(com.bytedance.ies.web.a.a.class, bVar2.c(com.bytedance.ies.web.a.a.class));
            cVar.b(b.d.class, new C0875a(this));
            cVar.b(com.bytedance.ies.xbridge.b.a.class, new C0876b(this));
            bVar.a(cVar);
            this.f36375g = bVar;
            int i2 = c.f36386a[bVar.c().ordinal()];
            if (i2 == 1) {
                aVar = k.a.PRIVATE;
            } else if (i2 == 2) {
                aVar = k.a.PROTECT;
            } else if (i2 != 3) {
                aVar = k.a.PRIVATE;
            } else {
                aVar = k.a.PUBLIC;
            }
            this.f36377i = aVar;
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(21790);
    }
}
