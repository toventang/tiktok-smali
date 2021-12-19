package com.ss.android.ugc.aweme.kids.a.f;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.g.a.a.d;
import h.f.a.m;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public long f105324a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Long f105325b;

    /* renamed from: c  reason: collision with root package name */
    public a f105326c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f105327d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f105328e;

    /* renamed from: f  reason: collision with root package name */
    final c f105329f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f105330g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f105331h = -1;

    /* renamed from: i  reason: collision with root package name */
    private final m<com.ss.android.ugc.g.a.b, HashMap<String, HashMap<String, Object>>, z> f105332i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.b<HashMap<String, Object>, z> f105333j = new c(this);

    static {
        Covode.recordClassIndex(67512);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.f.f
    public final void c() {
        this.f105330g = false;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.f.f
    public final boolean b() {
        return this.f105330g;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.f.f
    public final void d() {
        e();
    }

    @Override // com.ss.android.ugc.aweme.kids.a.f.f
    public final void e() {
        try {
            this.f105327d = true;
            this.f105328e = true;
            com.ss.android.ugc.g.a.c.a(this.f105331h);
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.f.a
    public final void a() {
        String str;
        Class<?> cls;
        try {
            com.ss.android.ugc.g.a.a.b bVar = new com.ss.android.ugc.g.a.a.b(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
            Activity j2 = f.j();
            if (j2 == null || (cls = j2.getClass()) == null) {
                str = null;
            } else {
                str = cls.getSimpleName();
            }
            this.f105331h = com.ss.android.ugc.g.a.c.a(bVar, new d(str, ""), this.f105332i, this.f105333j);
            this.f105324a = System.currentTimeMillis();
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<HashMap<String, Object>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(67515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(HashMap<String, Object> hashMap) {
            l.d(hashMap, "");
            if (!this.this$0.f105328e) {
                this.this$0.f105328e = true;
            }
            return z.f158842a;
        }
    }

    public e(c cVar) {
        l.d(cVar, "");
        this.f105329f = cVar;
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.g.a.b f105334a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, HashMap<String, Object>> f105335b;

        static {
            Covode.recordClassIndex(67513);
        }

        public a(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            l.d(bVar, "");
            l.d(hashMap, "");
            this.f105334a = bVar;
            this.f105335b = hashMap;
        }
    }

    static final class b extends h.f.b.m implements m<com.ss.android.ugc.g.a.b, HashMap<String, HashMap<String, Object>>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(67514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            com.ss.android.ugc.g.a.b bVar2 = bVar;
            HashMap<String, HashMap<String, Object>> hashMap2 = hashMap;
            l.d(bVar2, "");
            l.d(hashMap2, "");
            if (!this.this$0.f105327d) {
                this.this$0.f105327d = true;
                this.this$0.f105325b = Long.valueOf(System.currentTimeMillis());
                this.this$0.f105326c = new a(bVar2, hashMap2);
                e eVar = this.this$0;
                l.d(bVar2, "");
                l.d(hashMap2, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_time", eVar.f105324a);
                jSONObject.put("duration", System.currentTimeMillis() - eVar.f105324a);
                jSONObject.put("detect_result", bVar2.name());
                eVar.f105329f.a(eVar, bVar2, hashMap2, jSONObject);
            }
            return z.f158842a;
        }
    }
}
