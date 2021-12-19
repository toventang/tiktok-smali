package com.ss.android.ugc.aweme.discover.ui.intermediate;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.discover.a.ai;
import com.ss.android.ugc.aweme.discover.a.aj;
import com.ss.android.ugc.aweme.discover.a.al;
import com.ss.android.ugc.aweme.discover.a.p;
import com.ss.android.ugc.aweme.discover.a.s;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.e.d;
import com.ss.android.ugc.aweme.discover.e.l;
import com.ss.android.ugc.aweme.discover.lynx.container.e;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.model.TrendingDataJson;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.k.n;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.en;
import h.a.n;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONArray;
import org.json.JSONObject;

public final class DynamicSingleIntermediateFragment extends com.ss.android.ugc.aweme.discover.ui.a implements au, i, j {
    public e n;
    public final f o = new f();
    private SuggestWordsViewModel p;
    private int q = -1;
    private final u<com.ss.android.ugc.aweme.discover.api.a.a<String>> r = new b(this);
    private final u<Word> s = new a(this);
    private final u<com.ss.android.ugc.aweme.discover.api.a.a<TrendingData>> t = new c(this);
    private SparseArray u;

    static {
        Covode.recordClassIndex(51416);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(189, new g(DynamicSingleIntermediateFragment.class, "onDiscoverSearchEvent", d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(246, new g(DynamicSingleIntermediateFragment.class, "onSearchHistoryChangedEvent", l.class, ThreadMode.MAIN, 0, true));
        hashMap.put(410, new g(DynamicSingleIntermediateFragment.class, "onClickVisitedAccountEvent", com.ss.android.ugc.aweme.discover.e.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(185, new g(DynamicSingleIntermediateFragment.class, "onJsBroadcastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        x();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void x() {
        SparseArray sparseArray = this.u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void q() {
        d().setVisibility(0);
        e().setVisibility(4);
        super.q();
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DynamicSingleIntermediateFragment f82589a;

        static {
            Covode.recordClassIndex(51417);
        }

        a(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
            this.f82589a = dynamicSingleIntermediateFragment;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.DynamicSingleIntermediateFragment$a$a  reason: collision with other inner class name */
        static final class C1940a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.search.n.d> {
            final /* synthetic */ com.ss.android.ugc.aweme.search.n.d $source;
            final /* synthetic */ Word $word$inlined;

            static {
                Covode.recordClassIndex(51418);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1940a(com.ss.android.ugc.aweme.search.n.d dVar, Word word) {
                super(0);
                this.$source = dVar;
                this.$word$inlined = word;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.search.n.d invoke() {
                com.ss.android.ugc.aweme.search.n.d dVar = this.$source;
                return com.ss.android.ugc.aweme.search.n.d.copy$default(dVar, com.ss.android.ugc.aweme.search.n.f.copy$default(dVar.getImmutableData(), null, com.ss.android.ugc.aweme.search.n.g.copy$default(this.$source.getImmutableData().getSearchInputModel(), this.$word$inlined.getWord(), null, null, 6, null), null, 5, null), null, 2, null);
            }
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.search.n.d a2;
            Word word = (Word) obj;
            if (!TextUtils.isEmpty(word.getWord())) {
                this.f82589a.h().getFirstGuessWord().setValue(word);
                androidx.fragment.app.e activity = this.f82589a.getActivity();
                if (!(activity == null || (a2 = d.a.a(activity)) == null)) {
                    a2.update(new C1940a(a2, word));
                }
                com.ss.android.ugc.aweme.search.model.b bVar = SearchEnterViewModel.a.a(this.f82589a.getActivity()).f82794a;
                if (bVar != null) {
                    bVar.setSearchHint(word.getWord());
                }
            }
        }
    }

    private final String y() {
        List<SearchHistory> s2 = s();
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory : s2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory.keyword);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("historyList", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        h.f.b.l.b(jSONObject3, "");
        return jSONObject3;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final boolean o() {
        Integer value = h().getIntermediateState().getValue();
        if (value == null) {
            return false;
        }
        if (value.intValue() == 2) {
            if (e().getVisibility() == 0) {
                e().setVisibility(4);
            }
        } else if (value.intValue() == 0) {
            if (e().getVisibility() == 0) {
                e().setVisibility(4);
            }
        } else if (value.intValue() == 1 && d().getVisibility() == 0) {
            d().setVisibility(4);
        }
        return super.o();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void p() {
        String str;
        String str2;
        com.ss.android.ugc.aweme.search.n.i searchVideoModel;
        String groupId;
        com.ss.android.ugc.aweme.search.n.a searchCommonModel;
        SuggestWordsViewModel suggestWordsViewModel;
        String str3;
        MethodCollector.i(1025);
        int i2 = 0;
        e().setVisibility(0);
        e eVar = this.n;
        if (eVar == null) {
            h.f.b.l.a("dynamicViewsContainer");
        }
        ViewParent parent = eVar.getParent();
        String str4 = null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup e2 = e();
        e eVar2 = this.n;
        if (eVar2 == null) {
            h.f.b.l.a("dynamicViewsContainer");
        }
        e2.addView(eVar2, new ViewGroup.LayoutParams(-1, -1));
        e eVar3 = this.n;
        if (eVar3 == null) {
            h.f.b.l.a("dynamicViewsContainer");
        }
        List<com.ss.android.ugc.aweme.discover.lynx.container.a> a2 = a.a();
        com.ss.android.ugc.aweme.discover.lynx.container.a aVar = (com.ss.android.ugc.aweme.discover.lynx.container.a) n.b((List) a2, 0);
        if (aVar != null) {
            this.q = com.ss.android.ugc.aweme.discover.lynx.b.c.a(aVar.f81454b);
        }
        eVar3.a(a2);
        e eVar4 = this.n;
        if (eVar4 == null) {
            h.f.b.l.a("dynamicViewsContainer");
        } else {
            com.ss.android.ugc.aweme.discover.lynx.container.c cVar = eVar4.f81467b;
            if (cVar == null) {
                h.f.b.l.a("dynamicViewAdapter");
            } else {
                cVar.f81457a.clear();
                cVar.f81458b.clear();
            }
        }
        super.p();
        new com.ss.android.ugc.aweme.discover.lynx.d.c().a("click_input_area").f();
        boolean z = p.f80225a;
        if ((!h().backFromSearchResult || z) && ((al.f80155a || aj.f80151a) && (suggestWordsViewModel = this.p) != null)) {
            com.ss.android.ugc.aweme.search.model.b b2 = SearchEnterViewModel.a.b(getActivity());
            n.a.a(0);
            SuggestWordsApi.a aVar2 = new SuggestWordsApi.a();
            aVar2.f80816a = "100011";
            if (b2 != null) {
                str3 = b2.getGroupId();
            } else {
                str3 = null;
            }
            aVar2.f80819d = str3;
            aVar2.f80824i = Integer.valueOf(al.a());
            SuggestWordsApi.a(aVar2).a(new SuggestWordsViewModel.c(suggestWordsViewModel), b.i.f4826c, null);
        }
        if (com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
            SuggestWordsViewModel suggestWordsViewModel2 = this.p;
            if (suggestWordsViewModel2 != null) {
                suggestWordsViewModel2.a();
            }
            e eVar5 = this.n;
            if (eVar5 == null) {
                h.f.b.l.a("dynamicViewsContainer");
            } else {
                RecyclerView recyclerView = eVar5.f81466a;
                if (recyclerView == null) {
                    h.f.b.l.a("recyclerView");
                }
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).a(0, 0);
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (h().backFromSearchResult) {
            str = "result";
        } else {
            com.ss.android.ugc.aweme.search.model.b b3 = SearchEnterViewModel.a.b(getActivity());
            if (b3 != null) {
                str = b3.getEnterSearchFrom();
            } else {
                str = null;
            }
        }
        jSONObject.put("enter_from", str);
        com.ss.android.ugc.aweme.search.n.f b4 = d.a.b(getActivity());
        if (b4 == null || (searchCommonModel = b4.getSearchCommonModel()) == null) {
            str2 = null;
        } else {
            str2 = searchCommonModel.getEnterFrom();
        }
        jSONObject.put("enter_from_x", str2);
        jSONObject.put("search_position", w());
        jSONObject.put("show_most_visited_account", com.bytedance.ies.abmock.b.a().a(true, "show_most_visited_account", 0));
        jSONObject.put("show_search_history_lines", ai.f80149a);
        jSONObject.put("show_suggest_search_words", com.bytedance.ies.abmock.b.a().a(true, "show_suggest_search_words", 0));
        Integer value = h().getSearchTabIndex().getValue();
        if (value == null) {
            value = -1;
        }
        String str5 = "";
        h.f.b.l.b(value, str5);
        jSONObject.put(StringSet.type, com.ss.android.ugc.aweme.search.j.a(value.intValue()));
        jSONObject.put("language", en.a().toString());
        jSONObject.put("appLanguage", SettingServiceImpl.v().h());
        jSONObject.put("appLocale", com.ss.android.ugc.aweme.i18n.language.a.b());
        jSONObject.put("is_lynx_request_suggest", !z);
        com.ss.android.ugc.aweme.search.model.b b5 = SearchEnterViewModel.a.b(getActivity());
        if (!(b5 == null || (groupId = b5.getGroupId()) == null)) {
            str5 = groupId;
        }
        jSONObject.put("from_group_id", str5);
        com.ss.android.ugc.aweme.search.n.f b6 = d.a.b(getActivity());
        if (!(b6 == null || (searchVideoModel = b6.getSearchVideoModel()) == null)) {
            str4 = searchVideoModel.getGroupId();
        }
        jSONObject.put("from_group_id_x", str4);
        if (this.q == 1) {
            i2 = 1;
        }
        jSONObject.put("is_built_in", String.valueOf(i2));
        jSONObject.put("prerender", String.valueOf(s.f80230a ? 1 : 0));
        jSONObject.put("timestamp", com.ss.android.ugc.aweme.common.h.d.f76444a);
        Object obtainLogData = SearchEnterViewModel.a.a(getActivity()).b().obtainLogData("tab_name");
        if (obtainLogData != null) {
            jSONObject.put("tab_name", obtainLogData.toString());
        }
        e eVar6 = this.n;
        if (eVar6 == null) {
            h.f.b.l.a("dynamicViewsContainer");
        }
        eVar6.a("searchTransferEnter", jSONObject);
        String y = y();
        e eVar7 = this.n;
        if (eVar7 == null) {
            h.f.b.l.a("dynamicViewsContainer");
            MethodCollector.o(1025);
            return;
        }
        eVar7.a(y);
        MethodCollector.o(1025);
    }

    public static final /* synthetic */ e a(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
        e eVar = dynamicSingleIntermediateFragment.n;
        if (eVar == null) {
            h.f.b.l.a("dynamicViewsContainer");
        }
        return eVar;
    }

    @r(a = ThreadMode.MAIN)
    public final void onClickVisitedAccountEvent(com.ss.android.ugc.aweme.discover.e.b bVar) {
        if (bVar != null) {
            a(bVar.f80946c, bVar.f80945b, bVar.f80944a);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.a(EventBus.a(), this);
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        h.f.b.l.d(jVar, "");
        if (h.f.b.l.a(jVar.f91311b.get("eventName"), (Object) "SearchTransferFirstScreenFinished")) {
            b.a(System.currentTimeMillis(), true);
        }
    }

    @r(a = ThreadMode.MAIN, b = true)
    public final void onSearchHistoryChangedEvent(l lVar) {
        h.f.b.l.d(lVar, "");
        if (ab_()) {
            String y = y();
            e eVar = this.n;
            if (eVar == null) {
                h.f.b.l.a("dynamicViewsContainer");
            } else {
                eVar.a(y);
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DynamicSingleIntermediateFragment f82590a;

        static {
            Covode.recordClassIndex(51419);
        }

        b(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
            this.f82590a = dynamicSingleIntermediateFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("guessSearchData", (HashMap) this.f82590a.o.a((String) aVar.f80830b, (Class) HashMap.class));
                TemplateData a2 = TemplateData.a(linkedHashMap);
                h.f.b.l.b(a2, "");
                a2.f55592b = "guessSearchDataProcess";
                e a3 = DynamicSingleIntermediateFragment.a(this.f82590a);
                if (a3 != null) {
                    a3.a(a2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DynamicSingleIntermediateFragment f82591a;

        static {
            Covode.recordClassIndex(51420);
        }

        c(DynamicSingleIntermediateFragment dynamicSingleIntermediateFragment) {
            this.f82591a = dynamicSingleIntermediateFragment;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.discover.api.a.a aVar = (com.ss.android.ugc.aweme.discover.api.a.a) obj;
            if (aVar != null && aVar.f80829a) {
                T t = aVar.f80830b;
                try {
                    e a2 = DynamicSingleIntermediateFragment.a(this.f82591a);
                    if (a2 != null) {
                        String b2 = this.f82591a.o.b(new TrendingDataJson(t));
                        h.f.b.l.b(b2, "");
                        a2.a(b2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.a
    public final void a(View view) {
        h.f.b.l.d(view, "");
        super.a(view);
        this.n = com.ss.android.ugc.aweme.discover.lynx.container.d.a().getFirst();
        if (al.f80155a || aj.f80151a || com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            SuggestWordsViewModel a2 = SuggestWordsViewModel.a.a(activity);
            if (al.f80155a || aj.f80151a) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<String>> cVar = a2.f121755c;
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                cVar.observe(activity2, this.r);
            }
            if (l()) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<Word> cVar2 = a2.f121754b;
                androidx.fragment.app.e activity3 = getActivity();
                if (activity3 == null) {
                    h.f.b.l.b();
                }
                cVar2.observe(activity3, this.s);
            }
            if (com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
                com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.discover.api.a.a<TrendingData>> cVar3 = a2.f121756d;
                androidx.fragment.app.e activity4 = getActivity();
                if (activity4 == null) {
                    h.f.b.l.b();
                }
                cVar3.observe(activity4, this.t);
            }
            this.p = a2;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(com.ss.android.ugc.aweme.discover.e.d dVar) {
        String str;
        if (dVar != null && !dVar.f80949a) {
            JSONObject jSONObject = new JSONObject();
            if (h().backFromSearchResult) {
                str = "result";
            } else {
                com.ss.android.ugc.aweme.search.model.b b2 = SearchEnterViewModel.a.b(getActivity());
                if (b2 != null) {
                    str = b2.getEnterSearchFrom();
                } else {
                    str = null;
                }
            }
            jSONObject.put("enter_from", str);
            Integer value = h().getSearchTabIndex().getValue();
            if (value == null) {
                value = 0;
            }
            h.f.b.l.b(value, "");
            jSONObject.put(StringSet.type, com.ss.android.ugc.aweme.search.j.a(value.intValue()));
            e eVar = this.n;
            if (eVar == null) {
                h.f.b.l.a("dynamicViewsContainer");
            } else {
                eVar.a("searchTransferQuit", jSONObject);
            }
            com.ss.android.ugc.aweme.discover.lynx.b.b.a();
        }
    }
}
