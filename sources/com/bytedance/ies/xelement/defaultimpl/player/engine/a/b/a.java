package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.w;

public final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c, e, g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36839a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.xelement.b.a f36840b;

    /* renamed from: c  reason: collision with root package name */
    private final h f36841c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f36842d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f36843e = i.a((h.f.a.a) new C0898a(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f36844f = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(22113);
    }

    private final c k() {
        return (c) this.f36843e.getValue();
    }

    public final d h() {
        return (d) this.f36841c.getValue();
    }

    public final com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b.a i() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b.a) this.f36842d.getValue();
    }

    public final b j() {
        return (b) this.f36844f.getValue();
    }

    static final class d extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b.a invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b.a(this.this$0);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.k
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c g() {
        return i().f36887a;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a$a  reason: collision with other inner class name */
    static final class C0898a extends m implements h.f.a.a<c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0898a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c();
            cVar.a(this.this$0.i());
            return cVar;
        }
    }

    static final class b extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            b bVar = new b();
            bVar.a(this.this$0.i());
            return bVar;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final o b() {
        return h().c();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long d() {
        return h().d();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long e() {
        return h().e();
    }

    static final class c extends m implements h.f.a.a<d> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d(this.this$0.f36839a, this.this$0.j(), this.this$0.f36840b);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        j().c().f36836a.clear();
        k().f36896a.clear();
        h().f();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long c() {
        d h2 = h();
        if (h2.f36899a == null) {
            return 0;
        }
        return h2.a().e();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long f() {
        d h2 = h();
        if (h2.f36899a == null) {
            return 0;
        }
        return h2.a().h();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
        l.c(dVar, "");
        j().a(dVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
        l.c(dVar, "");
        j().b(dVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (!k().b(cVar)) {
            d h2 = h();
            if (h2.f36899a != null) {
                h2.a().b();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void e(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (!k().c(cVar)) {
            h().b();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g
    public final void a(f fVar) {
        l.c(fVar, "");
        k().a(fVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g
    public final void b(f fVar) {
        l.c(fVar, "");
        k().b(fVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (!k().a(cVar)) {
            d h2 = h();
            h2.a().a(h2.f36900b);
            h2.f36900b = 0;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void f(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (!k().d(cVar)) {
            d h2 = h();
            if (h2.f36899a != null) {
                h2.a().a();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.j
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.i iVar) {
        l.c(iVar, "");
        h().a(iVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void a(n nVar) {
        n b2 = k().b(nVar);
        h().a(b2);
        j().a(b2);
    }

    public a(Context context, com.bytedance.ies.xelement.b.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        this.f36839a = context;
        this.f36840b = aVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void a(long j2, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m mVar) {
        if (!k().f()) {
            d h2 = h();
            if (h2.f36899a == null || h2.c() == o.PLAYBACK_STATE_STOPPED) {
                h2.f36900b = j2;
                if (h2.a() instanceof c) {
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h a2 = h2.a();
                    if (a2 != null) {
                        ((c) a2).f36871f = h2.f36900b;
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                return;
            }
            h2.f36903e.a(q.SEEKING);
            h2.a().a(j2, new d.e(h2, mVar));
        }
    }
}
