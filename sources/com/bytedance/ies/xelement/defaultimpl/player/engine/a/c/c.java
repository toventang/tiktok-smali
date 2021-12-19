package com.bytedance.ies.xelement.defaultimpl.player.engine.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import h.z;

public final class c implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f36928a = h.i.a((h.f.a.a) a.f36930a);

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c f36929b;

    static {
        Covode.recordClassIndex(22165);
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c> c() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a) this.f36928a.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar) {
        c().a(new C0907c(fVar));
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36930a = new a();

        static {
            Covode.recordClassIndex(22166);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c> invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void b() {
        c().a(l.f36932a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void d() {
        c().a(m.f36933a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void e() {
        c().a(b.f36931a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        this.f36929b.b((com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c) this);
        this.f36929b.b((com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d) this);
        c().a(o.f36934a);
        c().f36836a.clear();
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36931a = new b();

        static {
            Covode.recordClassIndex(22167);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.e();
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$c  reason: collision with other inner class name */
    static final class C0907c extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f $dataSource;

        static {
            Covode.recordClassIndex(22168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0907c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar) {
            super(1);
            this.$dataSource = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$dataSource);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b $errorCode;

        static {
            Covode.recordClassIndex(22169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
            super(1);
            this.$errorCode = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$errorCode);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l $loadingState;

        static {
            Covode.recordClassIndex(22170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
            super(1);
            this.$loadingState = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$loadingState);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i $playMode;

        static {
            Covode.recordClassIndex(22171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i iVar) {
            super(1);
            this.$playMode = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a_(this.$playMode);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n $playable;

        static {
            Covode.recordClassIndex(22172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n nVar) {
            super(1);
            this.$playable = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$playable);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o $currentState;

        static {
            Covode.recordClassIndex(22173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o oVar) {
            super(1);
            this.$currentState = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$currentState);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ long $time;

        static {
            Covode.recordClassIndex(22174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(long j2) {
            super(1);
            this.$time = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$time);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ long $time;

        static {
            Covode.recordClassIndex(22175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(long j2) {
            super(1);
            this.$time = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.b(this.$time);
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h $playlist;

        static {
            Covode.recordClassIndex(22176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
            super(1);
            this.$playlist = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a_(this.$playlist);
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f36932a = new l();

        static {
            Covode.recordClassIndex(22177);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.b();
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f36933a = new m();

        static {
            Covode.recordClassIndex(22178);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.d();
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {
        final /* synthetic */ q $seekState;

        static {
            Covode.recordClassIndex(22179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(q qVar) {
            super(1);
            this.$seekState = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a(this.$seekState);
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f36934a = new o();

        static {
            Covode.recordClassIndex(22180);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar2 = cVar;
            h.f.b.l.c(cVar2, "");
            cVar2.a();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(long j2) {
        c().a(new i(j2));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
    public final void a_(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
        c().a(new k(hVar));
    }

    public c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar) {
        h.f.b.l.c(cVar, "");
        this.f36929b = cVar;
        cVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c) this);
        cVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d) this);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
    public final void a_(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i iVar) {
        h.f.b.l.c(iVar, "");
        c().a(new f(iVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void b(long j2) {
        c().a(new j(j2));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
        h.f.b.l.c(bVar, "");
        c().a(new d(bVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.d
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
        h.f.b.l.c(cVar, "");
        com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c> c2 = c();
        cVar.a();
        c2.b(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
        h.f.b.l.c(lVar, "");
        c().a(new e(lVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n nVar) {
        c().a(new g(nVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o oVar) {
        h.f.b.l.c(oVar, "");
        c().a(new h(oVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(q qVar) {
        h.f.b.l.c(qVar, "");
        c().a(new n(qVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c cVar) {
        h.f.b.l.c(cVar, "");
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar2 = this.f36929b;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = new com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b(cVar2, cVar2, cVar2, cVar2, cVar2, cVar2, cVar2);
        com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c> c2 = c();
        cVar.a(bVar);
        c2.a(cVar);
    }
}
