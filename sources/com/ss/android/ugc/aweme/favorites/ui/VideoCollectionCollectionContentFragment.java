package com.ss.android.ugc.aweme.favorites.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.api.d;
import com.ss.android.ugc.aweme.favorites.c.f;
import com.ss.android.ugc.aweme.favorites.c.h;
import com.ss.android.ugc.aweme.favorites.ui.ag;
import com.ss.android.ugc.aweme.favorites.ui.ah;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ae;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.z;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class VideoCollectionCollectionContentFragment extends com.ss.android.ugc.aweme.favorites.f.a implements com.bytedance.assem.arch.viewModel.h, f.g, h.f {

    /* renamed from: e  reason: collision with root package name */
    public String f90771e;

    /* renamed from: f  reason: collision with root package name */
    public String f90772f;

    /* renamed from: g  reason: collision with root package name */
    public Long f90773g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f90774h;

    /* renamed from: i  reason: collision with root package name */
    public int f90775i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f90776j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.favorites.api.d f90777k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90778l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f90779m;
    private SparseArray n;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, com.ss.android.ugc.aweme.favorites.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(57025);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(57023);
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a
    public final int e() {
        return R.layout.zr;
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

    public final VideoCollectionContentViewModel i() {
        return (VideoCollectionContentViewModel) this.f90778l.getValue();
    }

    public final f.a.b.a j() {
        return (f.a.b.a) this.f90779m.getValue();
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

    @Override // com.ss.android.ugc.aweme.favorites.c.f.g
    public final void a(Aweme aweme) {
        h.f.b.l.d(aweme, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            r.a("remove_unavailable_from_collection", v.a("collection_video", "enter_from"));
            com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(activity);
            bVar.a(false);
            bVar.b(activity.getResources().getString(R.string.buj));
            bVar.b(R.string.buh);
            com.bytedance.tux.dialog.b.c.a(bVar, new j(this, activity, aweme));
            new com.bytedance.tux.dialog.a(bVar).b().show();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90780a = new c();

        static {
            Covode.recordClassIndex(57026);
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

    static final class d extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment) {
            super(0);
            this.this$0 = videoCollectionCollectionContentFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            String str = this.this$0.f90771e;
            if (str == null) {
                str = "";
            }
            return VideoCollectionContentViewModel.a.a(str);
        }
    }

    public final com.ss.android.ugc.aweme.favorites.api.d h() {
        com.ss.android.ugc.aweme.favorites.api.d dVar = this.f90777k;
        if (dVar == null) {
            h.f.b.l.a("initializeDetail");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        j().a();
        br_();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(57024);
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

    @Override // com.ss.android.ugc.aweme.favorites.c.h.f
    public final void a() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            a(i(), new g(this, activity));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.favorites.c.h.f
    public final void c() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            a(i(), new h(this, activity));
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a
    public final boolean g() {
        z.a aVar = new z.a();
        aVar.element = false;
        a(i(), new k(this, aVar));
        return aVar.element;
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f90799a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoCollectionCollectionContentFragment f90800b;

        static {
            Covode.recordClassIndex(57051);
        }

        l(int i2, VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment) {
            this.f90799a = i2;
            this.f90800b = videoCollectionCollectionContentFragment;
        }

        public final void run() {
            androidx.fragment.app.e requireActivity = this.f90800b.requireActivity();
            h.f.b.l.b(requireActivity, "");
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(requireActivity);
            Resources resources = this.f90800b.getResources();
            int i2 = this.f90799a;
            bVar.a(resources.getQuantityString(R.plurals.cp, i2, String.valueOf(i2))).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
        }
    }

    public static final class f implements ag.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCollectionCollectionContentFragment f90785a;

        static {
            Covode.recordClassIndex(57033);
        }

        @Override // com.ss.android.ugc.aweme.favorites.ui.ag.a
        public final void a() {
            r.a("change_collection_name_click", v.a("collection_video", "enter_from"), v.a(this.f90785a.f90771e, "collection_id"));
            VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment = this.f90785a;
            androidx.fragment.app.e activity = videoCollectionCollectionContentFragment.getActivity();
            if (activity != null) {
                h.f.b.l.b(activity, "");
                androidx.fragment.app.i supportFragmentManager = activity.getSupportFragmentManager();
                h.f.b.l.b(supportFragmentManager, "");
                String string = activity.getString(R.string.bth);
                h.f.b.l.b(string, "");
                com.ss.android.ugc.aweme.favorites.api.d dVar = videoCollectionCollectionContentFragment.f90777k;
                if (dVar == null) {
                    h.f.b.l.a("initializeDetail");
                }
                String str = dVar.f90450b;
                String string2 = activity.getString(R.string.ffv);
                h.f.b.l.b(string2, "");
                ah.a.a(supportFragmentManager, string, str, string2, new n(videoCollectionCollectionContentFragment, activity));
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.ui.ag.a
        public final void b() {
            r.a("delete_collection_click", v.a("collection_video", "enter_from"), v.a(this.f90785a.f90771e, "collection_id"));
            VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment = this.f90785a;
            androidx.fragment.app.e activity = videoCollectionCollectionContentFragment.getActivity();
            if (activity != null) {
                h.f.b.l.b(activity, "");
                com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(activity);
                bVar.a(false);
                String string = activity.getString(R.string.bts);
                h.f.b.l.b(string, "");
                Object[] objArr = new Object[1];
                com.ss.android.ugc.aweme.favorites.api.d dVar = videoCollectionCollectionContentFragment.f90777k;
                if (dVar == null) {
                    h.f.b.l.a("initializeDetail");
                }
                objArr[0] = dVar.f90450b;
                String a2 = com.a.a(string, Arrays.copyOf(objArr, 1));
                h.f.b.l.b(a2, "");
                bVar.b(a2);
                bVar.b(R.string.bu5);
                com.bytedance.tux.dialog.b.c.a(bVar, new e(videoCollectionCollectionContentFragment, activity));
                new com.bytedance.tux.dialog.a(bVar).b().show();
            }
        }

        f(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment) {
            this.f90785a = videoCollectionCollectionContentFragment;
        }
    }

    public VideoCollectionCollectionContentFragment() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        d dVar2 = new d(this);
        h.k.c a2 = ab.a(VideoCollectionContentViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((androidx.lifecycle.ag) this, true), dVar2, bVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((androidx.lifecycle.ag) this, false), dVar2, bVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f90778l = bVar;
        this.f90779m = h.i.a((h.f.a.a) c.f90780a);
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.h.f
    public final void d() {
        r.a("collection_setting_click", v.a("collection_video", "enter_from"), v.a(this.f90771e, "collection_id"));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            ag agVar = new ag();
            f fVar = new f(this);
            h.f.b.l.d(fVar, "");
            agVar.f90838a = fVar;
            new a.C1112a().a(1).a(agVar).f45299a.show(activity.getSupportFragmentManager(), "VideoCollectionOperation");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i2;
        long j2;
        Long l2;
        super.onResume();
        com.ss.android.ugc.aweme.favorites.api.f a2 = com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_CONTENT");
        if (a2 != null) {
            if (a2.f90461a == 10) {
                List<String> list = a2.f90466f;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                com.ss.android.ugc.aweme.favorites.api.d dVar = this.f90777k;
                if (dVar == null) {
                    h.f.b.l.a("initializeDetail");
                }
                d.a aVar = dVar.f90453e;
                if (aVar == null || (l2 = aVar.f90454a) == null) {
                    j2 = 0;
                } else {
                    j2 = l2.longValue();
                }
                com.ss.android.ugc.aweme.favorites.api.d dVar2 = this.f90777k;
                if (dVar2 == null) {
                    h.f.b.l.a("initializeDetail");
                }
                d.a aVar2 = dVar2.f90453e;
                if (aVar2 != null) {
                    aVar2.f90454a = Long.valueOf(j2 + ((long) i2));
                }
                androidx.fragment.app.e requireActivity = requireActivity();
                h.f.b.l.b(requireActivity, "");
                new com.bytedance.tux.g.b(requireActivity).a(getResources().getQuantityString(R.plurals.cp, i2, String.valueOf(i2))).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
            }
            i().d(true);
            com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", new com.ss.android.ugc.aweme.favorites.api.f(3, null, null, null, null, null, null, null, 254));
        }
        Integer num = this.f90776j;
        if (num != null) {
            int intValue = num.intValue();
            View view = getView();
            if (view != null) {
                view.postDelayed(new l(intValue, this), 500);
            }
            this.f90776j = null;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, h.z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$activity = eVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
            final /* synthetic */ List $selectedAweme$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(57039);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, List list) {
                super(1);
                this.this$0 = hVar;
                this.$selectedAweme$inlined = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                h.f.b.l.d(bVar2, "");
                bVar2.a(R.string.fbo, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.h.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f90792a;

                    static {
                        Covode.recordClassIndex(57040);
                    }

                    {
                        this.f90792a = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        com.bytedance.tux.dialog.b.a aVar2 = aVar;
                        h.f.b.l.d(aVar2, "");
                        String str = this.f90792a.this$0.this$0.f90771e;
                        List<com.ss.android.ugc.aweme.favorites.viewmodel.a> list = this.f90792a.$selectedAweme$inlined;
                        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                        for (com.ss.android.ugc.aweme.favorites.viewmodel.a aVar3 : list) {
                            arrayList.add(aVar3.f91001a.getAid());
                        }
                        final com.ss.android.ugc.aweme.favorites.api.f fVar = new com.ss.android.ugc.aweme.favorites.api.f(11, str, null, null, null, null, arrayList, null, 188);
                        f.a.b.b a2 = new com.ss.android.ugc.aweme.favorites.e.j().f90621b.a(fVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                            /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.h.a.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f90793a;

                            static {
                                Covode.recordClassIndex(57041);
                            }

                            {
                                this.f90793a = r1;
                            }

                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(Object obj) {
                                long j2;
                                Long l2;
                                r.a("collection_move_videos", v.a("collection_video", "enter_from"), v.a(this.f90793a.f90792a.this$0.this$0.f90771e, "from"), v.a("", "to"));
                                com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", fVar);
                                d.a aVar = this.f90793a.f90792a.this$0.this$0.h().f90453e;
                                if (aVar == null || (l2 = aVar.f90454a) == null) {
                                    j2 = 0;
                                } else {
                                    j2 = l2.longValue();
                                }
                                d.a aVar2 = this.f90793a.f90792a.this$0.this$0.h().f90453e;
                                if (aVar2 != null) {
                                    aVar2.f90454a = Long.valueOf(j2 - ((long) this.f90793a.f90792a.$selectedAweme$inlined.size()));
                                }
                                this.f90793a.f90792a.this$0.this$0.i().d(true);
                                new com.bytedance.tux.g.b(this.f90793a.f90792a.this$0.$activity).a(this.f90793a.f90792a.this$0.this$0.getResources().getQuantityString(R.plurals.cu, this.f90793a.f90792a.$selectedAweme$inlined.size(), Integer.valueOf(this.f90793a.f90792a.$selectedAweme$inlined.size()))).b();
                            }
                        }, new f.a.d.f(this) {
                            /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.h.a.AnonymousClass1.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f90795a;

                            static {
                                Covode.recordClassIndex(57042);
                            }

                            {
                                this.f90795a = r1;
                            }

                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(Object obj) {
                                new com.bytedance.tux.g.b(this.f90795a.f90792a.this$0.$activity).e(R.string.bp3).b();
                            }
                        });
                        h.f.b.l.b(a2, "");
                        f.a.j.a.a(a2, this.f90792a.this$0.this$0.j());
                        aVar2.a().dismiss();
                        return h.z.f158842a;
                    }
                });
                bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>() {
                    /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.h.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(57043);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        com.bytedance.tux.dialog.b.a aVar2 = aVar;
                        h.f.b.l.d(aVar2, "");
                        aVar2.a().dismiss();
                        return h.z.f158842a;
                    }
                });
                return h.z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r6 == null) goto L_0x0036;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d r11) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class n implements ah.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoCollectionCollectionContentFragment f90802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f90803b;

        static {
            Covode.recordClassIndex(57058);
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f90807a;

            static {
                Covode.recordClassIndex(57060);
            }

            b(n nVar) {
                this.f90807a = nVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                new com.bytedance.tux.g.b(this.f90807a.f90803b).e(R.string.bp3).b();
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f90804a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f90805b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.favorites.api.f f90806c;

            static {
                Covode.recordClassIndex(57059);
            }

            a(n nVar, String str, com.ss.android.ugc.aweme.favorites.api.f fVar) {
                this.f90804a = nVar;
                this.f90805b = str;
                this.f90806c = fVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                TextView textView;
                RecyclerView recyclerView;
                RecyclerView.a adapter;
                this.f90804a.f90802a.h().f90450b = this.f90805b;
                com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", this.f90806c);
                new com.bytedance.tux.g.b(this.f90804a.f90803b).e(R.string.bti).b();
                View view = this.f90804a.f90802a.getView();
                if (!(view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.a8f)) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    adapter.notifyItemChanged(0);
                }
                View view2 = this.f90804a.f90802a.getView();
                if (view2 != null && (textView = (TextView) view2.findViewById(R.id.cs_)) != null) {
                    textView.setText(this.f90805b);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.ui.ah.b
        public final void a(String str) {
            h.f.b.l.d(str, "");
            if (this.f90802a.f90771e != null) {
                r.a("change_collection_name_save", v.a("collection_video", "enter_from"), v.a(this.f90802a.f90771e, "collection_id"));
                com.ss.android.ugc.aweme.favorites.api.f fVar = new com.ss.android.ugc.aweme.favorites.api.f(3, this.f90802a.f90771e, str, null, null, null, null, null, 248);
                f.a.b.b a2 = new com.ss.android.ugc.aweme.favorites.e.j().f90621b.a(fVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, str, fVar), new b(this));
                h.f.b.l.b(a2, "");
                f.a.j.a.a(a2, this.f90802a.j());
            }
        }

        n(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, androidx.fragment.app.e eVar) {
            this.f90802a = videoCollectionCollectionContentFragment;
            this.f90803b = eVar;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ androidx.fragment.app.e $activity$inlined;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$activity$inlined = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.c(R.string.b5g, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f90781a;

                static {
                    Covode.recordClassIndex(57029);
                }

                {
                    this.f90781a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    r.a("delete_collection_confirm", v.a("collection_video", "enter_from"), v.a(this.f90781a.this$0.f90771e, "collection_id"));
                    final com.ss.android.ugc.aweme.favorites.api.f fVar = new com.ss.android.ugc.aweme.favorites.api.f(2, this.f90781a.this$0.f90771e, null, null, null, null, null, null, 252);
                    f.a.b.b a2 = new com.ss.android.ugc.aweme.favorites.e.j().f90621b.a(fVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.e.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f90782a;

                        static {
                            Covode.recordClassIndex(57030);
                        }

                        {
                            this.f90782a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", fVar);
                            this.f90782a.f90781a.this$0.f();
                        }
                    }, new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.e.AnonymousClass1.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f90784a;

                        static {
                            Covode.recordClassIndex(57031);
                        }

                        {
                            this.f90784a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            new com.bytedance.tux.g.b(this.f90784a.f90781a.$activity$inlined).e(R.string.bp3).b();
                        }
                    });
                    h.f.b.l.b(a2, "");
                    f.a.j.a.a(a2, this.f90781a.this$0.j());
                    aVar2.a().dismiss();
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>() {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(57032);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    aVar2.a().dismiss();
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ androidx.fragment.app.e $activity$inlined;
        final /* synthetic */ Aweme $aweme$inlined;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, androidx.fragment.app.e eVar, Aweme aweme) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$activity$inlined = eVar;
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.fbo, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f90796a;

                static {
                    Covode.recordClassIndex(57046);
                }

                {
                    this.f90796a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    com.ss.android.ugc.aweme.favorites.e.k kVar = new com.ss.android.ugc.aweme.favorites.e.j().f90621b;
                    String aid = this.f90796a.$aweme$inlined.getAid();
                    h.f.b.l.b(aid, "");
                    f.a.b.b a2 = kVar.b(aid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.j.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f90797a;

                        static {
                            Covode.recordClassIndex(57047);
                        }

                        {
                            this.f90797a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            long j2;
                            Long l2;
                            com.ss.android.ugc.aweme.account.b.a();
                            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                            h.f.b.l.b(e2, "");
                            r.a("cancel_favourite_video", v.a("collection_video", "enter_from"), v.a("unavailable_popup", "enter_method"), v.a(this.f90797a.f90796a.$aweme$inlined.getAuthorUid(), "author_id"), v.a(this.f90797a.f90796a.$aweme$inlined.getAid(), "aweme_id"), v.a(e2.getCurUserId(), "user_id"));
                            d.a aVar = this.f90797a.f90796a.this$0.h().f90453e;
                            if (aVar == null || (l2 = aVar.f90454a) == null) {
                                j2 = 0;
                            } else {
                                j2 = l2.longValue();
                            }
                            d.a aVar2 = this.f90797a.f90796a.this$0.h().f90453e;
                            if (aVar2 != null) {
                                aVar2.f90454a = Long.valueOf(j2 - 1);
                            }
                            this.f90797a.f90796a.this$0.i().d(true);
                            com.ss.android.ugc.aweme.favorites.viewmodel.f.a("COLLECTION_LIST", new com.ss.android.ugc.aweme.favorites.api.f(3, null, null, null, null, null, null, null, 254));
                        }
                    }, new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.j.AnonymousClass1.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f90798a;

                        static {
                            Covode.recordClassIndex(57048);
                        }

                        {
                            this.f90798a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            new com.bytedance.tux.g.b(this.f90798a.f90796a.$activity$inlined).e(R.string.bp3).b();
                        }
                    });
                    h.f.b.l.b(a2, "");
                    f.a.j.a.a(a2, this.f90796a.this$0.j());
                    aVar2.a().dismiss();
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>() {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.j.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(57049);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    h.f.b.l.d(aVar2, "");
                    aVar2.a().dismiss();
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Assembler, h.z> {
        final /* synthetic */ View $view;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, View view) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(57053);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    h.f.b.l.d(iVar2, "");
                    iVar2.a(this.this$0.this$0.h());
                    return h.z.f158842a;
                }
            });
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>) AnonymousClass2.f90801a);
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.m.AnonymousClass3 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(57055);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    h.f.b.l.d(iVar2, "");
                    boolean z = true;
                    if (this.this$0.this$0.f90775i <= 1) {
                        z = false;
                    }
                    iVar2.a(new h.e(z));
                    return h.z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.m.AnonymousClass4 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(57056);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view;
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.favorites.c.h.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.favorites.c.h();
                    return h.z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, h.z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.m.AnonymousClass5 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(57057);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(q qVar) {
                    q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.a8f);
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.favorites.c.f.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.favorites.c.f();
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, h.z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
            if (r4 == null) goto L_0x0035;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d r8) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.favorites.viewmodel.d r8 = (com.ss.android.ugc.aweme.favorites.viewmodel.d) r8
                java.lang.String r0 = ""
                h.f.b.l.d(r8, r0)
                com.bytedance.assem.arch.extensions.f<java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.a>> r0 = r8.f91007a
                java.lang.Object r1 = r0.a()
                java.util.List r1 = (java.util.List) r1
                r0 = 1
                if (r1 == 0) goto L_0x0035
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r1.iterator()
            L_0x001b:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0031
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.favorites.viewmodel.a r0 = (com.ss.android.ugc.aweme.favorites.viewmodel.a) r0
                int r1 = r0.f91002b
                r0 = 2
                if (r1 != r0) goto L_0x001b
                r4.add(r2)
                goto L_0x001b
            L_0x0031:
                java.util.List r4 = (java.util.List) r4
                if (r4 != 0) goto L_0x0037
            L_0x0035:
                h.a.z r4 = h.a.z.INSTANCE
            L_0x0037:
                com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment r0 = r7.this$0
                java.lang.String r3 = r0.f90771e
                androidx.fragment.app.e r1 = r7.$activity
                r2 = 1
                com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment r0 = r7.this$0
                int r0 = r0.f90775i
                int r5 = r0 + -1
                com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$g$1 r6 = new com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$g$1
                r6.<init>(r7, r4)
                java.lang.String r4 = "collection_video"
                com.ss.android.ugc.aweme.favorites.ui.ae.a.a(r1, r2, r3, r4, r5, r6)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment.g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, h.z> {
        final /* synthetic */ z.a $inManage;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, z.a aVar) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$inManage = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            boolean z;
            com.ss.android.ugc.aweme.favorites.viewmodel.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            z.a aVar = this.$inManage;
            List<com.ss.android.ugc.aweme.favorites.viewmodel.a> a2 = dVar2.f91007a.a();
            if (a2 != null) {
                z = true;
                if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                    Iterator<T> it = a2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f91002b != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
            aVar.element = z;
            if (this.$inManage.element) {
                this.this$0.i().a(false);
            }
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, h.z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ View $itemView;
        final /* synthetic */ VideoCollectionCollectionContentFragment this$0;

        static {
            Covode.recordClassIndex(57044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, View view, Aweme aweme) {
            super(1);
            this.this$0 = videoCollectionCollectionContentFragment;
            this.$itemView = view;
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            ArrayList arrayList;
            boolean z;
            com.ss.android.ugc.aweme.favorites.viewmodel.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            List<com.ss.android.ugc.aweme.favorites.viewmodel.a> a2 = dVar2.f91007a.a();
            Boolean bool = null;
            if (a2 != null) {
                ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) a2, 10));
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().f91001a);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            List<com.ss.android.ugc.aweme.favorites.viewmodel.a> a3 = dVar2.f91007a.a();
            boolean z2 = false;
            if (a3 != null) {
                if (!(a3 instanceof Collection) || !a3.isEmpty()) {
                    Iterator<T> it2 = a3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().f91002b != 0) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            }
            boolean z3 = dVar2.f91009c;
            com.ss.android.ugc.aweme.profile.presenter.q<?, ?> d2 = ae.f115954a.d();
            d2.a(arrayList, z3);
            d2.a(this.this$0.f90771e);
            com.ss.android.ugc.aweme.feed.x.ae.f95296a = d2;
            View view = this.$itemView;
            androidx.core.app.b b2 = androidx.core.app.b.b(view, view.getWidth(), this.$itemView.getHeight());
            h.f.b.l.b(b2, "");
            SmartRoute buildRoute = SmartRouter.buildRoute(this.this$0.getActivity(), "aweme://aweme/detail/");
            Bundle bundle = new Bundle();
            bundle.putString("id", this.$aweme.getAid());
            bundle.putString("video_from", "from_profile_other");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            bundle.putString("userid", g2.getCurUserId());
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            bundle.putString("sec_userid", g3.getCurSecUserId());
            bundle.putString("refer", "collection_video");
            bundle.putInt("video_type", 4);
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            bundle.putBoolean("is_clean_mode", z2);
            buildRoute.withParam(bundle).withBundleAnimation(b2.a()).withParam("activity_has_activity_options", true).open();
            return h.z.f158842a;
        }
    }

    private static <VM1 extends AssemViewModel<S1>, S1 extends com.bytedance.assem.arch.viewModel.j, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) h.a.a(vm1, bVar);
    }

    @Override // com.ss.android.ugc.aweme.favorites.f.a, com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f90777k = new com.ss.android.ugc.aweme.favorites.api.d(this.f90771e, this.f90772f, new d.b(this.f90774h), new d.a(this.f90773g, 2), 4);
        com.bytedance.assem.arch.extensions.d.a(this, new m(this, view));
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.f.g
    public final void a(View view, Aweme aweme) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(aweme, "");
        a(i(), new i(this, view, aweme));
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }
}
