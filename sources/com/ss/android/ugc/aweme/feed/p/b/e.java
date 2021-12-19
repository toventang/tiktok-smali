package com.ss.android.ugc.aweme.feed.p.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.z;
import java.util.HashMap;

public final class e extends com.ss.android.ugc.aweme.feed.p.a.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f93673g = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final a f93674f;

    static {
        Covode.recordClassIndex(59605);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59606);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.p.a.a
    public final void c() {
        super.c();
    }

    @Override // com.ss.android.ugc.aweme.feed.p.a.a
    public final void d() {
        super.d();
        this.f93674f.a();
    }

    public e(a aVar) {
        l.d(aVar, "");
        this.f93674f = aVar;
    }

    static final class b extends m implements h.f.a.b<Long, z> {
        final /* synthetic */ HashMap $detailMap;
        final /* synthetic */ com.ss.android.ugc.g.a.b $networkState;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(59607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, com.ss.android.ugc.g.a.b bVar, HashMap hashMap) {
            super(1);
            this.this$0 = eVar;
            this.$networkState = bVar;
            this.$detailMap = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            l2.longValue();
            this.this$0.f93674f.a(this.this$0, this.$networkState, this.$detailMap);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.p.a.a
    public final void a(d dVar) {
        l.d(dVar, "");
        dVar.a(com.ss.android.ugc.g.a.a.e.f145594d, this.f93631a);
        dVar.a(com.ss.android.ugc.g.a.a.e.f145599i, System.currentTimeMillis() - this.f93631a);
        Long l2 = this.f93632b;
        if (l2 != null) {
            dVar.a(com.ss.android.ugc.g.a.a.e.f145598h, l2.longValue() - this.f93631a);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.p.a.a
    public final void a(com.ss.android.ugc.g.a.b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
        z zVar;
        l.d(bVar, "");
        l.d(hashMap, "");
        try {
            if (!hashMap.containsKey("extra_info")) {
                hashMap.put("extra_info", new HashMap<>());
            }
            HashMap<String, Object> hashMap2 = hashMap.get("extra_info");
            if (hashMap2 != null) {
                l.b(hashMap2, "");
                hashMap2.put("start_time", Long.valueOf(this.f93631a));
                zVar = z.f158842a;
            } else {
                zVar = null;
            }
            q.m223constructorimpl(zVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        if (bVar == com.ss.android.ugc.g.a.b.NETWORK_GOOD || bVar == com.ss.android.ugc.g.a.b.UNKNOWN_STATUS) {
            new com.ss.android.ugc.g.a.c.b().a(10000, new b(this, bVar, hashMap));
        } else {
            this.f93674f.a(this, bVar, hashMap);
        }
    }
}
