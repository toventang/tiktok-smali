package com.ss.android.ugc.aweme.inbox;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.legacy.widget.Space;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.analytics.page.d;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.friends.service.ContactServiceImpl;
import com.ss.android.ugc.aweme.friends.service.IContactService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.inbox.d.g;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.inbox.f.a;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class l extends com.ss.android.ugc.aweme.base.f.a implements SwipeRefreshLayout.b, com.bytedance.analytics.page.d, com.bytedance.hox.a.d, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    boolean f104309a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f104310b;

    /* renamed from: c  reason: collision with root package name */
    androidx.recyclerview.widget.r f104311c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayoutManager f104312d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f104313e = h.i.a((h.f.a.a) e.f104319a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f104314j = h.i.a((h.f.a.a) new b(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f104315k = h.i.a((h.f.a.a) d.f104318a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f104316l = h.i.a((h.f.a.a) new f(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f104317m = h.i.a((h.f.a.a) new y(this));
    private final h.h n = h.i.a((h.f.a.a) new r(this));
    private final h.h o = h.i.a((h.f.a.a) new q(this));
    private final h.h p = h.i.a((h.f.a.a) new c(this));
    private final h.h q = h.i.a((h.f.a.a) new z(this));
    private final h.h r = h.i.a((h.f.a.a) new a(this));
    private SparseArray s;

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        public static final j f104323a = new j();

        static {
            Covode.recordClassIndex(66799);
        }

        j() {
        }

        @Override // androidx.lifecycle.u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(66789);
    }

    public final View a(int i2) {
        if (this.s == null) {
            this.s = new SparseArray();
        }
        View view = (View) this.s.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.s.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        h.f.b.l.d(bundle, "");
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "9081";
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return ((Boolean) this.f104313e.getValue()).booleanValue();
    }

    public final InboxFragmentVM g() {
        return (InboxFragmentVM) this.f104314j.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(148, new org.greenrobot.eventbus.g(l.class, "onSwitchInbox", com.ss.android.ugc.aweme.notice.api.b.d.class, ThreadMode.MAIN, 0, true));
        hashMap.put(360, new org.greenrobot.eventbus.g(l.class, "onDoubleClickTab", com.ss.android.ugc.aweme.notice.api.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final boolean h() {
        return ((Boolean) this.f104315k.getValue()).booleanValue();
    }

    public final MultiAdapterWidget i() {
        return (MultiAdapterWidget) this.f104316l.getValue();
    }

    public final InboxAdapterWidget j() {
        return (InboxAdapterWidget) this.f104317m.getValue();
    }

    public final InboxAdapterWidget k() {
        return (InboxAdapterWidget) this.n.getValue();
    }

    public final InboxAdapterWidget l() {
        return (InboxAdapterWidget) this.o.getValue();
    }

    public final InboxAdapterWidget m() {
        return (InboxAdapterWidget) this.p.getValue();
    }

    public final List<InboxAdapterWidget> n() {
        return (List) this.q.getValue();
    }

    public final c o() {
        return (c) this.r.getValue();
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return d.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return d.a.b(this);
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104318a = new d();

        static {
            Covode.recordClassIndex(66793);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.notice.api.b.b().isChatFunOfflineUnder16());
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f104319a = new e();

        static {
            Covode.recordClassIndex(66794);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!e.b().d());
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<MultiAdapterWidget> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MultiAdapterWidget invoke() {
            l lVar = this.this$0;
            return new MultiAdapterWidget(lVar, lVar.g().f103981d);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ViewGroup $container;
        final /* synthetic */ LayoutInflater $inflater;

        static {
            Covode.recordClassIndex(66804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(0);
            this.$inflater = layoutInflater;
            this.$container = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return com.a.a(this.$inflater, R.layout.k5, this.$container, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final void q() {
        IMService.createIIMServicebyMonsterPlugin(false).processMessagingDeepLink(this);
    }

    static final class b extends h.f.b.m implements h.f.a.a<InboxFragmentVM> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InboxFragmentVM invoke() {
            l lVar = this.this$0;
            h.f.b.l.d(lVar, "");
            ac a2 = ae.a(lVar, (ad.b) null).a(InboxFragmentVM.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<InboxAdapterWidget> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            IContactService b2 = ContactServiceImpl.b();
            l lVar = this.this$0;
            return b2.a(lVar, lVar.g().f103981d);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<InboxAdapterWidget> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            l lVar = this.this$0;
            return b2.a(lVar, lVar.g().f103981d);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(l lVar, Bundle bundle) {
            super(0);
            this.this$0 = lVar;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            l.super.onCreate(this.$savedInstanceState);
            EventBus.a(EventBus.a(), this.this$0);
            Iterator<T> it = this.this$0.n().iterator();
            while (it.hasNext()) {
                this.this$0.getLifecycle().a(it.next());
            }
            com.ss.android.ugc.aweme.inbox.d.g.a(g.e.f104158a);
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<InboxAdapterWidget> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            com.ss.android.ugc.aweme.im.service.e.a inboxAdapterService;
            if (this.this$0.h() || (inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService()) == null) {
                return null;
            }
            l lVar = this.this$0;
            return inboxAdapterService.a(lVar, lVar.g().f103981d);
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<InboxAdapterWidget> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            com.ss.android.ugc.aweme.im.service.e.a inboxAdapterService;
            if (this.this$0.h() || (inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService()) == null) {
                return null;
            }
            l lVar = this.this$0;
            return inboxAdapterService.b(lVar, lVar.g().f103981d);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            getLifecycle().b(it.next());
        }
        EventBus.a().b(this);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b
    public final void onRefresh() {
        androidx.lifecycle.t<Boolean> bq_;
        Iterator<T> it = n().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        InboxAdapterWidget k2 = k();
        if (k2 != null && (bq_ = k2.bq_()) != null) {
            bq_.postValue(Boolean.valueOf(e()));
        }
    }

    public final void p() {
        for (T t2 : n()) {
            t2.f().observe(this, new k(t2, this));
            LiveData<Boolean> e2 = t2.e();
            if (e2 != null) {
                e2.observe(this, new C2656l(this));
            }
        }
    }

    public final void r() {
        ((TuxStatusView) a(R.id.e_c)).a();
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.e_c);
        h.f.b.l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(0);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.bnq);
        h.f.b.l.b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
    }

    static final class a extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            g.a.C0060a aVar = new g.a.C0060a();
            aVar.f4029a = true;
            aVar.f4030b = g.a.b.ISOLATED_STABLE_IDS;
            g.a a2 = aVar.a();
            h.f.b.l.b(a2, "");
            List<InboxAdapterWidget> n = this.this$0.n();
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) n, 10));
            Iterator<T> it = n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().g());
            }
            return new c(new androidx.recyclerview.widget.g(a2, arrayList));
        }
    }

    public l() {
        com.ss.android.ugc.aweme.inbox.d.g.a(g.d.f104157a);
        e.a();
    }

    static final class z extends h.f.b.m implements h.f.a.a<List<InboxAdapterWidget>> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<InboxAdapterWidget> invoke() {
            ArrayList arrayList = new ArrayList();
            InboxAdapterWidget j2 = this.this$0.j();
            if (j2 != null) {
                arrayList.add(j2);
            }
            arrayList.add(this.this$0.i());
            InboxAdapterWidget k2 = this.this$0.k();
            if (k2 != null) {
                arrayList.add(k2);
                k2.bq_().setValue(true);
            }
            arrayList.add(this.this$0.l());
            arrayList.add(this.this$0.m());
            if (com.ss.android.ugc.aweme.inbox.b.c.b()) {
                InboxAdapterWidget l2 = this.this$0.l();
                h.f.b.l.d(l2, "");
                l2.a(1, v.f104355a);
            }
            if (com.ss.android.ugc.aweme.inbox.b.c.e()) {
                MultiAdapterWidget i2 = this.this$0.i();
                h.f.b.l.d(i2, "");
                i2.a(13, v.f104357c);
                i2.a(0, v.f104358d);
                i2.a(1, v.f104359e);
                i2.a(2, v.f104359e);
                InboxAdapterWidget k3 = this.this$0.k();
                if (k3 != null) {
                    h.f.b.l.d(k3, "");
                    k3.a(0, v.f104356b);
                    k3.a(1, v.f104359e);
                }
                v.a(this.this$0.l());
                v.a(this.this$0.m());
            }
            return arrayList;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ View $view;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(l lVar, View view, Bundle bundle) {
            super(0);
            this.this$0 = lVar;
            this.$view = view;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            int i2;
            androidx.lifecycle.t<Boolean> bq_;
            int a2;
            int identifier;
            l.super.onViewCreated(this.$view, this.$savedInstanceState);
            l lVar = this.this$0;
            View a3 = lVar.a(R.id.fej);
            h.f.b.l.b(a3, "");
            ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
            Context context = lVar.getContext();
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                i2 = 0;
            } else {
                i2 = context.getResources().getDimensionPixelSize(identifier);
            }
            layoutParams.height = i2;
            com.ss.android.ugc.aweme.adaptation.c.p.observe(lVar, new s(lVar));
            if (lVar.h()) {
                TuxIconView tuxIconView = (TuxIconView) lVar.a(R.id.agt);
                h.f.b.l.b(tuxIconView, "");
                tuxIconView.setVisibility(8);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) lVar.a(R.id.agt);
                h.f.b.l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                if (!com.ss.android.ugc.aweme.im.service.c.b.a() || com.ss.android.ugc.aweme.im.service.c.c.a()) {
                    ((TuxIconView) lVar.a(R.id.agt)).setTuxIcon(com.bytedance.tux.c.c.a(v.f104330a));
                } else {
                    ((TuxIconView) lVar.a(R.id.agt)).setTuxIcon(com.bytedance.tux.c.c.a(u.f104329a));
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    Context requireContext = lVar.requireContext();
                    h.f.b.l.b(requireContext, "");
                    TuxIconView tuxIconView3 = (TuxIconView) lVar.a(R.id.agt);
                    h.f.b.l.b(tuxIconView3, "");
                    createIIMServicebyMonsterPlugin.showGroupChatGuideBubble(requireContext, tuxIconView3);
                }
                ((TuxIconView) lVar.a(R.id.agt)).setOnClickListener(new w(lVar));
            }
            lVar.getContext();
            lVar.f104312d = new FixedLinearlayoutManager("InboxFragment");
            lVar.f104311c = new t(lVar, lVar.requireContext());
            RecyclerView recyclerView = (RecyclerView) lVar.a(R.id.bnp);
            h.f.b.l.b(recyclerView, "");
            LinearLayoutManager linearLayoutManager = lVar.f104312d;
            if (linearLayoutManager == null) {
                h.f.b.l.a("layoutManager");
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView2 = (RecyclerView) lVar.a(R.id.bnp);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setAdapter(lVar.o());
            RecyclerView recyclerView3 = (RecyclerView) lVar.a(R.id.bnp);
            h.f.b.l.b(recyclerView3, "");
            recyclerView3.setItemAnimator(new s());
            if (((Boolean) com.ss.android.ugc.aweme.inbox.b.c.f104060a.getValue()).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                InboxAdapterWidget j2 = lVar.j();
                if (j2 != null) {
                    arrayList.add(j2);
                }
                arrayList.add(lVar.i());
                InboxAdapterWidget k2 = lVar.k();
                if (k2 != null) {
                    arrayList.add(k2);
                }
                RecyclerView recyclerView4 = (RecyclerView) lVar.a(R.id.bnp);
                h.f.b.l.b(recyclerView4, "");
                View a4 = lVar.a(R.id.elw);
                h.f.b.l.b(a4, "");
                h.f.b.l.d(arrayList, "");
                h.f.b.l.d(recyclerView4, "");
                h.f.b.l.d(a4, "");
                Context context2 = recyclerView4.getContext();
                if (com.ss.android.ugc.aweme.inbox.b.c.e()) {
                    Resources system = Resources.getSystem();
                    h.f.b.l.a((Object) system, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 84.0f, system.getDisplayMetrics()));
                } else {
                    Resources system2 = Resources.getSystem();
                    h.f.b.l.a((Object) system2, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 76.0f, system2.getDisplayMetrics()));
                }
                float f2 = (float) a2;
                int c2 = androidx.core.content.b.c(context2, R.color.b6);
                Resources system3 = Resources.getSystem();
                h.f.b.l.a((Object) system3, "");
                recyclerView4.b(new j(arrayList, c2, h.g.a.a(TypedValue.applyDimension(1, 0.32f, system3.getDisplayMetrics())), f2));
                a4.setVisibility(0);
            }
            com.ss.android.ugc.aweme.notification.utils.q.a((RecyclerView) lVar.a(R.id.bnp), (SwipeRefreshLayout) lVar.a(R.id.bnq));
            ((SwipeRefreshLayout) lVar.a(R.id.bnq)).setOnRefreshListener(lVar);
            this.this$0.p();
            l lVar2 = this.this$0;
            DataCenter.a(ae.a(lVar2.requireActivity(), (ad.b) null), lVar2).a("onNewIntent", new i(lVar2), true);
            this.this$0.q();
            l lVar3 = this.this$0;
            lVar3.g().f103979b.observe(lVar3, new g(lVar3));
            lVar3.g().f103980c.observe(lVar3, new h(lVar3));
            l lVar4 = this.this$0;
            InboxAdapterWidget k3 = lVar4.k();
            if (!(k3 == null || (bq_ = k3.bq_()) == null)) {
                bq_.observe(lVar4, j.f104323a);
            }
            this.this$0.r();
            return h.z.f158842a;
        }
    }

    static final class i<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104322a;

        static {
            Covode.recordClassIndex(66798);
        }

        i(l lVar) {
            this.f104322a = lVar;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Intent intent = (Intent) ((com.ss.android.ugc.aweme.arch.widgets.base.b) obj).a();
            if (intent != null) {
                this.f104322a.setArguments(a(intent));
                this.f104322a.q();
            }
        }
    }

    static boolean a(InboxAdapterWidget.b bVar) {
        if (bVar == InboxAdapterWidget.b.EMPTY || bVar == InboxAdapterWidget.b.FAIL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.ss.android.ugc.aweme.inbox.d.g.a(com.ss.android.ugc.aweme.inbox.d.a.ON_CREATE, new n(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.l$l  reason: collision with other inner class name */
    public static final class C2656l<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104326a;

        static {
            Covode.recordClassIndex(66801);
        }

        C2656l(l lVar) {
            this.f104326a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar;
            Boolean bool = (Boolean) obj;
            InboxFragmentVM g2 = this.f104326a.g();
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                uVar = u.LOADING;
            } else {
                uVar = u.NORMAL;
            }
            g2.a(uVar);
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        com.bytedance.analytics.b.a(this);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN, b = true)
    public final void onSwitchInbox(com.ss.android.ugc.aweme.notice.api.b.d dVar) {
        h.f.b.l.d(dVar, "");
        q.CONTACTS.markEnterInbox();
        q.THIRD_PLATFORM.markEnterInbox();
        this.f104309a = true;
        a.e.a();
    }

    static final class h<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104321a;

        static {
            Covode.recordClassIndex(66797);
        }

        h(l lVar) {
            this.f104321a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int itemCount = this.f104321a.o().getItemCount();
            h.f.b.l.b(num, "");
            int intValue = num.intValue();
            if (intValue >= 0 && itemCount > intValue) {
                l lVar = this.f104321a;
                int intValue2 = num.intValue();
                androidx.recyclerview.widget.r rVar = lVar.f104311c;
                if (rVar == null) {
                    h.f.b.l.a("inboxListSmoothScroller");
                }
                rVar.f3862g = intValue2;
                LinearLayoutManager linearLayoutManager = lVar.f104312d;
                if (linearLayoutManager == null) {
                    h.f.b.l.a("layoutManager");
                }
                androidx.recyclerview.widget.r rVar2 = lVar.f104311c;
                if (rVar2 == null) {
                    h.f.b.l.a("inboxListSmoothScroller");
                }
                linearLayoutManager.a(rVar2);
            }
        }
    }

    static final class s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104327a;

        static {
            Covode.recordClassIndex(66808);
        }

        s(l lVar) {
            this.f104327a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                Space space = (Space) this.f104327a.a(R.id.v3);
                h.f.b.l.b(space, "");
                ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                if (layoutParams.height != intValue) {
                    layoutParams.height = intValue;
                    Space space2 = (Space) this.f104327a.a(R.id.v3);
                    h.f.b.l.b(space2, "");
                    space2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104331a;

        static {
            Covode.recordClassIndex(66812);
        }

        w(l lVar) {
            this.f104331a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.notice.api.b.b().shouldRedictToTipsPage()) {
                com.ss.android.ugc.aweme.notice.api.b.b().goToTipsPage();
                return;
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            Context requireContext = this.f104331a.requireContext();
            h.f.b.l.b(requireContext, "");
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "notification_page");
            bundle.putString("enter_method", "button");
            createIIMServicebyMonsterPlugin.enterCreateChatPage(requireContext, bundle);
        }
    }

    static final class x extends h.f.b.m implements h.f.a.b<TuxButton, h.z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            h.f.b.l.d(tuxButton2, "");
            tuxButton2.setButtonSize(3);
            tuxButton2.setText(this.this$0.getString(R.string.cjx));
            tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise_fill));
            return h.z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onDoubleClickTab(com.ss.android.ugc.aweme.notice.api.b.a aVar) {
        h.f.b.l.d(aVar, "");
        InboxFragmentVM g2 = g();
        List<InboxAdapterWidget> n2 = n();
        LinearLayoutManager linearLayoutManager = this.f104312d;
        if (linearLayoutManager == null) {
            h.f.b.l.a("layoutManager");
        }
        int k2 = linearLayoutManager.k();
        h.f.b.l.d(n2, "");
        if (!g2.a(n2, k2, false) && !g2.a(n2, 0, true)) {
            g2.f103978a.postValue(0);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<e.a, h.z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(66802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(e.a aVar) {
            boolean z;
            androidx.lifecycle.t<Boolean> bq_;
            Boolean value;
            e.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            boolean z2 = true;
            if (this.this$0.l().g().getItemCount() > 0 || this.this$0.m().g().getItemCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            InboxAdapterWidget k2 = this.this$0.k();
            if (k2 == null || (bq_ = k2.bq_()) == null || (value = bq_.getValue()) == null || value.booleanValue()) {
                z2 = false;
            }
            aVar2.a(z, z2);
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f104329a = new u();

        static {
            Covode.recordClassIndex(66810);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_create_group;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f104330a = new v();

        static {
            Covode.recordClassIndex(66811);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_pen_on_paper;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return h.z.f158842a;
        }
    }

    static final class g<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104320a;

        static {
            Covode.recordClassIndex(66796);
        }

        g(l lVar) {
            this.f104320a = lVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar = (u) obj;
            if (uVar != null) {
                int i2 = m.f104332a[uVar.ordinal()];
                if (i2 == 1) {
                    l lVar = this.f104320a;
                    TuxStatusView tuxStatusView = (TuxStatusView) lVar.a(R.id.e_c);
                    h.f.b.l.b(tuxStatusView, "");
                    tuxStatusView.setVisibility(0);
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) lVar.a(R.id.bnq);
                    h.f.b.l.b(swipeRefreshLayout, "");
                    swipeRefreshLayout.setRefreshing(false);
                    TuxStatusView.c a2 = new TuxStatusView.c().a(0, R.raw.icon_large_wifi_slash);
                    String string = lVar.getString(R.string.q6);
                    h.f.b.l.b(string, "");
                    TuxStatusView.c a3 = a2.a(string);
                    String string2 = lVar.getString(R.string.q5);
                    h.f.b.l.b(string2, "");
                    TuxStatusView.c a4 = a3.a((CharSequence) string2);
                    Resources system = Resources.getSystem();
                    h.f.b.l.a((Object) system, "");
                    int a5 = h.g.a.a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    h.f.b.l.a((Object) system2, "");
                    TuxStatusView.c b2 = a4.b(a5, h.g.a.a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics())));
                    b2.f45362j = new x(lVar);
                    ((TuxStatusView) lVar.a(R.id.e_c)).setStatus(b2);
                } else if (i2 == 3) {
                    this.f104320a.r();
                } else if (i2 == 4) {
                    l lVar2 = this.f104320a;
                    TuxStatusView tuxStatusView2 = (TuxStatusView) lVar2.a(R.id.e_c);
                    h.f.b.l.b(tuxStatusView2, "");
                    tuxStatusView2.setVisibility(8);
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) lVar2.a(R.id.bnq);
                    h.f.b.l.b(swipeRefreshLayout2, "");
                    swipeRefreshLayout2.setRefreshing(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InboxAdapterWidget f104324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f104325b;

        static {
            Covode.recordClassIndex(66800);
        }

        k(InboxAdapterWidget inboxAdapterWidget, l lVar) {
            this.f104324a = inboxAdapterWidget;
            this.f104325b = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r47) {
            /*
            // Method dump skipped, instructions count: 467
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.l.k.onChanged(java.lang.Object):void");
        }
    }

    public static final class t extends androidx.recyclerview.widget.r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f104328f;

        static {
            Covode.recordClassIndex(66809);
        }

        @Override // androidx.recyclerview.widget.r
        public final int c() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(l lVar, Context context) {
            super(context);
            this.f104328f = lVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        com.ss.android.ugc.aweme.inbox.d.g.a(com.ss.android.ugc.aweme.inbox.d.a.ON_VIEW_CREATED, new p(this, view, bundle));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        Object a2 = com.ss.android.ugc.aweme.inbox.d.g.a(com.ss.android.ugc.aweme.inbox.d.a.ON_CREATE_VIEW, new o(layoutInflater, viewGroup));
        h.f.b.l.b(a2, "");
        return (View) a2;
    }
}
