package com.ss.android.ugc.aweme.following.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.ss.android.ugc.aweme.utils.fo;
import com.ss.android.ugc.aweme.utils.gh;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class g extends a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: l  reason: collision with root package name */
    public FollowListAdapter f96507l;

    /* renamed from: m  reason: collision with root package name */
    boolean f96508m;
    private final lifecycleAwareLazy n;
    private final lifecycleAwareLazy o;
    private SparseArray p;

    static {
        Covode.recordClassIndex(61117);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final FollowerRelationViewModel b() {
        return (FollowerRelationViewModel) this.n.getValue();
    }

    public final RecommendUserListViewModel c() {
        return (RecommendUserListViewModel) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int g() {
        return R.layout.ao0;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(g.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int i() {
        return R.string.eyl;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class j implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f96519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96521c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, h.z> f96522d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> f96523e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> f96524f;

        static {
            Covode.recordClassIndex(61139);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, h.z> a() {
            return this.f96522d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> b() {
            return this.f96523e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> c() {
            return this.f96524f;
        }

        public j(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f96519a = bVar;
            this.f96520b = mVar;
            this.f96521c = mVar2;
            this.f96522d = bVar;
            this.f96523e = mVar;
            this.f96524f = mVar2;
        }
    }

    public static final class k implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f96525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96526b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f96527c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<com.bytedance.jedi.arch.i, h.z> f96528d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> f96529e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> f96530f;

        static {
            Covode.recordClassIndex(61140);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<com.bytedance.jedi.arch.i, h.z> a() {
            return this.f96528d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> b() {
            return this.f96529e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> c() {
            return this.f96530f;
        }

        public k(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f96525a = bVar;
            this.f96526b = mVar;
            this.f96527c = mVar2;
            this.f96528d = bVar;
            this.f96529e = mVar;
            this.f96530f = mVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int r() {
        h();
        return R.string.c08;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$g  reason: collision with other inner class name */
    static final class C2326g implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f96512a;

        static {
            Covode.recordClassIndex(61134);
        }

        C2326g(g gVar) {
            this.f96512a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            g gVar = this.f96512a;
            gVar.withState(gVar.b(), new h.f.a.b<FollowerRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.g.C2326g.AnonymousClass1 */
                final /* synthetic */ C2326g this$0;

                static {
                    Covode.recordClassIndex(61135);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
                    List<Object> recommendList;
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    h.f.b.l.d(followerRelationState2, "");
                    if (followerRelationState2.getListState().getPayload().f96369c != 0 || ((recommendList = followerRelationState2.getRecommendList()) != null && !recommendList.isEmpty())) {
                        g gVar = this.this$0.f96512a;
                        gVar.withState(gVar.b(), new ae(gVar));
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final String j() {
        if (h()) {
            return "fans";
        }
        return "other_fans";
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final void p() {
        b().f96626c.refresh();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int q() {
        if (h()) {
            return R.string.c09;
        }
        return R.string.c0_;
    }

    public final String t() {
        return (String) withState(b(), i.f96518a);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final boolean l() {
        return ((Boolean) withState(b(), new af(this))).booleanValue();
    }

    public final boolean m() {
        if (h()) {
            return ((Boolean) withState(b(), new e(this))).booleanValue();
        }
        return false;
    }

    public final boolean s() {
        return ((Boolean) withState(b(), f.f96511a)).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) withState(b(), ab.f96509a)).booleanValue();
    }

    public final void w() {
        ((DmtStatusView) a(R.id.e_o)).d();
        ((DmtStatusView) a(R.id.e_o)).g();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<FollowerRelationViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_following_ui_FollowerRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel> r0 = com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.g$b$1 r0 = new com.ss.android.ugc.aweme.following.ui.g$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.g.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_following_ui_FollowerRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<RecommendUserListViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_following_ui_FollowerRelationFragment$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel> r0 = com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.g$d$1 r0 = new com.ss.android.ugc.aweme.following.ui.g$d$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.g.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_aweme_following_ui_FollowerRelationFragment$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public g() {
        ac acVar = new ac(this);
        h.k.c a2 = h.f.b.ab.a(FollowerRelationViewModel.class);
        a aVar = new a(a2);
        this.n = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, acVar));
        ad adVar = new ad(this);
        h.k.c a3 = h.f.b.ab.a(RecommendUserListViewModel.class);
        c cVar = new c(a3);
        this.o = new lifecycleAwareLazy(this, cVar, new d(this, cVar, a3, adVar));
    }

    public final void u() {
        FollowListAdapter followListAdapter = this.f96507l;
        if (followListAdapter == null) {
            h.f.b.l.a("mFollowerListAdapter");
        }
        followListAdapter.ai_();
        if (this.f96508m) {
            return;
        }
        if (v() || !s()) {
            FollowListAdapter followListAdapter2 = this.f96507l;
            if (followListAdapter2 == null) {
                h.f.b.l.a("mFollowerListAdapter");
            }
            followListAdapter2.ah_();
            return;
        }
        b().a(t());
        this.f96508m = true;
    }

    public static final class h implements fo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f96513a;

        static {
            Covode.recordClassIndex(61136);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ User f96514a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f96515b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ fo f96516c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f96517d;

            static {
                Covode.recordClassIndex(61137);
            }

            a(User user, h hVar, fo foVar, int i2) {
                this.f96514a = user;
                this.f96515b = hVar;
                this.f96516c = foVar;
                this.f96517d = i2;
            }

            public final void run() {
                String str;
                if (this.f96515b.f96513a.h()) {
                    str = "fans";
                } else {
                    str = "other_fans";
                }
                com.ss.android.ugc.aweme.common.r.a("fan_list_user_show", h.v.a(str, "enter_from"), h.v.a(this.f96514a.getRequestId(), "req_id"), h.v.a(this.f96514a.getUid(), "to_user_id"), h.v.a(Integer.valueOf(this.f96517d), "impr_order"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(g gVar) {
            this.f96513a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.fo.a
        public final void a(int i2, fo foVar) {
            User user;
            h.f.b.l.d(foVar, "");
            Object a2 = g.a(this.f96513a).a(i2);
            if (a2 instanceof com.ss.android.ugc.aweme.following.a.g) {
                com.ss.android.ugc.aweme.following.a.g gVar = (com.ss.android.ugc.aweme.following.a.g) a2;
                if (gVar.f96342a == 1 && (user = gVar.f96343b) != null) {
                    String uid = user.getUid();
                    h.f.b.l.b(uid, "");
                    foVar.a(uid, new a(user, this, foVar, i2));
                }
            }
        }
    }

    static final class z extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<RecommendUserListState, com.ss.android.ugc.aweme.recommend.viewmodel.a> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f96534a = new a();

            static {
                Covode.recordClassIndex(61160);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ com.ss.android.ugc.aweme.recommend.viewmodel.a invoke(RecommendUserListState recommendUserListState) {
                RecommendUserListState recommendUserListState2 = recommendUserListState;
                h.f.b.l.d(recommendUserListState2, "");
                return recommendUserListState2.getRecommendMobParams();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar2, "");
            if (booleanValue) {
                g.a(this.this$0).ai_();
            } else if (this.this$0.m()) {
                if (!this.this$0.v()) {
                    com.ss.android.ugc.aweme.recommend.viewmodel.a aVar = (com.ss.android.ugc.aweme.recommend.viewmodel.a) iVar2.withState(this.this$0.c(), a.f96534a);
                    RecommendUserListViewModel c2 = this.this$0.c();
                    String str = aVar.f120183a;
                    String str2 = aVar.f120184b;
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(str2, "");
                    h.f.b.l.d("nonempty", "");
                    com.ss.android.ugc.aweme.recommend.viewmodel.a aVar2 = new com.ss.android.ugc.aweme.recommend.viewmodel.a(str, str2, "nonempty");
                    h.f.b.l.d(aVar2, "");
                    c2.c(new RecommendUserListViewModel.i(aVar2));
                }
                g gVar = this.this$0;
                FollowListAdapter followListAdapter = gVar.f96507l;
                if (followListAdapter == null) {
                    h.f.b.l.a("mFollowerListAdapter");
                }
                followListAdapter.ai_();
                if (!gVar.v() && !gVar.f96508m && gVar.s()) {
                    gVar.b().a(gVar.t());
                    gVar.f96508m = true;
                }
                this.this$0.c().k();
            } else if (this.this$0.l()) {
                g gVar2 = this.this$0;
                FollowListAdapter followListAdapter2 = gVar2.f96507l;
                if (followListAdapter2 == null) {
                    h.f.b.l.a("mFollowerListAdapter");
                }
                followListAdapter2.ai_();
                if (gVar2.v() || gVar2.f96508m || !gVar2.s()) {
                    FollowerRelationViewModel b2 = gVar2.b();
                    b2.b_(new FollowerRelationViewModel.i(b2));
                } else {
                    FollowerRelationViewModel b3 = gVar2.b();
                    String t = gVar2.t();
                    h.f.b.l.d(t, "");
                    b3.b_(new FollowerRelationViewModel.g(b3, t));
                    gVar2.f96508m = true;
                }
                g.a(this.this$0).ai_();
            } else if (!this.this$0.v()) {
                this.this$0.u();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<FollowerRelationState, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f96511a = new f();

        static {
            Covode.recordClassIndex(61133);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            return Boolean.valueOf(followerRelationState2.isHotsoonHasMore());
        }
    }

    public static final /* synthetic */ FollowListAdapter a(g gVar) {
        FollowListAdapter followListAdapter = gVar.f96507l;
        if (followListAdapter == null) {
            h.f.b.l.a("mFollowerListAdapter");
        }
        return followListAdapter;
    }

    static final class af extends h.f.b.m implements h.f.a.b<FollowerRelationState, Boolean> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            return Boolean.valueOf(this.this$0.a(followerRelationState2.getListState()));
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ag f96510a = new ag();

        static {
            Covode.recordClassIndex(61126);
        }

        ag() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_lock;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<FollowerRelationState, Boolean> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            followerRelationState2.getListState().getList().size();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<FollowerRelationState, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f96518a = new i();

        static {
            Covode.recordClassIndex(61138);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            if (followerRelationState2.getHotsoonText().length() == 0) {
                return "Unable to view more followers due to this user's privacy setting";
            }
            return followerRelationState2.getHotsoonText();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            ((DmtStatusView) this.this$0.a(R.id.e_o)).f();
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            g.a(this.this$0).ag_();
            return h.z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            iVar2.withState(this.this$0.b(), new h.f.a.b<FollowerRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.g.w.AnonymousClass1 */
                final /* synthetic */ w this$0;

                static {
                    Covode.recordClassIndex(61155);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    h.f.b.l.d(followerRelationState2, "");
                    if (followerRelationState2.getListState().isEmpty().f39447a) {
                        ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).f();
                    } else {
                        g.a(this.this$0.this$0).ag_();
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ab extends h.f.b.m implements h.f.a.b<FollowerRelationState, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f96509a = new ab();

        static {
            Covode.recordClassIndex(61121);
        }

        ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            List<Object> a2;
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            List<Object> a3 = followerRelationState2.getListState().getRefresh().a();
            boolean z = false;
            if ((a3 == null || a3.isEmpty()) && ((a2 = followerRelationState2.getListState().getLoadMore().a()) == null || a2.isEmpty())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.b<FollowerRelationState, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            h.f.b.l.d(followerRelationState2, "");
            List<Object> recommendList = followerRelationState2.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                this.this$0.b().f96626c.loadMore();
            } else {
                this.this$0.c().l();
            }
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            if (this.this$0.v()) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).f();
            } else {
                g.a(this.this$0).ag_();
            }
            return h.z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        h.f.b.l.d(aVar, "");
        String str = aVar.f68097a;
        if (str == null) {
            return;
        }
        if (h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/follower/list/?", false) || h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/following/list/?", false)) {
            EventBus.a().d(aVar);
            p();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            if (this.this$0.v()) {
                this.this$0.w();
            } else {
                this.this$0.u();
            }
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            g.a(this.this$0).j();
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            g.a(this.this$0).j();
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list, "");
            iVar2.withState(this.this$0.b(), new h.f.a.b<FollowerRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.g.y.AnonymousClass1 */
                final /* synthetic */ y this$0;

                static {
                    Covode.recordClassIndex(61158);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    h.f.b.l.d(followerRelationState2, "");
                    if (!this.this$0.this$0.b().a(followerRelationState2.getListState().getPayload().f39459a.f39447a, followerRelationState2.getListState().getPayload().f96371e, followerRelationState2.getListState().getPayload().f96372f)) {
                        if (!this.this$0.this$0.v() || this.this$0.this$0.m()) {
                            ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).d();
                        } else {
                            this.this$0.this$0.w();
                        }
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(iVar2, "");
            if (booleanValue && !this.this$0.m()) {
                iVar2.withState(this.this$0.b(), new h.f.a.b<FollowerRelationState, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.g.aa.AnonymousClass1 */
                    final /* synthetic */ aa this$0;

                    static {
                        Covode.recordClassIndex(61120);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
                        FollowerRelationState followerRelationState2 = followerRelationState;
                        h.f.b.l.d(followerRelationState2, "");
                        if (followerRelationState2.getListState().isEmpty().f39447a && !followerRelationState2.getListState().getPayload().f39459a.f39447a && ((followerRelationState2.getListState().getLoadMore() instanceof aj) || (followerRelationState2.getListState().getRefresh() instanceof aj))) {
                            this.this$0.this$0.w();
                        }
                        return h.z.f158842a;
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.m<FollowerRelationState, Bundle, FollowerRelationState> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState, Bundle bundle) {
            String secUid;
            FollowerRelationState followerRelationState2 = followerRelationState;
            String str = "";
            h.f.b.l.d(followerRelationState2, str);
            String str2 = ((a) this.this$0).f96384b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.this$0.f96385c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return FollowerRelationState.copy$default(followerRelationState2, str2, str, null, null, false, 0, null, null, null, 508, null);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Object>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Object> list) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            List<? extends Object> list2 = list;
            h.f.b.l.d(iVar2, "");
            h.f.b.l.d(list2, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list2)) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
            }
            iVar2.withState(this.this$0.b(), new h.f.a.b<FollowerRelationState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.g.v.AnonymousClass1 */
                final /* synthetic */ v this$0;

                static {
                    Covode.recordClassIndex(61153);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    h.f.b.l.d(followerRelationState2, "");
                    if (!this.this$0.this$0.b().a(followerRelationState2.getListState().getPayload().f39459a.f39447a, followerRelationState2.getListState().getPayload().f96371e, followerRelationState2.getListState().getPayload().f96372f)) {
                        if (!this.this$0.this$0.v() || this.this$0.this$0.m()) {
                            ((DmtStatusView) this.this$0.this$0.a(R.id.e_o)).d();
                        } else {
                            this.this$0.this$0.w();
                        }
                    }
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.m<RecommendUserListState, Bundle, RecommendUserListState> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState, Bundle bundle) {
            String secUid;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            String str = "";
            h.f.b.l.d(recommendUserListState2, str);
            String str2 = ((a) this.this$0).f96384b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.this$0.f96385c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return RecommendUserListState.copy$default(recommendUserListState2, str2, str, this.this$0.h(), 14, null, new com.ss.android.ugc.aweme.recommend.viewmodel.a(this.this$0.j(), this.this$0.k(), "empty"), null, 80, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            String str;
            List<? extends User> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            if (this.this$0.v() && list2.isEmpty()) {
                this.this$0.w();
            } else if (this.this$0.v()) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
                FollowerRelationViewModel b2 = this.this$0.b();
                if (this.this$0.s()) {
                    str = this.this$0.t();
                } else {
                    str = "";
                }
                h.f.b.l.d(str, "");
                b2.b_(new FollowerRelationViewModel.f(b2, str));
            }
            return h.z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (T t : list2) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                T t2 = t;
                if (t2 instanceof RecommendContact) {
                    arrayList.add(t2);
                } else {
                    String requestId = t2.getRequestId();
                    h.f.b.l.b(requestId, "");
                    arrayList.add(new com.ss.android.ugc.aweme.following.a.g(2, t2, i3, requestId));
                    i3++;
                }
                i2 = i4;
            }
            if (!list2.isEmpty()) {
                String string = this.this$0.getResources().getString(R.string.asu);
                h.f.b.l.b(string, "");
                arrayList.add(0, new com.ss.android.ugc.aweme.following.a.f(4, string));
            }
            FollowerRelationViewModel b2 = this.this$0.b();
            h.f.b.l.d(arrayList, "");
            b2.c(new FollowerRelationViewModel.n(arrayList));
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th2, "");
            if (!(th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) || ((com.ss.android.ugc.aweme.base.api.a.a) th2).getErrorCode() != 2096) {
                g gVar = this.this$0;
                DmtStatusView dmtStatusView = (DmtStatusView) gVar.a(R.id.e_o);
                h.f.b.l.b(dmtStatusView, "");
                gVar.a(dmtStatusView, (Exception) th2);
                ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
                g.a(this.this$0).ah_();
            } else {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
                g gVar2 = this.this$0;
                TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(ag.f96510a));
                String string = gVar2.getString(R.string.evd);
                h.f.b.l.b(string, "");
                TuxStatusView.c a3 = a2.a(string);
                String string2 = gVar2.getString(R.string.exy);
                h.f.b.l.b(string2, "");
                ((TuxStatusView) gVar2.a(R.id.b8c)).setStatus(a3.a((CharSequence) string2));
                ((TuxStatusView) gVar2.a(R.id.b8c)).setLayoutVariant(0);
                TuxStatusView tuxStatusView = (TuxStatusView) gVar2.a(R.id.b8c);
                h.f.b.l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.e91);
        h.f.b.l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.e_o);
        h.f.b.l.b(dmtStatusView, "");
        a(dmtStatusView);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        RecyclerView recyclerView = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setItemAnimator(new com.ss.android.ugc.aweme.friends.ui.t());
        gh.a((RecyclerView) a(R.id.drj), 8);
        FollowListAdapter followListAdapter = new FollowListAdapter(this, "follower_relation", h());
        followListAdapter.a(this.f96388j);
        this.f96507l = followListAdapter;
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView3, "");
        followListAdapter.g(androidx.core.content.b.c(recyclerView3.getContext(), R.color.nd));
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView4, "");
        FollowListAdapter followListAdapter2 = this.f96507l;
        if (followListAdapter2 == null) {
            h.f.b.l.a("mFollowerListAdapter");
        }
        recyclerView4.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f96507l;
        if (followListAdapter3 == null) {
            h.f.b.l.a("mFollowerListAdapter");
        }
        followListAdapter3.a(new C2326g(this));
        RecyclerView recyclerView5 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView5, "");
        new fo(recyclerView5, new h(this));
        f fVar = new f(com.a.a(LayoutInflater.from(getContext()), R.layout.ano, (ViewGroup) a(R.id.drj), false), new o(((a) this).f96384b, h(), com.ss.android.ugc.aweme.following.a.a.FOLLOWER));
        h.f.b.l.b(fVar, "");
        if (fVar.f96501d && fVar.f96498a != null && !fVar.f96498a.isBlock() && !fVar.f96498a.isBlocked()) {
            FollowListAdapter followListAdapter4 = this.f96507l;
            if (followListAdapter4 == null) {
                h.f.b.l.a("mFollowerListAdapter");
            }
            View view2 = fVar.itemView;
            if (view2 != null) {
                ((com.ss.android.ugc.aweme.base.arch.h) followListAdapter4).f67990b = view2;
                followListAdapter4.notifyItemInserted(0);
            }
        }
        ListMiddleware<FollowerRelationState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware = b().f96626c;
        FollowListAdapter followListAdapter5 = this.f96507l;
        if (followListAdapter5 == null) {
            h.f.b.l.a("mFollowerListAdapter");
        }
        ListMiddleware.a(listMiddleware, this, followListAdapter5, false, new j(new l(this), new s(this), new v(this)), new k(new w(this), new x(this), new y(this)), new z(this), new aa(this), 780);
        f.a.b.b unused = selectSubscribe(b(), n.f96541a, h.f96535a, new ah(), new m(this));
        h.a.a(this, c(), i.f96536a, (ah) null, new o(this), new n(this), new p(this), 2);
        h.a.a(this, c(), j.f96537a, (ah) null, new r(this), new q(this), (h.f.a.m) null, 18);
        f.a.b.b unused2 = selectSubscribe(c(), k.f96538a, new ah(), new t(this));
        f.a.b.b unused3 = selectSubscribe(c(), l.f96539a, m.f96540a, new ah(), new u(this));
        if (!this.f96386d) {
            b().f96626c.refresh();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, ListState<Object, com.ss.android.ugc.aweme.following.repository.f>, List<? extends Object>, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(3);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState, List<? extends Object> list) {
            final ListState<Object, com.ss.android.ugc.aweme.following.repository.f> listState2 = listState;
            final List<? extends Object> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(listState2, "");
            h.f.b.l.d(list2, "");
            RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.drj);
            h.f.b.l.b(recyclerView, "");
            if (!recyclerView.l()) {
                ((RecyclerView) this.this$0.a(R.id.drj)).post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.g.m.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ m f96531a;

                    static {
                        Covode.recordClassIndex(61143);
                    }

                    {
                        this.f96531a = r1;
                    }

                    public final void run() {
                        g.a(this.f96531a.this$0).a(h.a.n.d((Collection) listState2.getList(), (Iterable) list2));
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.q<com.bytedance.jedi.arch.i, List<? extends User>, com.bytedance.jedi.arch.ext.list.b, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(g gVar) {
            super(3);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list, com.bytedance.jedi.arch.ext.list.b bVar) {
            List<? extends User> list2 = list;
            com.bytedance.jedi.arch.ext.list.b bVar2 = bVar;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            h.f.b.l.d(bVar2, "");
            if (bVar2.f39447a) {
                g.a(this.this$0).ai_();
            } else if (!this.this$0.v() || !list2.isEmpty()) {
                this.this$0.u();
            }
            return h.z.f158842a;
        }
    }
}
