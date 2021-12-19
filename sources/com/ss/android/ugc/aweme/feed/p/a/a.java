package com.ss.android.ugc.aweme.feed.p.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.experiment.j;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.g.a.a.e;
import h.f.a.m;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.HashMap;
import java.util.Map;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public long f93631a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Long f93632b;

    /* renamed from: c  reason: collision with root package name */
    public C2272a f93633c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f93634d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f93635e;

    /* renamed from: f  reason: collision with root package name */
    private long f93636f = -1;

    /* renamed from: g  reason: collision with root package name */
    private final m<com.ss.android.ugc.g.a.b, HashMap<String, HashMap<String, Object>>, z> f93637g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private final h.f.a.b<HashMap<String, Object>, z> f93638h = new c(this);

    static {
        Covode.recordClassIndex(59577);
    }

    public abstract void a(d dVar);

    public abstract void a(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap);

    @Override // com.ss.android.ugc.aweme.feed.p.a.b
    public final void a() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.feed.p.a.b
    public final void b() {
        d();
    }

    @Override // com.ss.android.ugc.aweme.feed.p.a.e
    public final void e() {
        try {
            this.f93634d = true;
            this.f93635e = true;
            com.ss.android.ugc.g.a.c.a(this.f93636f);
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    public void c() {
        try {
            this.f93631a = System.currentTimeMillis();
            this.f93636f = com.ss.android.ugc.g.a.c.a(j.a(), new com.ss.android.ugc.g.a.a.d(s.b(), s.f93858b.name()), this.f93637g, this.f93638h);
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    public void d() {
        z zVar;
        try {
            C2272a aVar = this.f93633c;
            if (aVar != null) {
                if (aVar.f93639a == com.ss.android.ugc.g.a.b.NO_NETWORK) {
                    d a2 = new d().a(e.f145601k, aVar.f93640b);
                    l.b(a2, "");
                    a(a2);
                    com.ss.android.ugc.aweme.common.r.a(e.f145592b, a2.f66730a);
                }
                zVar = z.f158842a;
            } else {
                zVar = null;
            }
            q.m223constructorimpl(zVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        e();
    }

    static final class c extends h.f.b.m implements h.f.a.b<HashMap<String, Object>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(59580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(HashMap<String, Object> hashMap) {
            HashMap<String, Object> hashMap2 = hashMap;
            l.d(hashMap2, "");
            if (!this.this$0.f93635e) {
                this.this$0.f93635e = true;
                d dVar = new d();
                for (Map.Entry<String, Object> entry : hashMap2.entrySet()) {
                    dVar.a(entry.getKey(), entry.getValue());
                }
                com.ss.android.ugc.aweme.common.r.a(e.f145591a, dVar.f66730a);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.p.a.a$a  reason: collision with other inner class name */
    public static final class C2272a {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.g.a.b f93639a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, HashMap<String, Object>> f93640b;

        static {
            Covode.recordClassIndex(59578);
        }

        public C2272a(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            l.d(bVar, "");
            l.d(hashMap, "");
            this.f93639a = bVar;
            this.f93640b = hashMap;
        }
    }

    static final class b extends h.f.b.m implements m<com.ss.android.ugc.g.a.b, HashMap<String, HashMap<String, Object>>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(59579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            com.ss.android.ugc.g.a.b bVar2 = bVar;
            HashMap<String, HashMap<String, Object>> hashMap2 = hashMap;
            l.d(bVar2, "");
            l.d(hashMap2, "");
            if (!this.this$0.f93634d) {
                this.this$0.f93634d = true;
                this.this$0.f93632b = Long.valueOf(System.currentTimeMillis());
                this.this$0.f93633c = new C2272a(bVar2, hashMap2);
                this.this$0.a(bVar2, hashMap2);
            }
            return z.f158842a;
        }
    }
}
