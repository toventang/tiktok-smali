package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b, d, e {

    /* renamed from: a  reason: collision with root package name */
    private final h f36935a = i.a((h.f.a.a) b.f36938a);

    /* renamed from: b  reason: collision with root package name */
    private final h f36936b = i.a((h.f.a.a) new C0908a(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f36937c = i.a((h.f.a.a) c.f36940a);

    static {
        Covode.recordClassIndex(22181);
    }

    private final d d() {
        return (d) this.f36937c.getValue();
    }

    public final c b() {
        return (c) this.f36935a.getValue();
    }

    public final b c() {
        return (b) this.f36936b.getValue();
    }

    static final class b extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36938a = new b();

        static {
            Covode.recordClassIndex(22183);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    static final class c extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f36940a = new c();

        static {
            Covode.recordClassIndex(22184);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h k() {
        return c().f36945a;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i l() {
        return c().f36946b;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a$a  reason: collision with other inner class name */
    static final class C0908a extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0908a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(this.this$0.b());
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean h() {
        if (c().c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean i() {
        return c().a();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final boolean j() {
        return c().b();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f m() {
        return c().c();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f n() {
        return c().d();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final f o() {
        return c().e();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        b().a();
        d().f36952a.clear();
        c().f();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
        l.c(cVar, "");
        b().a(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
        l.c(cVar, "");
        b().b(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e
    public final void b(g gVar) {
        l.c(gVar, "");
        d().b(gVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e
    public final void a(g gVar) {
        l.c(gVar, "");
        d().a(gVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
        c().a(d().a(hVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i iVar) {
        l.c(iVar, "");
        c().a(d().a(iVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b
    public final void a(f fVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        c().a(d().a(fVar, cVar));
    }
}
