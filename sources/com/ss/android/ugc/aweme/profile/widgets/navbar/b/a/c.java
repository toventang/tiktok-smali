package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.d;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends h<d> {
    static {
        Covode.recordClassIndex(76504);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c u() {
        return d.Back;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        View t;
        super.f();
        if (!s()) {
            if (Build.VERSION.SDK_INT >= 26 && (t = t()) != null) {
                t.setDefaultFocusHighlightEnabled(false);
            }
            x();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(76506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (MSAdaptionService.c().c(this.this$0.ar_())) {
                SmartRouter.buildRoute(this.this$0.ar_(), "//duo").withParam("duo_type", "duo_back").open();
            } else {
                ((x) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(x.class))).p();
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117979a = new a();

        static {
            Covode.recordClassIndex(76505);
        }

        a() {
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
        bVar2.a(com.bytedance.tux.c.c.a(a.f117979a)).a((h.f.a.a<z>) new b(this));
    }
}
