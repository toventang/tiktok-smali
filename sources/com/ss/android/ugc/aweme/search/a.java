package com.ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.google.gson.g;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.sdk.webview.e;
import com.ss.android.ugc.aweme.discover.a.i;
import com.ss.android.ugc.aweme.discover.a.j;
import com.ss.android.ugc.aweme.discover.a.k;
import com.ss.android.ugc.aweme.discover.a.r;
import com.ss.android.ugc.aweme.discover.adapter.al;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.mob.d;
import com.ss.android.ugc.aweme.discover.mob.n;
import com.ss.android.ugc.aweme.discover.mob.o;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.af;
import com.ss.android.ugc.aweme.discover.ui.bl;
import com.ss.android.ugc.aweme.discover.ui.intermediate.DynamicSingleIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.search.b;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.FeedbackSubmitSuccessMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SearchKeywordChangeMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.DeleteMostVisitedAccountMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.DeleteSearchHistoryMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.FollowPACheckMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.GetSearchHistoryMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.HideSearchLoadingMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.KeyboardChangeMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenAlertMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenEffectRecordMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenHotSpotMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenLiveMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenLiveMoreMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenPlaylistMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SaveSearchHistoryAndGoDetail;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchCardClickMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchLaunchChatMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchRefreshMonitorMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchRequestSuccessMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod;
import com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.UpdateRawDataMethod;
import com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchViewHolder;
import com.ss.android.ugc.aweme.discover.ui.suggest.c;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.ax;
import com.ss.android.ugc.aweme.search.l.a.h;
import com.ss.android.ugc.aweme.search.l.m;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.ss.android.ugc.aweme.search.model.b;
import com.ss.android.ugc.aweme.search.model.c;
import com.ss.android.ugc.aweme.search.model.f;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.gt;
import com.ss.android.ugc.aweme.xsearch.horizontallist.LynxSearchHorizontal;
import com.ss.android.ugc.aweme.xsearch.live.LynxSearchLive;
import com.ss.android.ugc.aweme.xsearch.video.LynxSearchVideo;
import com.ss.android.ugc.aweme.xsearch.video.d;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class a implements ISearchService {
    static {
        Covode.recordClassIndex(78791);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchResultStatistics c() {
        return n.f81934a;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final e d() {
        return b.f82643a;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.discover.h.b f() {
        return com.ss.android.ugc.aweme.discover.service.a.f82038b;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean h() {
        return m.f121434a;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean a(Activity activity) {
        return activity instanceof SearchResultActivity;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(c cVar) {
        l.d(cVar, "");
        if (o()) {
            m();
        }
        f fVar = new f();
        fVar.setClickMagnifyingGlassTime(System.currentTimeMillis());
        cVar.f121512b.setTimeParam(fVar);
        g.a(cVar.f121511a, cVar.f121512b, cVar.f121513c, cVar.f121517g, cVar.f121514d);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(g gVar) {
        l.d(gVar, "");
        if (com.ss.android.ugc.aweme.search.l.g.a()) {
            gVar.a(new SearchMixFeedCollectionTypeAdapterFactory());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null && TextUtils.equals(jSONObject.optString("eventName"), "updateKeyword")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String str = null;
            String optString = optJSONObject != null ? optJSONObject.optString(StringSet.type, "") : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 != null) {
                str = optJSONObject2.optString("search_word", "");
            }
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(str)) {
                new Word().setWord(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(int i2, String str, int i3, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str3, "");
        l.d(str4, "");
        String a2 = o.a(str4);
        q o = new q().o(o.a(i3));
        o.r = str2;
        o.q = str3;
        new com.ss.android.ugc.aweme.discover.mob.g().setOrder(i2).setSearchKeyword(str).setRid(str2).setEnterFrom("find_friends").setEnterMethod(a2).installToMetrics(o);
        o.f();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        ((com.ss.android.ugc.aweme.search.k.c) new ax(str).o(str2)).c(ac.a.f91473a.a(d.a())).g(d.f81886e).a("tag_id", str3).f();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(e eVar, WeakReference<Context> weakReference) {
        l.d(eVar, "");
        l.d(weakReference, "");
        l.d(eVar, "");
        l.d(weakReference, "");
        com.bytedance.ies.web.a.a aVar = eVar.f60185b;
        if (aVar != null) {
            eVar.a(com.ss.android.ugc.aweme.discover.ui.search.jsbridge.c.f82732a, new SearchKeywordChangeMethod(aVar));
            eVar.a("openConfirmAlert", new OpenConfirmAlertMethod(weakReference, aVar));
            eVar.a("feedbackSubmitSuccess", new FeedbackSubmitSuccessMethod(aVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(Exception exc, String str) {
        l.d(exc, "");
        l.d(str, "");
        b.a(exc, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(com.ss.android.ugc.aweme.search.model.d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.search.l.a.g.a(0, dVar);
        h.a(0, dVar);
        com.ss.android.ugc.aweme.search.l.a.a.f121305f.onEventStart(dVar);
        com.ss.android.ugc.aweme.search.s.b.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(boolean z, List<? extends Aweme> list, int i2) {
        com.ss.android.ugc.aweme.discover.c.e.a(z, list, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r1.equals("playlist") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        if (r1.equals("selfharm") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        if (r1.equals("chat") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
        if (h.f.b.l.a((java.lang.Object) "private", (java.lang.Object) r11.get("tab_name")) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        if (r1.equals("unknow") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        if (r1.equals("notification_page") != false) goto L_0x00a3;
     */
    @Override // com.ss.android.ugc.aweme.search.ISearchService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.lifecycle.m r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.a.a(androidx.lifecycle.m, java.lang.String, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean k() {
        return k.a();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.discover.helper.h n() {
        return s.a.a();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean q() {
        return com.ss.android.ugc.aweme.discover.a.g.a();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean i() {
        return ((Boolean) com.ss.android.ugc.aweme.discover.a.f.f80198a.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean j() {
        if (com.bytedance.ies.abmock.b.a().a(true, "enlarge_feed_search_icon", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void m() {
        if (o()) {
            com.ss.android.ugc.aweme.discover.lynx.container.d.a(r.f80228a);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean o() {
        if (!com.ss.android.ugc.aweme.discover.a.s.f80230a || com.ss.android.ugc.aweme.discover.lynx.container.d.f81462a) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean s() {
        if (com.bytedance.ies.abmock.b.a().a(true, "black_discover_search_box_text", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b() {
        SearchHistoryManager.inst("").clearForAccountChange();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.search.model.b e() {
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 == null || !(j2 instanceof androidx.fragment.app.e)) {
            return null;
        }
        return SearchEnterViewModel.a.b((androidx.fragment.app.e) j2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Fragment g() {
        long currentTimeMillis = System.currentTimeMillis();
        if (com.ss.android.ugc.aweme.discover.ui.intermediate.b.f82595a <= 0) {
            com.ss.android.ugc.aweme.discover.ui.intermediate.b.f82595a = currentTimeMillis;
        }
        if (!i.f80204a) {
            return new bl();
        }
        com.ss.android.ugc.aweme.discover.lynx.container.d.a();
        return new DynamicSingleIntermediateFragment();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean l() {
        j b2;
        Integer num;
        j b3 = k.b();
        Integer num2 = null;
        if (b3 != null) {
            num2 = b3.f80207b;
        }
        if (num2 == null || num2.intValue() != 1 || (b2 = k.b()) == null || (num = b2.f80206a) == null || num.intValue() != 1 || f.a("search_common").getInt("feed_search_tips_shown", -1) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final t<DiscoverSectionItem.SuggestSearchSection> r() {
        SuggestWordsApi.a aVar = (SuggestWordsApi.a) h.i.a((h.f.a.a) c.b.f82759a).getValue();
        l.d(aVar, "");
        t<R> d2 = SuggestWordsApi.a().getSuggestSearchList(aVar.f80816a, aVar.f80817b, gt.f143029c.a().a(), aVar.f80818c, aVar.f80825j).c(c.a.f82758a).d();
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> p() {
        String str;
        int i2;
        ad c2;
        String str2;
        ad c3;
        String a2 = d.a();
        String str3 = "";
        if (a2 == null) {
            a2 = str3;
        }
        com.ss.android.ugc.aweme.search.k.q a3 = am.a();
        if (a3 == null || (c3 = a3.c()) == null || (str = c3.f121172a) == null) {
            str = str3;
        }
        com.ss.android.ugc.aweme.search.k.q a4 = am.a();
        if (!(a4 == null || (c2 = a4.c()) == null || (str2 = c2.f121173b) == null)) {
            str3 = str2;
        }
        String str4 = d.f81886e;
        com.ss.android.ugc.aweme.search.k.q a5 = am.a();
        if (a5 != null) {
            i2 = a5.a();
        } else {
            i2 = 0;
        }
        return ag.a(v.a("imprId", a2), v.a("searchId", str), v.a("searchKeyword", str3), v.a("searchResultId", str4), v.a("searchType", com.ss.android.ugc.aweme.discover.mob.m.b(i2)));
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a() {
        com.ss.android.ugc.aweme.xsearch.video.d dVar = d.b.f145280a;
        dVar.a(null, null, null, dVar.f145276b);
        d.b.f145280a.f145275a = null;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(int i2) {
        com.ss.android.ugc.aweme.xsearch.d.f145150a = i2;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final af a(boolean z) {
        return new com.ss.android.ugc.aweme.discover.j.s();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void c(boolean z) {
        com.ss.android.ugc.aweme.discover.a.g.f80201a = z;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> a(com.lynx.tasm.behavior.j jVar) {
        l.d(jVar, "");
        return new LynxSearchVideo(jVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> b(com.lynx.tasm.behavior.j jVar) {
        l.d(jVar, "");
        return new LynxSearchHorizontal(jVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> c(com.lynx.tasm.behavior.j jVar) {
        l.d(jVar, "");
        return new LynxSearchLive(jVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b(com.ss.android.ugc.aweme.search.model.d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.search.s.b.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b(boolean z) {
        f.a("search_common").storeInt("feed_search_tips_shown", z ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final FeedSearchIconViewModel a(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        androidx.lifecycle.ac a2 = ae.a(eVar, (ad.b) null).a(FeedSearchIconViewModel.class);
        l.b(a2, "");
        FeedSearchIconViewModel feedSearchIconViewModel = (FeedSearchIconViewModel) a2;
        if (!feedSearchIconViewModel.a().hasObservers()) {
            ef.a(feedSearchIconViewModel.a(), eVar, new com.ss.android.ugc.aweme.search.h.c(eVar));
        }
        return feedSearchIconViewModel;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<com.bytedance.ies.bullet.c.c.a.k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return h.a.n.b(new com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.SearchKeywordChangeMethod(bVar), new PlayMusicBridge(bVar), new UpdateGeneralSearchBackgroundMethod(bVar), new UpdateRawDataMethod(bVar), new DeleteSearchHistoryMethod(bVar), new GetSearchHistoryMethod(bVar), new OpenAlertMethod(bVar), new KeyboardChangeMethod(bVar), new OpenLiveMethod(bVar), new SearchLaunchChatMethod(bVar), new FollowPACheckMethod(bVar), new OpenLiveMoreMethod(bVar), new SaveSearchHistoryAndGoDetail(bVar), new DeleteMostVisitedAccountMethod(bVar), new OpenEffectRecordMethod(bVar), new SearchCardClickMethod(bVar), new OpenPlaylistMethod(bVar), new HideSearchLoadingMethod(bVar), new SearchRequestSuccessMethod(bVar), new SearchRefreshMonitorMethod(bVar), new OpenHotSpotMethod(bVar));
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final JediSimpleViewHolder<DiscoverSectionItem> a(ViewGroup viewGroup, androidx.fragment.app.e eVar) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awi, viewGroup, false);
        l.b(a2, "");
        return new DiscoverySuggestSearchViewHolder(a2, eVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Intent a(Activity activity, Uri uri) {
        l.d(activity, "");
        l.d(uri, "");
        l.d(activity, "");
        l.d(uri, "");
        b.a newBuilder = com.ss.android.ugc.aweme.search.model.b.Companion.newBuilder();
        com.ss.android.ugc.aweme.search.n.d a2 = com.ss.android.ugc.aweme.search.m.a.a(uri, newBuilder);
        com.ss.android.ugc.aweme.search.model.b a3 = newBuilder.a();
        com.ss.android.ugc.aweme.search.model.d dVar = new com.ss.android.ugc.aweme.search.model.d();
        com.ss.android.ugc.aweme.search.m.a.a(uri, dVar);
        dVar.setSearchEnterParam(a3);
        Intent intent = new Intent(activity, SearchResultActivity.class);
        new Bundle();
        intent.putExtra("searchParam", dVar);
        intent.putExtra("search_enter_param", a3);
        intent.putExtras(intent.putExtra("search_context_source", a2));
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String a(User user, Context context) {
        if (user != null) {
            return com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.discover.ui.ae a(com.ss.android.ugc.aweme.search.model.d dVar, a.AbstractC2689a aVar, com.ss.android.ugc.aweme.following.ui.adapter.d dVar2, com.ss.android.ugc.aweme.search.d.b bVar, String str) {
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(dVar2, "");
        return new al(dVar, aVar, dVar2, bVar, str);
    }
}
