package com.ss.android.ugc.aweme.music.i;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.g.a.a.d;
import h.f.a.m;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public long f111516a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Long f111517b;

    /* renamed from: c  reason: collision with root package name */
    public a f111518c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f111519d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f111520e;

    /* renamed from: f  reason: collision with root package name */
    final c f111521f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f111522g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f111523h = -1;

    /* renamed from: i  reason: collision with root package name */
    private final m<com.ss.android.ugc.g.a.b, HashMap<String, HashMap<String, Object>>, z> f111524i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.b<HashMap<String, Object>, z> f111525j = new c(this);

    static {
        Covode.recordClassIndex(71633);
    }

    @Override // com.ss.android.ugc.aweme.music.i.g
    public final void c() {
        this.f111522g = false;
    }

    @Override // com.ss.android.ugc.aweme.music.i.g
    public final boolean b() {
        return this.f111522g;
    }

    @Override // com.ss.android.ugc.aweme.music.i.g
    public final void d() {
        e();
    }

    @Override // com.ss.android.ugc.aweme.music.i.g
    public final void e() {
        try {
            this.f111519d = true;
            this.f111520e = true;
            com.ss.android.ugc.g.a.c.a(this.f111523h);
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.i.a
    public final void a() {
        String str;
        Class<?> cls;
        try {
            com.ss.android.ugc.g.a.a.b bVar = new com.ss.android.ugc.g.a.a.b(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j2 == null || (cls = j2.getClass()) == null) {
                str = null;
            } else {
                str = cls.getSimpleName();
            }
            this.f111523h = com.ss.android.ugc.g.a.c.a(bVar, new d(str, ""), this.f111524i, this.f111525j);
            this.f111516a = System.currentTimeMillis();
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<HashMap<String, Object>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(71636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(HashMap<String, Object> hashMap) {
            l.d(hashMap, "");
            if (!this.this$0.f111520e) {
                this.this$0.f111520e = true;
            }
            return z.f158842a;
        }
    }

    public f(c cVar) {
        l.d(cVar, "");
        this.f111521f = cVar;
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.g.a.b f111526a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, HashMap<String, Object>> f111527b;

        static {
            Covode.recordClassIndex(71634);
        }

        public a(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            l.d(bVar, "");
            l.d(hashMap, "");
            this.f111526a = bVar;
            this.f111527b = hashMap;
        }
    }

    static final class b extends h.f.b.m implements m<com.ss.android.ugc.g.a.b, HashMap<String, HashMap<String, Object>>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(71635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            com.ss.android.ugc.g.a.b bVar2 = bVar;
            HashMap<String, HashMap<String, Object>> hashMap2 = hashMap;
            l.d(bVar2, "");
            l.d(hashMap2, "");
            if (!this.this$0.f111519d) {
                this.this$0.f111519d = true;
                this.this$0.f111517b = Long.valueOf(System.currentTimeMillis());
                this.this$0.f111518c = new a(bVar2, hashMap2);
                f fVar = this.this$0;
                l.d(bVar2, "");
                l.d(hashMap2, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_time", fVar.f111516a);
                jSONObject.put("duration", System.currentTimeMillis() - fVar.f111516a);
                jSONObject.put("detect_result", bVar2.name());
                fVar.f111521f.a(fVar, bVar2, hashMap2, jSONObject);
            }
            return z.f158842a;
        }
    }
}
