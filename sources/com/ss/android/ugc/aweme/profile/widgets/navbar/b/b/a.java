package com.ss.android.ugc.aweme.profile.widgets.navbar.b.b;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.ui.v2.ab;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.c;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends h<d> {
    static {
        Covode.recordClassIndex(76546);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ c u() {
        return d.Back;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        View t;
        super.f();
        if (Build.VERSION.SDK_INT >= 26 && (t = t()) != null) {
            t.setDefaultFocusHighlightEnabled(false);
        }
        x();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (MSAdaptionService.c().c(this.this$0.ar_())) {
                SmartRouter.buildRoute(this.this$0.ar_(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                ((ab) com.bytedance.assem.arch.service.d.a(this.this$0, h.f.b.ab.a(ab.class))).c();
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.a$a  reason: collision with other inner class name */
    static final class C3011a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3011a f118007a = new C3011a();

        static {
            Covode.recordClassIndex(76547);
        }

        C3011a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_arrow_left_ltr;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(com.bytedance.tux.c.c.a(C3011a.f118007a)).a((h.f.a.a<z>) new b(this));
    }
}
