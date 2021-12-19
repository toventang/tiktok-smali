package com.ss.android.ugc.aweme.relation.recommend;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.z;
import h.p;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class n extends com.ss.android.ugc.aweme.base.arch.b {

    /* renamed from: d  reason: collision with root package name */
    public static final d f120449d = new d((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public m f120450b;

    /* renamed from: c  reason: collision with root package name */
    public l f120451c;

    /* renamed from: e  reason: collision with root package name */
    private final lifecycleAwareLazy f120452e;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f120453j = h.i.a((h.f.a.a) m.f120466a);

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f120454k;

    public static final class b extends h.f.b.m implements h.f.a.m<SocialRecRequestState, Bundle, SocialRecRequestState> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(78398);
        }

        public b() {
            super(2);
        }

        public final SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState, Bundle bundle) {
            h.f.b.l.c(socialRecRequestState, "");
            return socialRecRequestState;
        }
    }

    static {
        Covode.recordClassIndex(78396);
    }

    private final SocialRecRequestViewModel c() {
        return (SocialRecRequestViewModel) this.f120452e.getValue();
    }

    private final String e() {
        return (String) this.f120453j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.f120454k == null) {
            this.f120454k = new SparseArray();
        }
        View view = (View) this.f120454k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f120454k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.f120454k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class d {
        static {
            Covode.recordClassIndex(78401);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        public static n a(m mVar) {
            h.f.b.l.d(mVar, "");
            n nVar = new n();
            Bundle bundle = new Bundle();
            bundle.putSerializable("recommendFriendsConfig", mVar);
            nVar.setArguments(bundle);
            return nVar;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78397);
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

    static final class m extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f120466a = new m();

        static {
            Covode.recordClassIndex(78412);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            return g2.getCurUserId();
        }
    }

    public final void b() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ((SocialRecFlowModel) ae.a(activity, (ad.b) null).a(SocialRecFlowModel.class)).f120503b.postValue(new Bundle());
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<SocialRecRequestViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel invoke() {
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel> r0 = com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.relation.recommend.n$c$1 r0 = new com.ss.android.ugc.aweme.relation.recommend.n$c$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recommend.n.c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f120462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f120463b;

        static {
            Covode.recordClassIndex(78409);
        }

        j(n nVar, h.f.a.a aVar) {
            this.f120462a = nVar;
            this.f120463b = aVar;
        }

        public final void run() {
            if (this.f120462a.ab_()) {
                RecyclerView recyclerView = (RecyclerView) this.f120462a.a(R.id.drm);
                h.f.b.l.b(recyclerView, "");
                if (recyclerView.getAdapter() != null) {
                    this.f120463b.invoke();
                }
            }
        }
    }

    public n() {
        h.k.c a2 = h.f.b.ab.a(SocialRecRequestViewModel.class);
        a aVar = new a(a2);
        this.f120452e = new lifecycleAwareLazy(this, aVar, new c(this, aVar, a2, b.INSTANCE));
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ z.c $verticalScrollRange;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(78411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(n nVar, z.c cVar) {
            super(0);
            this.this$0 = nVar;
            this.$verticalScrollRange = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            z.c cVar = this.$verticalScrollRange;
            RecyclerView recyclerView = (RecyclerView) this.this$0.a(R.id.drm);
            h.f.b.l.b(recyclerView, "");
            RecyclerView recyclerView2 = (RecyclerView) this.this$0.a(R.id.drm);
            h.f.b.l.b(recyclerView2, "");
            RecyclerView.a adapter = recyclerView2.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.recommend.SocialRecommendFriendsAdapter");
            RecyclerView recyclerView3 = (RecyclerView) this.this$0.a(R.id.drm);
            h.f.b.l.b(recyclerView3, "");
            RecyclerView.i layoutManager = recyclerView3.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            cVar.element = n.a(recyclerView, (l) adapter, (LinearLayoutManager) layoutManager);
            int i2 = this.$verticalScrollRange.element;
            RecyclerView recyclerView4 = (RecyclerView) this.this$0.a(R.id.drm);
            h.f.b.l.b(recyclerView4, "");
            if (i2 > recyclerView4.getHeight()) {
                View a2 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a2, "");
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                RecyclerView recyclerView5 = (RecyclerView) this.this$0.a(R.id.drm);
                h.f.b.l.b(recyclerView5, "");
                float height = (float) recyclerView5.getHeight();
                RecyclerView recyclerView6 = (RecyclerView) this.this$0.a(R.id.drm);
                h.f.b.l.b(recyclerView6, "");
                TextTitleBar textTitleBar = (TextTitleBar) this.this$0.a(R.id.em8);
                h.f.b.l.b(textTitleBar, "");
                layoutParams.height = ((int) ((height * (((float) recyclerView6.getHeight()) + 0.0f)) / ((float) this.$verticalScrollRange.element))) - textTitleBar.getHeight();
                View a3 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a3, "");
                View a4 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a4, "");
                a3.setLayoutParams(a4.getLayoutParams());
                View a5 = this.this$0.a(R.id.dta);
                h.f.b.l.b(a5, "");
                a5.setVisibility(0);
            }
            return h.z.f158842a;
        }
    }

    public static final class h extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public int f120457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f120458b;

        static {
            Covode.recordClassIndex(78407);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(n nVar) {
            this.f120458b = nVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f120457a += i3;
            if (this.f120458b.ab_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f120458b.a(R.id.em8);
                h.f.b.l.b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f120458b.a(R.id.em8);
                    h.f.b.l.b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f120458b.a(R.id.em8);
                    h.f.b.l.b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f120457a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    public static final /* synthetic */ m a(n nVar) {
        m mVar = nVar.f120450b;
        if (mVar == null) {
            h.f.b.l.a("config");
        }
        return mVar;
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f120464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f120465b;

        static {
            Covode.recordClassIndex(78410);
        }

        k(n nVar, long j2) {
            this.f120464a = nVar;
            this.f120465b = j2;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                long currentTimeMillis = System.currentTimeMillis() - this.f120465b;
                int socialRecType = n.a(this.f120464a).getSocialRecType();
                h.f.b.l.d("next", "");
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (socialRecType == 2) {
                    str = "facebook";
                } else {
                    str = "contact";
                }
                r.a("confirm_rec_page", dVar.a("platform", str).a("result", "next").a("duration", currentTimeMillis).f66730a);
                com.ss.android.ugc.aweme.relation.b.b.b(n.a(this.f120464a).getSocialRecType(), com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue());
                this.f120464a.b();
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, FriendList<? extends User>, h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(78406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, FriendList<? extends User> friendList) {
            FriendList<? extends User> friendList2 = friendList;
            h.f.b.l.d(iVar, "");
            if (friendList2 != null) {
                ((TuxDualBallView) this.this$0.a(R.id.chl)).c();
                l lVar = this.this$0.f120451c;
                if (lVar != null) {
                    List<? extends User> friends = friendList2.getFriends();
                    h.f.b.l.b(friends, "");
                    h.f.b.l.d(friends, "");
                    lVar.f120444a.clear();
                    lVar.f120444a.add(new b(lVar.f120447d.getFirst(), lVar.f120447d.getSecond()));
                    List<k> list = lVar.f120444a;
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) friends, 10));
                    Iterator<T> it = friends.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new a(it.next()));
                    }
                    list.addAll(arrayList);
                    lVar.notifyDataSetChanged();
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        com.ss.android.ugc.aweme.relation.viewmodel.e eVar;
        List<? extends User> list;
        String str;
        List<? extends User> friends;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        String e2 = e();
        if (e2 == null || e2.length() == 0) {
            b();
            return;
        }
        Bundle arguments = getArguments();
        FriendList<? extends User> friendList = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("recommendFriendsConfig");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof m)) {
            serializable = null;
        }
        m mVar = (m) serializable;
        if (mVar == null) {
            b();
            return;
        }
        this.f120450b = mVar;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            eVar = ((SocialRecFlowModel) ae.a(activity, (ad.b) null).a(SocialRecFlowModel.class)).f120502a.getValue();
        } else {
            eVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.drm);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.drm);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        com.bytedance.ies.dmt.ui.f.c.a(a(R.id.ux), 0.75f);
        ((RecyclerView) a(R.id.drm)).a(new h(this));
        if (eVar != null) {
            friendList = eVar.f120574b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        z.c cVar = new z.c();
        cVar.element = -1;
        z.c cVar2 = new z.c();
        cVar2.element = 0;
        ((RecyclerView) a(R.id.drm)).a(new i(this, cVar2, cVar));
        ((RecyclerView) a(R.id.drm)).post(new j(this, new l(this, cVar)));
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.drm);
        h.f.b.l.b(recyclerView3, "");
        getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        m mVar2 = this.f120450b;
        if (mVar2 == null) {
            h.f.b.l.a("config");
        }
        String title = mVar2.getTitle();
        m mVar3 = this.f120450b;
        if (mVar3 == null) {
            h.f.b.l.a("config");
        }
        String subTitle = mVar3.getSubTitle();
        m mVar4 = this.f120450b;
        if (mVar4 == null) {
            h.f.b.l.a("config");
        }
        int socialRecType = mVar4.getSocialRecType();
        p pVar = new p(title, subTitle);
        if (friendList == null || (list = friendList.getFriends()) == null) {
            list = h.a.z.INSTANCE;
        }
        this.f120451c = new l(socialRecType, pVar, list);
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.drm);
        h.f.b.l.b(recyclerView4, "");
        recyclerView4.setAdapter(this.f120451c);
        ((com.bytedance.ies.dmt.ui.titlebar.a) a(R.id.em8)).setTitle(title);
        TuxButton tuxButton = (TuxButton) a(R.id.ux);
        h.f.b.l.b(tuxButton, "");
        m mVar5 = this.f120450b;
        if (mVar5 == null) {
            h.f.b.l.a("config");
        }
        tuxButton.setText(mVar5.getButtonText());
        ((TuxButton) a(R.id.ux)).setOnClickListener(new k(this, currentTimeMillis));
        if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
            f.a.b.b unused = selectSubscribe(c(), o.f120467a, p.f120468a, new ah(), new e(this));
            f.a.b.b unused2 = selectSubscribe(c(), q.f120469a, r.f120470a, new ah(), new f(this));
            f.a.b.b unused3 = selectSubscribe(c(), s.f120471a, new ah(), new g(this));
            TuxDualBallView tuxDualBallView = (TuxDualBallView) a(R.id.chl);
            tuxDualBallView.setVisibility(0);
            tuxDualBallView.b();
            SocialRecRequestViewModel c2 = c();
            String e3 = e();
            h.f.b.l.b(e3, "");
            m mVar6 = this.f120450b;
            if (mVar6 == null) {
                h.f.b.l.a("config");
            }
            c2.a(e3, mVar6.getSocialRecType(), com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue(), "auto");
        }
        m mVar7 = this.f120450b;
        if (mVar7 == null) {
            h.f.b.l.a("config");
        }
        int socialRecType2 = mVar7.getSocialRecType();
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        if (socialRecType2 == 2) {
            str = "facebook";
        } else {
            str = "contact";
        }
        r.a("show_rec_page", dVar.a("platform", str).f66730a);
    }

    public static final class i extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f120459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f120460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f120461c;

        static {
            Covode.recordClassIndex(78408);
        }

        i(n nVar, z.c cVar, z.c cVar2) {
            this.f120459a = nVar;
            this.f120460b = cVar;
            this.f120461c = cVar2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            this.f120460b.element += i3;
            if (i3 != 0 && this.f120459a.ab_() && this.f120461c.element != -1) {
                int i4 = this.f120461c.element;
                RecyclerView recyclerView2 = (RecyclerView) this.f120459a.a(R.id.drm);
                h.f.b.l.b(recyclerView2, "");
                int height = i4 - recyclerView2.getHeight();
                RecyclerView recyclerView3 = (RecyclerView) this.f120459a.a(R.id.drm);
                h.f.b.l.b(recyclerView3, "");
                int height2 = recyclerView3.getHeight();
                View a2 = this.f120459a.a(R.id.dta);
                h.f.b.l.b(a2, "");
                int height3 = height2 - a2.getHeight();
                View a3 = this.f120459a.a(R.id.dta);
                h.f.b.l.b(a3, "");
                float f2 = ((((float) this.f120460b.element) * 1.0f) / ((float) height)) * ((float) height3);
                TextTitleBar textTitleBar = (TextTitleBar) this.f120459a.a(R.id.em8);
                h.f.b.l.b(textTitleBar, "");
                a3.setY(f2 + ((float) textTitleBar.getHeight()));
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a29, viewGroup, false);
    }

    static final class e extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Boolean, Boolean, h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(78402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(3);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue && booleanValue2) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.bgb).b();
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.relation.recommend.n.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f120455a;

                    static {
                        Covode.recordClassIndex(78403);
                    }

                    {
                        this.f120455a = r1;
                    }

                    public final void run() {
                        this.f120455a.this$0.b();
                    }
                }, 1000);
            }
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements q<com.bytedance.jedi.arch.i, Boolean, Boolean, h.z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(78404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(n nVar) {
            super(3);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            h.f.b.l.d(iVar, "");
            if (booleanValue && booleanValue2) {
                new com.bytedance.tux.g.b(this.this$0).a(n.a(this.this$0).getToast()).b();
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.relation.recommend.n.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f120456a;

                    static {
                        Covode.recordClassIndex(78405);
                    }

                    {
                        this.f120456a = r1;
                    }

                    public final void run() {
                        this.f120456a.this$0.b();
                    }
                }, 1000);
            }
            return h.z.f158842a;
        }
    }

    public static int a(RecyclerView recyclerView, RecyclerView.a<? extends RecyclerView.ViewHolder> aVar, LinearLayoutManager linearLayoutManager) {
        int n = linearLayoutManager.n();
        View g2 = linearLayoutManager.g(n);
        View g3 = linearLayoutManager.g(0);
        if (g2 == null || g3 == null || n <= 0 || !(recyclerView.a(g3) instanceof c)) {
            return -1;
        }
        return (int) ((((((float) (aVar.getItemCount() - 1)) * 1.0f) / ((float) n)) * ((float) (g2.getBottom() - g3.getBottom()))) + ((float) g3.getHeight()));
    }
}
