package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.c;
import h.a.z;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public abstract class h<AREA extends c> extends c<AREA, com.bytedance.tux.navigation.a.b> {

    /* renamed from: h  reason: collision with root package name */
    private g f117971h;

    /* renamed from: i  reason: collision with root package name */
    private final i f117972i = new i(bQ_(), new a(this, null));

    static {
        Covode.recordClassIndex(76480);
    }

    /* access modifiers changed from: protected */
    public List<AREA> v() {
        return z.INSTANCE;
    }

    /* access modifiers changed from: protected */
    public List<AREA> w() {
        return z.INSTANCE;
    }

    public static final class a extends m implements h.f.a.a<a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.navbar.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.navbar.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.navbar.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.navbar.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.a.h.a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public final void x() {
        g gVar = this.f117971h;
        if (gVar == null) {
            l.a("service");
        }
        gVar.a(u());
    }

    /* access modifiers changed from: protected */
    public final void y() {
        g gVar = this.f117971h;
        if (gVar == null) {
            l.a("service");
        }
        gVar.b(u());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        this.f117971h = (g) d.b(this, ab.a(g.class));
        a aVar = (a) this.f117972i.getValue();
        if (aVar != null) {
            aVar.f117957a.put(u(), v());
            aVar.f117958b.put(u(), w());
        }
        a(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(76482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.navigation.a.b bVar) {
            com.bytedance.tux.navigation.a.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.a(bVar2);
            return h.z.f158842a;
        }
    }

    public final void a(h.f.a.b<? super com.bytedance.tux.navigation.a.b, h.z> bVar) {
        l.d(bVar, "");
        g gVar = this.f117971h;
        if (gVar == null) {
            l.a("service");
        }
        gVar.a(u(), bVar);
    }
}
