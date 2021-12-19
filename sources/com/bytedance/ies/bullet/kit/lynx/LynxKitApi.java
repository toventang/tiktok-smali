package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.g;
import com.bytedance.ies.bullet.c.c.h;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.c.f;
import com.bytedance.ies.bullet.kit.lynx.a.c;
import com.bytedance.ies.bullet.kit.lynx.b.d;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ag;
import com.lynx.tasm.LynxEnv;
import h.f.b.l;
import java.util.List;

public final class LynxKitApi extends ILynxKitApi<i> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32298a = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f32299f;

    /* renamed from: b  reason: collision with root package name */
    private Throwable f32300b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<i> f32301c = i.class;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.ies.bullet.c.e.a.b f32302d;

    /* renamed from: e  reason: collision with root package name */
    private d f32303e;

    static {
        Covode.recordClassIndex(18933);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18934);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final com.bytedance.ies.bullet.c.e.a.b b() {
        return this.f32302d;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.ILynxKitApi
    public final boolean h() {
        return f32299f;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.ILynxKitApi
    public final Throwable i() {
        return this.f32300b;
    }

    private final boolean j() {
        com.bytedance.ies.bullet.service.base.c.b bVar = (com.bytedance.ies.bullet.service.base.c.b) b_(com.bytedance.ies.bullet.service.base.c.b.class);
        if (bVar != null) {
            bVar.a(this);
        }
        com.bytedance.ies.bullet.service.base.c.b bVar2 = (com.bytedance.ies.bullet.service.base.c.b) b_(com.bytedance.ies.bullet.service.base.c.b.class);
        if (bVar2 != null) {
            return bVar2.b();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.c.c.o, com.bytedance.ies.bullet.c.c.d
    public final String d() {
        l.a((Object) LynxEnv.b(), "");
        String g2 = LynxEnv.g();
        l.a((Object) g2, "");
        return g2;
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final void c() {
        com.bytedance.ies.bullet.service.base.a b2;
        MethodCollector.i(9258);
        ag agVar = (ag) b_(ag.class);
        if (agVar == null || (b2 = agVar.b()) == null || !b2.f32515d) {
            k();
            MethodCollector.o(9258);
            return;
        }
        LynxEnv b3 = LynxEnv.b();
        l.a((Object) b3, "");
        synchronized (b3) {
            try {
                j.b.a(this, "ensure lynx init be sync", null, null, 6);
                k();
            } finally {
                MethodCollector.o(9258);
            }
        }
    }

    private final void k() {
        g gVar;
        d dVar;
        if (!f32299f) {
            j.b.a(this, "start to init lynx lib", null, null, 6);
            if (!c.a.a().f32308a) {
                com.bytedance.ies.bullet.c.e.a.b bVar = this.f32302d;
                if (bVar == null || (dVar = this.f32303e) == null || (gVar = dVar.a(bVar)) == null) {
                    gVar = new g((byte) 0);
                }
                c.a.a().a(gVar.f32346a);
            }
            try {
                f32299f = j();
            } catch (Exception e2) {
                printReject(e2, "init lynx failed");
                f32299f = false;
                this.f32300b = e2;
            }
        }
    }

    public static final class b implements h<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f32304a;

        static {
            Covode.recordClassIndex(18935);
        }

        b(Object obj) {
            this.f32304a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.g' to match base method */
        @Override // com.bytedance.ies.bullet.c.c.h
        public final /* synthetic */ d a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(bVar, "");
            return ((com.bytedance.ies.bullet.kit.lynx.b.c) this.f32304a).a(bVar);
        }
    }

    public static final class c implements com.bytedance.ies.bullet.c.c.l<e, c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f32305a;

        static {
            Covode.recordClassIndex(18936);
        }

        c(Object obj) {
            this.f32305a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.m' to match base method */
        @Override // com.bytedance.ies.bullet.c.c.l
        public final /* synthetic */ e a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(bVar, "");
            return ((d) this.f32305a).g(bVar);
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.e' to match base method */
        @Override // com.bytedance.ies.bullet.c.c.l
        public final /* synthetic */ c b(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(bVar, "");
            return ((d) this.f32305a).h(bVar);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final com.bytedance.ies.bullet.c.c.l<e, c> a(Object obj) {
        l.c(obj, "");
        if (obj instanceof d) {
            return new c(obj);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final /* synthetic */ void a(i iVar) {
        l.c(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final h<d> b(Object obj) {
        l.c(obj, "");
        if (obj instanceof com.bytedance.ies.bullet.kit.lynx.b.c) {
            return new b(obj);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final /* synthetic */ void a(g gVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.c(bVar, "");
        this.f32303e = (d) gVar;
        this.f32302d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public i a(z zVar, List<String> list, f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.c(zVar, "");
        l.c(list, "");
        l.c(fVar, "");
        l.c(bVar, "");
        c();
        return new i(this, zVar, list, fVar, bVar);
    }
}
