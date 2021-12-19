package com.bytedance.ies.xelement.defaultimpl.player.engine.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f36829a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f36830b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.ies.xelement.b.a f36831c;

    /* renamed from: d  reason: collision with root package name */
    private final h f36832d = i.a((h.f.a.a) c.f36838a);

    /* renamed from: e  reason: collision with root package name */
    private final h f36833e = i.a((h.f.a.a) new C0896a(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f36834f = i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b f36835g;

    static {
        Covode.recordClassIndex(22105);
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a p() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a) this.f36832d.getValue();
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a q() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a) this.f36833e.getValue();
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c r() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c) this.f36834f.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
        if (s()) {
            p().a(hVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i iVar) {
        l.c(iVar, "");
        if (s()) {
            p().a(iVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(f fVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            p().a(fVar, cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b<f, n> bVar) {
        l.c(bVar, "");
        this.f36835g.a(bVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            this.f36835g.a(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e
    public final void a(g gVar) {
        l.c(gVar, "");
        if (s()) {
            p().a(gVar);
        }
    }

    static final class b extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c(this.this$0);
        }
    }

    static final class c extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f36838a = new c();

        static {
            Covode.recordClassIndex(22108);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a();
        }
    }

    private final boolean s() {
        if (!this.f36829a) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a$a  reason: collision with other inner class name */
    static final class C0896a extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0896a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a(this.this$0.f36830b, this.this$0.f36831c);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        if (!this.f36829a) {
            r().a();
            p().a();
            q().a();
            this.f36829a = true;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final o b() {
        if (s()) {
            return q().b();
        }
        return o.PLAYBACK_STATE_STOPPED;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long c() {
        if (s()) {
            return q().c();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long d() {
        if (s()) {
            return q().h().d();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long e() {
        if (s()) {
            return q().h().e();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long f() {
        if (s()) {
            return q().f();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.k
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c g() {
        if (s()) {
            return q().i().f36887a;
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean h() {
        if (s()) {
            return p().h();
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean i() {
        if (s()) {
            return p().c().a();
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean j() {
        if (s()) {
            return p().c().b();
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h k() {
        if (s()) {
            return p().c().f36945a;
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i l() {
        if (s()) {
            return p().c().f36946b;
        }
        return com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i.SEQUENCE;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f m() {
        if (s()) {
            return p().m();
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f n() {
        if (s()) {
            return p().c().d();
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f o() {
        if (s()) {
            return p().c().e();
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            this.f36835g.b(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            q().c(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            q().d(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void e(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            q().e(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void f(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (s()) {
            q().f(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e
    public final void a(d dVar) {
        l.c(dVar, "");
        if (s()) {
            q().a(dVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e
    public final void b(d dVar) {
        l.c(dVar, "");
        if (s()) {
            q().b(dVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f fVar) {
        l.c(fVar, "");
        if (s()) {
            q().a(fVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.g
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f fVar) {
        l.c(fVar, "");
        if (s()) {
            q().b(fVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.j
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.i iVar) {
        l.c(iVar, "");
        if (s()) {
            q().a(iVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.d
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
        l.c(cVar, "");
        if (s()) {
            r().b(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void a(n nVar) {
        if (s()) {
            q().a(nVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
        l.c(cVar, "");
        if (s()) {
            p().b(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
        l.c(cVar, "");
        if (s()) {
            r().a(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e
    public final void b(g gVar) {
        l.c(gVar, "");
        if (s()) {
            p().b(gVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
        l.c(cVar, "");
        if (s()) {
            p().a(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void a(long j2, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m mVar) {
        if (s()) {
            q().a(j2, mVar);
        }
    }

    public a(Context context, com.bytedance.ies.xelement.b.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        this.f36830b = context;
        this.f36831c = aVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b bVar = new com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b();
        this.f36835g = bVar;
        a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) bVar);
    }
}
