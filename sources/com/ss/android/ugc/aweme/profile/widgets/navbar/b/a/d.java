package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.metrics.ab;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.c;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class d extends h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> {
    static {
        Covode.recordClassIndex(76507);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ c u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.d.FindFriends;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h
    public final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> v() {
        return z.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h
    public final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> w() {
        return n.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.d.SuggestBA);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        if (s() && !in.d() && !com.ss.android.ugc.aweme.friends.service.a.f97047a.p()) {
            x();
        }
    }

    static final class b extends m implements h.f.a.a<h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            SmartRouter.buildRoute(this.this$0.ar_(), "//friends/find").withParam("previous_page", "personal_homepage").open();
            ab.a("click_add_friends").b("enter_from", "personal_homepage").f();
            return h.z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117980a = new a();

        static {
            Covode.recordClassIndex(76508);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_person_plus;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(com.bytedance.tux.c.c.a(a.f117980a)).a((h.f.a.a<h.z>) new b(this));
    }
}
