package com.ss.android.ugc.aweme.discover.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.f;
import com.ss.android.ugc.aweme.search.n.g;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.Serializable;
import org.json.JSONObject;

public final class SearchLiveListActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80264a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f80265b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f80266c;

    static {
        Covode.recordClassIndex(49952);
    }

    private final a.AbstractC2689a a() {
        return (a.AbstractC2689a) this.f80265b.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f80266c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f80266c == null) {
            this.f80266c = new SparseArray();
        }
        View view = (View) this.f80266c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f80266c.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49953);
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

        public static void a(Context context, b bVar, com.ss.android.ugc.aweme.search.model.b bVar2) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            com.ss.android.ugc.aweme.search.n.a searchCommonModel;
            com.ss.android.ugc.aweme.search.n.i searchVideoModel;
            g searchInputModel;
            l.d(context, "");
            l.d(bVar, "");
            f c2 = d.a.c();
            Intent intent = new Intent(context, SearchLiveListActivity.class);
            intent.putExtra("param_live_enter", bVar);
            intent.addFlags(268435456);
            if (bVar2 != null) {
                intent.putExtra("param_search_enter", bVar2);
            }
            a(context, intent);
            JSONObject jSONObject = new JSONObject();
            String str6 = null;
            if (bVar2 != null) {
                str = bVar2.getSearchHint();
            } else {
                str = null;
            }
            jSONObject.put("search_hint", str);
            if (bVar2 != null) {
                str2 = bVar2.getGroupId();
            } else {
                str2 = null;
            }
            jSONObject.put("group_id", str2);
            if (bVar2 != null) {
                str3 = bVar2.getEnterSearchFrom();
            } else {
                str3 = null;
            }
            jSONObject.put("enter_from", str3);
            if (c2 == null || (searchInputModel = c2.getSearchInputModel()) == null) {
                str4 = null;
            } else {
                str4 = searchInputModel.getHintWord();
            }
            jSONObject.put("search_hint_x", str4);
            if (c2 == null || (searchVideoModel = c2.getSearchVideoModel()) == null) {
                str5 = null;
            } else {
                str5 = searchVideoModel.getGroupId();
            }
            jSONObject.put("group_id_x", str5);
            if (!(c2 == null || (searchCommonModel = c2.getSearchCommonModel()) == null)) {
                str6 = searchCommonModel.getEnterFrom();
            }
            jSONObject.put("enter_from_x", str6);
            c.a.a("ref_search_live_list_activity", jSONObject, am.c("search_hint", "group_id", "enter_from"));
        }
    }

    static final class b extends m implements h.f.a.a<SearchKeywordPresenter> {
        final /* synthetic */ SearchLiveListActivity this$0;

        static {
            Covode.recordClassIndex(49954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchLiveListActivity searchLiveListActivity) {
            super(0);
            this.this$0 = searchLiveListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchKeywordPresenter invoke() {
            return new SearchKeywordPresenter(this.this$0);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
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

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80267a = new c();

        static {
            Covode.recordClassIndex(49955);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f80268a);
            return z.f158842a;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchLiveListActivity f80269a;

        static {
            Covode.recordClassIndex(49957);
        }

        d(SearchLiveListActivity searchLiveListActivity) {
            this.f80269a = searchLiveListActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f80269a.finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Serializable serializableExtra;
        Serializable serializableExtra2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onCreate", true);
        activityConfiguration(c.f80267a);
        super.onCreate(bundle);
        setContentView(R.layout.aul);
        com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.elv);
        l.b(aVar, "");
        DmtTextView titleView = aVar.getTitleView();
        l.b(titleView, "");
        titleView.setText(getString(R.string.fw));
        NormalTitleBar normalTitleBar = (NormalTitleBar) _$_findCachedViewById(R.id.elv);
        l.b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setOnClickListener(new d(this));
        ((com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.elv)).a(true);
        Intent intent = getIntent();
        if (!(intent == null || (serializableExtra = intent.getSerializableExtra("param_live_enter")) == null)) {
            l.b(serializableExtra, "");
            if (serializableExtra instanceof b) {
                a.AbstractC2689a a2 = a();
                b bVar = (b) serializableExtra;
                String searchKeyword = bVar.getSearchKeyword();
                if (searchKeyword == null) {
                    searchKeyword = "";
                }
                a2.a(new com.ss.android.ugc.aweme.keyword.b(searchKeyword, null, 2));
                ac a3 = ae.a(this, (ad.b) null).a(SearchLiveListEnterParamViewModel.class);
                l.b(a3, "");
                ((SearchLiveListEnterParamViewModel) a3).f80271a = bVar;
                Intent intent2 = getIntent();
                if (!(intent2 == null || (serializableExtra2 = intent2.getSerializableExtra("param_search_enter")) == null)) {
                    l.b(serializableExtra2, "");
                    if (serializableExtra2 instanceof com.ss.android.ugc.aweme.search.model.b) {
                        SearchEnterViewModel.a.a(this).a(this, (com.ss.android.ugc.aweme.search.model.b) serializableExtra2);
                    }
                    com.ss.android.ugc.aweme.discover.ui.c.d dVar = new com.ss.android.ugc.aweme.discover.ui.c.d();
                    com.ss.android.ugc.aweme.search.model.d enterMethod = new com.ss.android.ugc.aweme.search.model.d().setKeyword(a().a().f105233a).setEnterMethod(bVar.getEnterMethod());
                    String fromSearchSubtag = bVar.getFromSearchSubtag();
                    if (fromSearchSubtag == null) {
                        fromSearchSubtag = "";
                    }
                    com.ss.android.ugc.aweme.search.model.d fromSearchSubtag2 = enterMethod.setFromSearchSubtag(fromSearchSubtag);
                    String preSearchId = bVar.getPreSearchId();
                    if (preSearchId == null) {
                        preSearchId = "";
                    }
                    com.ss.android.ugc.aweme.search.model.d preSearchId2 = fromSearchSubtag2.setPreSearchId(preSearchId);
                    l.b(preSearchId2, "");
                    l.d(preSearchId2, "");
                    dVar.r = preSearchId2;
                    getSupportFragmentManager().a().b(R.id.b94, dVar, "container").c();
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity", "onCreate", false);
    }
}
