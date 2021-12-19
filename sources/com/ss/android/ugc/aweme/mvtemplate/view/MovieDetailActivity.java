package com.ss.android.ugc.aweme.mvtemplate.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class MovieDetailActivity extends com.bytedance.ies.foundation.activity.a implements com.ss.android.ugc.aweme.analysis.c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f112164f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f112165a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f112166b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f112167c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f112168d = "";

    /* renamed from: e  reason: collision with root package name */
    public int f112169e;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f112170g;

    static {
        Covode.recordClassIndex(72063);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f112170g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f112170g == null) {
            this.f112170g = new SparseArray();
        }
        View view = (View) this.f112170g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f112170g.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72064);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MovieDetailActivity f112171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f112172b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f112173c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Intent f112174d;

        static {
            Covode.recordClassIndex(72065);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().recordActivityResult(this.f112171a, this.f112172b, this.f112173c, this.f112174d);
        }

        b(MovieDetailActivity movieDetailActivity, int i2, int i3, Intent intent) {
            this.f112171a = movieDetailActivity;
            this.f112172b = i2;
            this.f112173c = i3;
            this.f112174d = intent;
        }
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        long j2;
        Exception e2;
        long j3 = 0;
        try {
            j2 = Long.parseLong(this.f112165a);
            try {
                j3 = Long.parseLong(this.f112168d);
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Exception e4) {
            e2 = e4;
            j2 = 0;
            e2.printStackTrace();
            Analysis value = new Analysis().setLabelName("mv_page").setExt_value(j2).setValue(j3);
            l.b(value, "");
            return value;
        }
        Analysis value2 = new Analysis().setLabelName("mv_page").setExt_value(j2).setValue(j3);
        l.b(value2, "");
        return value2;
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
        public static final c f112175a = new c();

        static {
            Covode.recordClassIndex(72066);
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
            baseActivityViewModel2.config(AnonymousClass1.f112176a);
            baseActivityViewModel2.config(AnonymousClass2.f112177a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", true);
        activityConfiguration(c.f112175a);
        super.onCreate(bundle);
        setContentView(R.layout.bn);
        String a2 = a(getIntent(), "mv_id");
        if (a2 == null) {
            a2 = "";
        }
        this.f112165a = a2;
        String a3 = a(getIntent(), "enter_method");
        if (a3 == null) {
            a3 = "";
        }
        this.f112167c = a3;
        String a4 = a(getIntent(), "enter_from");
        if (a4 == null) {
            a4 = "";
        }
        this.f112166b = a4;
        String a5 = a(getIntent(), "group_id");
        if (a5 == null) {
            a5 = "";
        }
        this.f112168d = a5;
        this.f112169e = getIntent().getIntExtra(StringSet.type, 0);
        i supportFragmentManager = getSupportFragmentManager();
        n a6 = supportFragmentManager.a();
        l.b(a6, "");
        Fragment a7 = supportFragmentManager.a("movie_detail_fragment_tag");
        if (a7 == null) {
            String str = this.f112165a;
            String str2 = this.f112166b;
            String str3 = this.f112168d;
            String str4 = this.f112167c;
            int i2 = this.f112169e;
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            a7 = new f();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("mv_id", str);
            bundle2.putString("enter_from", str2);
            bundle2.putString("enter_method", str4);
            bundle2.putString("group_id", str3);
            bundle2.putInt(StringSet.type, i2);
            a7.setArguments(bundle2);
        }
        a7.setUserVisibleHint(true);
        a6.b(R.id.ad7, a7, "movie_detail_fragment_tag");
        a6.b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        AVExternalServiceImpl.a().asyncService(this, "movie_detail", new b(this, i2, i3, intent));
        if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
