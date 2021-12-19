package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f36885a = h.i.a((h.f.a.a) a.f36886a);

    static {
        Covode.recordClassIndex(22135);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d> c() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a) this.f36885a.getValue();
    }

    static final class a extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36886a = new a();

        static {
            Covode.recordClassIndex(22136);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d> invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        c().f36836a.clear();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void b() {
        c().a(i.f36893a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void d() {
        c().a(j.f36894a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void e() {
        c().a(C0903b.f36892a);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.b$b  reason: collision with other inner class name */
    static final class C0903b extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0903b f36892a = new C0903b();

        static {
            Covode.recordClassIndex(22137);
        }

        C0903b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.e();
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b $errorCode;

        static {
            Covode.recordClassIndex(22138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
            super(1);
            this.$errorCode = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.a(this.$errorCode);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l $loadingState;

        static {
            Covode.recordClassIndex(22139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
            super(1);
            this.$loadingState = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.a(this.$loadingState);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ n $playable;

        static {
            Covode.recordClassIndex(22140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(1);
            this.$playable = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.a(this.$playable);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ o $currentState;

        static {
            Covode.recordClassIndex(22141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar) {
            super(1);
            this.$currentState = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.a(this.$currentState);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ long $time;

        static {
            Covode.recordClassIndex(22142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(long j2) {
            super(1);
            this.$time = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.a(this.$time);
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ long $time;

        static {
            Covode.recordClassIndex(22143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(long j2) {
            super(1);
            this.$time = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.b(this.$time);
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f36893a = new i();

        static {
            Covode.recordClassIndex(22144);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.b();
            return z.f158842a;
        }
    }

    static final class j extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f36894a = new j();

        static {
            Covode.recordClassIndex(22145);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.d();
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, z> {
        final /* synthetic */ q $seekState;

        static {
            Covode.recordClassIndex(22146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(q qVar) {
            super(1);
            this.$seekState = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar2 = dVar;
            l.c(dVar2, "");
            dVar2.a(this.$seekState);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(long j2) {
        c().a(new g(j2));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void b(long j2) {
        c().a(new h(j2));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
        l.c(bVar, "");
        c().a(new c(bVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
        l.c(dVar, "");
        c().b(dVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.e
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar) {
        l.c(dVar, "");
        c().a(dVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
        l.c(lVar, "");
        c().a(new d(lVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(n nVar) {
        c().a(new e(nVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(o oVar) {
        l.c(oVar, "");
        c().a(new f(oVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
    public final void a(q qVar) {
        l.c(qVar, "");
        c().a(new k(qVar));
    }
}
