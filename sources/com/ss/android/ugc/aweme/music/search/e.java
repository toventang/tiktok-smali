package com.ss.android.ugc.aweme.music.search;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.assem.list.cell.MusicCell;
import com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell;
import com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.List;
import java.util.Objects;

public final class e extends com.bytedance.ext_power_list.m<SearchMusicListViewModel> implements com.ss.android.ugc.aweme.music.assem.list.cell.b, com.ss.android.ugc.aweme.music.assem.list.p {

    /* renamed from: j  reason: collision with root package name */
    public boolean f111704j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f111705k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f111706l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f111707m = h.i.a((h.f.a.a) new v(this));
    private final com.bytedance.assem.arch.viewModel.b n;
    private final com.bytedance.assem.arch.viewModel.b o;
    private final com.bytedance.assem.arch.viewModel.b p;
    private final h.h q;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.video.e, com.ss.android.ugc.aweme.music.assem.video.e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71803);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.video.e invoke(com.ss.android.ugc.aweme.music.assem.video.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.a, com.ss.android.ugc.aweme.music.assem.a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(71805);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.a invoke(com.ss.android.ugc.aweme.music.assem.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.list.s, com.ss.android.ugc.aweme.music.assem.list.s> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(71807);
        }

        public f() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.list.s invoke(com.ss.android.ugc.aweme.music.assem.list.s sVar) {
            h.f.b.l.c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(71801);
    }

    /* renamed from: A */
    public final SearchMusicListViewModel u() {
        return (SearchMusicListViewModel) this.p.getValue();
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.q.getValue();
    }

    public final TuxStatusView x() {
        return (TuxStatusView) this.f111707m.getValue();
    }

    public final MusicPlayViewModel y() {
        return (MusicPlayViewModel) this.n.getValue();
    }

    public final LegacyCommunicateViewModel z() {
        return (LegacyCommunicateViewModel) this.o.getValue();
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.p
    public final boolean D() {
        return this.f111706l;
    }

    static final class g implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f111708a;

        static {
            Covode.recordClassIndex(71808);
        }

        g(e eVar) {
            this.f111708a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            this.f111708a.u().a(com.bytedance.ies.powerlist.page.e.Next);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.u().l();
            return z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.s().findViewById(R.id.e_o);
        }
    }

    private static boolean G() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.b
    public final com.ss.android.ugc.aweme.music.assem.list.cell.a B() {
        return new com.ss.android.ugc.aweme.music.assem.list.cell.a(v(), new g(this));
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.p
    public final View E() {
        if (this.f25594h) {
            return v();
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34357b = false;
        cVar.f34356a = 2;
        cVar.f34358c = MusicFooterCell.class;
        return cVar;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71802);
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

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.search.e$e  reason: collision with other inner class name */
    public static final class C2860e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2860e(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.p
    public final boolean C() {
        if (!this.f25594h) {
            return false;
        }
        if (v().getChildCount() > 0) {
            v().b(0);
        }
        u().l();
        return true;
    }

    public final void F() {
        x().setVisibility(0);
        x().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new u(this)));
    }

    static final class h extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            PowerList powerList = (PowerList) this.this$0.s().findViewById(R.id.drv);
            powerList.setItemAnimator(null);
            e eVar = this.this$0;
            RecyclerView.a adapter = powerList.getAdapter();
            if (adapter != null) {
                PowerStub g2 = ((PowerAdapter) adapter).g();
                if (g2 != null) {
                    com.bytedance.ies.powerlist.a.b e2 = g2.e();
                    if (!e2.a().containsKey(e.class)) {
                        e2.a().put(e.class, eVar);
                    } else {
                        throw new RuntimeException("already contains control type :" + e.class);
                    }
                }
                powerList.a(MusicCell.class);
                return powerList;
            }
            throw new h.w("null cannot be cast to non-null type");
        }
    }

    public e() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        com.bytedance.assem.arch.viewModel.b bVar3;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(MusicPlayViewModel.class);
        a aVar = new a(a2);
        b bVar4 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), u.c.f25670a, bVar4, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), u.c.f25670a, bVar4, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, bVar4, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
        i.d dVar2 = i.d.f25721a;
        h.k.c a3 = ab.a(LegacyCommunicateViewModel.class);
        c cVar = new c(a3);
        d dVar3 = d.INSTANCE;
        if (h.f.b.l.a(dVar2, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), u.c.f25670a, dVar3, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar2, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), u.c.f25670a, dVar3, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar2 == null || h.f.b.l.a(dVar2, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, dVar3, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.o = bVar2;
        this.f111705k = true;
        this.f111706l = true;
        i.d dVar4 = i.d.f25721a;
        w wVar = new w(this);
        h.k.c a4 = ab.a(SearchMusicListViewModel.class);
        C2860e eVar = new C2860e(a4);
        f fVar = f.INSTANCE;
        if (h.f.b.l.a(dVar4, i.a.f25718a)) {
            bVar3 = new com.bytedance.assem.arch.viewModel.b(a4, eVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), wVar, fVar, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar4, i.d.f25721a)) {
            bVar3 = new com.bytedance.assem.arch.viewModel.b(a4, eVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), wVar, fVar, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar4 == null || h.f.b.l.a(dVar4, i.b.f25719a)) {
            bVar3 = new com.bytedance.assem.arch.viewModel.b(a4, eVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), wVar, fVar, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.p = bVar3;
        this.q = h.i.a((h.f.a.a) new h(this));
    }

    static final class n extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f111704j = bool.booleanValue();
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            this.this$0.F();
            this.this$0.v().setVisibility(8);
            this.this$0.f111705k = false;
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || !t.booleanValue())) {
                this.this$0.C();
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            this.this$0.f111705k = false;
            this.this$0.y().a(true);
            e.a(this.this$0.u(), new h.f.a.b<com.ss.android.ugc.aweme.music.assem.list.s, z>(this) {
                /* class com.ss.android.ugc.aweme.music.search.e.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(71813);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.music.assem.list.s sVar) {
                    boolean z;
                    com.ss.android.ugc.aweme.music.assem.list.s sVar2 = sVar;
                    h.f.b.l.d(sVar2, "");
                    List b2 = i.a.b(sVar2);
                    if (b2 == null || b2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (this.this$0.this$0.u().f111638l.length() > 0) {
                            this.this$0.this$0.x().setVisibility(0);
                            this.this$0.this$0.x().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c()));
                        }
                        this.this$0.this$0.v().setVisibility(8);
                    } else {
                        this.this$0.this$0.x().setVisibility(8);
                        this.this$0.this$0.v().setVisibility(0);
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
        super.b(view);
        da.a.a("origin_music_new_fragment").a(v());
        ar_();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        v().setLayoutManager(wrapLinearLayoutManager);
        f.a.a(this, u(), g.f111714a, com.bytedance.assem.arch.viewModel.l.a(), new o(this), 4);
        f.a.a(this, u(), m.f111720a, com.bytedance.assem.arch.viewModel.l.a(), new r(this), 4);
        f.a.a(this, u(), n.f111721a, com.bytedance.assem.arch.viewModel.l.a(), s.f111711a, 4);
        f.a.a(this, u(), o.f111722a, (com.bytedance.assem.arch.viewModel.k) null, new t(this), 6);
        f.a.a(this, u(), p.f111723a, com.bytedance.assem.arch.viewModel.l.a(), new i(this), 4);
        AssemViewModel.a(u(), h.f111715a, null, new j(this), new l(this), new k(this), 2);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class), i.f111716a, new m(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class), j.f111717a, new n(this));
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = G();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            new com.bytedance.tux.g.b(view).e(R.string.de8);
        } else if (z().f111105l) {
            u().l();
        }
        f.a.a(this, z(), k.f111718a, com.bytedance.assem.arch.viewModel.l.a(), p.f111709a, 4);
        f.a.a(this, z(), l.f111719a, com.bytedance.assem.arch.viewModel.l.a(), new q(this), 4);
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f111709a = new p();

        static {
            Covode.recordClassIndex(71818);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            h.f.b.l.d(pVar, "");
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar, "");
            this.this$0.F();
            this.this$0.v().setVisibility(8);
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            h.f.b.l.d(pVar, "");
            aq.b bVar = this.this$0.z().f111103j;
            if (bVar != null && this.this$0.f111705k) {
                bVar.a();
            }
            this.this$0.f111705k = false;
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(pVar, "");
            this.this$0.f111706l = booleanValue;
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d> list) {
            aq.b bVar;
            List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d> list2 = list;
            h.f.b.l.d(pVar, "");
            this.this$0.y().k();
            if (list2 == null || list2.isEmpty()) {
                if (this.this$0.f111705k && (bVar = this.this$0.z().f111103j) != null) {
                    bVar.a();
                }
                this.this$0.f111705k = false;
            } else {
                this.this$0.v().setVisibility(0);
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(71820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            h.f.b.l.d(aVar, "");
            if (pVar2.f25594h) {
                this.this$0.v().postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.music.search.e.r.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ r f111710a;

                    static {
                        Covode.recordClassIndex(71821);
                    }

                    {
                        this.f111710a = r1;
                    }

                    public final void run() {
                        this.f111710a.this$0.v().b(0);
                    }
                }, 50);
            }
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.music.p>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f111711a = new s();

        static {
            Covode.recordClassIndex(71822);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.music.p> aVar) {
            Fragment a2;
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.music.p> aVar2 = aVar;
            h.f.b.l.d(pVar2, "");
            h.f.b.l.d(aVar2, "");
            T t = aVar2.f25631b;
            if (t != null) {
                if (t.f111561a) {
                    int i2 = f.f111712a[t.f111562b.ordinal()];
                    if (i2 == 1) {
                        Fragment a3 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a3 != null) {
                            new com.bytedance.tux.g.b(a3).e(R.string.dp_).b();
                        }
                    } else if (i2 != 2) {
                        Fragment a4 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a4 != null) {
                            new com.bytedance.tux.g.b(a4).a(a4.getString(R.string.dpa)).b();
                        }
                    } else {
                        Fragment a5 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a5 != null) {
                            new com.bytedance.tux.g.b(a5).a(a5.getString(R.string.dpb, Integer.valueOf(t.f111563c))).b();
                        }
                    }
                } else {
                    int i3 = f.f111713b[t.f111562b.ordinal()];
                    if (i3 == 1) {
                        Fragment a6 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a6 != null) {
                            new com.bytedance.tux.g.b(a6).e(R.string.dpd).b();
                        }
                    } else if (i3 == 2 && (a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2)) != null) {
                        new com.bytedance.tux.g.b(a2).a(a2.getString(R.string.dpc)).b();
                    }
                }
            }
            return z.f158842a;
        }
    }
}
