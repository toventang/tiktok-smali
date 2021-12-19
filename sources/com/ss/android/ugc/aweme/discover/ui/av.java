package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.discover.a.ak;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.ai;
import com.ss.android.ugc.aweme.search.k.al;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.aw;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.v;
import com.ss.android.ugc.aweme.search.model.SearchResultParamProvider;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.ec;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.p;
import h.z;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class av<D> extends am implements h.a, com.ss.android.ugc.aweme.common.e.c<D>, ac, com.ss.android.ugc.aweme.discover.ui.b.c, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    protected DoubleBallSwipeRefreshLayout K;
    public com.ss.android.ugc.aweme.discover.ui.e.f L;
    public SearchIntermediateViewModel M;
    protected FrameLayout N;
    public boolean O;
    public boolean P;
    public com.ss.android.ugc.aweme.discover.ui.b.a Q;
    public com.ss.android.ugc.aweme.search.model.d R;
    public com.ss.android.ugc.aweme.common.a.f<D> S;
    public com.ss.android.ugc.aweme.discover.c.a T;
    public boolean U = true;
    protected SearchStateViewModel V;
    public boolean W = true;
    long X;
    private long Y;
    private MusicPlayHelper Z;

    /* renamed from: a  reason: collision with root package name */
    private SearchStateViewModel f82329a;
    private SearchEnterViewModel aa;
    private SurveyViewModel ab;
    private final h.h ac = ec.a(new f(this));
    private final h.h ad = ec.a(new n(this));
    private boolean ae;
    private SparseArray af;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f82330b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f82331c = ec.a(new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f82332d = ec.a(new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f82333e = ec.a(new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f82334j = ec.a(new g(this));

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.widget.c f82335k;

    /* renamed from: l  reason: collision with root package name */
    private QueryCorrectInfo f82336l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f82337m;
    protected RecyclerView n;
    protected DmtStatusView o;

    static {
        Covode.recordClassIndex(51240);
    }

    private final an n() {
        return (an) this.ac.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.discover.ui.d.b E() {
        return (com.ss.android.ugc.aweme.discover.ui.d.b) this.ad.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public View a(int i2) {
        if (this.af == null) {
            this.af = new SparseArray();
        }
        View view = (View) this.af.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.af.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void a(FollowStatus followStatus) {
        h.f.b.l.d(followStatus, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public void aT_() {
        SparseArray sparseArray = this.af;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void aU_();

    /* access modifiers changed from: protected */
    public abstract void b_(boolean z);

    @Override // com.ss.android.ugc.aweme.common.e.c
    public void c(List<? extends D> list, boolean z) {
        h.f.b.l.d(list, "");
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(305, new org.greenrobot.eventbus.g(av.class, "onFeedbackSubmitSuccess", com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(306, new org.greenrobot.eventbus.g(av.class, "onWebViewActivityCloseEvent", com.ss.android.sdk.webview.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(307, new org.greenrobot.eventbus.g(av.class, "onSearchAfterLogin", com.ss.android.ugc.aweme.discover.e.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(37, new org.greenrobot.eventbus.g(av.class, "onReceiveVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(36, new org.greenrobot.eventbus.g(av.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    public abstract void m();

    public boolean o() {
        return false;
    }

    @r
    public final void onWebViewActivityCloseEvent(com.ss.android.sdk.webview.b bVar) {
        h.f.b.l.d(bVar, "");
    }

    /* access modifiers changed from: protected */
    public boolean s() {
        return true;
    }

    public String t() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final AppBarLayout z() {
        return (AppBarLayout) this.f82332d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final com.ss.android.ugc.aweme.search.model.d aQ_() {
        return this.s;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        Q();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
        Q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0107, code lost:
        if (r12 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x010b, code lost:
        if (r12 != null) goto L_0x0095;
     */
    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.model.SearchApiResult r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.av.a(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.b.c
    public final void a(String str, String str2, boolean z) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (this.r != null) {
            com.ss.android.ugc.aweme.search.model.d needCorrect = new com.ss.android.ugc.aweme.search.model.d().setKeyword(str2).setNeedCorrect(this.C);
            if (z) {
                str = null;
            }
            com.ss.android.ugc.aweme.search.model.d filterOption = needCorrect.setGuideSearchBaseWord(str).setSearchFrom(z ? "guide_search_cancel" : "guide_search").setFilterOption(this.D);
            h.f.b.l.b(filterOption, "");
            filterOption.setIndex(this.B);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.discover.e.h(filterOption));
            p();
        }
    }

    public final void a(List<GuideSearchWord> list) {
        String str;
        ad b2;
        if (ab_()) {
            com.ss.android.ugc.aweme.search.model.d dVar = this.r;
            if (dVar == null || !dVar.isGuideSearch()) {
                q a2 = am.a();
                if (a2 == null || (b2 = a2.b(this.B)) == null || (str = b2.f121172a) == null) {
                    str = "";
                }
                if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                    com.ss.android.ugc.aweme.discover.ui.b.a aVar = this.Q;
                    if (aVar != null) {
                        aVar.a(list, u(), com.ss.android.ugc.aweme.search.j.a(this.t), str);
                    }
                    this.O = false;
                    return;
                }
                if (this.Q == null) {
                    this.Q = new com.ss.android.ugc.aweme.discover.ui.b.a((com.ss.android.ugc.aweme.discover.ui.b.b) this.f82333e.getValue());
                }
                com.ss.android.ugc.aweme.discover.ui.b.a aVar2 = this.Q;
                if (aVar2 != null) {
                    aVar2.a(list, u(), com.ss.android.ugc.aweme.search.j.a(this.t), str);
                }
                this.O = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (h.f.b.l.a((java.lang.Object) (r0 != null ? r0.getSearchFrom() : null), (java.lang.Object) "guide_search_cancel") != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (r7 == null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.av.a(boolean, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        h.f.b.l.d(dVar, "");
        this.R = dVar;
        super.a(dVar);
        this.U = true;
        if (!ab_()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable(am.G, dVar);
                return;
            }
            return;
        }
        b(dVar);
        Context context = getContext();
        if (context == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context, "");
        SearchResultParamProvider.a.a(context, dVar);
        a(false, false);
        ViewGroup viewGroup = this.f82330b;
        if (viewGroup == null) {
            h.f.b.l.a("mPreventSuicideLayout");
        }
        viewGroup.setVisibility(8);
        SearchStateViewModel searchStateViewModel = this.f82329a;
        if (searchStateViewModel != null) {
            searchStateViewModel.setShowingSuicide(false);
        }
        com.ss.android.ugc.aweme.discover.ui.e.f fVar = this.L;
        if (fVar != null) {
            androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
            h.f.b.l.b(childFragmentManager, "");
            if (childFragmentManager.e() >= 0) {
                getChildFragmentManager().a().a(fVar).b();
                this.L = null;
            }
        }
    }

    public final void a(String str, String str2, String str3, boolean z) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str3, "");
        if (this.t != com.ss.android.ugc.aweme.search.j.f121154b) {
            com.ss.android.ugc.aweme.discover.mob.q.b(this.t);
        }
        com.ss.android.ugc.aweme.discover.mob.e eVar = new com.ss.android.ugc.aweme.discover.mob.e();
        if (h.f.b.l.a((Object) str, (Object) "general_search")) {
            str = "general";
        }
        eVar.f81895a = str;
        eVar.f81896b = str3;
        eVar.a(this.u);
        eVar.f81905k = this.v;
        com.ss.android.ugc.aweme.search.model.d dVar = this.s;
        com.ss.android.ugc.aweme.search.model.b bVar = null;
        eVar.f81906l = dVar != null ? dVar.getEnterMethod() : null;
        eVar.f81898d = str2;
        eVar.f81900f = z;
        SearchEnterViewModel searchEnterViewModel = this.aa;
        if (searchEnterViewModel != null) {
            bVar = searchEnterViewModel.f82794a;
        }
        eVar.f81899e = bVar;
        eVar.f81902h = com.ss.android.ugc.aweme.discover.mob.d.f81892k;
        eVar.f81901g = this.B;
        eVar.f81903i = this.A;
        eVar.f81907m = com.ss.android.ugc.aweme.discover.mob.d.f81883b;
        eVar.p = this.s;
        eVar.f81904j = com.ss.android.ugc.aweme.discover.mob.q.f81943a;
        eVar.n = com.ss.android.ugc.aweme.discover.mob.q.c(this.t);
        eVar.o = t();
        new v("query_sign").f();
        a(eVar);
        com.ss.android.ugc.aweme.discover.mob.q.f81943a = false;
        com.ss.android.ugc.aweme.discover.mob.d.f81883b = false;
        com.ss.android.ugc.aweme.discover.mob.d.f81892k = this.B;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public void a(List<? extends D> list, boolean z) {
        h.f.b.l.d(list, "");
        if (ab_()) {
            L();
            A().d(true);
            if (!z) {
                A().ah_();
            } else {
                A().ai_();
            }
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView == null) {
                h.f.b.l.a("mStatusView");
            }
            dmtStatusView.d();
            A().b_(list);
            N();
            View view = getView();
            if (view == null) {
                h.f.b.l.b();
            }
            view.requestLayout();
            b_(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
        h.f.b.l.d(exc, "");
        d(exc);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(SearchPreventSuicide searchPreventSuicide, GlobalDoodleConfig globalDoodleConfig) {
        if (searchPreventSuicide != null) {
            this.L = new com.ss.android.ugc.aweme.discover.ui.e.f();
            ViewGroup viewGroup = this.f82330b;
            if (viewGroup == null) {
                h.f.b.l.a("mPreventSuicideLayout");
            }
            viewGroup.setVisibility(0);
            SearchStateViewModel searchStateViewModel = this.f82329a;
            if (searchStateViewModel != null) {
                searchStateViewModel.setShowingSuicide(true);
            }
            androidx.fragment.app.n a2 = getChildFragmentManager().a();
            com.ss.android.ugc.aweme.discover.ui.e.f fVar = this.L;
            if (fVar == null) {
                h.f.b.l.b();
            }
            a2.b(R.id.c7u, fVar, com.ss.android.ugc.aweme.discover.ui.e.f.f82571l).b();
            com.ss.android.ugc.aweme.discover.ui.e.f fVar2 = this.L;
            if (fVar2 != null) {
                com.ss.android.ugc.aweme.search.model.d dVar = this.r;
                fVar2.f82573a = searchPreventSuicide;
                fVar2.f82574b = dVar;
                fVar2.f82575c = globalDoodleConfig != null ? globalDoodleConfig.getShowResultsSource() : null;
                fVar2.f82576d = globalDoodleConfig;
                fVar2.f82578j = false;
                fVar2.f82579k = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final a.AbstractC2689a aP_() {
        return v();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final an e() {
        return n();
    }

    static final class c extends h.f.b.m implements h.f.a.a<AppBarLayout> {
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(51243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(av avVar) {
            super(0);
            this.this$0 = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AppBarLayout invoke() {
            return this.this$0.a(R.id.du8);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(51248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(av avVar) {
            super(0);
            this.this$0 = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.a(R.id.b46);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82344a;

        static {
            Covode.recordClassIndex(51252);
        }

        k(av avVar) {
            this.f82344a = avVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.search.l.a.g.b(this.f82344a.s);
            com.ss.android.ugc.aweme.search.l.a.h.b(this.f82344a.s);
        }
    }

    private void Q() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.K;
        if (doubleBallSwipeRefreshLayout == null) {
            h.f.b.l.a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setRefreshing(true);
    }

    private final void S() {
        new Handler().post(new l(this));
    }

    public final com.ss.android.ugc.aweme.common.a.f<D> A() {
        com.ss.android.ugc.aweme.common.a.f<D> fVar = this.S;
        if (fVar == null) {
            h.f.b.l.a("mSearchAdapter");
        }
        return fVar;
    }

    public final com.ss.android.ugc.aweme.discover.c.a B() {
        com.ss.android.ugc.aweme.discover.c.a aVar = this.T;
        if (aVar == null) {
            h.f.b.l.a("mSearchAdapterWrapper");
        }
        return aVar;
    }

    public final SearchStateViewModel C() {
        SearchStateViewModel searchStateViewModel = this.V;
        if (searchStateViewModel == null) {
            h.f.b.l.a("mStateViewModel");
        }
        return searchStateViewModel;
    }

    public RecyclerView.i D() {
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        return wrapLinearLayoutManager;
    }

    public final void N() {
        View view = getView();
        if (view != null) {
            view.post(new k(this));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean P() {
        if (this.S != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (ab_()) {
            A().ag_();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final WeakReference<androidx.fragment.app.e> aR_() {
        return new WeakReference<>(getActivity());
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public void f() {
        if (ab_()) {
            K();
            N();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f82337m) {
            p();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.Y = SystemClock.uptimeMillis();
    }

    public final RecyclerView w() {
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    public final DmtStatusView x() {
        DmtStatusView dmtStatusView = this.o;
        if (dmtStatusView == null) {
            h.f.b.l.a("mStatusView");
        }
        return dmtStatusView;
    }

    /* access modifiers changed from: protected */
    public final DoubleBallSwipeRefreshLayout y() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.K;
        if (doubleBallSwipeRefreshLayout == null) {
            h.f.b.l.a("mRefreshLayout");
        }
        return doubleBallSwipeRefreshLayout;
    }

    static final class f extends h.f.b.m implements h.f.a.a<an> {
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(51246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(av avVar) {
            super(0);
            this.this$0 = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ an invoke() {
            an anVar = new an();
            anVar.a(com.ss.android.ugc.aweme.search.j.a(this.this$0.t), this.this$0.getActivity());
            anVar.f82297d = new com.ss.android.ugc.aweme.search.g.d(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.av.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f82340a;

                static {
                    Covode.recordClassIndex(51247);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82340a = r1;
                }

                @Override // com.ss.android.ugc.aweme.search.g.d
                public final void a(com.ss.android.ugc.aweme.search.g.b bVar) {
                    com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
                    boolean z;
                    this.f82340a.this$0.a(1, bVar);
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f82340a.this$0.M;
                    if (searchIntermediateViewModel != null && (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) != null) {
                        if (bVar != null) {
                            z = bVar.isDefaultOption();
                        } else {
                            z = true;
                        }
                        showSearchFilterDot.setValue(Boolean.valueOf(!z));
                    }
                }

                @Override // com.ss.android.ugc.aweme.search.g.d
                public final void a(String str, com.ss.android.ugc.aweme.search.g.b bVar) {
                    h.f.b.l.d(str, "");
                    this.f82340a.this$0.c(str);
                    this.f82340a.this$0.D = bVar;
                }
            };
            return anVar;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.discover.ui.d.b> {
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(51255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(av avVar) {
            super(0);
            this.this$0 = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.d.b invoke() {
            Context context = this.this$0.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            av avVar = this.this$0;
            h.f.b.l.d(context, "");
            h.f.b.l.d(avVar, "");
            return new com.ss.android.ugc.aweme.discover.ui.d.b(context, avVar);
        }
    }

    public static void J() {
        String str;
        ai aiVar = new ai();
        if (com.ss.android.ugc.aweme.user.f.a(com.ss.android.ugc.aweme.user.e.f142364k.a())) {
            str = "1";
        } else {
            str = "0";
        }
        aiVar.c(ai.f121185b, str);
        aiVar.f();
    }

    /* access modifiers changed from: protected */
    public final void K() {
        a(E().a());
        z().setExpanded(false);
        N();
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        if (ab_()) {
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.K;
            if (doubleBallSwipeRefreshLayout == null) {
                h.f.b.l.a("mRefreshLayout");
            }
            if (!doubleBallSwipeRefreshLayout.f144446b) {
                aU_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            h.f.b.l.b(view, "");
            j.a.b(view);
        }
        super.onDestroyView();
        EventBus.a().b(this);
        aT_();
    }

    static final class d extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(51244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(av avVar) {
            super(0);
            this.this$0 = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(769);
            ViewStub viewStub = (ViewStub) this.this$0.getView().findViewById(R.id.aot);
            h.f.b.l.b(viewStub, "");
            viewStub.setLayoutInflater(new com.ss.android.ugc.aweme.search.l.a(this.this$0.getContext()));
            View inflate = ((ViewStub) this.this$0.getView().findViewById(R.id.aot)).inflate();
            MethodCollector.o(769);
            return inflate;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.discover.ui.b.b> {
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(51245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(av avVar) {
            super(0);
            this.this$0 = avVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.ui.b.b invoke() {
            MethodCollector.i(768);
            FrameLayout frameLayout = (FrameLayout) this.this$0.a(R.id.bdt);
            Context context = this.this$0.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.discover.ui.b.b bVar = new com.ss.android.ugc.aweme.discover.ui.b.b(context, (byte) 0);
            frameLayout.addView(bVar);
            bVar.setItemClickListener(this.this$0);
            MethodCollector.o(768);
            return bVar;
        }
    }

    private void R() {
        AppBarLayout z;
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView.b(0);
        if (ab_()) {
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView == null) {
                h.f.b.l.a("mStatusView");
            }
            if (!dmtStatusView.k()) {
                DmtStatusView dmtStatusView2 = this.o;
                if (dmtStatusView2 == null) {
                    h.f.b.l.a("mStatusView");
                }
                if (!dmtStatusView2.l() && (z = z()) != null) {
                    z.setExpanded(true);
                }
            }
        }
    }

    public final void I() {
        if (!this.ae) {
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView == null) {
                h.f.b.l.a("mStatusView");
            }
            Context context = dmtStatusView.getContext();
            DmtStatusView.a a2 = DmtStatusView.a.a(context).a(R.string.h2z, new b(this));
            MtEmptyView a3 = MtEmptyView.a(context);
            h.f.b.l.b(a3, "");
            a2.b(a3);
            DmtStatusView dmtStatusView2 = this.o;
            if (dmtStatusView2 == null) {
                h.f.b.l.a("mStatusView");
            }
            dmtStatusView2.setBuilder(a2);
            this.ae = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void L() {
        S();
        SearchStateViewModel searchStateViewModel = this.V;
        if (searchStateViewModel == null) {
            h.f.b.l.a("mStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(false);
        if (ab_()) {
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.K;
            if (doubleBallSwipeRefreshLayout == null) {
                h.f.b.l.a("mRefreshLayout");
            }
            doubleBallSwipeRefreshLayout.setRefreshing(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82341a;

        static {
            Covode.recordClassIndex(51249);
        }

        h(av avVar) {
            this.f82341a = avVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_word", this.f82341a.u());
                if (h.f.b.l.a((Object) this.f82341a.u, (Object) "search_history")) {
                    this.f82341a.e("search_history");
                } else if (h.f.b.l.a((Object) this.f82341a.u, (Object) "search_sug")) {
                    this.f82341a.e("search_sug");
                } else {
                    this.f82341a.e("normal_search");
                }
                jSONObject.put("enter_from", this.f82341a.w);
            } catch (JSONException unused) {
            }
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("search").setLabelName(this.f82341a.c()).setJsonObject(jSONObject));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    public final String M() {
        String str;
        QueryCorrectInfo queryCorrectInfo;
        QueryCorrectInfo queryCorrectInfo2 = this.f82336l;
        if (queryCorrectInfo2 == null || queryCorrectInfo2.getCorrectedLevel() != 2 || (queryCorrectInfo = this.f82336l) == null || (str = queryCorrectInfo.getCorrectedKeyword()) == null) {
            str = "";
        }
        v().a(new com.ss.android.ugc.aweme.keyword.b(u(), str));
        QueryCorrectInfo queryCorrectInfo3 = this.f82336l;
        if (queryCorrectInfo3 == null || queryCorrectInfo3.getCorrectedLevel() != 2) {
            return u();
        }
        QueryCorrectInfo queryCorrectInfo4 = this.f82336l;
        if (queryCorrectInfo4 == null) {
            h.f.b.l.b();
        }
        String correctedKeyword = queryCorrectInfo4.getCorrectedKeyword();
        h.f.b.l.b(correctedKeyword, "");
        return correctedKeyword;
    }

    public final String O() {
        String str;
        String str2;
        com.ss.android.ugc.aweme.search.n.a searchCommonModel;
        com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
        String str3 = "";
        if (bVar == null || TextUtils.isEmpty(bVar.getEnterSearchFrom()) || (str = bVar.getEnterSearchFrom()) == null) {
            str = str3;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            com.ss.android.ugc.aweme.search.n.f b2 = d.a.b(activity);
            if (b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null || (str2 = searchCommonModel.getEnterFrom()) == null) {
                str2 = str3;
            }
            str3 = str2;
        }
        jSONObject.put("enter_from_x", str3);
        c.a.a("ref_search_get_search_fragment_enterfrom", jSONObject, h.a.am.c("enter_from"));
        return str;
    }

    public void q() {
        a((QueryCorrectInfo) null);
        a((com.ss.android.ugc.aweme.discover.mixfeed.d) null);
        a((com.ss.android.ugc.aweme.discover.mixfeed.d) null, (String) null);
        if (A().v) {
            A().d(false);
            A().notifyDataSetChanged();
        }
        A().f();
        DmtStatusView dmtStatusView = this.o;
        if (dmtStatusView == null) {
            h.f.b.l.a("mStatusView");
        }
        dmtStatusView.h();
        z().a(false, false, true);
        new com.ss.android.ugc.aweme.tux.a.i.a(GlobalContext.getContext()).a(R.string.de8).a();
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82345a;

        static {
            Covode.recordClassIndex(51253);
        }

        l(av avVar) {
            this.f82345a = avVar;
        }

        public final void run() {
            String c2;
            String str;
            String str2;
            ad c3;
            av avVar = this.f82345a;
            long currentTimeMillis = System.currentTimeMillis() - avVar.X;
            if (currentTimeMillis > 0 && currentTimeMillis <= 15000) {
                String str3 = "general_search";
                if (h.f.b.l.a((Object) avVar.c(), (Object) str3)) {
                    c2 = "general";
                } else {
                    c2 = avVar.c();
                    str3 = "search_result";
                }
                q a2 = am.a();
                if (a2 == null || (c3 = a2.c()) == null || (str = c3.f121172a) == null) {
                    str = "";
                }
                com.ss.android.ugc.aweme.search.k.c b2 = ((com.ss.android.ugc.aweme.search.k.c) new com.ss.android.ugc.aweme.search.k.ag().o(str3).p(avVar.v)).b(avVar.u());
                b2.c(com.ss.android.ugc.aweme.search.k.ag.f121182b, String.valueOf(currentTimeMillis));
                com.ss.android.ugc.aweme.search.k.c a3 = b2.f(c2).a(str);
                com.ss.android.ugc.aweme.search.n.h b3 = d.a.b();
                if (b3 != null) {
                    str2 = b3.getSearchId();
                } else {
                    str2 = null;
                }
                ((com.ss.android.ugc.aweme.search.k.c) a3.c("search_id_x", str2)).c(ac.a.f91473a.a(str)).f();
            }
        }
    }

    private final void p() {
        Integer num;
        String str;
        ad b2;
        String str2;
        long uptimeMillis = SystemClock.uptimeMillis() - this.Y;
        com.ss.android.ugc.aweme.search.model.d dVar = this.r;
        if (dVar != null) {
            num = Integer.valueOf(dVar.getIndex());
        } else {
            num = null;
        }
        String str3 = "";
        if (num != null) {
            int i2 = this.B;
            com.ss.android.ugc.aweme.search.model.d dVar2 = this.r;
            if (dVar2 == null || i2 != dVar2.getIndex()) {
                str = com.ss.android.ugc.aweme.search.j.a(num.intValue());
                q a2 = am.a();
                if (!(a2 == null || (b2 = a2.b(this.B)) == null || (str2 = b2.f121172a) == null)) {
                    str3 = str2;
                }
                ((aw) ((com.ss.android.ugc.aweme.search.k.c) new aw().r(String.valueOf(uptimeMillis)).f(com.ss.android.ugc.aweme.search.j.a(this.B)).a(str3).d(str3).c("search_id_x", this.q.getSearchId())).c(ac.a.f91473a.a(str3))).s(str).b(u()).f();
            }
        }
        str = str3;
        q a22 = am.a();
        str3 = str2;
        ((aw) ((com.ss.android.ugc.aweme.search.k.c) new aw().r(String.valueOf(uptimeMillis)).f(com.ss.android.ugc.aweme.search.j.a(this.B)).a(str3).d(str3).c("search_id_x", this.q.getSearchId())).c(ac.a.f91473a.a(str3))).s(str).b(u()).f();
    }

    /* access modifiers changed from: package-private */
    public static final class m<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mob.e f82347b;

        static {
            Covode.recordClassIndex(51254);
        }

        m(av avVar, com.ss.android.ugc.aweme.discover.mob.e eVar) {
            this.f82346a = avVar;
            this.f82347b = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            String str9;
            Map<String, String> map;
            Map<String, String> map2;
            com.ss.android.ugc.aweme.search.g.b filterOption;
            List<com.ss.android.ugc.aweme.search.g.h> activitySwitchOption;
            com.ss.android.ugc.aweme.search.g.b filterOption2;
            com.ss.android.ugc.aweme.search.g.g sortTypeStruct;
            com.ss.android.ugc.aweme.search.g.b filterOption3;
            com.ss.android.ugc.aweme.search.g.g filterByStruct;
            String utmSource;
            String str10;
            String eventKeyword;
            String str11;
            String str12;
            com.ss.android.ugc.aweme.search.n.i searchVideoModel;
            com.ss.android.ugc.aweme.search.n.i searchVideoModel2;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel2;
            com.ss.android.ugc.aweme.search.n.i searchVideoModel3;
            com.ss.android.ugc.aweme.search.n.i searchVideoModel4;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel3;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel4;
            al alVar = new al(al.r);
            if (hl.a(this.f82346a.y)) {
                alVar.r(this.f82346a.y);
            }
            if (hl.a(this.f82346a.z)) {
                alVar.s(this.f82346a.z);
            }
            if (hl.a(com.ss.android.ugc.aweme.discover.adapter.b.g.f80504a)) {
                alVar.c(al.y, com.ss.android.ugc.aweme.discover.adapter.b.g.f80504a);
                com.ss.android.ugc.aweme.discover.adapter.b.g.a("");
                com.ss.android.ugc.aweme.search.o.a.a();
            }
            com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(this.f82346a.getActivity()).f82794a;
            if (bVar != null) {
                Object obtainLogData = bVar.obtainLogData("is_from_video");
                z = h.f.b.l.a((Object) "1", obtainLogData);
                if (obtainLogData != null) {
                    alVar.a("is_from_video", obtainLogData.toString());
                }
                Object obtainLogData2 = bVar.obtainLogData("tab_name");
                if (obtainLogData2 != null) {
                    alVar.a("tab_name", obtainLogData2.toString());
                }
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.discover.mob.e eVar = this.f82347b;
            androidx.fragment.app.e activity = this.f82346a.getActivity();
            h.f.b.l.d(alVar, "");
            com.ss.android.ugc.aweme.search.n.f b2 = d.a.b(activity);
            com.ss.android.ugc.aweme.search.k.c f2 = ((com.ss.android.ugc.aweme.search.k.c) alVar.b(eVar.f81896b).n(eVar.f81898d)).c(ac.a.f91473a.a(eVar.f81898d)).d(eVar.f81898d).f(eVar.f81895a);
            com.ss.android.ugc.aweme.search.model.b bVar2 = eVar.f81899e;
            if (bVar2 != null) {
                str = bVar2.getEnterSearchFrom();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.search.k.b o = f2.o(str);
            com.ss.android.ugc.aweme.search.model.b bVar3 = eVar.f81899e;
            if (bVar3 != null) {
                str2 = bVar3.getPreviousPage();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.search.k.b m2 = o.m(str2);
            com.ss.android.ugc.aweme.search.model.b bVar4 = eVar.f81899e;
            if (bVar4 != null) {
                str3 = bVar4.getGroupId();
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.search.k.b i2 = m2.i(str3);
            com.ss.android.ugc.aweme.search.model.b bVar5 = eVar.f81899e;
            if (bVar5 != null) {
                str4 = bVar5.getAuthorId();
            } else {
                str4 = null;
            }
            com.ss.android.ugc.aweme.search.k.b j2 = i2.j(str4);
            if (b2 == null || (searchCommonModel4 = b2.getSearchCommonModel()) == null) {
                str5 = null;
            } else {
                str5 = searchCommonModel4.getEnterFrom();
            }
            com.ss.android.ugc.aweme.search.k.b c2 = j2.c("enter_from_x", str5);
            if (b2 == null || (searchCommonModel3 = b2.getSearchCommonModel()) == null) {
                str6 = null;
            } else {
                str6 = searchCommonModel3.getPreviousPage();
            }
            com.ss.android.ugc.aweme.search.k.b c3 = c2.c("previous_page_x", str6);
            if (b2 == null || (searchVideoModel4 = b2.getSearchVideoModel()) == null) {
                str7 = null;
            } else {
                str7 = searchVideoModel4.getGroupId();
            }
            com.ss.android.ugc.aweme.search.k.b c4 = c3.c("group_id_x", str7);
            if (b2 == null || (searchVideoModel3 = b2.getSearchVideoModel()) == null) {
                str8 = null;
            } else {
                str8 = searchVideoModel3.getAuthorId();
            }
            c4.c("author_id_x", str8).c(al.t, String.valueOf(eVar.f81900f ? 1 : 0));
            JSONObject jSONObject = new JSONObject();
            com.ss.android.ugc.aweme.search.model.b bVar6 = eVar.f81899e;
            if (bVar6 != null) {
                obj = bVar6.getEnterSearchFrom();
            } else {
                obj = null;
            }
            jSONObject.put("enter_from", obj);
            com.ss.android.ugc.aweme.search.model.b bVar7 = eVar.f81899e;
            if (bVar7 != null) {
                obj2 = bVar7.getPreviousPage();
            } else {
                obj2 = null;
            }
            jSONObject.put("previous_page", obj2);
            com.ss.android.ugc.aweme.search.model.b bVar8 = eVar.f81899e;
            if (bVar8 != null) {
                obj3 = bVar8.getGroupId();
            } else {
                obj3 = null;
            }
            jSONObject.put("group_id", obj3);
            com.ss.android.ugc.aweme.search.model.b bVar9 = eVar.f81899e;
            if (bVar9 != null) {
                obj4 = bVar9.getAuthorId();
            } else {
                obj4 = null;
            }
            jSONObject.put("author_id", obj4);
            if (b2 == null || (searchCommonModel2 = b2.getSearchCommonModel()) == null) {
                obj5 = null;
            } else {
                obj5 = searchCommonModel2.getEnterFrom();
            }
            jSONObject.put("enter_from_x", obj5);
            if (b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null) {
                obj6 = null;
            } else {
                obj6 = searchCommonModel.getPreviousPage();
            }
            jSONObject.put("previous_page_x", obj6);
            if (b2 == null || (searchVideoModel2 = b2.getSearchVideoModel()) == null) {
                obj7 = null;
            } else {
                obj7 = searchVideoModel2.getGroupId();
            }
            jSONObject.put("group_id_x", obj7);
            if (b2 == null || (searchVideoModel = b2.getSearchVideoModel()) == null) {
                obj8 = null;
            } else {
                obj8 = searchVideoModel.getAuthorId();
            }
            jSONObject.put("author_id_x", obj8);
            c.a.a("search_install_to_metrics", jSONObject, h.a.am.c("enter_from", "previous_page", "group_id", "author_id"));
            com.ss.android.ugc.aweme.search.model.d dVar = eVar.p;
            if (dVar != null) {
                str9 = dVar.getLastSearchId();
            } else {
                str9 = null;
            }
            if (!TextUtils.isEmpty(str9)) {
                com.ss.android.ugc.aweme.search.model.d dVar2 = eVar.p;
                if (dVar2 != null) {
                    str12 = dVar2.getLastSearchId();
                } else {
                    str12 = null;
                }
                alVar.s(str12);
            } else if (!TextUtils.isEmpty(eVar.o)) {
                alVar.s(eVar.o);
            }
            com.ss.android.ugc.aweme.search.model.d dVar3 = eVar.p;
            if (!(dVar3 == null || (eventKeyword = dVar3.getEventKeyword()) == null || eventKeyword.length() == 0)) {
                com.ss.android.ugc.aweme.search.model.d dVar4 = eVar.p;
                if (dVar4 != null) {
                    str11 = dVar4.getEventKeyword();
                } else {
                    str11 = null;
                }
                alVar.c(al.z, str11);
                com.ss.android.ugc.aweme.search.model.d dVar5 = eVar.p;
                if (dVar5 != null) {
                    dVar5.setEventKeyword("");
                }
            }
            com.ss.android.ugc.aweme.search.model.d dVar6 = eVar.p;
            if (!(dVar6 == null || (utmSource = dVar6.getUtmSource()) == null || utmSource.length() == 0)) {
                com.ss.android.ugc.aweme.search.model.d dVar7 = eVar.p;
                if (dVar7 != null) {
                    str10 = dVar7.getUtmSource();
                } else {
                    str10 = null;
                }
                alVar.c(al.A, str10);
                com.ss.android.ugc.aweme.search.model.d dVar8 = eVar.p;
                if (dVar8 != null) {
                    dVar8.setUtmSource("");
                }
            }
            if (eVar.f81907m) {
                alVar.p("click_more_general_list");
            } else if (eVar.a()) {
                alVar.p("switch_tab");
                alVar.r(com.ss.android.ugc.aweme.discover.mob.m.c(eVar.f81902h));
            } else {
                String str13 = eVar.f81906l;
                if (str13 == null || str13.length() == 0) {
                    eVar.a(alVar);
                } else {
                    alVar.p(eVar.f81906l);
                }
            }
            if (h.f.b.l.a((Object) eVar.f81897c, (Object) "tab_search") || h.f.b.l.a((Object) eVar.f81897c, (Object) "guide_search") || h.f.b.l.a((Object) eVar.f81897c, (Object) "guide_search_cancel") || h.f.b.l.a((Object) eVar.f81897c, (Object) "correct_word")) {
                alVar.p(eVar.f81897c);
                com.ss.android.ugc.aweme.search.model.d dVar9 = eVar.p;
                if (dVar9 == null || (filterOption3 = dVar9.getFilterOption()) == null || (filterByStruct = filterOption3.getFilterByStruct()) == null || (map = filterByStruct.getLogInfo()) == null) {
                    map = new LinkedHashMap<>();
                }
                alVar.a(map);
                com.ss.android.ugc.aweme.search.model.d dVar10 = eVar.p;
                if (dVar10 == null || (filterOption2 = dVar10.getFilterOption()) == null || (sortTypeStruct = filterOption2.getSortTypeStruct()) == null || (map2 = sortTypeStruct.getLogInfo()) == null) {
                    map2 = new LinkedHashMap<>();
                }
                alVar.a(map2);
                com.ss.android.ugc.aweme.search.model.d dVar11 = eVar.p;
                if (!(dVar11 == null || (filterOption = dVar11.getFilterOption()) == null || (activitySwitchOption = filterOption.getActivitySwitchOption()) == null)) {
                    for (T t : activitySwitchOption) {
                        String logInfo = t.getLogInfo();
                        if (logInfo == null) {
                            logInfo = "";
                        }
                        alVar.a(logInfo, t.isSelected() ? 1 : 0);
                    }
                }
            }
            if (z && !this.f82347b.a()) {
                this.f82347b.a(alVar);
            }
            alVar.c(al.s, String.valueOf(this.f82347b.n));
            alVar.f();
            if (this.f82347b.f81904j) {
                alVar.e();
                com.ss.android.ugc.aweme.search.k.m mVar = new com.ss.android.ugc.aweme.search.k.m();
                mVar.a(alVar.f109555g);
                mVar.c(com.ss.android.ugc.aweme.search.k.m.f121261b, String.valueOf(com.ss.android.ugc.aweme.discover.mob.q.f81944b));
                mVar.f();
            }
            return z.f158842a;
        }
    }

    public static final class i extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82342a;

        static {
            Covode.recordClassIndex(51250);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(av avVar) {
            this.f82342a = avVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(recyclerView, "");
        }
    }

    public final void b(boolean z) {
        A().d(z);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82339a;

        static {
            Covode.recordClassIndex(51242);
        }

        b(av avVar) {
            this.f82339a = avVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f82339a.a(0, (com.ss.android.ugc.aweme.search.g.b) null);
        }
    }

    private void a(com.ss.android.ugc.aweme.discover.mob.e eVar) {
        b.i.b(new m(this, eVar), b.i.f4824a);
    }

    public final void a(com.ss.android.ugc.aweme.common.a.f<D> fVar) {
        h.f.b.l.d(fVar, "");
        this.S = fVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        h.f.b.l.d(exc, "");
        if (ab_()) {
            d(exc);
            N();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        h.f.b.l.d(exc, "");
        if (ab_()) {
            L();
            A().i();
        }
    }

    @r
    public final void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        h.f.b.l.d(followStatusEvent, "");
        if (ab_() && A() != null) {
            a(followStatusEvent.status);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82338a;

        static {
            Covode.recordClassIndex(51241);
        }

        a(av avVar) {
            this.f82338a = avVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r3)
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82338a
                boolean r0 = r0.ab_()
                if (r0 == 0) goto L_0x0039
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82338a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.x()
                boolean r0 = r0.l()
                if (r0 != 0) goto L_0x002f
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82338a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.x()
                boolean r0 = r0.m()
                if (r0 != 0) goto L_0x002f
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82338a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.x()
                boolean r0 = r0.n()
                if (r0 == 0) goto L_0x0039
            L_0x002f:
                com.ss.android.ugc.aweme.discover.ui.av r1 = r2.f82338a
                r0 = 1
                r1.U = r0
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82338a
                com.ss.android.ugc.aweme.discover.ui.av.a(r0)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.av.a.onClick(android.view.View):void");
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f82343a;

        static {
            Covode.recordClassIndex(51251);
        }

        j(av avVar) {
            this.f82343a = avVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82343a
                boolean r0 = r0.W
                r1 = 2
                if (r0 != 0) goto L_0x0022
                int r0 = r3.intValue()
                if (r0 != r1) goto L_0x0022
                com.ss.android.ugc.aweme.discover.ui.av r1 = r2.f82343a
                r0 = 1
                r1.W = r0
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82343a
                boolean r0 = r0.U
                if (r0 == 0) goto L_0x002d
                com.ss.android.ugc.aweme.discover.ui.av r0 = r2.f82343a
                com.ss.android.ugc.aweme.discover.ui.av.a(r0)
                return
            L_0x0022:
                int r0 = r3.intValue()
                if (r0 == r1) goto L_0x002d
                com.ss.android.ugc.aweme.discover.ui.av r1 = r2.f82343a
                r0 = 0
                r1.W = r0
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.av.j.onChanged(java.lang.Object):void");
        }
    }

    private void d(Exception exc) {
        h.f.b.l.d(exc, "");
        com.bytedance.ies.dmt.ui.widget.d a2 = com.ss.android.ugc.aweme.discover.ui.d.b.a(E(), null, exc, 1);
        if (a2 != null) {
            a(a2);
            return;
        }
        com.ss.android.ugc.aweme.app.api.b.a.a(getContext(), (Throwable) exc, (int) R.string.g4j);
        K();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void b(SearchApiResult searchApiResult) {
        SearchSurveyConfig surveyConfig;
        SurveyViewModel surveyViewModel;
        NextLiveData<SearchSurveyConfig> nextLiveData;
        SearchSurveyConfig surveyConfig2;
        if (searchApiResult != null) {
            GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
            if (!(globalDoodleConfig == null || (surveyConfig2 = globalDoodleConfig.getSurveyConfig()) == null)) {
                surveyConfig2.getSurveyId();
            }
            GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig2 != null && (surveyConfig = globalDoodleConfig2.getSurveyConfig()) != null && (surveyViewModel = this.ab) != null && (nextLiveData = surveyViewModel.f121647b) != null) {
                nextLiveData.postValue(surveyConfig);
            }
        }
    }

    @r
    public final void onFeedbackSubmitSuccess(com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b bVar) {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        h.f.b.l.d(bVar, "");
        SurveyViewModel surveyViewModel = this.ab;
        if (!(surveyViewModel == null || (nextLiveData2 = surveyViewModel.f121646a) == null)) {
            Boolean.valueOf(nextLiveData2.hasObservers());
        }
        SurveyViewModel surveyViewModel2 = this.ab;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.f121646a) != null) {
            nextLiveData.postValue(true);
        }
    }

    @r
    public void onReceiveVideoEvent(ag agVar) {
        Integer valueOf;
        AppBarLayout z;
        if (agVar != null && (valueOf = Integer.valueOf(agVar.f93450a)) != null && valueOf.intValue() == 21 && (agVar.f93451b instanceof Aweme) && agVar.f93462m && !this.O && (z = z()) != null) {
            z.setExpanded(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        a(true, false);
        if (z) {
            com.ss.android.ugc.aweme.discover.mob.d.f81893l = this.B;
            com.ss.android.ugc.aweme.discover.mob.d.f81885d = false;
            com.ss.android.ugc.aweme.search.model.d dVar = this.r;
            if (dVar != null) {
                dVar.setIndex(this.B);
            }
            this.Y = SystemClock.uptimeMillis();
        }
        if (this.f82337m && !z) {
            p();
        }
        this.f82337m = z;
    }

    public void a(View view) {
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.cbi);
        h.f.b.l.b(findViewById, "");
        this.n = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.e_o);
        h.f.b.l.b(findViewById2, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById2;
        this.o = dmtStatusView;
        if (dmtStatusView == null) {
            h.f.b.l.a("mStatusView");
        }
        dmtStatusView.setOnClickListener(new a(this));
        View findViewById3 = view.findViewById(R.id.dk8);
        h.f.b.l.b(findViewById3, "");
        this.K = (DoubleBallSwipeRefreshLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.aeh);
        h.f.b.l.b(findViewById4, "");
        this.N = (FrameLayout) findViewById4;
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.K;
        if (doubleBallSwipeRefreshLayout == null) {
            h.f.b.l.a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setEnabled(false);
        View findViewById5 = view.findViewById(R.id.c7u);
        h.f.b.l.b(findViewById5, "");
        this.f82330b = (ViewGroup) findViewById5;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(am.G);
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            b((com.ss.android.ugc.aweme.search.model.d) serializable);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        androidx.lifecycle.ac a2 = ae.a(activity, (ad.b) null).a(SearchStateViewModel.class);
        h.f.b.l.b(a2, "");
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) a2;
        this.V = searchStateViewModel;
        if (searchStateViewModel == null) {
            h.f.b.l.a("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new j(this));
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            this.M = (SearchIntermediateViewModel) ae.a(activity2, (ad.b) null).a(SearchIntermediateViewModel.class);
        }
        if (this.D == null) {
            n().a();
        }
    }

    @r
    public void onSearchAfterLogin(com.ss.android.ugc.aweme.discover.e.j jVar) {
        h.f.b.l.d(jVar, "");
        if (jVar.f80963a && ab_()) {
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView == null) {
                h.f.b.l.a("mStatusView");
            }
            if (!dmtStatusView.l()) {
                DmtStatusView dmtStatusView2 = this.o;
                if (dmtStatusView2 == null) {
                    h.f.b.l.a("mStatusView");
                }
                if (!dmtStatusView2.m()) {
                    DmtStatusView dmtStatusView3 = this.o;
                    if (dmtStatusView3 == null) {
                        h.f.b.l.a("mStatusView");
                    }
                    if (!dmtStatusView3.n()) {
                        return;
                    }
                }
            }
            DmtStatusView dmtStatusView4 = this.o;
            if (dmtStatusView4 == null) {
                h.f.b.l.a("mStatusView");
            }
            dmtStatusView4.d();
            this.U = true;
            a(false, false);
        }
    }

    public void b(com.ss.android.ugc.aweme.search.model.d dVar) {
        String str;
        h.f.b.l.d(dVar, "");
        this.r = dVar;
        String keyword = dVar.getKeyword();
        h.f.b.l.b(keyword, "");
        b(keyword);
        String searchFrom = dVar.getSearchFrom();
        h.f.b.l.b(searchFrom, "");
        c(searchFrom);
        this.C = dVar.getNeedCorrect();
        String enterMethod = dVar.getEnterMethod();
        if (enterMethod == null || enterMethod.length() == 0) {
            str = dVar.getSearchFrom();
            h.f.b.l.b(str, "");
        } else {
            str = dVar.getEnterMethod();
            h.f.b.l.b(str, "");
        }
        d(str);
        if (h.f.b.l.a((Object) this.u, (Object) "search_sug")) {
            this.A = dVar.getSugType();
        }
        if (hl.a(dVar.getFromSearchSubtag())) {
            String fromSearchSubtag = dVar.getFromSearchSubtag();
            h.f.b.l.b(fromSearchSubtag, "");
            f(fromSearchSubtag);
        }
        if (hl.a(dVar.getPreSearchId())) {
            String preSearchId = dVar.getPreSearchId();
            h.f.b.l.b(preSearchId, "");
            g(preSearchId);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) ae.a(activity, (ad.b) null).a(SearchResultViewModel.class)).f82802a.postValue(dVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void c_(boolean z) {
        com.ss.android.ugc.aweme.search.g.b bVar;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter2;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> enableSearchFilter3;
        SearchIntermediateViewModel searchIntermediateViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
        n().a(z, getActivity(), this.B, this.r, this.E);
        if (ak.f80153a && r()) {
            com.ss.android.ugc.aweme.search.model.d dVar = this.r;
            if (dVar != null) {
                bVar = dVar.getFilterOption();
            } else {
                bVar = null;
            }
            if (!(bVar != null || (searchIntermediateViewModel = this.M) == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                showSearchFilterDot.setValue(false);
            }
            if (!z) {
                SearchIntermediateViewModel searchIntermediateViewModel2 = this.M;
                if (!(searchIntermediateViewModel2 == null || (enableSearchFilter = searchIntermediateViewModel2.getEnableSearchFilter()) == null)) {
                    enableSearchFilter.setValue(false);
                }
                this.E = false;
            } else if (com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(n().b())) {
                SearchIntermediateViewModel searchIntermediateViewModel3 = this.M;
                if (!(searchIntermediateViewModel3 == null || (enableSearchFilter3 = searchIntermediateViewModel3.getEnableSearchFilter()) == null)) {
                    enableSearchFilter3.setValue(true);
                }
                this.E = true;
            } else {
                SearchIntermediateViewModel searchIntermediateViewModel4 = this.M;
                if (!(searchIntermediateViewModel4 == null || (enableSearchFilter2 = searchIntermediateViewModel4.getEnableSearchFilter()) == null)) {
                    enableSearchFilter2.setValue(false);
                }
                this.E = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(com.bytedance.ies.dmt.ui.widget.d dVar) {
        h.f.b.l.d(dVar, "");
        L();
        if (A().v) {
            A().d(false);
            A().notifyDataSetChanged();
        }
        A().f();
        DmtStatusView dmtStatusView = this.o;
        if (dmtStatusView == null) {
            h.f.b.l.a("mStatusView");
        }
        h.f.b.l.d(dmtStatusView, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(dVar, "");
        if (dVar.w != com.ss.android.ugc.aweme.discover.ui.d.a.EMPTY.getType() && dVar.s) {
            View b2 = dmtStatusView.b(2);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.IDmtDefaultView");
            ((com.bytedance.ies.dmt.ui.widget.g) b2).setStatus(dVar);
            dmtStatusView.h();
        } else {
            View b3 = dmtStatusView.b(1);
            if (b3 instanceof com.bytedance.ies.dmt.ui.widget.g) {
                ((com.bytedance.ies.dmt.ui.widget.g) b3).setStatus(dVar);
            }
            if (b3 instanceof com.ss.android.ugc.aweme.discover.widget.e) {
                ((com.ss.android.ugc.aweme.discover.widget.e) b3).setSearchStatusName(null);
            }
            dmtStatusView.g();
        }
        b_(false);
    }

    public final void a(com.ss.android.ugc.aweme.discover.c.a aVar) {
        h.f.b.l.d(aVar, "");
        this.T = aVar;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(QueryCorrectInfo queryCorrectInfo) {
        com.ss.android.ugc.aweme.discover.widget.c cVar;
        if (ab_()) {
            this.f82336l = queryCorrectInfo;
            if (queryCorrectInfo == null) {
                com.ss.android.ugc.aweme.discover.widget.c cVar2 = this.f82335k;
                if (cVar2 != null) {
                    cVar2.setVisibility(8);
                }
                B().b(this.f82335k);
                this.P = false;
            } else if (o()) {
                B().b(this.f82335k);
            } else {
                if (this.f82335k == null) {
                    Context context = getContext();
                    if (context == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(context, "");
                    this.f82335k = new com.ss.android.ugc.aweme.discover.widget.c(context);
                }
                com.ss.android.ugc.aweme.discover.widget.c cVar3 = this.f82335k;
                if (cVar3 != null) {
                    cVar3.setVisibility(0);
                }
                List<View> a2 = B().a();
                com.ss.android.ugc.aweme.discover.widget.c cVar4 = this.f82335k;
                if (cVar4 == null) {
                    h.f.b.l.b();
                }
                if (!a2.contains(cVar4)) {
                    B().a(0, this.f82335k);
                }
                com.ss.android.ugc.aweme.discover.widget.c cVar5 = this.f82335k;
                if (cVar5 == null) {
                    h.f.b.l.b();
                }
                cVar5.a(queryCorrectInfo, u());
                if (!s() && (cVar = this.f82335k) != null) {
                    cVar.setTopMargin((int) by.a(16));
                }
                R();
                this.P = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.common.e.c
    public void b(List<? extends D> list, boolean z) {
        if (ab_()) {
            if (list == 0 || list.isEmpty()) {
                z = false;
            }
            L();
            if (!z) {
                A().ah_();
            } else {
                A().ai_();
            }
            A().b((List<D>) list);
        }
    }

    public void a(int i2, com.ss.android.ugc.aweme.search.g.b bVar) {
        p<Integer, Long> value;
        Long l2;
        MusicPlayHelper musicPlayHelper;
        p<Integer, Long> value2;
        com.ss.android.ugc.aweme.search.g.b bVar2;
        this.s = this.r;
        Long l3 = null;
        if (bVar == null) {
            this.D = null;
            n().a();
        }
        if (TextUtils.equals(com.ss.android.ugc.aweme.discover.mob.m.c(this.B), com.ss.android.ugc.aweme.search.i.TOP.getTabName())) {
            com.ss.android.ugc.aweme.search.l.a.a.f121305f.onEventStart(this.r);
        }
        com.ss.android.ugc.aweme.search.model.d dVar = this.r;
        if (dVar != null && dVar.getIsFilterFromSchema()) {
            com.ss.android.ugc.aweme.search.model.d dVar2 = this.r;
            if (dVar2 != null) {
                bVar2 = dVar2.getFilterOption();
            } else {
                bVar2 = null;
            }
            this.D = bVar2;
            com.ss.android.ugc.aweme.search.g.b bVar3 = this.D;
            if (bVar3 != null) {
                bVar3.setFromSchema(true);
            }
            com.ss.android.ugc.aweme.search.model.d dVar3 = this.r;
            if (dVar3 != null) {
                dVar3.setIsFilterFromSchema(false);
            }
        }
        R();
        MusicPlayHelper musicPlayHelper2 = this.Z;
        if (!(musicPlayHelper2 == null || musicPlayHelper2.f81004b == null || musicPlayHelper2.f81003a.getValue() == null || (((value = musicPlayHelper2.f81003a.getValue()) == null || value.getFirst().intValue() != 2) && ((value2 = musicPlayHelper2.f81003a.getValue()) == null || value2.getFirst().intValue() != 1)))) {
            p<Integer, Long> value3 = musicPlayHelper2.f81003a.getValue();
            if (value3 != null) {
                l2 = value3.getSecond();
            } else {
                l2 = null;
            }
            Music music = musicPlayHelper2.f81004b;
            if (music != null) {
                l3 = Long.valueOf(music.getId());
            }
            if (h.f.b.l.a(l2, l3) && (musicPlayHelper = this.Z) != null) {
                musicPlayHelper.a();
            }
        }
        com.ss.android.ugc.aweme.search.model.d dVar4 = this.r;
        if (dVar4 != null) {
            dVar4.setFilterOption(bVar);
        }
        this.X = System.currentTimeMillis();
    }

    public void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        I();
        RecyclerView recyclerView = this.n;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView.setLayoutManager(D());
        m();
        a(new com.ss.android.ugc.aweme.discover.c.a(A()));
        com.ss.android.ugc.aweme.common.a.f<D> A = A();
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        A.g(androidx.core.content.b.c(recyclerView2.getContext(), R.color.c5));
        A().a(this);
        RecyclerView recyclerView3 = this.n;
        if (recyclerView3 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView3.setAdapter(B());
        RecyclerView recyclerView4 = this.n;
        if (recyclerView4 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView4.setOverScrollMode(2);
        RecyclerView recyclerView5 = this.n;
        if (recyclerView5 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        RecyclerView.f itemAnimator = recyclerView5.getItemAnimator();
        if (itemAnimator == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(itemAnimator, "");
        itemAnimator.f3833l = 0;
        int i2 = Build.VERSION.SDK_INT;
        RecyclerView recyclerView6 = this.n;
        if (recyclerView6 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        h.f.b.l.d(recyclerView6, "");
        recyclerView6.a(new i(this));
        RecyclerView recyclerView7 = this.n;
        if (recyclerView7 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView7.setClipToPadding(false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        if (r1.equals("com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedFragment") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        if (r1.equals("com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment") != false) goto L_0x0084;
     */
    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.av.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.search.l.k.INSTANCE.getView(getContext(), R.layout.av1, viewGroup);
    }
}
