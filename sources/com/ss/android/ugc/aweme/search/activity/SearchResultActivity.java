package com.ss.android.ugc.aweme.search.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.arch.i;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.ui.ab;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.discover.ui.bi;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.l.a.g;
import com.ss.android.ugc.aweme.search.l.k;
import com.ss.android.ugc.aweme.search.model.b;
import com.ss.android.ugc.aweme.utils.gu;
import com.ss.android.ugc.aweme.utils.w;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.h;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.greenrobot.eventbus.EventBus;

public final class SearchResultActivity extends com.bytedance.ies.foundation.activity.a implements ar<i>, q, com.ss.android.ugc.aweme.base.f, com.ss.android.ugc.aweme.d.d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f120967b = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private static boolean f120968g;

    /* renamed from: a  reason: collision with root package name */
    public i f120969a = new i();

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.search.model.d f120970c;

    /* renamed from: d  reason: collision with root package name */
    private final h f120971d = h.i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f120972e = h.i.a((h.f.a.a) new f(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f120973f;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f120974h;

    static {
        Covode.recordClassIndex(78794);
    }

    private final SearchIntermediateViewModel a() {
        return (SearchIntermediateViewModel) this.f120971d.getValue();
    }

    private final SearchStateViewModel b() {
        return (SearchStateViewModel) this.f120972e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f120974h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f120974h == null) {
            this.f120974h = new SparseArray();
        }
        View view = (View) this.f120974h.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f120974h.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78795);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        private static void a(Context context, Intent intent, Bundle bundle) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent, bundle);
        }

        public static void a(Context context, com.ss.android.ugc.aweme.search.model.d dVar, com.ss.android.ugc.aweme.search.model.b bVar, Bundle bundle, com.ss.android.ugc.aweme.search.n.d dVar2) {
            l.d(context, "");
            l.d(dVar, "");
            Intent intent = new Intent();
            intent.putExtra("searchParam", dVar);
            com.ss.android.ugc.aweme.discover.viewmodel.a.a(intent, bVar);
            intent.putExtra("search_context_source", dVar2);
            intent.setClass(context, SearchResultActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (bundle == null || Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 30) {
                a(context, intent);
            } else {
                a(context, intent, bundle);
            }
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ i d() {
        return this.f120969a;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.search.l.c> {
        final /* synthetic */ SearchResultActivity this$0;

        static {
            Covode.recordClassIndex(78796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchResultActivity searchResultActivity) {
            super(0);
            this.this$0 = searchResultActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.l.c invoke() {
            return new com.ss.android.ugc.aweme.search.l.c(this.this$0);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        com.ss.android.ugc.aweme.base.a.c.a(this);
    }

    static final class c extends h.f.b.m implements h.f.a.a<SearchIntermediateViewModel> {
        final /* synthetic */ SearchResultActivity this$0;

        static {
            Covode.recordClassIndex(78797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchResultActivity searchResultActivity) {
            super(0);
            this.this$0 = searchResultActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            return androidx.lifecycle.ae.a(this.this$0, (ad.b) null).a(SearchIntermediateViewModel.class);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<SearchStateViewModel> {
        final /* synthetic */ SearchResultActivity this$0;

        static {
            Covode.recordClassIndex(78801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SearchResultActivity searchResultActivity) {
            super(0);
            this.this$0 = searchResultActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchStateViewModel invoke() {
            return androidx.lifecycle.ae.a(this.this$0, (ad.b) null).a(SearchStateViewModel.class);
        }
    }

    private boolean g() {
        return MSAdaptionService.c().a((Context) this);
    }

    @Override // com.ss.android.ugc.aweme.d.d
    public final com.ss.android.ugc.aweme.d.c getInflater() {
        return (com.ss.android.ugc.aweme.d.c) this.f120973f.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        b().setSearchPageVisible(true);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        Fragment a2 = getSupportFragmentManager().a("container");
        if (!(a2 instanceof ab) || !((ab) a2).a()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", true);
        super.onResume();
        w.f143191a = hashCode();
        com.ss.android.ugc.aweme.discover.ui.search.a.f82639a = hashCode();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        int i2;
        Fragment a2 = getSupportFragmentManager().a("container");
        if (a2 instanceof bi) {
            bi biVar = (bi) a2;
            if (biVar.b() != null) {
                ap b2 = biVar.b();
                if (b2 == null) {
                    l.b();
                }
                i2 = b2.f82317k;
            } else {
                i2 = -1;
            }
            if (i2 == j.f121154b) {
                return "general_search";
            }
            if (i2 == j.f121156d) {
                return "search_result";
            }
        }
        return "";
    }

    public SearchResultActivity() {
        for (SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver : n.a(new SearchMusicPlayerLifecycleObserver(this))) {
            getLifecycleOwner().getLifecycle().a(searchMusicPlayerLifecycleObserver);
        }
        this.f120973f = h.i.a((h.f.a.a) new b(this));
    }

    private final com.ss.android.ugc.aweme.search.model.d e() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        String a2 = a(intent, "keyword");
        String a3 = a(intent, "display_keyword");
        if (TextUtils.isEmpty(a3)) {
            a3 = a(intent, "displayKeyword");
        }
        String a4 = a(intent, "enter_from");
        String a5 = a(intent, "search_from");
        String a6 = a(intent, "enter_method");
        if (TextUtils.isEmpty(a4)) {
            return null;
        }
        com.ss.android.ugc.aweme.search.model.d realSearchWord = new com.ss.android.ugc.aweme.search.model.d().setRealSearchWord(a2);
        if (!TextUtils.isEmpty(a3)) {
            a2 = a3;
        }
        return realSearchWord.setKeyword(a2).setSearchFrom(a5).setEnterMethod(a6);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        b().setSearchPageVisible(false);
        b().setIsLeavingSearch(false);
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        View decorView;
        com.bytedance.helios.sdk.utils.a.e(this);
        Window window = getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            l.b(decorView, "");
            j.a.b(decorView);
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.discover.j.l.f81275d--;
        com.ss.android.ugc.aweme.discover.j.l.f81274c--;
        if (com.ss.android.ugc.aweme.discover.j.l.f81275d <= 0) {
            com.ss.android.ugc.aweme.discover.j.l.f81272a.clear();
        }
        g.f121354a.clear();
        com.ss.android.ugc.aweme.search.l.a.h.f121359a.clear();
        com.ss.android.ugc.aweme.discover.mob.d.f81892k = 0;
        com.ss.android.ugc.aweme.discover.mob.d.f81893l = 0;
        com.ss.android.ugc.aweme.discover.mob.d.f81883b = false;
        com.ss.android.ugc.aweme.discover.mob.d.f81884c = false;
        com.ss.android.ugc.aweme.discover.mob.d.f81885d = false;
        SearchEnterViewModel.a.a(this);
        SearchEnterViewModel.f82792b.remove(Integer.valueOf(hashCode()));
        w.a(hashCode());
        com.ss.android.ugc.aweme.discover.helper.ae aeVar = com.ss.android.ugc.aweme.discover.helper.ae.f81066a;
        aeVar.f81624b--;
        if (aeVar.f81624b <= 0) {
            EventBus.a().b(aeVar);
            aeVar.a().clear();
            aeVar.f81624b = 0;
        }
        SearchApiNew.f80778d.clear();
        int hashCode = hashCode();
        ConcurrentLinkedDeque<p<Integer, com.ss.android.ugc.aweme.search.k.q>> concurrentLinkedDeque = am.f121188a;
        ArrayList<p> arrayList = new ArrayList();
        for (T t : concurrentLinkedDeque) {
            T t2 = t;
            if (!(t2 == null || hashCode != ((Number) t2.getFirst()).intValue() || t2.getSecond() == null)) {
                arrayList.add(t);
            }
        }
        for (p pVar : arrayList) {
            am.f121188a.remove(pVar);
            ((com.ss.android.ugc.aweme.search.k.q) pVar.getSecond()).d();
        }
        gu.a(this);
    }

    private final void f() {
        com.ss.android.ugc.aweme.search.model.f fVar;
        String a2;
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.f120970c = (com.ss.android.ugc.aweme.search.model.d) intent.getSerializableExtra("searchParam");
            SearchIntermediateViewModel a3 = a();
            com.ss.android.ugc.aweme.search.model.d dVar = this.f120970c;
            if (dVar != null) {
                fVar = dVar.getTimeParam();
            } else {
                fVar = null;
            }
            a3.timeParam = fVar;
            com.ss.android.ugc.aweme.search.model.b bVar = (com.ss.android.ugc.aweme.search.model.b) intent.getSerializableExtra("search_enter_param");
            com.ss.android.ugc.aweme.search.n.d dVar2 = (com.ss.android.ugc.aweme.search.n.d) intent.getSerializableExtra("search_context_source");
            a(bVar);
            if (this.f120970c == null) {
                this.f120970c = e();
            }
            com.ss.android.ugc.aweme.search.model.d dVar3 = this.f120970c;
            if (dVar3 == null) {
                finish();
                return;
            }
            if (bVar == null) {
                bVar = dVar3.getSearchEnterParam();
            }
            if (!(bVar != null || (a2 = a(intent, "enter_from")) == null || a2.length() == 0)) {
                String a4 = a(intent, "group_id");
                String a5 = a(intent, "author_id");
                b.a newBuilder = com.ss.android.ugc.aweme.search.model.b.Companion.newBuilder();
                newBuilder.f121499a = a2;
                newBuilder.f121501c = a4;
                newBuilder.f121502d = a5;
                bVar = newBuilder.a();
            }
            if (dVar2 == null) {
                String a6 = a(intent, "enter_from");
                if (a6 == null || a6.length() == 0) {
                    dVar2 = new com.ss.android.ugc.aweme.search.n.d(null, null, 3, null);
                } else {
                    dVar2 = new com.ss.android.ugc.aweme.search.n.d(new com.ss.android.ugc.aweme.search.n.f(new com.ss.android.ugc.aweme.search.n.a(a6, null, false, false, 14, null), null, new com.ss.android.ugc.aweme.search.n.i(a(intent, "author_id"), a(intent, "group_id")), 2, null), null, 2, null);
                }
            }
            com.bytedance.track.c.a(this).f44410c.a().a("tracker_key", dVar2, com.ss.android.ugc.aweme.search.n.d.class);
            com.bytedance.track.c.a(this).f44410c.a().a("tracker_key", new com.ss.android.ugc.aweme.search.n.e(), com.ss.android.ugc.aweme.search.n.e.class);
            if (bVar != null) {
                SearchEnterViewModel.a.a(this).a(this, bVar);
            }
            com.ss.android.ugc.aweme.search.model.d dVar4 = this.f120970c;
            if (dVar4 == null) {
                l.b();
            }
            dVar4.setOpenNewSearchContainer(true);
            com.ss.android.ugc.aweme.search.model.d dVar5 = this.f120970c;
            if (dVar5 == null) {
                l.b();
            }
            a(dVar5, bVar);
            return;
        }
        finish();
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchResultActivity f120977a;

        static {
            Covode.recordClassIndex(78800);
        }

        e(SearchResultActivity searchResultActivity) {
            this.f120977a = searchResultActivity;
        }

        public final void run() {
            int i2;
            SearchResultActivity searchResultActivity = this.f120977a;
            if (searchResultActivity != null) {
                i2 = searchResultActivity.hashCode();
            } else {
                i2 = 0;
            }
            w.a("search_result_show_video", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_result_show_video", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("search_result_show_video", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_result_show_video", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("search_result_show_video", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("search_result_show_video", "video_tag", com.ss.android.ugc.aweme.search.r.b.f121592c, i2);
            w.a("search_result_show", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_result_show", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("search_result_show", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_result_show", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("search_result_show", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("search_result_click", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_result_click", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("search_result_click", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_result_click", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("search_result_click", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("feed_enter", "video_tag", com.ss.android.ugc.aweme.search.r.b.f121592c, i2);
            w.a("feed_enter", "user_tag", com.ss.android.ugc.aweme.search.r.b.f121593d, i2);
            w.a("feed_enter", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("feed_enter", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("feed_enter", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("feed_enter", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("feed_enter", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("feed_enter", "token_type", com.ss.android.ugc.aweme.search.r.b.f121601l, i2);
            w.a("feed_enter", "anchor_info", com.ss.android.ugc.aweme.search.r.b.f121602m, i2);
            w.a("video_play", "video_tag", com.ss.android.ugc.aweme.search.r.b.f121592c, i2);
            w.a("video_play", "user_tag", com.ss.android.ugc.aweme.search.r.b.f121593d, i2);
            w.a("video_play", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("video_play", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("video_play", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("video_play", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("video_play", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("video_play", "list_result_type", com.ss.android.ugc.aweme.search.r.b.f121598i, i2);
            w.a("video_play", "list_item_id", com.ss.android.ugc.aweme.search.r.b.f121599j, i2);
            w.a("video_play", "search_third_item_id", com.ss.android.ugc.aweme.search.r.b.f121600k, i2);
            w.a("video_play", "token_type", com.ss.android.ugc.aweme.search.r.b.f121601l, i2);
            w.a("video_play", "anchor_info", com.ss.android.ugc.aweme.search.r.b.f121602m, i2);
            w.a("play_time", "video_tag", com.ss.android.ugc.aweme.search.r.b.f121592c, i2);
            w.a("play_time", "user_tag", com.ss.android.ugc.aweme.search.r.b.f121593d, i2);
            w.a("play_time", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("play_time", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("play_time", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("play_time", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("play_time", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("play_time", "list_result_type", com.ss.android.ugc.aweme.search.r.b.f121598i, i2);
            w.a("play_time", "list_item_id", com.ss.android.ugc.aweme.search.r.b.f121599j, i2);
            w.a("play_time", "search_third_item_id", com.ss.android.ugc.aweme.search.r.b.f121600k, i2);
            w.a("play_time", "token_type", com.ss.android.ugc.aweme.search.r.b.f121601l, i2);
            w.a("play_time", "anchor_info", com.ss.android.ugc.aweme.search.r.b.f121602m, i2);
            w.a("video_play_finish", "video_tag", com.ss.android.ugc.aweme.search.r.b.f121592c, i2);
            w.a("video_play_finish", "user_tag", com.ss.android.ugc.aweme.search.r.b.f121593d, i2);
            w.a("video_play_finish", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("video_play_finish", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("video_play_finish", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("video_play_finish", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("video_play_finish", "log_pb", com.ss.android.ugc.aweme.search.r.b.f121597h, i2);
            w.a("video_play_finish", "list_result_type", com.ss.android.ugc.aweme.search.r.b.f121598i, i2);
            w.a("video_play_finish", "list_item_id", com.ss.android.ugc.aweme.search.r.b.f121599j, i2);
            w.a("video_play_finish", "search_third_item_id", com.ss.android.ugc.aweme.search.r.b.f121600k, i2);
            w.a("video_play_finish", "token_type", com.ss.android.ugc.aweme.search.r.b.f121601l, i2);
            w.a("video_play_finish", "anchor_info", com.ss.android.ugc.aweme.search.r.b.f121602m, i2);
            w.a("enter_personal_detail", "video_tag", com.ss.android.ugc.aweme.search.r.b.f121592c, i2);
            w.a("enter_personal_detail", "user_tag", com.ss.android.ugc.aweme.search.r.b.f121593d, i2);
            w.a("enter_personal_detail", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("enter_personal_detail", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("enter_personal_detail", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("enter_personal_detail", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("enter_tag_detail", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("enter_tag_detail", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("enter_tag_detail", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("enter_tag_detail", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("enter_music_detail", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("enter_music_detail", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("enter_music_detail", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("enter_music_detail", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("follow", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("follow", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("follow", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("follow", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("like", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("like", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("like", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("like", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("like_cancel", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("like_cancel", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("like_cancel", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("like_cancel", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("click_comment_button", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("click_comment_button", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("click_comment_button", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("click_comment_button", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("post_comment", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("post_comment", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("post_comment", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("post_comment", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("click_more_button", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("click_more_button", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("click_more_button", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("click_more_button", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("share_video", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("share_video", "search_keyword", com.ss.android.ugc.aweme.search.r.b.f121591b, i2);
            w.a("share_video", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("share_video", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_video_play_finish", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_video_play_finish", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_video_play", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_video_play", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_play_time", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_play_time", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("search_follow", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("search_follow", "impr_id", com.ss.android.ugc.aweme.search.r.b.f121596g, i2);
            w.a("tiktok_video_anchor_view", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("tiktok_video_anchor_view", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("tiktok_video_anchor_view", "enter_from", com.ss.android.ugc.aweme.search.r.b.f121595f, i2);
            w.a("tiktok_video_anchor_click", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("tiktok_video_anchor_click", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("tiktok_video_anchor_click", "enter_from", com.ss.android.ugc.aweme.search.r.b.f121595f, i2);
            w.a("tiktokec_product_show", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("tiktokec_product_show", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("tiktokec_product_show", "enter_from", com.ss.android.ugc.aweme.search.r.b.f121595f, i2);
            w.a("tiktokec_product_click", "search_id", com.ss.android.ugc.aweme.search.r.b.f121590a, i2);
            w.a("tiktokec_product_click", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("tiktokec_product_click", "enter_from", com.ss.android.ugc.aweme.search.r.b.f121595f, i2);
            w.a("tiktokec_enter_product_detail", "search_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("tiktokec_enter_product_detail", "search_result_id", com.ss.android.ugc.aweme.search.r.b.f121594e, i2);
            w.a("tiktokec_enter_product_detail", "enter_from", com.ss.android.ugc.aweme.search.r.b.f121595f, i2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120975a = new d();

        static {
            Covode.recordClassIndex(78798);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f120976a);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        f();
    }

    private final void a(com.ss.android.ugc.aweme.search.model.b bVar) {
        if (bVar != null) {
            if (bVar.getUseSingleStack()) {
                getIntent().putExtra("in_single_stack", true);
            }
            bVar.setUseSingleStack(false);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        if (!g()) {
            if (Build.VERSION.SDK_INT >= 24) {
                z = isInMultiWindowMode();
            } else {
                z = false;
            }
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            if ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || !a2.getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) && ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || (!"HWTAH ".equalsIgnoreCase(Build.DEVICE) && !"HWTAH-C".equalsIgnoreCase(Build.DEVICE) && !"unknownRLI".equalsIgnoreCase(Build.DEVICE) && !"unknownRHA".equalsIgnoreCase(Build.DEVICE))) && (!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || (!"TAH-AN00".equalsIgnoreCase(Build.MODEL) && !"TAH-N29".equalsIgnoreCase(Build.MODEL) && !"TAH-AN00m".equalsIgnoreCase(Build.MODEL) && !"TAH-N29m".equalsIgnoreCase(Build.MODEL) && !"RLI-AN00".equalsIgnoreCase(Build.MODEL) && !"RLI-N29".equalsIgnoreCase(Build.MODEL) && !"RHA-AN00m".equalsIgnoreCase(Build.MODEL) && !"RHA-N29m".equalsIgnoreCase(Build.MODEL))))) {
                com.ss.android.ugc.aweme.adaptation.j.f66257a = false;
                com.ss.android.ugc.aweme.adaptation.j.f66258b = 0;
                com.ss.android.ugc.aweme.adaptation.j.f66259c = 0;
            } else {
                com.ss.android.ugc.aweme.adaptation.j.f66257a = z;
                if (z) {
                    com.ss.android.ugc.aweme.adaptation.j.f66258b = i2;
                    com.ss.android.ugc.aweme.adaptation.j.f66259c = i3;
                } else {
                    com.ss.android.ugc.aweme.adaptation.j.f66258b = 0;
                    com.ss.android.ugc.aweme.adaptation.j.f66259c = 0;
                }
            }
            if (z != f120968g) {
                getSupportFragmentManager().a("container");
            }
            f120968g = z;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Bundle a2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", true);
        activityConfiguration(d.f120975a);
        super.onCreate(bundle);
        setContentView(k.INSTANCE.getView(this, R.layout.auk, null));
        f();
        if (!g()) {
            if (Build.VERSION.SDK_INT >= 30) {
                com.ss.android.ugc.aweme.base.a.c.a(this, 1);
            } else {
                com.ss.android.ugc.aweme.base.a.c.a(this, 0);
            }
        }
        com.ss.android.ugc.aweme.search.l.d.a();
        k.INSTANCE.async(new e(this));
        com.ss.android.ugc.aweme.discover.helper.ae aeVar = com.ss.android.ugc.aweme.discover.helper.ae.f81066a;
        aeVar.f81624b++;
        EventBus.a(EventBus.a(), aeVar);
        l.d(this, "");
        Iterator<T> it = gu.f143032b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().size();
        }
        if (i2 >= gu.f143031a) {
            List list = (List) n.d((Iterable) gu.f143032b);
            if (list == null) {
                list = new ArrayList();
            }
            if (list.isEmpty()) {
                gu.f143032b.poll();
            } else {
                Activity activity = (Activity) list.remove(0);
                if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                    activity.finish();
                }
            }
        }
        if (gu.f143032b.isEmpty() || ((a2 = gu.a(getIntent())) != null && a2.getBoolean("in_single_stack"))) {
            gu.f143032b.offer(n.d(this));
        } else {
            gu.b().add(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    private final void a(com.ss.android.ugc.aweme.search.model.d dVar, com.ss.android.ugc.aweme.search.model.b bVar) {
        bi a2 = bi.a.a(dVar, bVar, this);
        androidx.fragment.app.n a3 = getSupportFragmentManager().a();
        l.b(a3, "");
        a3.b(R.id.b94, a2, "container");
        a3.c();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
