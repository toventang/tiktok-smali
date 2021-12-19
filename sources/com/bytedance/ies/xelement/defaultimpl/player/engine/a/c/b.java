package com.bytedance.ies.xelement.defaultimpl.player.engine.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.b, g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36926b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b<f, n> f36927c = new com.bytedance.ies.xelement.defaultimpl.player.engine.api.a();

    static {
        Covode.recordClassIndex(22162);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22163);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a() {
        e eVar;
        super.a();
        this.f36927c = null;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36963a;
        if (bVar != null && (eVar = bVar.f36966c) != null) {
            eVar.b(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void e() {
        i iVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar3;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar4;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar5 = this.f36963a;
        f fVar = null;
        if (bVar5 == null || (bVar4 = bVar5.f36969f) == null) {
            iVar = null;
        } else {
            iVar = bVar4.l();
        }
        if (iVar == i.SINGLE_LOOP) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar6 = this.f36963a;
            if (bVar6 != null && (bVar2 = bVar6.f36969f) != null && bVar2.h()) {
                com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar7 = this.f36963a;
                if (!(bVar7 == null || (bVar3 = bVar7.f36969f) == null)) {
                    fVar = bVar3.m();
                }
                b(fVar, new c("FROM_AUTO_SINGLE_LOOP"));
                return;
            }
            return;
        }
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar8 = this.f36963a;
        if (bVar8 != null && (bVar = bVar8.f36969f) != null && bVar.i()) {
            b(new c("FROM_AUTO_PLAY_NEXT"));
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b<f, n> bVar) {
        l.c(bVar, "");
        this.f36927c = bVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final i a(i iVar) {
        l.c(iVar, "");
        l.c(iVar, "");
        return iVar;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b$b  reason: collision with other inner class name */
    static final class C0906b extends m implements h.f.a.b<n, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(22164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0906b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
            n nVar2 = nVar;
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.this$0.f36963a;
            if (!(bVar == null || (cVar = bVar.f36968e) == null)) {
                cVar.a(nVar2);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final h a(h hVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36963a;
        if (!(bVar == null || (cVar = bVar.f36968e) == null)) {
            cVar.f(new c("STOP_FROM_PLAYLIST_CHANGED"));
        }
        return hVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void b(c cVar) {
        f fVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 == null || (bVar = bVar2.f36969f) == null) {
            fVar = null;
        } else {
            fVar = bVar.n();
        }
        b(fVar, cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar) {
        e eVar;
        l.c(bVar, "");
        super.a(bVar);
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 != null && (eVar = bVar2.f36966c) != null) {
            eVar.a(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(f fVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b<f, n> bVar = this.f36927c;
        if (bVar != null) {
            bVar.a(fVar, new C0906b(this));
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b
    public final void a(c cVar) {
        f fVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 == null || (bVar = bVar2.f36969f) == null) {
            fVar = null;
        } else {
            fVar = bVar.o();
        }
        b(fVar, cVar);
    }

    private final void b(f fVar, c cVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (!(bVar2 == null || (bVar = bVar2.f36969f) == null)) {
            bVar.a(fVar, cVar);
        }
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar3 = this.f36963a;
        if (bVar3 != null && (cVar2 = bVar3.f36968e) != null) {
            cVar2.c(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final f a(f fVar, c cVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36963a;
        if (!(bVar == null || (cVar2 = bVar.f36968e) == null)) {
            cVar2.f(new c("STOP_FROM_DATA_SOURCE_CHANGED"));
        }
        return fVar;
    }
}
