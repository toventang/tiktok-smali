package com.ss.android.ugc.aweme.discover.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.discover.adapter.y;
import com.ss.android.ugc.aweme.discover.model.SearchEffect;
import com.ss.android.ugc.aweme.discover.model.SearchEffectListViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchEffectPropsList;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.List;

public final class SearchEffectListActivity extends com.bytedance.ies.foundation.activity.a implements h.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f80252c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    View f80253a;

    /* renamed from: b  reason: collision with root package name */
    final y f80254b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f80255d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private TextTitleBar f80256e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f80257f;

    /* renamed from: g  reason: collision with root package name */
    private String f80258g;

    /* renamed from: h  reason: collision with root package name */
    private String f80259h = "tiktok_effects";

    /* renamed from: i  reason: collision with root package name */
    private String f80260i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f80261j;

    static {
        Covode.recordClassIndex(49947);
    }

    private final SearchEffectListViewModel a() {
        return (SearchEffectListViewModel) this.f80255d.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f80261j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f80261j == null) {
            this.f80261j = new SparseArray();
        }
        View view = (View) this.f80261j.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f80261j.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<SearchEffectListViewModel> {
        final /* synthetic */ SearchEffectListActivity this$0;

        static {
            Covode.recordClassIndex(49950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchEffectListActivity searchEffectListActivity) {
            super(0);
            this.this$0 = searchEffectListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchEffectListViewModel invoke() {
            return ae.a(this.this$0, (ad.b) null).a(SearchEffectListViewModel.class);
        }
    }

    public SearchEffectListActivity() {
        y yVar = new y();
        yVar.a((h.a) this);
        this.f80254b = yVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        String str = this.f80258g;
        if (str != null) {
            a().fetch(str, this.f80259h, this.f80254b.c(), 15);
            this.f80254b.ag_();
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

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchEffectListActivity f80262a;

        static {
            Covode.recordClassIndex(49949);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SearchEffectListActivity searchEffectListActivity) {
            this.f80262a = searchEffectListActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f80262a.finish();
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchEffectListActivity f80263a;

        static {
            Covode.recordClassIndex(49951);
        }

        d(SearchEffectListActivity searchEffectListActivity) {
            this.f80263a = searchEffectListActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.ss.android.ugc.aweme.discover.adapter.y */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            SearchEffectPropsList searchEffectPropsList = (SearchEffectPropsList) obj;
            SearchEffectListActivity searchEffectListActivity = this.f80263a;
            searchEffectListActivity.f80254b.ai_();
            View view = searchEffectListActivity.f80253a;
            if (view == null) {
                l.a("loadingView");
            }
            view.setVisibility(8);
            if (searchEffectPropsList != null) {
                List<SearchEffect> list = searchEffectPropsList.props;
                if (list == null || !(!list.isEmpty())) {
                    searchEffectListActivity.f80254b.ah_();
                    return;
                }
                searchEffectListActivity.f80254b.c(list);
                if (list.size() < 15) {
                    searchEffectListActivity.f80254b.ah_();
                    return;
                }
                return;
            }
            searchEffectListActivity.f80254b.j();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(2390);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aun);
        getIntent().getIntExtra(StringSet.type, 0);
        String a2 = a(getIntent(), "alasrc");
        if (a2 == null) {
            a2 = "tiktok_effects";
        }
        this.f80259h = a2;
        String a3 = a(getIntent(), "title");
        if (a3 == null) {
            a3 = getString(R.string.fhq);
        }
        this.f80260i = a3;
        String a4 = a(getIntent(), "keyword");
        this.f80258g = a4;
        if (a4 != null) {
            a().fetch(a4, this.f80259h, this.f80254b.c(), 15);
        }
        a().getData().observe(this, new d(this));
        View findViewById = findViewById(R.id.em8);
        l.b(findViewById, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById;
        this.f80256e = textTitleBar;
        if (textTitleBar == null) {
            l.a("titleBar");
        }
        textTitleBar.setTitle(this.f80260i);
        TextTitleBar textTitleBar2 = this.f80256e;
        if (textTitleBar2 == null) {
            l.a("titleBar");
        }
        textTitleBar2.setOnTitleBarClickListener(new b(this));
        View findViewById2 = findViewById(R.id.cb4);
        l.b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f80257f = recyclerView;
        if (recyclerView == null) {
            l.a("mList");
        }
        recyclerView.setAdapter(this.f80254b);
        View findViewById3 = findViewById(R.id.aot);
        if (findViewById3 != null) {
            View inflate = ((ViewStub) findViewById3).inflate();
            l.b(inflate, "");
            this.f80253a = inflate;
            if (inflate == null) {
                l.a("loadingView");
            }
            inflate.setVisibility(0);
            this.f80254b.a((CharSequence) "");
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.discover.activity.SearchEffectListActivity", "onCreate", false);
            MethodCollector.o(2390);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
        MethodCollector.o(2390);
        throw nullPointerException;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
