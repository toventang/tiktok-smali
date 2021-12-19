package com.ss.android.ugc.aweme.detail.ui.b;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tiktok.proxy.f;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.ui.z;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bc;
import com.ss.android.ugc.aweme.feed.e.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.List;

public abstract class a extends z implements h {
    public final boolean q;
    public int r;
    public com.ss.android.ugc.aweme.feed.param.b s;
    public boolean t;
    public boolean u;
    private final com.bytedance.assem.arch.viewModel.b v;
    private SparseArray w;

    public static final class b extends m implements h.f.a.b<bc, bc> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(49726);
        }

        public b() {
            super(1);
        }

        public final bc invoke(bc bcVar) {
            l.c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(49724);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public View a(int i2) {
        if (this.w == null) {
            this.w = new SparseArray();
        }
        View view = (View) this.w.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.w.put(i2, findViewById);
        return findViewById;
    }

    public abstract List<Aweme> a(aa aaVar);

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public void e() {
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public abstract int v();

    public abstract MixFlowParam w();

    public abstract View x();

    @Override // com.bytedance.tiktok.proxy.f
    public androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$a  reason: collision with other inner class name */
    public static final class C1867a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(49725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1867a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f79928a;

        static {
            Covode.recordClassIndex(49728);
        }

        d(a aVar) {
            this.f79928a = aVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.detail.h.b bVar;
            VerticalViewPager verticalViewPager;
            a aVar = this.f79928a;
            if (aVar.isAdded() && (bVar = aVar.f79992k) != null && (verticalViewPager = bVar.N) != null) {
                verticalViewPager.a(new c(aVar));
            }
        }
    }

    public a() {
        boolean z;
        com.bytedance.assem.arch.viewModel.b bVar;
        if (ae.f95300e != null) {
            z = true;
        } else {
            z = false;
        }
        this.q = z;
        this.r = -1;
        this.s = new com.ss.android.ugc.aweme.feed.param.b();
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(VideoPlaySearchViewModel.class);
        C1867a aVar2 = new C1867a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (aVar == null || l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.v = bVar;
    }

    public static final class c extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f79927a;

        static {
            Covode.recordClassIndex(49727);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f79927a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            boolean a2;
            if (this.f79927a.q) {
                aa aaVar = this.f79927a.p;
                if (!(aaVar instanceof c)) {
                    aaVar = null;
                }
                c cVar = (c) aaVar;
                if (cVar != null) {
                    this.f79927a.t = cVar.a(i2);
                    a aVar = this.f79927a;
                    if (aVar.r < 0) {
                        a2 = true;
                    } else {
                        a2 = cVar.a(this.f79927a.r);
                    }
                    aVar.u = a2;
                }
                this.f79927a.r = i2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.z
    public final aa a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar) {
        com.ss.android.ugc.aweme.common.e.a<?, ?> aVar2 = ae.f95300e;
        aa aaVar = null;
        if (aVar2 != null) {
            ae.f95300e = null;
            com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
            JediViewModel<?> j2 = j();
            if (s.f79834a.size() == 0) {
                for (IDetailPageOperatorService iDetailPageOperatorService : ServiceManager.get().getServices(IDetailPageOperatorService.class)) {
                    HashMap<String, com.ss.android.ugc.aweme.detail.operators.ab> a2 = iDetailPageOperatorService.a();
                    if (a2 != null) {
                        s.f79834a.putAll(a2);
                    }
                }
            }
            com.ss.android.ugc.aweme.detail.operators.ab abVar = s.f79834a.get("from_search_mix");
            if (abVar != null) {
                aaVar = abVar.a(bVar, aVar2, j2);
            }
        }
        if (aaVar == null || com.ss.android.ugc.aweme.search.a.a.a()) {
            aa a3 = super.a(aVar);
            l.b(a3, "");
            return a3;
        }
        aa a4 = super.a(aVar);
        MixFlowParam w2 = w();
        MixFlowParam mixFlowParam = new MixFlowParam("general_search", "from_search_mix");
        int v2 = v();
        l.b(a4, "");
        return new c(w2, mixFlowParam, v2, a4, aaVar, a(a4));
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        if (com.ss.android.ugc.aweme.search.a.a.a()) {
            super.onViewCreated(view, bundle);
            return;
        }
        com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
        this.s.setEventType(bVar.getEventType());
        this.s.setPreviousPage(bVar.getPreviousPage());
        this.s.setFrom(bVar.getFrom());
        this.s.setHotEnterMethod(bVar.getHotEnterMethod());
        super.onViewCreated(view, bundle);
        view.post(new d(this));
        f.a.a(this, (VideoPlaySearchViewModel) this.v.getValue(), b.f79929a, (k) null, new e(this), 6);
    }

    static final class e extends m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(49729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            o oVar;
            o oVar2;
            l.d(dVar, "");
            if (this.this$0.u && !this.this$0.t) {
                a aVar2 = this.this$0;
                com.ss.android.ugc.aweme.feed.param.b bVar = aVar2.f79991j;
                l.b(bVar, "");
                bVar.setFrom("from_search_mix");
                com.ss.android.ugc.aweme.feed.param.b bVar2 = aVar2.f79991j;
                l.b(bVar2, "");
                bVar2.setEventType("general_search");
                com.ss.android.ugc.aweme.feed.param.b bVar3 = aVar2.f79991j;
                l.b(bVar3, "");
                bVar3.setPreviousPage(aVar2.s.getEventType());
                com.ss.android.ugc.aweme.feed.param.b bVar4 = aVar2.f79991j;
                l.b(bVar4, "");
                bVar4.setIsFromPlaylist(1);
                Context requireContext = aVar2.requireContext();
                l.b(requireContext, "");
                MobParamProvider.a.a(requireContext).a("slide_type", "artificial_to_natural");
                com.ss.android.ugc.aweme.detail.h.b bVar5 = aVar2.f79992k;
                if (!(bVar5 == null || (oVar2 = bVar5.aK) == null)) {
                    oVar2.f92899d = "general_search";
                }
                View x = aVar2.x();
                if (x != null) {
                    x.setVisibility(4);
                }
            } else if (!this.this$0.u && this.this$0.t) {
                a aVar3 = this.this$0;
                com.ss.android.ugc.aweme.feed.param.b bVar6 = aVar3.f79991j;
                l.b(bVar6, "");
                bVar6.setFrom(aVar3.s.getFrom());
                com.ss.android.ugc.aweme.feed.param.b bVar7 = aVar3.f79991j;
                l.b(bVar7, "");
                bVar7.setEventType(aVar3.s.getEventType());
                com.ss.android.ugc.aweme.feed.param.b bVar8 = aVar3.f79991j;
                l.b(bVar8, "");
                bVar8.setPreviousPage(aVar3.s.getPreviousPage());
                com.ss.android.ugc.aweme.feed.param.b bVar9 = aVar3.f79991j;
                l.b(bVar9, "");
                bVar9.setIsFromPlaylist(0);
                Context requireContext2 = aVar3.requireContext();
                l.b(requireContext2, "");
                MobParamProvider.a.a(requireContext2).a("slide_type", "artificial_to_own");
                com.ss.android.ugc.aweme.detail.h.b bVar10 = aVar3.f79992k;
                if (!(bVar10 == null || (oVar = bVar10.aK) == null)) {
                    oVar.f92899d = aVar3.s.getEventType();
                }
                View x2 = aVar3.x();
                if (x2 != null) {
                    x2.setVisibility(0);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
