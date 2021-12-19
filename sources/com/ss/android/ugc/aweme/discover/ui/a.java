package com.ss.android.ugc.aweme.discover.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.a.ad;
import com.ss.android.ugc.aweme.discover.a.ah;
import com.ss.android.ugc.aweme.discover.a.aj;
import com.ss.android.ugc.aweme.discover.a.al;
import com.ss.android.ugc.aweme.discover.j.c;
import com.ss.android.ugc.aweme.discover.lynx.spark.b.e;
import com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.lego.c.a;
import com.ss.android.ugc.aweme.search.k.ay;
import com.ss.android.ugc.aweme.search.k.be;
import com.ss.android.ugc.aweme.search.k.bi;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.ec;
import com.ss.android.ugc.aweme.utils.gt;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.EventBus;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.discover.g.a, c.a, a.AbstractC2762a {

    /* renamed from: m  reason: collision with root package name */
    public static final C1922a f82173m = new C1922a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.c.a f82174a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f82175b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f82176c;

    /* renamed from: d  reason: collision with root package name */
    protected SearchIntermediateViewModel f82177d;

    /* renamed from: e  reason: collision with root package name */
    protected SearchStateViewModel f82178e;

    /* renamed from: j  reason: collision with root package name */
    public int f82179j;

    /* renamed from: k  reason: collision with root package name */
    public SearchSugMobHelper f82180k;

    /* renamed from: l  reason: collision with root package name */
    public int f82181l;
    private final h.h n = ec.a(new j(this));
    private com.ss.android.ugc.aweme.discover.j.p o;
    private SearchKeywordPresenter p;
    private SugKeywordPresenter q;
    private final h.h r = ec.a(new h(this));
    private final h.h s = ec.a(i.f82252a);
    private Integer t;
    private long u;
    private boolean v;
    private SparseArray w;

    public static final class b extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        public static final C1925a f82201a = new C1925a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private final Drawable f82202b;

        static {
            Covode.recordClassIndex(51136);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$b$a  reason: collision with other inner class name */
        public static final class C1925a {
            static {
                Covode.recordClassIndex(51137);
            }

            private C1925a() {
            }

            public /* synthetic */ C1925a(byte b2) {
                this();
            }
        }

        public b(Drawable drawable) {
            h.f.b.l.d(drawable, "");
            this.f82202b = drawable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(canvas, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            if (recyclerView.getChildCount() >= 2) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int m2 = linearLayoutManager.m();
                recyclerView.f(m2);
                int k2 = (m2 - linearLayoutManager.k()) - 1;
                if (k2 >= 0) {
                    recyclerView.getPaddingLeft();
                    com.bytedance.common.utility.n.b(recyclerView.getContext(), 16.0f);
                    recyclerView.getWidth();
                    recyclerView.getPaddingRight();
                    com.bytedance.common.utility.n.b(recyclerView.getContext(), 16.0f);
                    View childAt = recyclerView.getChildAt(k2);
                    h.f.b.l.b(childAt, "");
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    childAt.getBottom();
                    int i2 = ((RecyclerView.j) layoutParams).bottomMargin;
                    this.f82202b.getIntrinsicHeight();
                    this.f82202b.draw(canvas);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            h.f.b.l.d(rect, "");
            h.f.b.l.d(view, "");
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(sVar, "");
            rect.set(0, 0, 0, this.f82202b.getIntrinsicHeight());
        }
    }

    static {
        Covode.recordClassIndex(51134);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public boolean H() {
        return true;
    }

    public final com.ss.android.ugc.aweme.discover.adapter.b.d g() {
        return (com.ss.android.ugc.aweme.discover.adapter.b.d) this.n.getValue();
    }

    /* access modifiers changed from: protected */
    public final ISearchHistoryManager j() {
        return (ISearchHistoryManager) this.r.getValue();
    }

    /* access modifiers changed from: protected */
    public final CopyOnWriteArrayList<SearchHistory> k() {
        return (CopyOnWriteArrayList) this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        x();
    }

    public void x() {
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$a  reason: collision with other inner class name */
    public static final class C1922a {
        static {
            Covode.recordClassIndex(51135);
        }

        private C1922a() {
        }

        public /* synthetic */ C1922a(byte b2) {
            this();
        }
    }

    public static final class e extends RecyclerView.n {
        static {
            Covode.recordClassIndex(51140);
        }

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            KeyboardUtils.c(recyclerView);
        }
    }

    public final void a(String str, String str2, String str3) {
        SmartRouter.buildRoute(getContext(), "aweme://user/profile/").withParam("sec_user_id", str).withParam("uid", str2).withParam("enter_from", "search_most_visited").withCallback(new f(this, str3)).open(1, new g(this));
    }

    static final class i extends h.f.b.m implements h.f.a.a<CopyOnWriteArrayList<SearchHistory>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f82252a = new i();

        static {
            Covode.recordClassIndex(51145);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArrayList<SearchHistory> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.g.a
    public int a() {
        return SearchHistory.toHistoryType(Integer.MIN_VALUE);
    }

    public static final class d implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82247a;

        static {
            Covode.recordClassIndex(51139);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f82247a.u());
        }

        d(a aVar) {
            this.f82247a = aVar;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<ISearchHistoryManager> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchHistoryManager invoke() {
            return SearchHistoryManager.inst(this.this$0.r());
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.discover.adapter.b.d> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(51146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.adapter.b.d invoke() {
            return new com.ss.android.ugc.aweme.discover.adapter.b.d(this.this$0.getActivity());
        }
    }

    private final String y() {
        String a2;
        SugKeywordPresenter sugKeywordPresenter = this.q;
        if (sugKeywordPresenter == null || (a2 = sugKeywordPresenter.a()) == null) {
            return "";
        }
        return a2;
    }

    public final RecyclerView d() {
        RecyclerView recyclerView = this.f82175b;
        if (recyclerView == null) {
            h.f.b.l.a("mListView");
        }
        return recyclerView;
    }

    public final ViewGroup e() {
        ViewGroup viewGroup = this.f82176c;
        if (viewGroup == null) {
            h.f.b.l.a("mRNFragment");
        }
        return viewGroup;
    }

    public final SearchIntermediateViewModel h() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82177d;
        if (searchIntermediateViewModel == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    /* access modifiers changed from: protected */
    public final SearchStateViewModel i() {
        SearchStateViewModel searchStateViewModel = this.f82178e;
        if (searchStateViewModel == null) {
            h.f.b.l.a("mSearchStateViewModel");
        }
        return searchStateViewModel;
    }

    public void n() {
        com.ss.android.ugc.aweme.discover.j.p pVar = new com.ss.android.ugc.aweme.discover.j.p();
        this.o = pVar;
        pVar.a_(this);
    }

    public final String t() {
        return com.ss.android.ugc.aweme.discover.mob.m.b(u());
    }

    public static final class f extends AbsOpenResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82249b;

        static {
            Covode.recordClassIndex(51141);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.a$f$a  reason: collision with other inner class name */
        static final class RunnableC1930a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f82250a;

            static {
                Covode.recordClassIndex(51142);
            }

            RunnableC1930a(f fVar) {
                this.f82250a = fVar;
            }

            public final void run() {
                this.f82250a.f82248a.j().recordSearchHistory(new SearchHistory(this.f82250a.f82249b, 0));
            }
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onSuccess(Intent intent) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1930a(this), 500);
            this.f82248a.h();
            this.f82248a.i().setIsLeavingSearch(true);
        }

        f(a aVar, String str) {
            this.f82248a = aVar;
            this.f82249b = str;
        }
    }

    public void m() {
        g().f80469e = this;
        g().f80468d = r();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (H()) {
            EventBus a2 = EventBus.a();
            if (!a2.a(this)) {
                EventBus.a(a2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final List<SearchHistory> s() {
        List<SearchHistory> searchHistoryByType = j().getSearchHistoryByType(SearchHistory.toHistoryType(Integer.MIN_VALUE));
        h.f.b.l.b(searchHistoryByType, "");
        return searchHistoryByType;
    }

    public final int u() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82177d;
        if (searchIntermediateViewModel == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getSearchTabIndex().getValue();
        if (value != null) {
            return value.intValue();
        }
        return -1;
    }

    static final class c extends h.f.b.m implements h.f.a.a<List<com.ss.android.ugc.aweme.search.model.e>> {
        final /* synthetic */ ArrayList $accountList;
        final /* synthetic */ SearchSugResponse $response;
        final /* synthetic */ ArrayList $textList;

        static {
            Covode.recordClassIndex(51138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, ArrayList arrayList2, SearchSugResponse searchSugResponse) {
            super(0);
            this.$accountList = arrayList;
            this.$textList = arrayList2;
            this.$response = searchSugResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<com.ss.android.ugc.aweme.search.model.e> invoke() {
            ArrayList arrayList = new ArrayList();
            if (!this.$accountList.isEmpty()) {
                arrayList.addAll(this.$textList);
                com.ss.android.ugc.aweme.search.model.e eVar = new com.ss.android.ugc.aweme.search.model.e();
                eVar.f121525h = 5;
                h.f.b.l.b(eVar, "");
                arrayList.add(eVar);
                arrayList.addAll(this.$accountList);
            } else if (ah.f80146b) {
                List<com.ss.android.ugc.aweme.search.model.e> list = this.$response.sugList;
                h.f.b.l.b(list, "");
                arrayList.addAll(list);
            } else {
                arrayList.addAll(this.$textList);
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.j.c.a
    public final void aW_() {
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            if (!activity.isFinishing()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.de2).a();
            }
        }
    }

    public final boolean l() {
        if (((al.f80155a || aj.f80151a) && bj.a(getActivity())) || SearchEnterViewModel.a.a(getActivity()).a()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f82179j != 0) {
            RecyclerView recyclerView = this.f82175b;
            if (recyclerView == null) {
                h.f.b.l.a("mListView");
            }
            if (recyclerView.getAdapter() instanceof com.ss.android.ugc.aweme.discover.adapter.b.d) {
                RecyclerView recyclerView2 = this.f82175b;
                if (recyclerView2 == null) {
                    h.f.b.l.a("mListView");
                }
                RecyclerView.a adapter = recyclerView2.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.sug.SearchSugAdapter");
                if (adapter.getItemCount() > 0) {
                    v();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (H()) {
            EventBus a2 = EventBus.a();
            if (a2.a(this)) {
                a2.b(this);
            }
        }
        SearchStateViewModel searchStateViewModel = this.f82178e;
        if (searchStateViewModel == null) {
            h.f.b.l.a("mSearchStateViewModel");
        }
        searchStateViewModel.setSearchPageVisible(false);
        SearchStateViewModel searchStateViewModel2 = this.f82178e;
        if (searchStateViewModel2 == null) {
            h.f.b.l.a("mSearchStateViewModel");
        }
        searchStateViewModel2.setIsLeavingSearch(false);
    }

    public void p() {
        this.f82179j = 1;
        k().clear();
        g().a();
        k().addAll(s());
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82177d;
        if (searchIntermediateViewModel == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        if (true ^ searchIntermediateViewModel.backFromSearchResult) {
            com.ss.android.ugc.aweme.search.e.d.f121005a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final String r() {
        String enterSearchFrom;
        com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
        if (bVar == null || TextUtils.isEmpty(bVar.getEnterSearchFrom()) || (enterSearchFrom = bVar.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    public final void v() {
        ((ay) new ay().q("show")).r(y()).c(ac.a.f91473a.a(g().f80466b)).f(com.ss.android.ugc.aweme.discover.mob.m.b(u())).f();
    }

    public final String w() {
        Object obtainLogData = SearchEnterViewModel.a.a(getActivity()).b().obtainLogData("search_position");
        if (obtainLogData != null) {
            return obtainLogData.toString();
        }
        String a2 = com.ss.android.ugc.aweme.discover.mob.m.a(u());
        if (TextUtils.isEmpty(a2)) {
            return r();
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.discover.g.a
    public final void aX_() {
        String str;
        com.ss.android.ugc.aweme.discover.adapter.b.d g2 = g();
        String y = y();
        String str2 = null;
        if (g2.f80465a != null && y.equals(g2.f80472h)) {
            for (com.ss.android.ugc.aweme.search.model.e eVar : g2.f80465a) {
                com.ss.android.ugc.aweme.search.model.i iVar = eVar.f121524g;
                if (iVar != null && iVar.matchQuery()) {
                    SearchSugMobHelper searchSugMobHelper = this.f82180k;
                    if (searchSugMobHelper != null) {
                        h.f.b.l.d(this, "");
                        h.f.b.l.d(eVar, "");
                        if (com.ss.android.ugc.aweme.search.h.f121133a.a((Activity) getActivity())) {
                            str = com.ss.android.ugc.aweme.discover.mob.m.a(u());
                        } else {
                            str = "discovery";
                        }
                        be beVar = new be();
                        Word word = eVar.f121523f;
                        bk w2 = beVar.d(word != null ? Integer.valueOf(word.getWordPosition()) : null).v("sug").x(searchSugMobHelper.f81920b).w(eVar.f121519b);
                        LogPbBean logPbBean = searchSugMobHelper.f81919a;
                        bk bkVar = (bk) w2.d(logPbBean != null ? logPbBean.getImprId() : null);
                        RecommendWordMob recommendWordMob = searchSugMobHelper.f81922d;
                        bk z = bkVar.z(recommendWordMob != null ? recommendWordMob.getQueryId() : null);
                        Word word2 = eVar.f121523f;
                        if (word2 != null) {
                            str2 = word2.getId();
                        }
                        ((bk) z.i(str2)).y(str).f();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public boolean o() {
        Context context;
        if (!ab_() || !getUserVisibleHint()) {
            return false;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82177d;
        if (searchIntermediateViewModel == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
        if (value == null) {
            return false;
        }
        if (value.intValue() == 1) {
            p();
        } else if (value.intValue() == 2) {
            q();
        } else if (value.intValue() == 0) {
            this.f82179j = 0;
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f82177d;
        if (searchIntermediateViewModel2 == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        Integer value2 = searchIntermediateViewModel2.getIntermediateState().getValue();
        if (value2 != null && ((value2.intValue() == 1 || value2.intValue() == 2) && (context = getContext()) != null)) {
            h.f.b.l.b(context, "");
            h.f.b.l.d(context, "");
            if (com.bytedance.ies.abmock.b.a().a(true, "preload_without_forecast", false)) {
                String a2 = SettingsManager.a().a("search_user_lynx_card_schema", "");
                h.f.b.l.b(a2, "");
                if (hk.a(a2) && !com.ss.android.ugc.aweme.discover.lynx.b.b.a(a2)) {
                    Looper.myQueue().addIdleHandler(new e.a(context, a2));
                }
            }
        }
        return true;
    }

    static final class p<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchSugResponse f82259b;

        static {
            Covode.recordClassIndex(51152);
        }

        p(a aVar, SearchSugResponse searchSugResponse) {
            this.f82258a = aVar;
            this.f82259b = searchSugResponse;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<com.ss.android.ugc.aweme.search.model.e> list;
            String r;
            SearchSugResponse searchSugResponse = this.f82259b;
            if (!com.ss.android.ugc.aweme.discover.a.a.a(searchSugResponse.requestSource)) {
                list = searchSugResponse.sugList;
                h.f.b.l.b(list, "");
            } else {
                int a2 = com.ss.android.ugc.aweme.discover.a.d.a();
                int b2 = com.ss.android.ugc.aweme.discover.a.d.b();
                ArrayList arrayList = new ArrayList(a2);
                ArrayList arrayList2 = new ArrayList(b2);
                c cVar = new c(arrayList2, arrayList, searchSugResponse);
                List<com.ss.android.ugc.aweme.search.model.e> list2 = searchSugResponse.sugList;
                h.f.b.l.b(list2, "");
                for (T t : list2) {
                    if (arrayList.size() >= a2 && arrayList2.size() >= b2) {
                        break;
                    }
                    int a3 = com.ss.android.ugc.aweme.discover.adapter.b.l.a(t, searchSugResponse.requestSource);
                    if (a3 == 0 || a3 == 1) {
                        if (arrayList.size() < a2) {
                            h.f.b.l.b(t, "");
                            t.f121525h = 0;
                            t.f121526i = arrayList.size();
                            arrayList.add(t);
                        }
                    } else if (a3 == 4 && arrayList2.size() < b2) {
                        h.f.b.l.b(t, "");
                        t.f121525h = 4;
                        t.f121526i = arrayList2.size();
                        arrayList2.add(t);
                    }
                }
                list = (List) cVar.invoke();
            }
            if (!list.isEmpty()) {
                this.f82258a.v();
                Map<String, String> b3 = this.f82258a.b(this.f82259b);
                int size = this.f82259b.sugList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.ss.android.ugc.aweme.search.model.e eVar = this.f82259b.sugList.get(i2);
                    h.f.b.l.b(eVar, "");
                    eVar.f121528k = b3;
                }
                a aVar = this.f82258a;
                SearchSugResponse searchSugResponse2 = this.f82259b;
                String str = com.ss.android.ugc.aweme.discover.adapter.b.g.f80504a;
                if (str == null || str.length() == 0) {
                    com.ss.android.ugc.aweme.discover.adapter.b.g.a(String.valueOf(System.currentTimeMillis()));
                }
                com.ss.android.ugc.aweme.search.n.h b4 = d.a.b();
                String str2 = null;
                if (b4 == null || (r = b4.getSearchPosition()) == null || r.length() <= 0) {
                    r = aVar.r();
                }
                bk a4 = new bi().y(r).a(SearchEnterViewModel.a.a(aVar.getActivity()).b().obtainLogData("tab_name"));
                List<com.ss.android.ugc.aweme.search.model.e> list3 = searchSugResponse2.sugList;
                bk c2 = a4.c(list3 != null ? Integer.valueOf(list3.size()) : null);
                RecommendWordMob recommendWordMob = searchSugResponse2.recommendWordMob;
                if (recommendWordMob != null) {
                    str2 = recommendWordMob.getWordsSource();
                }
                ((bk) c2.v(str2).a(b3)).E(com.ss.android.ugc.aweme.discover.adapter.b.g.f80504a).f();
            }
            return list;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q() {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.a.q():void");
    }

    public static final class k extends AbsOpenResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82253a;

        static {
            Covode.recordClassIndex(51147);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onActionResult(Object obj) {
            super.onActionResult(obj);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onIntercept(String str) {
            super.onIntercept(str);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onMatched(String str) {
            super.onMatched(str);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onMissed(String str) {
            super.onMissed(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(a aVar) {
            this.f82253a = aVar;
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onSuccess(Intent intent) {
            this.f82253a.i().setIsLeavingSearch(true);
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onFail(String str, String str2) {
            super.onFail(str, str2);
        }
    }

    public static final class m implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82255a;

        static {
            Covode.recordClassIndex(51149);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(a aVar) {
            this.f82255a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            SearchSugMobHelper searchSugMobHelper = this.f82255a.f82180k;
            if (searchSugMobHelper != null) {
                searchSugMobHelper.f81920b = str2;
            }
        }
    }

    static final class n<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82256a;

        static {
            Covode.recordClassIndex(51150);
        }

        n(a aVar) {
            this.f82256a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f82256a.o();
        }
    }

    static final class o<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82257a;

        static {
            Covode.recordClassIndex(51151);
        }

        o(a aVar) {
            this.f82257a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            a aVar = this.f82257a;
            h.f.b.l.b(num, "");
            aVar.f82181l = num.intValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            o();
        }
    }

    static int a(List<com.ss.android.ugc.aweme.search.model.e> list) {
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (!t2.b()) {
                arrayList.add(t2);
            }
        }
        return arrayList.size();
    }

    static final class q<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchSugResponse f82261b;

        static {
            Covode.recordClassIndex(51153);
        }

        q(a aVar, SearchSugResponse searchSugResponse) {
            this.f82260a = aVar;
            this.f82261b = searchSugResponse;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            boolean z;
            if (ai.a(iVar)) {
                com.ss.android.ugc.aweme.discover.adapter.b.d g2 = this.f82260a.g();
                h.f.b.l.b(iVar, "");
                Collection<? extends com.ss.android.ugc.aweme.search.model.e> collection = (Collection) iVar.d();
                if (collection == null) {
                    collection = new ArrayList<>();
                }
                if (g2.f80465a == null) {
                    g2.f80465a = new ArrayList();
                }
                g2.f80465a.clear();
                g2.f80465a.addAll(collection);
                com.ss.android.ugc.aweme.discover.adapter.b.d g3 = this.f82260a.g();
                SearchSugResponse searchSugResponse = this.f82261b;
                if (!com.ss.android.ugc.aweme.discover.a.a.a(searchSugResponse.requestSource)) {
                    List list = searchSugResponse.sugList;
                    if (list == null) {
                        list = new ArrayList();
                    }
                    if (a.a(list) >= 5) {
                        z = true;
                        g3.a(z);
                        this.f82260a.g().notifyDataSetChanged();
                    }
                }
                z = false;
                g3.a(z);
                this.f82260a.g().notifyDataSetChanged();
            }
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        if (getParentFragment() != null && (getParentFragment() instanceof b)) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.BaseDiscoverAndSearchFragment");
            b bVar = (b) parentFragment;
            if (i2 == 1 && bVar.w() == 3 && bVar.f82361l.b()) {
                new com.ss.android.ugc.aweme.search.k.j().p("cancel").o("personal_detail").f();
            }
        }
    }

    public void a(View view) {
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.djs);
        h.f.b.l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f82175b = recyclerView;
        if (recyclerView == null) {
            h.f.b.l.a("mListView");
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        RecyclerView recyclerView2 = this.f82175b;
        if (recyclerView2 == null) {
            h.f.b.l.a("mListView");
        }
        Drawable drawable = getResources().getDrawable(R.drawable.bc8);
        h.f.b.l.b(drawable, "");
        recyclerView2.a(new b(drawable));
        RecyclerView recyclerView3 = this.f82175b;
        if (recyclerView3 == null) {
            h.f.b.l.a("mListView");
        }
        recyclerView3.a(new e());
    }

    public final Map<String, String> b(SearchSugResponse searchSugResponse) {
        String str;
        String str2;
        String a2 = ac.a.f91473a.a(g().f80466b);
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("raw_query", y());
        RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
        String str3 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getInfo();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("info", str).a("sug_session_id", "");
        LogPbBean logPbBean = searchSugResponse.logPb;
        if (logPbBean != null) {
            str3 = logPbBean.getImprId();
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("impr_id", str3).a("log_pb", a2);
        h.f.b.l.d(this, "");
        if (com.ss.android.ugc.aweme.search.h.f121133a.a((Activity) getActivity())) {
            str2 = com.ss.android.ugc.aweme.discover.mob.m.a(u());
        } else {
            str2 = "discovery";
        }
        Map<String, String> map = a5.a("search_position", str2).f66730a;
        h.f.b.l.b(map, "");
        return map;
    }

    @Override // com.ss.android.ugc.aweme.discover.j.c.a
    public final void a(SearchSugResponse searchSugResponse) {
        h.f.b.l.d(searchSugResponse, "");
        if (searchSugResponse.requestOrder.longValue() >= this.u || ad.a() != 1) {
            Long l2 = searchSugResponse.requestOrder;
            h.f.b.l.b(l2, "");
            this.u = l2.longValue();
            if (ab_()) {
                RecyclerView recyclerView = this.f82175b;
                if (recyclerView == null) {
                    h.f.b.l.a("mListView");
                }
                if (recyclerView.getAdapter() instanceof com.ss.android.ugc.aweme.discover.adapter.b.d) {
                    g().f80467c = searchSugResponse.requestSource;
                    g().f80466b = searchSugResponse.requestId;
                    g().f80472h = searchSugResponse.keyword;
                    SearchSugMobHelper searchSugMobHelper = this.f82180k;
                    if (searchSugMobHelper != null) {
                        searchSugMobHelper.f81919a = searchSugResponse.logPb;
                    }
                    SearchSugMobHelper searchSugMobHelper2 = this.f82180k;
                    if (searchSugMobHelper2 != null) {
                        searchSugMobHelper2.f81922d = searchSugResponse.recommendWordMob;
                    }
                    b.i.b(new p(this, searchSugResponse), b.i.f4824a).a(new q(this, searchSugResponse), b.i.f4826c, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String b2;
        super.onCreate(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        String str = null;
        androidx.lifecycle.ac a2 = ae.a(activity, (ad.b) null).a(SearchIntermediateViewModel.class);
        String str2 = "";
        h.f.b.l.b(a2, str2);
        this.f82177d = (SearchIntermediateViewModel) a2;
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 == null) {
            h.f.b.l.b();
        }
        androidx.lifecycle.ac a3 = ae.a(activity2, (ad.b) null).a(SearchStateViewModel.class);
        h.f.b.l.b(a3, str2);
        this.f82178e = (SearchStateViewModel) a3;
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity3, str2);
        this.p = new SearchKeywordPresenter(activity3);
        androidx.fragment.app.e activity4 = getActivity();
        if (activity4 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity4, str2);
        SugKeywordPresenter sugKeywordPresenter = new SugKeywordPresenter(activity4);
        this.q = sugKeywordPresenter;
        SearchKeywordPresenter searchKeywordPresenter = this.p;
        if (!(searchKeywordPresenter == null || (b2 = searchKeywordPresenter.b()) == null)) {
            str2 = b2;
        }
        sugKeywordPresenter.a(str2);
        SugKeywordPresenter sugKeywordPresenter2 = this.q;
        if (sugKeywordPresenter2 != null) {
            m mVar = new m(this);
            sugKeywordPresenter2.b().a().observe(sugKeywordPresenter2.f121298b, mVar);
            sugKeywordPresenter2.f121297a = mVar;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82177d;
        if (searchIntermediateViewModel == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.keywordPresenter = this.p;
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f82177d;
        if (searchIntermediateViewModel2 == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        searchIntermediateViewModel2.sugKeywordPresenter = this.q;
        SearchIntermediateViewModel searchIntermediateViewModel3 = this.f82177d;
        if (searchIntermediateViewModel3 == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        searchIntermediateViewModel3.getIntermediateState().observe(this, new n(this));
        SearchIntermediateViewModel searchIntermediateViewModel4 = this.f82177d;
        if (searchIntermediateViewModel4 == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        searchIntermediateViewModel4.getSearchTabIndex().a(this, new o(this), true);
        androidx.fragment.app.e activity5 = getActivity();
        if (activity5 != null) {
            this.f82180k = (SearchSugMobHelper) ae.a(activity5, (ad.b) null).a(SearchSugMobHelper.class);
        }
        SearchSugMobHelper searchSugMobHelper = this.f82180k;
        if (searchSugMobHelper != null) {
            searchSugMobHelper.f81920b = y();
            com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(getActivity()).f82794a;
            if (bVar != null) {
                str = bVar.getEnterSearchFrom();
            }
            searchSugMobHelper.f81921c = str;
            searchSugMobHelper.f81923e = new d(this);
        }
        gt.f143029c.a().a(s());
    }

    public void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        h.f.b.l.d(dVar, "");
        if (this.f82178e == null) {
            h.f.b.l.a("mSearchStateViewModel");
        }
        com.ss.android.ugc.aweme.discover.j.p.f81288b = 0L;
        SearchStateViewModel searchStateViewModel = this.f82178e;
        if (searchStateViewModel == null) {
            h.f.b.l.a("mSearchStateViewModel");
        }
        searchStateViewModel.setIsRefreshingData(true);
        SearchIntermediateViewModel searchIntermediateViewModel = this.f82177d;
        if (searchIntermediateViewModel == null) {
            h.f.b.l.a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.openSearch(dVar);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        a(view);
        m();
        n();
        o();
    }

    static final class g implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82251a;

        static {
            Covode.recordClassIndex(51143);
        }

        g(a aVar) {
            this.f82251a = aVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i2, int i3, Intent intent) {
            this.f82251a.a(i2);
        }
    }

    static final class l implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82254a;

        static {
            Covode.recordClassIndex(51148);
        }

        l(a aVar) {
            this.f82254a = aVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i2, int i3, Intent intent) {
            this.f82254a.a(i2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.av4, viewGroup, false);
        View findViewById = a2.findViewById(R.id.dpi);
        h.f.b.l.b(findViewById, "");
        this.f82176c = (ViewGroup) findViewById;
        return a2;
    }

    private final void b(com.ss.android.ugc.aweme.search.model.e eVar, String str, int i2) {
        String str2;
        String a2 = ac.a.f91473a.a(str);
        if (eVar.f121525h == 4) {
            str2 = "user_enrich_sug";
        } else if (com.ss.android.ugc.aweme.discover.adapter.b.l.a(eVar)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        ((ay) ((ay) new ay().q("click").b(Integer.valueOf(i2))).r(y()).c(a2).f(com.ss.android.ugc.aweme.discover.mob.m.b(u())).b(eVar.f121519b)).s(str2).f();
    }

    @Override // com.ss.android.ugc.aweme.discover.g.a
    public final void a(com.ss.android.ugc.aweme.search.model.e eVar, String str, int i2) {
        String str2;
        String str3;
        String str4;
        String r2;
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(str, "");
        this.v = true;
        if (eVar.f121525h == 4) {
            com.ss.android.ugc.aweme.search.model.i iVar = eVar.f121524g;
            if (iVar != null && hl.a(iVar.getSecUserId())) {
                if (hl.a(iVar.getUsername()) && ah.f80145a) {
                    j().recordSearchHistory(new SearchHistory(iVar.getUsername(), 0));
                }
                iVar.getUsername();
                iVar.getSecUserId();
                Map<String, String> map = eVar.f121528k;
                if (map != null) {
                    map.put("sug_user_id", iVar.getUserId());
                    map.put("user_tag", iVar.getUserRelationType());
                }
                com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
                if (b2 == null || (r2 = b2.getSearchPosition()) == null || r2.length() <= 0) {
                    r2 = r();
                }
                com.ss.android.ugc.aweme.discover.adapter.b.g.b(r2, eVar.f121526i, eVar, "user_enrich_sug");
                b(eVar, str, eVar.f121526i);
                com.ss.android.ugc.aweme.discover.mob.o.a(null, i2, iVar.getUsername(), 6, str, iVar.getUserId(), "click_enrich_sug", iVar.getUserRelationType(), null);
                SmartRouter.buildRoute(getContext(), "aweme://user/profile/").withParam("sec_user_id", iVar.getSecUserId()).withParam("uid", iVar.getUserId()).withParam("enter_from", "search_sug").withParam("previous_page", "search_sug").withParam("extra_from_pre_page", "search_sug").withParam("extra_from_event_enter_from", "search_sug").withParam("extra_previous_page_position", "main_head").withParam("enter_from_request_id", str).withParam("search_request_id", str).withCallback(new k(this)).open(1, new l(this));
                com.ss.android.ugc.aweme.discover.adapter.b.g.a("");
                com.ss.android.ugc.aweme.search.o.a.a();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.search.model.d searchFrom = new com.ss.android.ugc.aweme.search.model.d().setKeyword(eVar.f121519b).setSearchFrom("search_sug");
        if (com.ss.android.ugc.aweme.discover.adapter.b.l.a(eVar)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        com.ss.android.ugc.aweme.search.model.d openNewSearchContainer = searchFrom.setSugType(str2).setOpenNewSearchContainer(false);
        com.ss.android.ugc.aweme.search.model.i iVar2 = eVar.f121524g;
        if (iVar2 == null || (str3 = iVar2.getUserId()) == null) {
            str3 = "";
        }
        com.ss.android.ugc.aweme.search.model.d sugUserId = openNewSearchContainer.setSugUserId(str3);
        com.ss.android.ugc.aweme.search.model.i iVar3 = eVar.f121524g;
        if (iVar3 == null || (str4 = iVar3.isRichSugValue()) == null) {
            str4 = "";
        }
        sugUserId.setIsRichSug(str4);
        h.f.b.l.b(openNewSearchContainer, "");
        com.ss.android.ugc.aweme.search.l.a.g.a(1, openNewSearchContainer);
        com.ss.android.ugc.aweme.search.l.a.h.a(1, openNewSearchContainer);
        com.ss.android.ugc.aweme.search.l.a.a.f121305f.onEventStart(openNewSearchContainer);
        a(openNewSearchContainer);
        b(eVar, str, i2);
    }
}
