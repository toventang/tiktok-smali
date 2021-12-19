package com.bytedance.ies.bullet.service.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.b.c;
import com.bytedance.ies.bullet.c.c.a.e;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.e.d;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.d.a.m;
import com.bytedance.ies.d.a.n;
import com.bytedance.ies.d.a.x;
import h.f.b.l;
import h.q;
import h.r;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArraySet<n> f32664b;

    /* renamed from: c  reason: collision with root package name */
    public final b f32665c;

    /* renamed from: d  reason: collision with root package name */
    public final b f32666d;

    /* renamed from: e  reason: collision with root package name */
    private k.a f32667e = k.a.PRIVATE;

    /* renamed from: f  reason: collision with root package name */
    private final String f32668f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32669g;

    /* renamed from: h  reason: collision with root package name */
    private final m f32670h;

    static {
        Covode.recordClassIndex(19423);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final boolean aY_() {
        return this.f32669g;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f32667e;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f32668f;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
        this.f32664b.clear();
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.c(aVar, "");
        this.f32667e = aVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.d.a$a  reason: collision with other inner class name */
    public static final class C0703a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k.b f32672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f32673c;

        static {
            Covode.recordClassIndex(19424);
        }

        @Override // com.bytedance.ies.d.a.n.a, com.bytedance.ies.d.a.n
        public final void a(JSONObject jSONObject) {
            l.c(jSONObject, "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("data", jSONObject);
            this.f32672b.a(jSONObject2);
            this.f32671a.f32664b.remove(this);
            o oVar = (o) this.f32671a.f32665c.a(o.class);
            if (oVar != null) {
                an anVar = new an("bdx_monitor_prefetch_data", null, null, 254);
                anVar.f32550c = (d) this.f32671a.f32666d.c(d.class);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("prefetch_state", "success");
                jSONObject3.put("prefetch_cached", jSONObject.optInt("cached"));
                jSONObject3.put("prefetch_api", this.f32673c.optString("url"));
                anVar.f32554g = jSONObject3;
                oVar.a(anVar);
            }
        }

        @Override // com.bytedance.ies.d.a.n.a, com.bytedance.ies.d.a.n
        public final void a(Throwable th) {
            int i2;
            String str = "";
            l.c(th, str);
            JSONObject jSONObject = new JSONObject();
            try {
                if (th instanceof c) {
                    jSONObject.put("status", ((c) th).getStatusCode());
                } else if (th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c) {
                    jSONObject.put("status", ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getStatusCode());
                }
                if (th instanceof com.bytedance.frameworks.baselib.network.http.b.d) {
                    i2 = -106;
                } else {
                    i2 = 1001;
                }
                q.m223constructorimpl(jSONObject.put("error_code", i2));
            } catch (Throwable th2) {
                q.m223constructorimpl(r.a(th2));
            }
            k.b bVar = this.f32672b;
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            bVar.a(4, str, jSONObject);
            this.f32671a.f32664b.remove(this);
            o oVar = (o) this.f32671a.f32665c.a(o.class);
            if (oVar != null) {
                an anVar = new an("bdx_monitor_prefetch_data", null, null, 254);
                anVar.f32550c = (d) this.f32671a.f32666d.c(d.class);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("prefetch_state", "fail");
                jSONObject2.put("prefetch_error", th.getMessage());
                jSONObject2.put("prefetch_api", this.f32673c.optString("url"));
                anVar.f32554g = jSONObject2;
                oVar.a(anVar);
            }
        }

        C0703a(a aVar, k.b bVar, JSONObject jSONObject) {
            this.f32671a = aVar;
            this.f32672b = bVar;
            this.f32673c = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        l.c(jSONObject, "");
        l.c(bVar, "");
        C0703a aVar = new C0703a(this, bVar, jSONObject);
        this.f32664b.add(aVar);
        new x(this.f32670h, aVar).a(jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, b bVar, b bVar2, m mVar) {
        super(bVar2);
        l.c(str, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        l.c(mVar, "");
        this.f32665c = bVar;
        this.f32666d = bVar2;
        this.f32670h = mVar;
        this.f32668f = str;
        this.f32664b = new CopyOnWriteArraySet<>();
    }
}
