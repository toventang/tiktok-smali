package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import android.view.View;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.a.c;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.c;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;

public abstract class c<AREA extends com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, ACTION extends com.bytedance.tux.navigation.a.c> extends com.bytedance.assem.arch.core.a {

    /* renamed from: g  reason: collision with root package name */
    public g f117963g;

    /* renamed from: h  reason: collision with root package name */
    private final i f117964h = new i(bQ_(), new a(this, null));

    /* renamed from: i  reason: collision with root package name */
    private final h f117965i = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(76462);
    }

    public abstract void a(ACTION action);

    public final View t() {
        return (View) this.f117965i.getValue();
    }

    public abstract AREA u();

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.a.c.a.invoke():java.lang.Object");
        }
    }

    static final class b extends m implements h.f.a.a<View> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(76464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            g gVar = this.this$0.f117963g;
            if (gVar == null) {
                l.a("service");
            }
            return gVar.d(this.this$0.u());
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        this.f117963g = (g) d.b(this, ab.a(g.class));
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        String str;
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.f117964h.getValue();
        if (aVar != null) {
            str = aVar.f117876a;
        } else {
            str = null;
        }
        return l.a((Object) str, (Object) "from_main");
    }

    public final void a(boolean z) {
        g gVar = this.f117963g;
        if (gVar == null) {
            l.a("service");
        }
        gVar.b(u(), z);
    }
}
