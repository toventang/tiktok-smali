package com.bytedance.ies.xelement.defaultimpl.player.engine.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class c implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f36949a = i.a((h.f.a.a) a.f36950a);

    static {
        Covode.recordClassIndex(22192);
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c> b() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a) this.f36949a.getValue();
    }

    static final class a extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36950a = new a();

        static {
            Covode.recordClassIndex(22193);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c> invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        b().f36836a.clear();
    }

    static final class b extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, z> {
        final /* synthetic */ f $dataSource;

        static {
            Covode.recordClassIndex(22194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.$dataSource = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar2 = cVar;
            l.c(cVar2, "");
            cVar2.a(this.$dataSource);
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.c$c  reason: collision with other inner class name */
    static final class C0909c extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i $playMode;

        static {
            Covode.recordClassIndex(22195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0909c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i iVar) {
            super(1);
            this.$playMode = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar2 = cVar;
            l.c(cVar2, "");
            cVar2.a_(this.$playMode);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, z> {
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h $playlist;

        static {
            Covode.recordClassIndex(22196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
            super(1);
            this.$playlist = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar2 = cVar;
            l.c(cVar2, "");
            cVar2.a_(this.$playlist);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
    public final void a_(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
        b().a(new d(hVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
        l.c(cVar, "");
        b().a(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
    public final void a_(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i iVar) {
        l.c(iVar, "");
        b().a(new C0909c(iVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.d
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c cVar) {
        l.c(cVar, "");
        b().b(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
    public final void a(f fVar) {
        b().a(new b(fVar));
    }
}
