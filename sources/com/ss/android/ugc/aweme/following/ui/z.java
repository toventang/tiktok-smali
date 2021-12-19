package com.ss.android.ugc.aweme.following.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.friends.ui.t;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.ss.android.ugc.aweme.utils.gh;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class z extends a {

    /* renamed from: l  reason: collision with root package name */
    public FollowListAdapter f96662l;

    /* renamed from: m  reason: collision with root package name */
    private final lifecycleAwareLazy f96663m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(61305);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
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

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final RecommendListViewModel b() {
        return (RecommendListViewModel) this.f96663m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int g() {
        return R.layout.a1q;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final String j() {
        return "suggested_list";
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int q() {
        return R.string.eya;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final int r() {
        return R.string.gai;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean z = this.f96386d;
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61306);
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

    static final class c implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f96664a;

        static {
            Covode.recordClassIndex(61309);
        }

        c(z zVar) {
            this.f96664a = zVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            z zVar = this.f96664a;
            zVar.withState(zVar.b(), new h.f.a.b<RecommendUserListState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.z.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(61310);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(RecommendUserListState recommendUserListState) {
                    h.f.b.l.d(recommendUserListState, "");
                    z zVar = this.this$0.f96664a;
                    if (!zVar.f96386d) {
                        FollowListAdapter followListAdapter = zVar.f96662l;
                        if (followListAdapter == null) {
                            h.f.b.l.a("mSuggestListAdapter");
                        }
                        followListAdapter.ag_();
                        zVar.b().l();
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        e.a.f112592a.c();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.a
    public final void p() {
        ((DmtStatusView) a(R.id.e_o)).f();
        b().k();
    }

    public static final class b extends m implements h.f.a.a<RecommendListViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(61307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_following_ui_SuggestRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.recommend.RecommendListViewModel> r0 = com.ss.android.ugc.aweme.recommend.RecommendListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.z$b$1 r0 = new com.ss.android.ugc.aweme.following.ui.z$b$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.z.b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_following_ui_SuggestRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public z() {
        l lVar = new l(this);
        h.k.c a2 = h.f.b.ab.a(RecommendListViewModel.class);
        a aVar = new a(a2);
        this.f96663m = new lifecycleAwareLazy(this, aVar, new b(this, aVar, a2, lVar));
    }

    public static final /* synthetic */ FollowListAdapter a(z zVar) {
        FollowListAdapter followListAdapter = zVar.f96662l;
        if (followListAdapter == null) {
            h.f.b.l.a("mSuggestListAdapter");
        }
        return followListAdapter;
    }

    static final class f extends m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(z zVar) {
            super(1);
            this.this$0 = zVar;
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

    static final class j extends m implements h.f.a.b<com.bytedance.jedi.arch.i, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(z zVar) {
            super(1);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar) {
            h.f.b.l.d(iVar, "");
            z.a(this.this$0).ag_();
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f96665a = new d();

        static {
            Covode.recordClassIndex(61311);
        }

        d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list, "");
            e.a.f112592a.b();
            return h.z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(z zVar) {
            super(2);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            ((DmtStatusView) this.this$0.a(R.id.e_o)).h();
            return h.z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Throwable, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(z zVar) {
            super(2);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Throwable th) {
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(th, "");
            z.a(this.this$0).j();
            return h.z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(z zVar) {
            super(2);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            ((DmtStatusView) this.this$0.a(R.id.e_o)).d();
            if (list2.isEmpty()) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).g();
            }
            com.ss.android.ugc.aweme.newfollow.c.e eVar = e.a.f112592a;
            h.f.b.l.b(eVar, "");
            if (!TextUtils.isEmpty(eVar.a())) {
                e.a.f112592a.b();
            }
            return h.z.f158842a;
        }
    }

    static final class l extends m implements h.f.a.m<RecommendUserListState, Bundle, RecommendUserListState> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(z zVar) {
            super(2);
            this.this$0 = zVar;
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
            return RecommendUserListState.copy$default(recommendUserListState2, str2, str, this.this$0.h(), 21, null, new com.ss.android.ugc.aweme.recommend.h("suggested_list", this.this$0.k(), "empty"), null, 80, null);
        }
    }

    static final class i extends m implements h.f.a.m<com.bytedance.jedi.arch.i, List<? extends User>, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(z zVar) {
            super(2);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(list2, "");
            final ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (T t : list2) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                if (t2 instanceof RecommendContact) {
                    arrayList.add(t2);
                } else {
                    String requestId = t2.getRequestId();
                    h.f.b.l.b(requestId, "");
                    arrayList.add(new com.ss.android.ugc.aweme.following.a.g(13, t2, i3, requestId));
                    i3++;
                }
                i2 = i4;
            }
            RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.drj);
            h.f.b.l.b(recyclerView, "");
            if (!recyclerView.l()) {
                ((RecyclerView) this.this$0.a(R.id.drj)).post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.z.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f96666a;

                    static {
                        Covode.recordClassIndex(61317);
                    }

                    {
                        this.f96666a = r1;
                    }

                    public final void run() {
                        z.a(this.f96666a.this$0).a(arrayList);
                    }
                });
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
        recyclerView2.setItemAnimator(new t());
        gh.a((RecyclerView) a(R.id.drj), 8);
        FollowListAdapter followListAdapter = new FollowListAdapter(this, "suggest_user", h());
        this.f96662l = followListAdapter;
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView3, "");
        followListAdapter.g(androidx.core.content.b.c(recyclerView3.getContext(), R.color.nd));
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.drj);
        h.f.b.l.b(recyclerView4, "");
        FollowListAdapter followListAdapter2 = this.f96662l;
        if (followListAdapter2 == null) {
            h.f.b.l.a("mSuggestListAdapter");
        }
        recyclerView4.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f96662l;
        if (followListAdapter3 == null) {
            h.f.b.l.a("mSuggestListAdapter");
        }
        followListAdapter3.a(new c(this));
        h.a.a(this, b(), aa.f96391a, (ah) null, new g(this), new f(this), new h(this), 2);
        f.a.b.b unused = selectSubscribe(b(), ad.f96394a, new ah(), new i(this));
        h.a.a(this, b(), ae.f96457a, (ah) null, new k(this), new j(this), d.f96665a, 2);
        f.a.b.b unused2 = selectSubscribe(b(), ab.f96392a, ac.f96393a, new ah(), new e(this));
        if (!this.f96386d) {
            b().k();
        }
    }

    static final class e extends m implements q<com.bytedance.jedi.arch.i, List<? extends User>, com.bytedance.jedi.arch.ext.list.b, h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(61312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z zVar) {
            super(3);
            this.this$0 = zVar;
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
                z.a(this.this$0).ai_();
            } else if (!list2.isEmpty()) {
                z.a(this.this$0).ah_();
            }
            return h.z.f158842a;
        }
    }
}
