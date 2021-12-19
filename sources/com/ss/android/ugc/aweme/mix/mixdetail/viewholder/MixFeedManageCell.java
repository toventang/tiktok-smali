package com.ss.android.ugc.aweme.mix.mixdetail.viewholder;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.w;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class MixFeedManageCell extends PowerCell<b> implements com.bytedance.assem.arch.viewModel.h, w {

    /* renamed from: a  reason: collision with root package name */
    final h.h f110056a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f110057b;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f110058j;

    public static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(70596);
        }

        public g() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70589);
    }

    public final MixVideosManageViewModel c() {
        return (MixVideosManageViewModel) this.f110058j.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70591);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a>> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(70592);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a>> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(70597);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(70600);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a>> {
        public static final l INSTANCE = new l();

        static {
            Covode.recordClassIndex(70601);
        }

        public l() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.mixdetail.w
    public final void b() {
        this.itemView.setBackgroundColor(0);
    }

    static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixFeedManageCell f110060a;

        static {
            Covode.recordClassIndex(70607);
        }

        q(MixFeedManageCell mixFeedManageCell) {
            this.f110060a = mixFeedManageCell;
        }

        public final void run() {
            this.f110060a.b();
            this.f110060a.f110057b = true;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70590);
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

    static final class o extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ MixFeedManageCell this$0;

        static {
            Covode.recordClassIndex(70604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(MixFeedManageCell mixFeedManageCell) {
            super(0);
            this.this$0 = mixFeedManageCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            View view = this.this$0.itemView;
            h.f.b.l.b(view, "");
            return Integer.valueOf(view.getResources().getColor(R.color.f159926j));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        MixVideosManageViewModel c2;
        super.k();
        a(c2, c.f110068a, d.f110069a, com.bytedance.assem.arch.viewModel.l.a(c().f25686c), null, new r(this));
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.core.a> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.core.a invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return (com.bytedance.assem.arch.core.a) i2;
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).getViewModelStore();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final ad.b invoke() {
            if (this.$this_assemViewModel.i() instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
                if (i2 != null) {
                    return ((com.bytedance.assem.arch.core.a) i2).q();
                }
                throw new h.w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.mixdetail.w
    public final void a() {
        View view = this.itemView;
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        view.setBackgroundColor(view2.getResources().getColor(R.color.f159927k));
    }

    public static final class i extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (androidx.fragment.app.e) context2;
                }
                throw new h.w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (androidx.fragment.app.e) baseContext;
                    }
                    throw new h.w("null cannot be cast to non-null type");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            androidx.fragment.app.e eVar;
            View view = this.$this_assemViewModel.itemView;
            h.f.b.l.a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof androidx.fragment.app.e) {
                View view2 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (androidx.fragment.app.e) context2;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (androidx.fragment.app.e) baseContext;
                    } else {
                        throw new h.w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.$this_assemViewModel.itemView;
                h.f.b.l.a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            af viewModelStore = eVar.getViewModelStore();
            h.f.b.l.a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final androidx.lifecycle.m invoke() {
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    return (Fragment) i3;
                }
                throw new h.w("null cannot be cast to non-null type");
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                    if (a2 != null) {
                        return a2;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new h.w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ PowerCell $this_assemViewModel;

        static {
            Covode.recordClassIndex(70603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(PowerCell powerCell) {
            super(0);
            this.$this_assemViewModel = powerCell;
        }

        @Override // h.f.a.a
        public final af invoke() {
            Fragment a2;
            af viewModelStore;
            androidx.lifecycle.m i2 = this.$this_assemViewModel.i();
            if (i2 instanceof Fragment) {
                androidx.lifecycle.m i3 = this.$this_assemViewModel.i();
                if (i3 != null) {
                    a2 = (Fragment) i3;
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else if (i2 instanceof com.bytedance.assem.arch.core.a) {
                androidx.lifecycle.m i4 = this.$this_assemViewModel.i();
                if (i4 != null) {
                    a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) ((com.bytedance.assem.arch.core.a) i4));
                } else {
                    throw new h.w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a2 != null && (viewModelStore = a2.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    public MixFeedManageCell() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(MixVideosManageViewModel.class);
        a aVar2 = new a(a2);
        g gVar = g.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, h.INSTANCE, new i(this), new j(this), k.INSTANCE, gVar);
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, l.INSTANCE, new m(this), new n(this), b.INSTANCE, gVar);
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, c.INSTANCE, new d(this), new e(this), new f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + aVar + " there");
        }
        this.f110058j = bVar;
        this.f110056a = h.i.a((h.f.a.a) new o(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        return a(viewGroup, R.layout.al2);
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, z> {
        final /* synthetic */ MixFeedManageCell this$0;

        static {
            Covode.recordClassIndex(70605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(MixFeedManageCell mixFeedManageCell) {
            super(1);
            this.this$0 = mixFeedManageCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
            if (r1 == null) goto L_0x0097;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a r8) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell.p.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        b bVar2 = bVar;
        h.f.b.l.d(bVar2, "");
        View view = this.itemView;
        h.f.b.l.b(view, "");
        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view.findViewById(R.id.agl), bVar2.f110064b);
        String str = bVar2.f110065c;
        if (str == null || str.length() <= 0) {
            View view2 = this.itemView;
            h.f.b.l.b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.cn0);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            View view3 = this.itemView;
            h.f.b.l.b(view3, "");
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.cn0);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            View view4 = this.itemView;
            h.f.b.l.b(view4, "");
            TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.cn0);
            h.f.b.l.b(tuxTextView3, "");
            a.C0730a aVar = new a.C0730a();
            String str2 = bVar2.f110065c;
            if (str2 == null) {
                str2 = "";
            }
            tuxTextView3.setText(aVar.a(str2).f33382a);
        }
        View view5 = this.itemView;
        h.f.b.l.b(view5, "");
        TuxTextView tuxTextView4 = (TuxTextView) view5.findViewById(R.id.cn1);
        h.f.b.l.b(tuxTextView4, "");
        Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
        AwemeStatistics statistics = bVar2.f110067e.getStatistics();
        h.f.b.l.b(statistics, "");
        tuxTextView4.setText(resources.getQuantityString(R.plurals.fe, (int) statistics.getPlayCount(), bVar2.f110066d));
        a(c(), new p(this));
    }

    public static <VM1 extends AssemViewModel<S1>, S1 extends com.bytedance.assem.arch.viewModel.j, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) h.a.a(vm1, bVar);
    }

    static final class r extends h.f.b.m implements h.f.a.q<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends Boolean>, List<? extends Aweme>, z> {
        final /* synthetic */ MixFeedManageCell this$0;

        static {
            Covode.recordClassIndex(70608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(MixFeedManageCell mixFeedManageCell) {
            super(3);
            this.this$0 = mixFeedManageCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar, List<? extends Aweme> list) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            List<? extends Aweme> list2 = list;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar2, "");
            if (!aVar2.f25631b.booleanValue()) {
                View view = this.this$0.itemView;
                h.f.b.l.b(view, "");
                TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.bhx);
                h.f.b.l.b(tuxCheckBox, "");
                tuxCheckBox.setVisibility(0);
                MixFeedManageCell.a(this.this$0.c(), new h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell.r.AnonymousClass1 */
                    final /* synthetic */ r this$0;

                    static {
                        Covode.recordClassIndex(70609);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
                        if (r1 == null) goto L_0x0037;
                     */
                    @Override // h.f.a.b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a r7) {
                        /*
                        // Method dump skipped, instructions count: 117
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell.r.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            } else {
                View view2 = this.this$0.itemView;
                h.f.b.l.b(view2, "");
                TuxCheckBox tuxCheckBox2 = (TuxCheckBox) view2.findViewById(R.id.bhx);
                h.f.b.l.b(tuxCheckBox2, "");
                tuxCheckBox2.setVisibility(8);
                View view3 = this.this$0.itemView;
                h.f.b.l.b(view3, "");
                ImageView imageView = (ImageView) view3.findViewById(R.id.byd);
                h.f.b.l.b(imageView, "");
                imageView.setVisibility(0);
            }
            String str = null;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAid());
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    b bVar = (b) this.this$0.f34234d;
                    if (bVar != null) {
                        str = bVar.f110063a;
                    }
                    if (arrayList2.contains(str) && !this.this$0.f110057b) {
                        this.this$0.f110057b = true;
                        MixFeedManageCell mixFeedManageCell = this.this$0;
                        mixFeedManageCell.itemView.setBackgroundColor(((Number) mixFeedManageCell.f110056a.getValue()).intValue());
                        mixFeedManageCell.itemView.postDelayed(new q(mixFeedManageCell), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
