package com.ss.android.ugc.aweme.recommend.users.profile.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.m;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell;
import com.ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.z;
import java.util.List;

public final class b extends m<UserProfilePublishListRecommendUserVM> {

    /* renamed from: j  reason: collision with root package name */
    private final h.h f120156j = h.i.a((h.f.a.a) new d(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f120157k = h.i.a((h.f.a.a) new i(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f120158l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f120159m;

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$b  reason: collision with other inner class name */
    public static final class C3100b extends h.f.b.m implements h.f.a.b<f, f> {
        public static final C3100b INSTANCE = new C3100b();

        static {
            Covode.recordClassIndex(78140);
        }

        public C3100b() {
            super(1);
        }

        public final f invoke(f fVar) {
            l.c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(78138);
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.f120156j.getValue();
    }

    public final TuxStatusView x() {
        return (TuxStatusView) this.f120157k.getValue();
    }

    /* renamed from: y */
    public final UserProfilePublishListRecommendUserVM u() {
        return (UserProfilePublishListRecommendUserVM) this.f120158l.getValue();
    }

    static final class d extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.d7z);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.s().findViewById(R.id.e_o);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<l> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(78141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.recommend.users.profile.ui.l] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.recommend.users.profile.ui.l invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.recommend.users.profile.ui.l> r1 = com.ss.android.ugc.aweme.recommend.users.profile.ui.l.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.users.profile.ui.b.c.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 5;
        cVar.f34357b = true;
        return cVar.a(LoadingFooterCell.class);
    }

    public b() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        j jVar = new j(this);
        h.k.c a2 = ab.a(UserProfilePublishListRecommendUserVM.class);
        a aVar = new a(a2);
        C3100b bVar2 = C3100b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), jVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), jVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), jVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f120158l = bVar;
        this.f120159m = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            final com.bytedance.ext_power_list.l lVar2 = lVar;
            l.d(lVar2, "");
            b.a(this.this$0.u(), new h.f.a.b<f, z>(this) {
                /* class com.ss.android.ugc.aweme.recommend.users.profile.ui.b.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(78146);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(f fVar) {
                    f fVar2 = fVar;
                    l.d(fVar2, "");
                    List b2 = i.a.b(fVar2);
                    if ((b2 == null || b2.isEmpty()) && lVar2.f28712b) {
                        this.this$0.this$0.u().a((Object) null);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f120160a;

        static {
            Covode.recordClassIndex(78147);
        }

        h(View view) {
            this.f120160a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a2 = o.a(this.f120160a.getContext());
            if (a2 != null) {
                ae.f115954a.a(a2, "others_homepage", "others_homepage");
            }
            r.a("click_suggested_account_information", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").f66730a);
        }
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        User user;
        l.d(view, "");
        super.b(view);
        v().a(RecommendUserCell.class, RecommendPermissionCell.class);
        ar_();
        v().setLayoutManager(new LinearLayoutManager());
        x().a();
        View a2 = com.a.a(LayoutInflater.from(ar_()), R.layout.bie, v(), false);
        a2.findViewById(R.id.elj).setOnClickListener(new h(view));
        v().a(0, a2);
        UserProfilePublishListRecommendUserVM y = u();
        l lVar = (l) this.f120159m.getValue();
        if (lVar != null) {
            user = lVar.f120173a;
        } else {
            user = null;
        }
        y.f120142m = user;
        f.a.a(this, u(), c.f120161a, (k) null, new e(this), 6);
        f.a.a(this, u(), d.f120162a, (k) null, new f(this), 6);
        AssemViewModel.a(u(), e.f120163a, null, null, null, new g(this), 14);
    }

    static final class e extends h.f.b.m implements h.f.a.m<p, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Integer num) {
            int intValue = num.intValue();
            l.d(pVar, "");
            this.this$0.v().d(intValue);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<p, Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(pVar, "");
            if (booleanValue) {
                this.this$0.x().setVisibility(8);
            }
            return z.f158842a;
        }
    }
}
