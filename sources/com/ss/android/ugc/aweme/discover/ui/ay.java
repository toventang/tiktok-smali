package com.ss.android.ugc.aweme.discover.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.ak;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.e.l;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.k.ah;
import com.ss.android.ugc.aweme.search.k.aj;
import com.ss.android.ugc.aweme.search.k.ao;
import com.ss.android.ugc.aweme.search.k.ap;
import com.ss.android.ugc.aweme.search.k.bi;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.k.n;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.f;
import com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.utils.ec;
import com.ss.android.ugc.aweme.utils.gt;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class ay<SuggestType> extends a implements al.b, al.c, al.d, al.e, i, j {
    public static final a n = new a((byte) 0);
    private SuggestWordsViewModel o;
    private final u<com.ss.android.ugc.aweme.discover.api.a.a<List<TypeWords>>> p = new b(this);
    private final u<Word> q = new c(this);
    private final u<com.ss.android.ugc.aweme.discover.api.a.a<TrendingData>> r = new e(this);
    private final h s = ec.a(new d(this));
    private SparseArray t;

    static {
        Covode.recordClassIndex(51258);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a, com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(246, new g(ay.class, "onSearchHistoryChangedEvent", l.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        x();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public void x() {
        SparseArray sparseArray = this.t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final ak<SuggestType> y() {
        return (ak) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51259);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        h.f.b.l.d(dVar, "");
        super.a(dVar);
        ak<SuggestType> y = y();
        if (y != null) {
            y.b();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int i2 = this.f82179j;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a, com.ss.android.ugc.aweme.discover.g.a
    public final int a() {
        int u = u();
        if (this instanceof bl) {
            u = Integer.MIN_VALUE;
        }
        return SearchHistory.toHistoryType(u);
    }

    static final class d extends m implements h.f.a.a<ak<SuggestType>> {
        final /* synthetic */ ay this$0;

        static {
            Covode.recordClassIndex(51263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ay ayVar) {
            super(0);
            this.this$0 = ayVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            ay ayVar = this.this$0;
            ak akVar = new ak(ayVar);
            com.ss.android.ugc.aweme.discover.c.a aVar = new com.ss.android.ugc.aweme.discover.c.a(akVar);
            h.f.b.l.d(aVar, "");
            ((a) ayVar).f82174a = aVar;
            return akVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.b
    public final void b() {
        new aj().q("clear_all").f(t()).f();
        j().clearSearchHistory();
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ay f82350a;

        static {
            Covode.recordClassIndex(51261);
        }

        c(ay ayVar) {
            this.f82350a = ayVar;
        }

        static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.search.n.d> {
            final /* synthetic */ com.ss.android.ugc.aweme.search.n.d $source;
            final /* synthetic */ Word $word$inlined;

            static {
                Covode.recordClassIndex(51262);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(com.ss.android.ugc.aweme.search.n.d dVar, Word word) {
                super(0);
                this.$source = dVar;
                this.$word$inlined = word;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.search.n.d invoke() {
                com.ss.android.ugc.aweme.search.n.d dVar = this.$source;
                return com.ss.android.ugc.aweme.search.n.d.copy$default(dVar, f.copy$default(dVar.getImmutableData(), null, com.ss.android.ugc.aweme.search.n.g.copy$default(this.$source.getImmutableData().getSearchInputModel(), this.$word$inlined.getWord(), null, null, 6, null), null, 5, null), null, 2, null);
            }
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.search.n.d a2;
            Word word = (Word) obj;
            if (!TextUtils.isEmpty(word.getWord())) {
                this.f82350a.h().getFirstGuessWord().setValue(word);
                com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(this.f82350a.getActivity()).f82794a;
                if (bVar != null) {
                    bVar.setSearchHint(word.getWord());
                }
                androidx.fragment.app.e activity = this.f82350a.getActivity();
                if (activity != null && (a2 = d.a.a(activity)) != null) {
                    a2.update(new a(a2, word));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.b
    public final void c() {
        new aj().q("show_all").f(t()).f();
        ak<SuggestType>.b a2 = y().a();
        a2.f80385e = true;
        a2.b();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void m() {
        super.m();
        ak<SuggestType> y = y();
        h.f.b.l.d(this, "");
        com.ss.android.ugc.aweme.discover.d.a.c cVar = y.f80372a;
        h.f.b.l.d(this, "");
        cVar.f80934a = this;
        com.ss.android.ugc.aweme.discover.d.a.a aVar = y.f80373b;
        h.f.b.l.d(this, "");
        aVar.f80930a = this;
        com.ss.android.ugc.aweme.discover.d.a.b bVar = y.f80375d;
        h.f.b.l.d(this, "");
        bVar.f80932a = this;
        com.ss.android.ugc.aweme.discover.d.a.d dVar = y.f80374c;
        h.f.b.l.d(this, "");
        dVar.f80935a = this;
        ak<SuggestType> y2 = y();
        h.f.b.l.d(this, "");
        com.ss.android.ugc.aweme.discover.d.a.e eVar = y2.f80376e;
        h.f.b.l.d(this, "");
        eVar.f80937a = this;
        ak<SuggestType> y3 = y();
        h.f.b.l.d(this, "");
        com.ss.android.ugc.aweme.discover.d.a.g gVar = y3.f80377f;
        h.f.b.l.d(this, "");
        gVar.f80941a = this;
        ak<SuggestType> y4 = y();
        h.f.b.l.d(this, "");
        com.ss.android.ugc.aweme.discover.d.a.f fVar = y4.f80378g;
        h.f.b.l.d(this, "");
        fVar.f80940a = this;
        ak<SuggestType> y5 = y();
        y5.f80376e.f80938b = h();
        y5.f80376e.f80939c = y5.f80379h;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void n() {
        super.n();
        if (com.ss.android.ugc.aweme.discover.a.al.f80155a || com.ss.android.ugc.aweme.discover.a.aj.f80151a || com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            SuggestWordsViewModel a2 = SuggestWordsViewModel.a.a(activity);
            if (com.ss.android.ugc.aweme.discover.a.al.f80155a || com.ss.android.ugc.aweme.discover.a.aj.f80151a) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<List<TypeWords>>> cVar = a2.f121753a;
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                cVar.observe(activity2, this.p);
            }
            if (l()) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<Word> cVar2 = a2.f121754b;
                androidx.fragment.app.e activity3 = getActivity();
                if (activity3 == null) {
                    h.f.b.l.b();
                }
                cVar2.observe(activity3, this.q);
            }
            if (com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<TrendingData>> cVar3 = a2.f121756d;
                androidx.fragment.app.e activity4 = getActivity();
                if (activity4 == null) {
                    h.f.b.l.b();
                }
                cVar3.observe(activity4, this.r);
            }
            this.o = a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void p() {
        SuggestWordsViewModel suggestWordsViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<TrendingData>> cVar;
        String str;
        super.p();
        y().a().f80386f = null;
        y().a(k(), true);
        RecyclerView d2 = d();
        com.ss.android.ugc.aweme.discover.c.a aVar = ((a) this).f82174a;
        if (aVar == null) {
            h.f.b.l.a("mHeaderAndFooterWrapper");
        }
        d2.setAdapter(aVar);
        if (!k().isEmpty()) {
            new aj().q("show").f(t()).f();
        }
        if (com.ss.android.ugc.aweme.discover.a.al.f80155a || com.ss.android.ugc.aweme.discover.a.aj.f80151a) {
            SuggestWordsViewModel suggestWordsViewModel2 = this.o;
            if (suggestWordsViewModel2 != null) {
                com.ss.android.ugc.aweme.search.model.b b2 = SearchEnterViewModel.a.b(getActivity());
                n.a.a(0);
                SuggestWordsApi.a aVar2 = new SuggestWordsApi.a();
                aVar2.f80816a = "100011";
                if (b2 != null) {
                    str = b2.getGroupId();
                } else {
                    str = null;
                }
                aVar2.f80819d = str;
                aVar2.f80824i = Integer.valueOf(com.ss.android.ugc.aweme.discover.a.al.a());
                h.f.b.l.d(aVar2, "");
                SuggestWordsApi.a().getSuggestWords(aVar2.f80816a, aVar2.f80819d, aVar2.f80820e, aVar2.f80824i, gt.f143029c.a().a(), "qrec").a(new SuggestWordsViewModel.b(suggestWordsViewModel2), b.i.f4826c, null);
            }
        } else {
            com.ss.android.ugc.aweme.discover.ui.intermediate.b.a(System.currentTimeMillis(), false);
        }
        if (com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
            if (h().backFromSearchResult && h().enterSearchMiddlePageByBack) {
                h().getDismissKeyboard().setValue(true);
            }
            SuggestWordsViewModel suggestWordsViewModel3 = this.o;
            if ((suggestWordsViewModel3 == null || (cVar = suggestWordsViewModel3.f121756d) == null || cVar.getValue() == null || !h().backFromSearchResult) && (suggestWordsViewModel = this.o) != null) {
                suggestWordsViewModel.a();
            }
        }
        this.f82179j = 1;
        ak<SuggestType> y = y();
        if (y != null) {
            y.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void a(View view) {
        h.f.b.l.d(view, "");
        super.a(view);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.e
    public final void a(RecyclerView.n nVar) {
        h.f.b.l.d(nVar, "");
        d().a(nVar);
    }

    @r(b = true)
    public final void onSearchHistoryChangedEvent(l lVar) {
        h.f.b.l.d(lVar, "");
        k().clear();
        k().addAll(s());
        if (ab_() && (d().getAdapter() instanceof com.ss.android.ugc.aweme.discover.c.a)) {
            y().a(k(), false);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ay f82351a;

        static {
            Covode.recordClassIndex(51264);
        }

        e(ay ayVar) {
            this.f82351a = ayVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            ArrayList<com.ss.android.ugc.aweme.search.l> arrayList;
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            if (aVar == null) {
                return;
            }
            if (aVar.f80829a) {
                T t = aVar.f80830b;
                ak<SuggestType>.b a2 = this.f82351a.y().a();
                a2.f80387g = t;
                a2.b();
                ay ayVar = this.f82351a;
                if (t == null || (arrayList = t.billboardInfo) == null) {
                    i2 = 0;
                } else {
                    i2 = arrayList.size();
                }
                com.ss.android.ugc.aweme.common.r.a("trending_topic_show", new com.ss.android.ugc.aweme.app.f.d().a("search_position", ayVar.w()).a("order", -1).a("item_num", i2).f66730a);
                return;
            }
            this.f82351a.y().a((List<TypeWords>) null);
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ay f82349a;

        static {
            Covode.recordClassIndex(51260);
        }

        b(ay ayVar) {
            this.f82349a = ayVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<VisitedAccount> list;
            List<Word> list2;
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            if (aVar == null) {
                return;
            }
            if (aVar.f80829a) {
                T t = aVar.f80830b;
                this.f82349a.y().a((List<TypeWords>) t);
                if (t != null) {
                    for (T t2 : t) {
                        if (!t2.fromCache && (list2 = t2.words) != null && (!list2.isEmpty())) {
                            ay ayVar = this.f82349a;
                            List<Word> list3 = t2.words;
                            String str = t2.imprId;
                            h.f.b.l.d(str, "");
                            if (list3 != null) {
                                ((bk) new bi().c(Integer.valueOf(list3.size())).y(ayVar.w()).a(SearchEnterViewModel.a.a(ayVar.getActivity()).b().obtainLogData("tab_name")).d(str)).v("recom_search").f();
                                int i2 = 0;
                                for (T t3 : list3) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        h.a.n.a();
                                    }
                                    T t4 = t3;
                                    ((bk) ((bk) new bl().i(t4.getId())).w(t4.getWord()).d(str)).y(ayVar.w()).a(SearchEnterViewModel.a.a(ayVar.getActivity()).b().obtainLogData("tab_name")).v("recom_search").d(Integer.valueOf(i2)).w(t4.getWord()).A(t4.getWordType()).i(t4.getId()).f();
                                    i2 = i3;
                                }
                            }
                        }
                        if (!t2.fromCache && (list = t2.visitedAccount) != null && (!list.isEmpty())) {
                            ay ayVar2 = this.f82349a;
                            List<VisitedAccount> list4 = t2.visitedAccount;
                            h.f.b.l.d(t2.imprId, "");
                            if (list4 != null) {
                                new ap().y(ayVar2.w()).b((Integer) -1).f();
                                int i4 = 0;
                                for (T t5 : list4) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        h.a.n.a();
                                    }
                                    T t6 = t5;
                                    ap apVar = new ap();
                                    apVar.c("sug_user_id", t6.getUid());
                                    ((bk) apVar.y(ayVar2.w()).b(Integer.valueOf(i4))).t(t6.getRelationShip()).b(t6.getNickname()).f();
                                    i4 = i5;
                                }
                            }
                        }
                    }
                }
                com.ss.android.ugc.aweme.discover.ui.intermediate.b.a(System.currentTimeMillis(), false);
                return;
            }
            this.f82349a.y().a((List<TypeWords>) null);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.b
    public final void b(SearchHistory searchHistory, int i2) {
        h.f.b.l.d(searchHistory, "");
        if (i2 >= 0 && i2 < k().size()) {
            new aj().q("clear").b(Integer.valueOf(i2)).b(searchHistory.keyword).f(t()).f();
            j().deleteSearchHistory(searchHistory);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.b
    public final void a(SearchHistory searchHistory, int i2) {
        h.f.b.l.d(searchHistory, "");
        com.ss.android.ugc.aweme.search.model.d searchFrom = new com.ss.android.ugc.aweme.search.model.d().setKeyword(searchHistory.keyword).setSearchFrom("search_history");
        h.f.b.l.b(searchFrom, "");
        com.ss.android.ugc.aweme.search.l.a.g.a(4, searchFrom);
        com.ss.android.ugc.aweme.search.l.a.h.a(4, searchFrom);
        com.ss.android.ugc.aweme.search.l.a.a.f121305f.onEventStart(searchFrom);
        a(searchFrom);
        new aj().q("click").b(Integer.valueOf(i2)).b(searchHistory.keyword).f(t()).f();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.c
    public final void a(VisitedAccount visitedAccount, int i2) {
        List<VisitedAccount> list;
        if (visitedAccount != null) {
            ((bk) ((ao) new ao().q("clear")).r(visitedAccount.getUid()).y(w()).b(Integer.valueOf(i2))).t(visitedAccount.getRelationShip()).b(visitedAccount.getNickname()).f();
            ak<SuggestType>.b a2 = y().a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            List<TypeWords> list2 = a2.f80386f;
            if (list2 != null) {
                for (T t2 : list2) {
                    if (t2 == null || (list = t2.visitedAccount) == null || !(!list.isEmpty())) {
                        arrayList.add(t2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        List<VisitedAccount> list3 = t2.visitedAccount;
                        if (list3 != null) {
                            for (T t3 : list3) {
                                String uid = t3.getUid();
                                if (uid != null && !uid.equals(visitedAccount.getUid())) {
                                    arrayList2.add(t3);
                                }
                            }
                        }
                        t2.visitedAccount = arrayList2;
                        List<VisitedAccount> list4 = t2.visitedAccount;
                        if (list4 == null || !(!list4.isEmpty())) {
                            z = true;
                        } else {
                            arrayList.add(t2);
                        }
                        List<VisitedAccount> list5 = t2.visitedAccount;
                        if (list5 != null) {
                            Integer.valueOf(list5.size());
                        }
                    }
                }
            }
            a2.f80386f = arrayList;
            if (z) {
                a2.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.d
    public final void a(Word word, int i2) {
        com.ss.android.ugc.aweme.discover.mob.d.f81892k = 0;
        SearchIntermediateViewModel h2 = h();
        if (h2 != null) {
            h2.handleSuggestWordItemClick(word, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.e
    public final void b(com.ss.android.ugc.aweme.search.l lVar, int i2, int i3) {
        h.f.b.l.d(lVar, "");
        com.ss.android.ugc.aweme.common.r.a("trending_topic_click", new com.ss.android.ugc.aweme.app.f.d().a("search_position", w()).a("order", i2).a("item_num", i3).a("trending_topic_tag", lVar.getType()).a("trending_topic_vv", lVar.getHeatValue()).a("search_keyword", lVar.getTrendingName()).f66730a);
        com.ss.android.ugc.aweme.search.model.d trendingEventId = new com.ss.android.ugc.aweme.search.model.d().setKeyword(lVar.getTrendingName()).setSearchFrom("trending_topic").setTrendingEventId(lVar.getEventId());
        h.f.b.l.b(trendingEventId, "");
        com.ss.android.ugc.aweme.search.l.a.g.a(7, trendingEventId);
        com.ss.android.ugc.aweme.search.l.a.h.a(7, trendingEventId);
        com.ss.android.ugc.aweme.search.l.a.a.f121305f.onEventStart(trendingEventId);
        a(trendingEventId);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.c
    public final void a(VisitedAccount visitedAccount, String str, int i2) {
        if (visitedAccount != null) {
            ((bk) ((ao) new ao().q("click")).r(visitedAccount.getUid()).y(w()).b(Integer.valueOf(i2))).t(visitedAccount.getRelationShip()).b(visitedAccount.getNickname()).f();
            com.ss.android.ugc.aweme.search.k.c a2 = ((com.ss.android.ugc.aweme.search.k.c) new ah().o("search_most_visited").p("click_search_most_visited")).b(visitedAccount.getNickname()).d(str).a(str).a(Integer.valueOf(i2));
            a2.c("to_user_id", visitedAccount.getUid());
            a2.c("user_tag", visitedAccount.getRelationShip());
            a2.f();
            a(visitedAccount.getSecUid(), visitedAccount.getUid(), visitedAccount.getNickname());
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.al.e
    public final void a(com.ss.android.ugc.aweme.search.l lVar, int i2, int i3) {
        h.f.b.l.d(lVar, "");
        com.ss.android.ugc.aweme.common.r.a("trending_topic_show", new com.ss.android.ugc.aweme.app.f.d().a("search_position", w()).a("order", i2).a("item_num", i3).a("trending_topic_tag", lVar.getType()).a("trending_topic_vv", lVar.getHeatValue()).a("search_keyword", lVar.getTrendingName()).f66730a);
    }
}
