package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.a.ak;
import com.ss.android.ugc.aweme.discover.e.m;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.lynx.container.f;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.ae;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.aw;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.v;
import com.ss.android.ugc.aweme.search.l.k;
import com.ss.android.ugc.aweme.search.model.SearchResultParamProvider;
import com.ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.ss.android.ugc.aweme.utils.ec;
import com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class u extends am implements aa, ac, i, j {
    private long K;
    private SurveyViewModel L;
    private final h M = ec.a(new b(this));
    private SparseArray N;

    /* renamed from: a  reason: collision with root package name */
    protected DoubleBallSwipeRefreshLayout f82767a;

    /* renamed from: b  reason: collision with root package name */
    public SearchIntermediateViewModel f82768b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.model.d f82769c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f82770d = true;

    /* renamed from: e  reason: collision with root package name */
    protected SearchStateViewModel f82771e;

    /* renamed from: j  reason: collision with root package name */
    public String f82772j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f82773k = true;

    /* renamed from: l  reason: collision with root package name */
    public SearchEnterViewModel f82774l;

    /* renamed from: m  reason: collision with root package name */
    protected f f82775m;
    public ViewGroup n;
    private boolean o;

    static {
        Covode.recordClassIndex(51552);
    }

    private final an n() {
        return (an) this.M.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public View a(int i2) {
        if (this.N == null) {
            this.N = new SparseArray();
        }
        View view = (View) this.N.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.N.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar, String str) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(QueryCorrectInfo queryCorrectInfo) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(SearchApiResult searchApiResult) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void a(SearchPreventSuicide searchPreventSuicide, GlobalDoodleConfig globalDoodleConfig) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public void aT_() {
        SparseArray sparseArray = this.N;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final void b(SearchApiResult searchApiResult) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(305, new g(u.class, "onFeedbackSubmitSuccess", com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(390, new g(u.class, "hideLoadingBall", com.ss.android.ugc.aweme.discover.e.g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(391, new g(u.class, "recordViewDrawEnd", com.ss.android.ugc.aweme.discover.e.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(392, new g(u.class, "setRequestSuccessConfig", m.class, ThreadMode.MAIN, 0, false));
        hashMap.put(306, new g(u.class, "onWebViewActivityCloseEvent", com.ss.android.sdk.webview.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public boolean m() {
        return true;
    }

    @r
    public final void onWebViewActivityCloseEvent(com.ss.android.sdk.webview.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final com.ss.android.ugc.aweme.search.model.d aQ_() {
        return this.s;
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.l.a.e f82780a;

        static {
            Covode.recordClassIndex(51558);
        }

        e(com.ss.android.ugc.aweme.search.l.a.e eVar) {
            this.f82780a = eVar;
        }

        public final void run() {
            this.f82780a.g();
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

    @Override // com.ss.android.ugc.aweme.discover.ui.ac
    public final WeakReference<androidx.fragment.app.e> aR_() {
        return new WeakReference<>(getActivity());
    }

    /* access modifiers changed from: protected */
    public final SearchStateViewModel b() {
        SearchStateViewModel searchStateViewModel = this.f82771e;
        if (searchStateViewModel == null) {
            l.a("mStateViewModel");
        }
        return searchStateViewModel;
    }

    /* access modifiers changed from: protected */
    public final f d() {
        f fVar = this.f82775m;
        if (fVar == null) {
            l.a("dynamicViewsContainer");
        }
        return fVar;
    }

    public final void g() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f82767a;
        if (doubleBallSwipeRefreshLayout == null) {
            l.a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setRefreshing(false);
    }

    /* access modifiers changed from: protected */
    public final void h() {
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = this.f82767a;
        if (doubleBallSwipeRefreshLayout == null) {
            l.a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setRefreshing(true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.o) {
            o();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.K = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.container.e f82776a;

        static {
            Covode.recordClassIndex(51553);
        }

        a(com.ss.android.ugc.aweme.discover.lynx.container.e eVar) {
            this.f82776a = eVar;
        }

        public final void run() {
            RecyclerView.ViewHolder a2 = this.f82776a.getRecyclerView().a(0, false);
            if (a2 != null && (a2 instanceof com.ss.android.ugc.aweme.discover.lynx.e.a)) {
                View view = a2.itemView;
                l.b(view, "");
                view.getLayoutParams().height = -1;
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<an> {
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(51554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar) {
            super(0);
            this.this$0 = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ an invoke() {
            an anVar = new an();
            anVar.a(com.ss.android.ugc.aweme.search.j.a(this.this$0.t), this.this$0.getActivity());
            anVar.f82297d = new com.ss.android.ugc.aweme.search.g.d(this) {
                /* class com.ss.android.ugc.aweme.discover.ui.u.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f82777a;

                static {
                    Covode.recordClassIndex(51555);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82777a = r1;
                }

                @Override // com.ss.android.ugc.aweme.search.g.d
                public final void a(com.ss.android.ugc.aweme.search.g.b bVar) {
                    com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> showSearchFilterDot;
                    boolean z;
                    this.f82777a.this$0.a(1, bVar);
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f82777a.this$0.f82768b;
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
                    l.d(str, "");
                    this.f82777a.this$0.c(str);
                    this.f82777a.this$0.D = bVar;
                }
            };
            return anVar;
        }
    }

    private void q() {
        if (!TextUtils.isEmpty(u())) {
            b.i.b(new c(this), b.i.f4824a);
        }
    }

    public final void i() {
        SearchStateViewModel searchStateViewModel = this.f82771e;
        if (searchStateViewModel == null) {
            l.a("mStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(false);
        new v("query_sign").f();
        com.ss.android.ugc.aweme.discover.mob.d.f81883b = false;
        com.ss.android.ugc.aweme.discover.mob.d.f81892k = this.B;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.discover.ui.am, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            l.b(view, "");
            j.a.b(view);
        }
        super.onDestroyView();
        EventBus.a().b(this);
        aT_();
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f82778a;

        static {
            Covode.recordClassIndex(51556);
        }

        c(u uVar) {
            this.f82778a = uVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_word", this.f82778a.u());
                if (l.a((Object) this.f82778a.u, (Object) "search_history")) {
                    this.f82778a.e("search_history");
                } else if (l.a((Object) this.f82778a.u, (Object) "search_sug")) {
                    this.f82778a.e("search_sug");
                } else {
                    this.f82778a.e("normal_search");
                }
                jSONObject.put("enter_from", this.f82778a.w);
            } catch (JSONException unused) {
            }
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("search").setLabelName(this.f82778a.c()).setJsonObject(jSONObject));
            return z.f158842a;
        }
    }

    private final void o() {
        Integer num;
        String str;
        ad b2;
        String str2;
        long uptimeMillis = SystemClock.uptimeMillis() - this.K;
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
                ((aw) new aw().r(String.valueOf(uptimeMillis)).f(com.ss.android.ugc.aweme.search.j.a(this.B)).a(str3).d(str3).c(ac.a.f91473a.a(str3))).s(str).b(u()).c("search_id_x", this.q.getSearchId()).f();
            }
        }
        str = str3;
        q a22 = am.a();
        str3 = str2;
        ((aw) new aw().r(String.valueOf(uptimeMillis)).f(com.ss.android.ugc.aweme.search.j.a(this.B)).a(str3).d(str3).c(ac.a.f91473a.a(str3))).s(str).b(u()).c("search_id_x", this.q.getSearchId()).f();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r3.equals(r4) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String p() {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.u.p():java.lang.String");
    }

    public final void a(GlobalDoodleConfig globalDoodleConfig) {
        SurveyViewModel surveyViewModel;
        NextLiveData<SearchSurveyConfig> nextLiveData;
        if (globalDoodleConfig != null) {
            SearchSurveyConfig surveyConfig = globalDoodleConfig.getSurveyConfig();
            if (!(surveyConfig == null || (surveyViewModel = this.L) == null || (nextLiveData = surveyViewModel.f121647b) == null)) {
                nextLiveData.postValue(surveyConfig);
            }
            boolean z = true;
            if (globalDoodleConfig.getDisplayFilterBar() != 1) {
                z = false;
            }
            c_(z);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void setRequestSuccessConfig(m mVar) {
        l.d(mVar, "");
        a(mVar.f80966a);
        a(mVar.f80967b);
        i();
    }

    static final class d<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f82779a;

        static {
            Covode.recordClassIndex(51557);
        }

        d(u uVar) {
            this.f82779a = uVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            if (!this.f82779a.f82773k && num.intValue() == 2) {
                this.f82779a.f82773k = true;
                if (this.f82779a.f82770d) {
                    this.f82779a.b(false);
                }
            } else if (num.intValue() != 2) {
                this.f82779a.f82773k = false;
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void hideLoadingBall(com.ss.android.ugc.aweme.discover.e.g gVar) {
        l.d(gVar, "");
        if ((l.a((Object) gVar.f80960a, (Object) "vertical-sounds") || l.a((Object) gVar.f80960a, (Object) "vertical-shopping")) && ab_()) {
            g();
        }
    }

    @r
    public final void onFeedbackSubmitSuccess(com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b bVar) {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        l.d(bVar, "");
        SurveyViewModel surveyViewModel = this.L;
        if (!(surveyViewModel == null || (nextLiveData2 = surveyViewModel.f121646a) == null)) {
            Boolean.valueOf(nextLiveData2.hasObservers());
        }
        SurveyViewModel surveyViewModel2 = this.L;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.f121646a) != null) {
            nextLiveData.postValue(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        b(true);
        if (z) {
            com.ss.android.ugc.aweme.discover.mob.d.f81893l = this.B;
            com.ss.android.ugc.aweme.discover.mob.d.f81885d = false;
            com.ss.android.ugc.aweme.discover.mob.d.f81891j = false;
            com.ss.android.ugc.aweme.search.model.d dVar = this.r;
            if (dVar != null) {
                dVar.setIndex(this.B);
            }
            this.K = SystemClock.uptimeMillis();
        }
        if (this.o && !z) {
            o();
        }
        this.o = z;
    }

    private void a(String str) {
        int i2;
        String str2;
        String str3;
        androidx.fragment.app.e activity = getActivity();
        int i3 = 0;
        if (activity != null) {
            i2 = activity.hashCode();
        } else {
            i2 = 0;
        }
        q a2 = am.a(i2);
        if (a2 == null) {
            a2 = new ae();
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                i3 = activity2.hashCode();
            }
            am.a(i3, a2);
        }
        int i4 = this.B;
        ad adVar = new ad();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        adVar.a(str2);
        adVar.b(u());
        a2.a(i4, adVar);
        com.ss.android.ugc.aweme.search.n.b bVar = this.p;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        bVar.a(str3);
        bVar.b(u());
        com.ss.android.ugc.aweme.search.n.h hVar = this.q;
        if (str == null) {
            str = "";
        }
        hVar.setSearchId(str);
        hVar.setSearchKeyword(u());
    }

    private void b(com.ss.android.ugc.aweme.search.model.d dVar) {
        String str;
        l.d(dVar, "");
        this.r = dVar;
        String keyword = dVar.getKeyword();
        l.b(keyword, "");
        b(keyword);
        String searchFrom = dVar.getSearchFrom();
        l.b(searchFrom, "");
        c(searchFrom);
        this.C = dVar.getNeedCorrect();
        String enterMethod = dVar.getEnterMethod();
        if (enterMethod == null || enterMethod.length() == 0) {
            str = dVar.getSearchFrom();
            l.b(str, "");
        } else {
            str = dVar.getEnterMethod();
            l.b(str, "");
        }
        d(str);
        if (l.a((Object) this.u, (Object) "search_sug")) {
            this.A = dVar.getSugType();
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ((SearchResultViewModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(SearchResultViewModel.class)).f82802a.postValue(dVar);
        }
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
            l.b();
        }
        androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a(activity, (ad.b) null).a(SearchStateViewModel.class);
        l.b(a2, "");
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) a2;
        this.f82771e = searchStateViewModel;
        if (searchStateViewModel == null) {
            l.a("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new d(this));
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            this.f82768b = (SearchIntermediateViewModel) androidx.lifecycle.ae.a(activity2, (ad.b) null).a(SearchIntermediateViewModel.class);
        }
        if (this.D == null) {
            n().a();
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void recordViewDrawEnd(com.ss.android.ugc.aweme.discover.e.e eVar) {
        com.ss.android.ugc.aweme.search.k.ad b2;
        String str;
        String str2 = "";
        l.d(eVar, str2);
        q a2 = am.a();
        if (!(a2 == null || (b2 = a2.b(this.B)) == null || (str = b2.f121172a) == null)) {
            str2 = str;
        }
        com.ss.android.ugc.aweme.search.l.a.e a3 = com.ss.android.ugc.aweme.search.l.a.g.a(this.r).b(eVar.f80953d).a(eVar.f80951b).c(eVar.f80952c).a(str2);
        a3.f121342c = eVar.f80950a;
        a3.f121343d = eVar.f80954e;
        a3.z = true;
        View view = getView();
        if (view != null) {
            view.post(new e(a3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) "guide_search_cancel") != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r4) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.u.b(boolean):void");
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
            if (!(bVar != null || (searchIntermediateViewModel = this.f82768b) == null || (showSearchFilterDot = searchIntermediateViewModel.getShowSearchFilterDot()) == null)) {
                showSearchFilterDot.setValue(false);
            }
            if (!z) {
                SearchIntermediateViewModel searchIntermediateViewModel2 = this.f82768b;
                if (!(searchIntermediateViewModel2 == null || (enableSearchFilter = searchIntermediateViewModel2.getEnableSearchFilter()) == null)) {
                    enableSearchFilter.setValue(false);
                }
                this.E = false;
            } else if (com.ss.android.ugc.aweme.discover.ui.a.b.a.b.a(n().b())) {
                SearchIntermediateViewModel searchIntermediateViewModel3 = this.f82768b;
                if (!(searchIntermediateViewModel3 == null || (enableSearchFilter3 = searchIntermediateViewModel3.getEnableSearchFilter()) == null)) {
                    enableSearchFilter3.setValue(true);
                }
                this.E = true;
            } else {
                SearchIntermediateViewModel searchIntermediateViewModel4 = this.f82768b;
                if (!(searchIntermediateViewModel4 == null || (enableSearchFilter2 = searchIntermediateViewModel4.getEnableSearchFilter()) == null)) {
                    enableSearchFilter2.setValue(false);
                }
                this.E = false;
            }
        }
    }

    public final void a(LogPbBean logPbBean) {
        String imprId;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            a(imprId);
            ac.a.f91473a.a(imprId, logPbBean);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        l.d(dVar, "");
        this.f82769c = dVar;
        super.a(dVar);
        this.f82770d = true;
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
            l.b();
        }
        l.b(context, "");
        SearchResultParamProvider.a.a(context, dVar);
        b(false);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        f fVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.dk8);
        l.b(findViewById, "");
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) findViewById;
        this.f82767a = doubleBallSwipeRefreshLayout;
        if (doubleBallSwipeRefreshLayout == null) {
            l.a("mRefreshLayout");
        }
        doubleBallSwipeRefreshLayout.setEnabled(false);
        int i2 = Build.VERSION.SDK_INT;
        if (m()) {
            fVar = new com.ss.android.ugc.aweme.discover.lynx.spark.container.a(this);
        } else {
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            com.ss.android.ugc.aweme.discover.lynx.container.e eVar = new com.ss.android.ugc.aweme.discover.lynx.container.e(context);
            com.ss.android.ugc.aweme.discover.lynx.container.c containerAdapter = eVar.getContainerAdapter();
            fVar = eVar;
            if (containerAdapter != null) {
                containerAdapter.f81459c = u();
                fVar = eVar;
            }
        }
        this.f82775m = fVar;
        ViewGroup viewGroup = this.n;
        if (viewGroup == null) {
            l.a("mDynamicFragment");
        }
        fVar.a(viewGroup, new ViewGroup.LayoutParams(-1, -1));
        ViewGroup viewGroup2 = this.n;
        if (viewGroup2 == null) {
            l.a("mDynamicFragment");
        }
        viewGroup2.setVisibility(0);
        if (this.r != null) {
            com.ss.android.ugc.aweme.search.model.d dVar = this.r;
            if (dVar == null) {
                l.b();
            }
            a(dVar);
        }
        EventBus.a(EventBus.a(), this);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            this.f82774l = (SearchEnterViewModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(SearchEnterViewModel.class);
            this.L = (SurveyViewModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(SurveyViewModel.class);
        }
        com.ss.android.ugc.aweme.search.feedback.a.a(getActivity());
        d(p());
        f fVar2 = this.f82775m;
        if (fVar2 == null) {
            l.a("dynamicViewsContainer");
        }
        a(fVar2);
        if (!m()) {
            f fVar3 = this.f82775m;
            if (fVar3 == null) {
                l.a("dynamicViewsContainer");
            }
            Objects.requireNonNull(fVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.lynx.container.DynamicViewsContainer");
            com.ss.android.ugc.aweme.discover.lynx.container.e eVar2 = (com.ss.android.ugc.aweme.discover.lynx.container.e) fVar3;
            RecyclerView recyclerView = eVar2.getRecyclerView();
            getContext();
            recyclerView.setLayoutManager(new DynamicSearchFragment$handleTouchActionForBullet$1(this));
            eVar2.post(new a(eVar2));
        }
        h();
    }

    public void a(int i2, com.ss.android.ugc.aweme.search.g.b bVar) {
        com.ss.android.ugc.aweme.search.model.b bVar2;
        int i3;
        String str;
        String str2;
        com.ss.android.ugc.aweme.search.g.b filterOption;
        com.ss.android.ugc.aweme.search.g.b filterOption2;
        com.ss.android.ugc.aweme.search.g.b filterOption3;
        com.ss.android.ugc.aweme.search.g.b bVar3;
        this.s = this.r;
        String str3 = null;
        if (bVar == null) {
            this.D = null;
            n().a();
        }
        com.ss.android.ugc.aweme.search.model.d dVar = this.r;
        int i4 = 0;
        int i5 = 1;
        if (dVar != null && dVar.getIsFilterFromSchema()) {
            com.ss.android.ugc.aweme.search.model.d dVar2 = this.r;
            if (dVar2 != null) {
                bVar3 = dVar2.getFilterOption();
            } else {
                bVar3 = null;
            }
            this.D = bVar3;
            com.ss.android.ugc.aweme.search.g.b bVar4 = this.D;
            if (bVar4 != null) {
                bVar4.setFromSchema(true);
            }
            com.ss.android.ugc.aweme.search.model.d dVar3 = this.r;
            if (dVar3 != null) {
                dVar3.setIsFilterFromSchema(false);
            }
        }
        com.ss.android.ugc.aweme.search.model.d dVar4 = this.r;
        if (dVar4 != null) {
            dVar4.setFilterOption(bVar);
        }
        SearchStateViewModel searchStateViewModel = this.f82771e;
        if (searchStateViewModel == null) {
            l.a("mStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(true);
        d(p());
        SearchEnterViewModel searchEnterViewModel = this.f82774l;
        if (searchEnterViewModel != null) {
            bVar2 = searchEnterViewModel.f82794a;
        } else {
            bVar2 = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("keyword", u());
        jSONObject.put("search_source", this.v);
        jSONObject.put("query_correct_type", this.C);
        com.ss.android.ugc.aweme.search.model.d dVar5 = this.r;
        if (dVar5 == null || (filterOption3 = dVar5.getFilterOption()) == null || filterOption3.isDefaultOption()) {
            i5 = 0;
        }
        jSONObject.put("is_filter_search", i5);
        com.ss.android.ugc.aweme.search.model.d dVar6 = this.r;
        if (dVar6 == null || (filterOption2 = dVar6.getFilterOption()) == null) {
            i3 = 0;
        } else {
            i3 = filterOption2.getFilterBy();
        }
        jSONObject.put("filter_by", i3);
        com.ss.android.ugc.aweme.search.model.d dVar7 = this.r;
        if (!(dVar7 == null || (filterOption = dVar7.getFilterOption()) == null)) {
            i4 = filterOption.getSortType();
        }
        jSONObject.put("sort_type", i4);
        jSONObject.put("search_context", s.a.a().a());
        if (bVar2 != null) {
            str = bVar2.getEnterSearchFrom();
        } else {
            str = null;
        }
        jSONObject.put("enter_from", str);
        if (bVar2 != null) {
            str2 = bVar2.getGroupId();
        } else {
            str2 = null;
        }
        jSONObject.put("group_id", str2);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        jSONObject.put("current_uid", g2.getCurUserId());
        if (com.ss.android.ugc.aweme.discover.mob.d.f81892k != this.B) {
            jSONObject.put("from_search_subtab", com.ss.android.ugc.aweme.discover.mob.m.c(com.ss.android.ugc.aweme.discover.mob.d.f81892k));
        }
        jSONObject.put("enter_method", this.v);
        jSONObject.put("last_search_id", this.f82772j);
        com.ss.android.ugc.aweme.search.model.d dVar8 = this.r;
        if (dVar8 != null) {
            str3 = dVar8.getSugType();
        }
        jSONObject.put("sug_type", str3);
        f fVar = this.f82775m;
        if (fVar == null) {
            l.a("dynamicViewsContainer");
        } else {
            fVar.a("changeSearchParams", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View view = k.INSTANCE.getView(getContext(), R.layout.av1, viewGroup);
        View findViewById = view.findViewById(R.id.arb);
        l.b(findViewById, "");
        this.n = (ViewGroup) findViewById;
        return view;
    }
}
