package com.bytedance.ies.bullet.service.g.c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.e;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.service.base.af;
import com.bytedance.ies.bullet.service.base.al;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.s;
import com.bytedance.ies.bullet.service.base.x;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.e.a.b f32775b;

    /* renamed from: c  reason: collision with root package name */
    private k.a f32776c = k.a.PRIVATE;

    /* renamed from: d  reason: collision with root package name */
    private final String f32777d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32778e;

    /* renamed from: f  reason: collision with root package name */
    private final h f32779f;

    /* renamed from: g  reason: collision with root package name */
    private final long f32780g;

    /* renamed from: h  reason: collision with root package name */
    private final b f32781h;

    static {
        Covode.recordClassIndex(19588);
    }

    private final s e() {
        return (s) this.f32779f.getValue();
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final boolean aY_() {
        return this.f32778e;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f32776c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f32777d;
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.c.a$a  reason: collision with other inner class name */
    public static final class C0711a implements x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k.b f32783b;

        static {
            Covode.recordClassIndex(19589);
        }

        @Override // com.bytedance.ies.bullet.service.base.x
        public final void a() {
            this.f32783b.a(a.a(true, 0, "succeed"));
        }

        C0711a(a aVar, k.b bVar) {
            this.f32782a = aVar;
            this.f32783b = bVar;
        }

        @Override // com.bytedance.ies.bullet.service.base.x
        public final void a(al alVar, String str) {
            l.c(alVar, "");
            this.f32783b.a(a.a(false, -2, "load failed"));
        }
    }

    static final class b extends m implements h.f.a.a<s> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(19590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ s invoke() {
            String str;
            com.bytedance.ies.bullet.c.a.a aVar = (com.bytedance.ies.bullet.c.a.a) this.this$0.f32775b.c(com.bytedance.ies.bullet.c.a.a.class);
            if (aVar == null || (str = aVar.f31975a) == null) {
                str = "default_bid";
            }
            return e.a.a().a(str, s.class);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.c(aVar, "");
        this.f32776c = aVar;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        l.c(jSONObject, "");
        l.c(bVar, "");
        String optString = jSONObject.optString("schema");
        Context context = (Context) this.f32775b.c(Context.class);
        if (context == null) {
            bVar.a(a(false, -1, "context is null"));
            return;
        }
        af afVar = (af) e.a.a().a(af.class);
        Uri parse = Uri.parse(optString);
        if (afVar != null) {
            l.a((Object) parse, "");
            Uri a2 = af.a.a(afVar, parse, null, null, 14);
            if (a2 != null) {
                parse = a2;
            }
        }
        s e2 = e();
        if (e2 != null) {
            l.a((Object) parse, "");
            e2.a(parse, context, this.f32780g, new C0711a(this, bVar));
        }
        if (e() == null) {
            bVar.a(a(false, -3, "poolService is null"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, b bVar, com.bytedance.ies.bullet.c.e.a.b bVar2) {
        super(bVar2);
        l.c(str, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        this.f32781h = bVar;
        this.f32775b = bVar2;
        this.f32777d = str;
        this.f32779f = i.a((h.f.a.a) new b(this));
        this.f32780g = 10000;
    }

    public static JSONObject a(boolean z, int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("__status_message__", str);
        jSONObject2.put("container", "BulletX");
        jSONObject2.put("result", z);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }
}
