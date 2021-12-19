package com.ss.android.ugc.aweme.favorites.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.favorites.c.l;
import com.ss.android.ugc.aweme.favorites.c.n;
import com.ss.android.ugc.aweme.favorites.e.j;
import com.ss.android.ugc.aweme.favorites.ui.ah;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class af extends com.bytedance.ies.foundation.fragment.a implements h, l.c, n.f {

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90829e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f90830f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f90831g;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, com.ss.android.ugc.aweme.favorites.viewmodel.e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(57086);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.e invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(57084);
    }

    private final VideoCollectionListViewModel e() {
        return (VideoCollectionListViewModel) this.f90829e.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f90831g == null) {
            this.f90831g = new SparseArray();
        }
        View view = (View) this.f90831g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f90831g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f90831g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final f.a.b.a d() {
        return (f.a.b.a) this.f90830f.getValue();
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

    static final class c extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90832a = new c();

        static {
            Covode.recordClassIndex(57087);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.favorites.c.l.c
    public final void c() {
        e().a(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        d().a();
        br_();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(57085);
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

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ h.f.a.b $createCollection;
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(57091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(af afVar, androidx.fragment.app.e eVar, h.f.a.b bVar) {
            super(0);
            this.this$0 = afVar;
            this.$activity = eVar;
            this.$createCollection = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            i supportFragmentManager = this.$activity.getSupportFragmentManager();
            h.f.b.l.b(supportFragmentManager, "");
            String string = this.this$0.requireContext().getString(R.string.bt9);
            h.f.b.l.b(string, "");
            String string2 = this.this$0.requireContext().getString(R.string.dgs);
            h.f.b.l.b(string2, "");
            ah.a.a(supportFragmentManager, string, string2, new ah.b(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.af.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f90837a;

                static {
                    Covode.recordClassIndex(57092);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90837a = r1;
                }

                @Override // com.ss.android.ugc.aweme.favorites.ui.ah.b
                public final void a(String str) {
                    h.f.b.l.d(str, "");
                    this.f90837a.$createCollection.invoke(str);
                }
            });
            return z.f158842a;
        }
    }

    public af() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f90829e = bVar;
        this.f90830f = h.i.a((h.f.a.a) c.f90832a);
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.n.f
    public final void a() {
        new com.ss.android.ugc.aweme.metrics.n().a("collection_video").f();
        androidx.fragment.app.e requireActivity = requireActivity();
        h.f.b.l.b(requireActivity, "");
        new e(this, requireActivity, new d(this, requireActivity)).invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.favorites.api.f a2 = com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST");
        if (a2 != null) {
            if (a2.f90461a == 2) {
                androidx.fragment.app.e requireActivity = requireActivity();
                h.f.b.l.b(requireActivity, "");
                new com.bytedance.tux.g.b(requireActivity).e(R.string.btt).b();
            }
            if (a2.f90461a == 1) {
                androidx.fragment.app.e requireActivity2 = requireActivity();
                h.f.b.l.b(requireActivity2, "");
                new com.bytedance.tux.g.b(requireActivity2).e(R.string.btl).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
            }
            if (a2.f90461a == 10) {
                VideoCollectionListViewModel e2 = e();
                f fVar = new f(a2, this);
                h.f.b.l.d(e2, "");
                h.f.b.l.d(fVar, "");
                h.a.a(e2, fVar);
            }
            e().a(true);
        }
    }

    static final class g extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(57094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(af afVar, View view) {
            super(1);
            this.this$0 = afVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.af.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(57095);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.a8i);
                    qVar2.a(ab.a(n.class));
                    qVar2.f25596b = new n();
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.af.g.AnonymousClass2 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(57096);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.e_o);
                    qVar2.a(ab.a(l.class));
                    qVar2.f25596b = new l();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<String, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(57088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(af afVar, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = afVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            final String str2 = str;
            h.f.b.l.d(str2, "");
            final com.ss.android.ugc.aweme.favorites.api.f fVar = new com.ss.android.ugc.aweme.favorites.api.f(1, null, str2, null, null, null, null, null, 250);
            f.a.b.b a2 = new j().f90621b.a(fVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.af.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f90833a;

                static {
                    Covode.recordClassIndex(57089);
                }

                {
                    this.f90833a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    new com.ss.android.ugc.aweme.metrics.i().a("collection_video").a((Integer) 1).f();
                    String str = ((com.ss.android.ugc.aweme.favorites.api.g) obj).f90469a;
                    if (str == null) {
                        str = "";
                    }
                    SmartRouter.buildRoute(this.f90833a.$activity, "aweme://favorite/videos/collections/add/video").withParam("collectionId", str).withParam("collectionName", str2).withParam("from", "COLLECTION_LIST").open();
                    com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", fVar);
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.af.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f90836a;

                static {
                    Covode.recordClassIndex(57090);
                }

                {
                    this.f90836a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    new com.bytedance.tux.g.b(this.f90836a.$activity).e(R.string.bp3).b();
                }
            });
            h.f.b.l.b(a2, "");
            f.a.j.a.a(a2, this.this$0.d());
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.favorites.api.f $request;
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(57093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.favorites.api.f fVar, af afVar) {
            super(1);
            this.$request = fVar;
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
            Integer num;
            long j2;
            com.ss.android.ugc.aweme.favorites.viewmodel.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            SmartRoute withParam = SmartRouter.buildRoute(this.this$0.getContext(), "aweme://favorite/videos/collections/content").withParam(StringSet.name, this.$request.f90463c);
            List<com.ss.android.ugc.aweme.favorites.viewmodel.b> a2 = eVar2.f91010a.a();
            Integer num2 = null;
            if (a2 != null) {
                int i2 = 0;
                if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                    Iterator<T> it = a2.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (it.next().f91005b == 2 && (i2 = i2 + 1) < 0) {
                            h.a.n.b();
                        }
                    }
                }
                num = Integer.valueOf(i2);
            } else {
                num = null;
            }
            SmartRoute withParam2 = withParam.withParam("collectionCount", num).withParam("id", this.$request.f90462b);
            List<String> list = this.$request.f90466f;
            if (list != null) {
                num2 = Integer.valueOf(list.size());
            }
            SmartRoute withParam3 = withParam2.withParam("showAddVideosCount", num2).withParam("state", 1);
            List<String> list2 = this.$request.f90466f;
            if (list2 != null) {
                j2 = (long) list2.size();
            } else {
                j2 = 0;
            }
            withParam3.withParam("total", j2).open();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.favorites.viewmodel.f.f91013a.clear();
        com.bytedance.assem.arch.extensions.d.a(this, new g(this, view));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.mn, viewGroup, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
