package com.ss.android.ugc.aweme.dsp.library;

import android.view.View;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.dsp.library.cell.LibraryMusicCell;
import com.ss.android.ugc.aweme.dsp.library.cell.LibraryTitleCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends com.bytedance.ext_power_list.m<MusicLibraryViewModel> implements IAccountService.b {

    /* renamed from: j  reason: collision with root package name */
    public static final c f83312j = new c((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f83313k = h.i.a((h.f.a.a) new k(this));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f83314l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f83315m;
    private final h.h n;

    public static final class b extends h.f.b.m implements h.f.a.b<j, j> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(51968);
        }

        public b() {
            super(1);
        }

        public final j invoke(j jVar) {
            h.f.b.l.c(jVar, "");
            return jVar;
        }
    }

    static {
        Covode.recordClassIndex(51966);
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.f83313k.getValue();
    }

    /* renamed from: x */
    public final MusicLibraryViewModel u() {
        return (MusicLibraryViewModel) this.f83314l.getValue();
    }

    public final DmtStatusView y() {
        return (DmtStatusView) this.f83315m.getValue();
    }

    public final DmtStatusView z() {
        return (DmtStatusView) this.n.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(51969);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.y().f();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void p() {
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.b(this);
        super.p();
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.library.a$a  reason: collision with other inner class name */
    public static final class C1962a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(51967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1962a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            View findViewById = this.this$0.s().findViewById(R.id.c_9);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerList");
            return findViewById;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            View findViewById = this.this$0.s().findViewById(R.id.c__);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
            return findViewById;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            View findViewById = this.this$0.s().findViewById(R.id.c_h);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
            return findViewById;
        }
    }

    private final void A() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            v().setVisibility(4);
            y().setVisibility(4);
            return;
        }
        v().setVisibility(0);
        y().setVisibility(0);
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 3;
        com.bytedance.ies.powerlist.page.config.c a2 = cVar.a(LoadingFooterCell.class);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            a2.f34357b = false;
        }
        return a2;
    }

    public a() {
        h.k.c a2 = ab.a(MusicLibraryViewModel.class);
        this.f83314l = new com.bytedance.assem.arch.viewModel.b(a2, new C1962a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), b.INSTANCE, u.b(this), u.c(this));
        this.f83315m = h.i.a((h.f.a.a) new m(this));
        this.n = h.i.a((h.f.a.a) new l(this));
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83328a;

        static {
            Covode.recordClassIndex(51970);
        }

        d(a aVar) {
            this.f83328a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83328a.u().g();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.this$0.y().h();
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            a.a(this.this$0.u(), new h.f.a.b<j, z>(this) {
                /* class com.ss.android.ugc.aweme.dsp.library.a.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(51975);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(j jVar) {
                    j jVar2 = jVar;
                    h.f.b.l.d(jVar2, "");
                    List b2 = i.a.b(jVar2);
                    if (b2 == null || b2.isEmpty()) {
                        this.this$0.this$0.y().g();
                    } else {
                        this.this$0.this$0.y().d();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        h.f.b.l.d(view, "");
        PowerList v = v();
        v.a(new h());
        v.a(LibraryMusicCell.class, LibraryTitleCell.class);
        v.setItemAnimator(null);
        super.b(view);
        DmtStatusView y = y();
        MtEmptyView a2 = MtEmptyView.a(ar_());
        a2.setStatus(new d.a(ar_()).b(R.string.bsy).c(R.string.bsx).a(2131233256).f33648a);
        y.setBuilder(DmtStatusView.a.a(ar_()).b(new d.a(ar_()).a(2131233141).b(R.string.h2z).c(R.string.h2y).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, R.string.h35, new d(this)).f33648a).b(a2));
        z().setBuilder(DmtStatusView.a.a(ar_()));
        AssemViewModel.a(u(), b.f83330a, null, new f(this), new g(this), new h(this), 2);
        f.a.a(this, u(), c.f83331a, (com.bytedance.assem.arch.viewModel.k) null, new i(this), 6);
        f.a.a(this, u(), d.f83340a, (com.bytedance.assem.arch.viewModel.k) null, new j(this), 6);
        f.a.a(this, u(), e.f83341a, (com.bytedance.assem.arch.viewModel.k) null, new e(this), 6);
        A();
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.a(this);
    }

    static final class j extends h.f.b.m implements h.f.a.m<p, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Integer num) {
            num.intValue();
            h.f.b.l.d(pVar, "");
            this.this$0.v().b(0);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<p, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Boolean bool) {
            h.f.b.l.d(pVar, "");
            if (bool != null) {
                if (h.f.b.l.a((Object) bool, (Object) true)) {
                    this.this$0.z().f();
                } else if (h.f.b.l.a((Object) bool, (Object) false)) {
                    this.this$0.z().d();
                }
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<p, List<? extends com.ss.android.ugc.aweme.dsp.library.a.a>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, List<? extends com.ss.android.ugc.aweme.dsp.library.a.a> list) {
            int i2;
            List<? extends com.ss.android.ugc.aweme.dsp.library.a.a> list2 = list;
            h.f.b.l.d(pVar, "");
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = -1;
            }
            String.valueOf(String.valueOf(i2));
            if (list2 != null) {
                if (!(!list2.isEmpty()) || this.this$0.y().e()) {
                    if (this.this$0.y().e()) {
                        if (list2.isEmpty()) {
                            this.this$0.y().g();
                        }
                    }
                }
                this.this$0.y().a(true);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        A();
        if (i2 == 1) {
            u().g();
        }
    }
}
