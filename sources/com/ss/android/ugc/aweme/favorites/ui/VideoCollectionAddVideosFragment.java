package com.ss.android.ugc.aweme.favorites.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.c.d;
import com.ss.android.ugc.aweme.favorites.c.f;
import com.ss.android.ugc.aweme.favorites.e.j;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class VideoCollectionAddVideosFragment extends com.ss.android.ugc.aweme.favorites.f.a implements h, d.c, f.g {

    /* renamed from: h  reason: collision with root package name */
    public static final c f90757h = new c((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public String f90758e;

    /* renamed from: f  reason: collision with root package name */
    public String f90759f;

    /* renamed from: g  reason: collision with root package name */
    public String f90760g;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90761i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f90762j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f90763k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, com.ss.android.ugc.aweme.favorites.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(57010);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(57008);
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f90763k == null) {
            this.f90763k = new SparseArray();
        }
        View view = (View) this.f90763k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f90763k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.f.g
    public final void a(Aweme aweme) {
        l.d(aweme, "");
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f90763k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final f.a.b.a c() {
        return (f.a.b.a) this.f90762j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a
    public final int e() {
        return R.layout.zq;
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

    public static final class c {
        static {
            Covode.recordClassIndex(57011);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
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

    static final class d extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90764a = new d();

        static {
            Covode.recordClassIndex(57012);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c().a();
        br_();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(57009);
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

    @Override // com.ss.android.ugc.aweme.favorites.c.d.c
    public final void a() {
        VideoCollectionContentViewModel videoCollectionContentViewModel = (VideoCollectionContentViewModel) this.f90761i.getValue();
        e eVar = new e(this);
        l.d(videoCollectionContentViewModel, "");
        l.d(eVar, "");
        h.a.a(videoCollectionContentViewModel, eVar);
    }

    public VideoCollectionAddVideosFragment() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionContentViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f90761i = bVar;
        this.f90762j = h.i.a((h.f.a.a) d.f90764a);
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCollectionAddVideosFragment f90768a;

        static {
            Covode.recordClassIndex(57016);
        }

        f(VideoCollectionAddVideosFragment videoCollectionAddVideosFragment) {
            this.f90768a = videoCollectionAddVideosFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90768a.f();
        }
    }

    static final class g extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ VideoCollectionAddVideosFragment this$0;

        static {
            Covode.recordClassIndex(57017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VideoCollectionAddVideosFragment videoCollectionAddVideosFragment, View view) {
            super(1);
            this.this$0 = videoCollectionAddVideosFragment;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) AnonymousClass1.f90769a);
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) AnonymousClass2.f90770a);
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment.g.AnonymousClass3 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(57020);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.a8i);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.favorites.c.f.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.favorites.c.f();
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment.g.AnonymousClass4 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(57021);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view;
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.favorites.c.d.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.favorites.c.d();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, z> {
        final /* synthetic */ VideoCollectionAddVideosFragment this$0;

        static {
            Covode.recordClassIndex(57013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VideoCollectionAddVideosFragment videoCollectionAddVideosFragment) {
            super(1);
            this.this$0 = videoCollectionAddVideosFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            com.ss.android.ugc.aweme.favorites.viewmodel.d dVar2 = dVar;
            l.d(dVar2, "");
            List<com.ss.android.ugc.aweme.favorites.viewmodel.a> a2 = dVar2.f91007a.a();
            if (a2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : a2) {
                    if (t.f91002b == 2) {
                        arrayList.add(t);
                    }
                }
                ArrayList<com.ss.android.ugc.aweme.favorites.viewmodel.a> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (com.ss.android.ugc.aweme.favorites.viewmodel.a aVar : arrayList2) {
                    arrayList3.add(aVar.f91001a);
                }
                ArrayList<Aweme> arrayList4 = arrayList3;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    String str = this.this$0.f90758e;
                    ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList4, 10));
                    for (Aweme aweme : arrayList4) {
                        arrayList5.add(aweme.getAid());
                    }
                    final com.ss.android.ugc.aweme.favorites.api.f fVar = new com.ss.android.ugc.aweme.favorites.api.f(10, str, null, null, null, arrayList5, null, null, 220);
                    f.a.b.b a3 = new j().f90621b.a(fVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment.e.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f90765a;

                        static {
                            Covode.recordClassIndex(57014);
                        }

                        {
                            this.f90765a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            r.a("collection_add_videos", v.a("collection_video", "enter_from"), v.a(this.f90765a.this$0.f90758e, "collection_id"));
                            String str = this.f90765a.this$0.f90760g;
                            if (str != null) {
                                com.ss.android.ugc.aweme.favorites.api.f fVar = fVar;
                                com.ss.android.ugc.aweme.favorites.viewmodel.f.a(str, new com.ss.android.ugc.aweme.favorites.api.f(fVar.f90461a, fVar.f90462b, this.f90765a.this$0.f90759f, fVar.f90464d, fVar.f90465e, fVar.f90466f, fVar.f90467g, fVar.f90468h));
                            }
                            this.f90765a.this$0.f();
                        }
                    }, new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment.e.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f90767a;

                        static {
                            Covode.recordClassIndex(57015);
                        }

                        {
                            this.f90767a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            androidx.fragment.app.e requireActivity = this.f90767a.this$0.requireActivity();
                            l.b(requireActivity, "");
                            new com.bytedance.tux.g.b(requireActivity).e(R.string.bp3).b();
                        }
                    });
                    l.b(a3, "");
                    f.a.j.a.a(a3, this.this$0.c());
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        view.findViewById(R.id.a1p).setOnClickListener(new f(this));
        com.bytedance.assem.arch.extensions.d.a(this, new g(this, view));
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.f.g
    public final void a(View view, Aweme aweme) {
        l.d(view, "");
        l.d(aweme, "");
        androidx.core.app.b b2 = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
        l.b(b2, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        bundle.putString("userid", g2.getCurUserId());
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        bundle.putString("sec_userid", g3.getCurSecUserId());
        bundle.putString("refer", "collection_video");
        bundle.putString("tab_name", "collection");
        bundle.putBoolean("is_clean_mode", true);
        buildRoute.withParam(bundle).withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true).open();
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.zq, viewGroup, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
