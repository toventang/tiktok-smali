package com.ss.android.ugc.aweme.compliance.business.report;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.h.ad;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class ReportWebPageDialogActivity extends com.bytedance.ies.foundation.activity.a implements com.ss.android.ugc.aweme.base.a.f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f77130c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Animation f77131a;

    /* renamed from: b  reason: collision with root package name */
    public int f77132b;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.base.a.b f77133d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.d.a.a f77134e;

    /* renamed from: f  reason: collision with root package name */
    private a f77135f;

    /* renamed from: g  reason: collision with root package name */
    private int f77136g;

    /* renamed from: h  reason: collision with root package name */
    private long f77137h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f77138i;

    static {
        Covode.recordClassIndex(47682);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f77138i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f77138i == null) {
            this.f77138i = new SparseArray();
        }
        View view = (View) this.f77138i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f77138i.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47683);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        public static void a(Activity activity, Bundle bundle, String str, String str2) {
            l.d(activity, "");
            l.d(bundle, "");
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("webview_progress_bar", true);
            if (str == null) {
                str = "";
            }
            bundle.putString("object_id", str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("enter_from", str2);
            Intent intent = new Intent(activity, ReportWebPageDialogActivity.class);
            intent.putExtras(bundle);
            a(activity, intent);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        a aVar = this.f77135f;
        if (aVar == null) {
            l.a("webPageContainer");
        }
        com.ss.android.ugc.aweme.crossplatform.view.a f2 = aVar.f();
        if (f2 == null || !f2.a()) {
            finish();
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

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        MethodCollector.i(4978);
        if (this.f77132b <= 2) {
            Animation animation = this.f77131a;
            if (animation != null) {
                animation.cancel();
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.ai);
            this.f77131a = loadAnimation;
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new b(this));
                ((RadiusLayout) _$_findCachedViewById(R.id.ahb)).startAnimation(this.f77131a);
                this.f77132b = 3;
                MethodCollector.o(4978);
                return;
            }
            this.f77132b = 4;
            if (!isFinishing()) {
                super.finish();
                overridePendingTransition(0, 0);
            }
        }
        MethodCollector.o(4978);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        long currentTimeMillis = System.currentTimeMillis();
        r.a("tns_report_webview", new com.ss.android.ugc.aweme.app.f.d().a("enter_time", this.f77137h).a("exit_time", currentTimeMillis).a("duration", currentTimeMillis - this.f77137h).a("enter_from", a(getIntent(), "enter_from")).a("object_id", a(getIntent(), "object_id")).f66730a);
        super.onDestroy();
    }

    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportWebPageDialogActivity f77139a;

        static {
            Covode.recordClassIndex(47684);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f77139a = reportWebPageDialogActivity;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f77139a.f77131a = null;
            this.f77139a.f77132b = 4;
            if (!this.f77139a.isFinishing()) {
                ReportWebPageDialogActivity.super.finish();
                this.f77139a.overridePendingTransition(0, 0);
            }
        }
    }

    public static final class g implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportWebPageDialogActivity f77145a;

        static {
            Covode.recordClassIndex(47690);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f77145a = reportWebPageDialogActivity;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f77145a.f77131a = null;
            this.f77145a.f77132b = 2;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.f
    public final void setActivityResultListener(com.ss.android.ugc.aweme.base.a.b bVar) {
        l.d(bVar, "");
        this.f77133d = bVar;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportWebPageDialogActivity f77140a;

        static {
            Covode.recordClassIndex(47685);
        }

        c(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f77140a = reportWebPageDialogActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f77140a.finish();
        }
    }

    static final class f extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f77143a = new f();

        static {
            Covode.recordClassIndex(47688);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f77144a);
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        int i3 = this.f77136g;
        if (i3 == 0) {
            return;
        }
        if (i2 > i3) {
            RadiusLayout radiusLayout = (RadiusLayout) _$_findCachedViewById(R.id.ahb);
            l.b(radiusLayout, "");
            radiusLayout.getLayoutParams().height = this.f77136g;
            return;
        }
        RadiusLayout radiusLayout2 = (RadiusLayout) _$_findCachedViewById(R.id.ahb);
        l.b(radiusLayout2, "");
        radiusLayout2.getLayoutParams().height = -1;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        MethodCollector.i(4874);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && this.f77132b <= 0) {
            Animation animation = this.f77131a;
            if (animation != null) {
                animation.cancel();
            }
            RadiusLayout radiusLayout = (RadiusLayout) _$_findCachedViewById(R.id.ahb);
            l.b(radiusLayout, "");
            radiusLayout.setTranslationY(0.0f);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.ag);
            this.f77131a = loadAnimation;
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new g(this));
                ((RadiusLayout) _$_findCachedViewById(R.id.ahb)).startAnimation(this.f77131a);
                this.f77132b = 1;
                MethodCollector.o(4874);
                return;
            }
            this.f77132b = 2;
        }
        MethodCollector.o(4874);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", true);
        activityConfiguration(f.f77143a);
        super.onCreate(bundle);
        this.f77137h = System.currentTimeMillis();
        setContentView(R.layout.u6);
        overridePendingTransition(0, 0);
        com.ss.android.ugc.aweme.crossplatform.d.a.a a2 = a.C1829a.a(getIntent());
        l.b(a2, "");
        this.f77134e = a2;
        this.f77136g = getIntent().getIntExtra("half_screen_height", 0);
        a(i.a(this));
        RadiusLayout radiusLayout = (RadiusLayout) _$_findCachedViewById(R.id.ahb);
        l.b(radiusLayout, "");
        radiusLayout.setTranslationY((float) i.a(this));
        _$_findCachedViewById(R.id.an1).setOnClickListener(new c(this));
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f77134e;
        if (aVar == null) {
            l.a("crossPlatformParams");
        }
        d dVar = new d(this, this, aVar);
        this.f77135f = dVar;
        dVar.a();
        v.a(_$_findCachedViewById(R.id.dqk), new e(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class e implements androidx.core.h.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportWebPageDialogActivity f77142a;

        static {
            Covode.recordClassIndex(47687);
        }

        e(ReportWebPageDialogActivity reportWebPageDialogActivity) {
            this.f77142a = reportWebPageDialogActivity;
        }

        @Override // androidx.core.h.r
        public final ad a(View view, ad adVar) {
            l.b(view, "");
            if (view.getHeight() == 0) {
                ReportWebPageDialogActivity reportWebPageDialogActivity = this.f77142a;
                reportWebPageDialogActivity.a(i.a(reportWebPageDialogActivity));
                if (adVar == null) {
                    return null;
                }
            } else {
                ReportWebPageDialogActivity reportWebPageDialogActivity2 = this.f77142a;
                int height = view.getHeight();
                l.b(adVar, "");
                reportWebPageDialogActivity2.a((height - adVar.d()) - adVar.b());
            }
            v.a(view, adVar.a(0, adVar.b(), 0, adVar.d()));
            return adVar;
        }
    }

    public static final class d extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReportWebPageDialogActivity f77141b;

        static {
            Covode.recordClassIndex(47686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ReportWebPageDialogActivity reportWebPageDialogActivity, Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
            super(activity, aVar, (byte) 0);
            this.f77141b = reportWebPageDialogActivity;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.ss.android.ugc.aweme.base.a.b bVar = this.f77133d;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
    }
}
