package com.bytedance.ies.bullet.service.b;

import b.i;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.aa;
import com.bytedance.ies.bullet.service.base.ak;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.e.d;
import com.bytedance.ies.bullet.service.base.e.e;
import com.bytedance.ies.bullet.service.base.o;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.z;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a extends com.bytedance.ies.bullet.service.base.b.a implements o {

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, Integer> f32503f = ag.a(new p("web", 0), new p("rn", 2), new p("lynx", 3), new p("unknown", -1));

    /* renamed from: g  reason: collision with root package name */
    public static final C0699a f32504g = new C0699a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.monitor.webview.a f32505a;

    /* renamed from: b  reason: collision with root package name */
    public final aa f32506b;

    /* renamed from: c  reason: collision with root package name */
    public final ak f32507c;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f32508h;

    /* renamed from: com.bytedance.ies.bullet.service.b.a$a  reason: collision with other inner class name */
    public static final class C0699a {
        static {
            Covode.recordClassIndex(19274);
        }

        private C0699a() {
        }

        public /* synthetic */ C0699a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.o
    public final ak b() {
        return this.f32507c;
    }

    static {
        Covode.recordClassIndex(19273);
    }

    static final class c<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ an f32511b;

        static {
            Covode.recordClassIndex(19276);
        }

        c(a aVar, an anVar) {
            this.f32510a = aVar;
            this.f32511b = anVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            JSONObject jSONObject;
            String str3;
            boolean z;
            boolean z2;
            String str4;
            JSONObject jSONObject2;
            try {
                String str5 = this.f32511b.f32553f;
                int i2 = 1;
                Boolean bool = null;
                if (str5 == null) {
                    d dVar = this.f32511b.f32550c;
                    if (dVar != null) {
                        int i3 = e.f32603a[dVar.c().ordinal()];
                        if (i3 == 1) {
                            str5 = "lynx";
                        } else if (i3 == 2) {
                            str5 = "web";
                        } else if (i3 != 3) {
                            str5 = "unknown";
                        } else {
                            str5 = "rn";
                        }
                    } else {
                        str5 = null;
                    }
                }
                a aVar = this.f32510a;
                JSONObject jSONObject3 = this.f32511b.f32554g;
                d dVar2 = this.f32511b.f32550c;
                if (dVar2 != null) {
                    str = dVar2.b();
                } else {
                    str = null;
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject3.put("_bid", aVar.f32574d);
                ak akVar = aVar.f32507c;
                if (akVar != null) {
                    str2 = akVar.f32537c;
                } else {
                    str2 = null;
                }
                jSONObject3.put("_container", str2);
                jSONObject3.put("_bullet_sdk_version", "2.1.4-rc.11-tiktok");
                jSONObject3.put("hybrid_platform", str5);
                jSONObject3.put("_full_url", str);
                ak akVar2 = aVar.f32507c;
                if (!(akVar2 == null || (jSONObject2 = akVar2.f32538d) == null)) {
                    a.a(jSONObject3, jSONObject2);
                }
                JSONObject jSONObject4 = this.f32511b.f32557j;
                ak akVar3 = this.f32510a.f32507c;
                if (akVar3 != null) {
                    jSONObject = akVar3.f32539e;
                } else {
                    jSONObject = null;
                }
                JSONObject a2 = a.a(jSONObject4, jSONObject, str5);
                ak akVar4 = this.f32510a.f32507c;
                String str6 = "";
                if (akVar4 != null) {
                    String str7 = akVar4.f32535a;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    str3 = akVar4.f32536b;
                } else {
                    str3 = null;
                }
                String str8 = this.f32511b.f32548a;
                boolean z3 = false;
                if (str8 == null || str8.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str3 = this.f32511b.f32548a;
                }
                String str9 = this.f32511b.f32549b;
                if (str9 == null || str9.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    str6 = this.f32511b.f32549b;
                }
                d dVar3 = this.f32511b.f32550c;
                if (dVar3 == null || (str4 = dVar3.a()) == null) {
                    str4 = this.f32511b.f32552e;
                }
                d dVar4 = this.f32511b.f32550c;
                if (dVar4 != null) {
                    if (!(dVar4 instanceof com.bytedance.ies.bullet.service.base.e.a)) {
                        dVar4 = null;
                    }
                    com.bytedance.ies.bullet.service.base.e.a aVar2 = (com.bytedance.ies.bullet.service.base.e.a) dVar4;
                    if (aVar2 != null) {
                        com.bytedance.ies.bullet.service.a.e<String, Object> b2 = e.a.a().b(aVar2.f32600a);
                        if (b2 != null) {
                            bool = b2.getBoolean("res_memory");
                        }
                        if (!l.a((Object) bool, (Object) true)) {
                            i2 = 0;
                        }
                        jSONObject3.put("res_memory", i2);
                    }
                }
                c.a e2 = new c.a(this.f32511b.f32551d).a(jSONObject3).b(this.f32511b.f32555h).a(this.f32510a.f32505a).c(this.f32511b.f32558k).b(str6).a(str4).e(a2);
                Boolean bool2 = this.f32511b.f32556i;
                if (bool2 != null) {
                    z3 = bool2.booleanValue();
                }
                c.a a3 = e2.a(z3);
                if (str3 != null) {
                    a3.c(str3);
                }
                HybridMonitor.getInstance().customReport(a3.a());
            } catch (Throwable unused) {
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.o
    public final void a(an anVar) {
        l.c(anVar, "");
        i.a((Callable) new c(this, anVar));
    }

    @Override // com.bytedance.ies.bullet.service.base.b.a, com.bytedance.ies.bullet.service.base.a.c
    public final void b(String str) {
        l.c(str, "");
        super.b(str);
        HybridMonitor.getInstance().setCustomReportMonitor(this.f32505a);
    }

    public a(aa aaVar, ak akVar) {
        l.c(aaVar, "");
        this.f32506b = aaVar;
        this.f32507c = akVar;
        if (akVar != null) {
            this.f32508h = akVar.f32539e;
        }
        this.f32505a = new b(this);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        l.c(jSONObject, "");
        l.c(jSONObject2, "");
        Iterator<String> keys = jSONObject2.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, Object obj) {
        JSONObject jSONObject3;
        Iterator<String> keys;
        Iterator<String> keys2;
        if (jSONObject2 == null) {
            jSONObject3 = new JSONObject();
        } else {
            jSONObject3 = jSONObject2;
        }
        if (!(jSONObject == null || (keys2 = jSONObject.keys()) == null)) {
            while (keys2.hasNext()) {
                String next = keys2.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        if (!(jSONObject2 == null || (keys = jSONObject2.keys()) == null)) {
            while (keys.hasNext()) {
                String next2 = keys.next();
                jSONObject3.put(next2, jSONObject2.opt(next2));
            }
        }
        if (obj != null) {
            jSONObject3.put("platform", f32503f.get(obj));
        }
        return jSONObject3;
    }

    static final class b implements com.bytedance.android.monitor.webview.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32509a;

        static {
            Covode.recordClassIndex(19275);
        }

        b(a aVar) {
            this.f32509a = aVar;
        }

        @Override // com.bytedance.android.monitor.webview.a
        public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f32509a.f32506b.a(str, i2, jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.o
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f32506b.a(str, i2, jSONObject, jSONObject2);
    }
}
