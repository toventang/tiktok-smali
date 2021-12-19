package com.ss.android.ugc.aweme.donation.webpage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class DonationWebPageDialogActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83052a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.d.a.a f83053b;

    /* renamed from: c  reason: collision with root package name */
    private a f83054c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f83055d;

    static {
        Covode.recordClassIndex(51776);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f83055d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f83055d == null) {
            this.f83055d = new SparseArray();
        }
        View view = (View) this.f83055d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f83055d.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51777);
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

        public static void a(Context context, Bundle bundle) {
            l.d(context, "");
            l.d(bundle, "");
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("webview_progress_bar", true);
            Intent intent = new Intent(context, DonationWebPageDialogActivity.class);
            intent.putExtras(bundle);
            a(context, intent);
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ DonationWebPageDialogActivity this$0;

        static {
            Covode.recordClassIndex(51778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DonationWebPageDialogActivity donationWebPageDialogActivity) {
            super(0);
            this.this$0 = donationWebPageDialogActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.ah);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        a aVar = this.f83054c;
        if (aVar == null) {
            l.a("donationWebPageContainer");
        }
        com.ss.android.ugc.aweme.crossplatform.view.a f2 = aVar.f();
        if (f2 == null || !f2.a()) {
            super.onBackPressed();
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
        public static final c f83056a = new c();

        static {
            Covode.recordClassIndex(51779);
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
            baseActivityViewModel2.config(AnonymousClass1.f83057a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", true);
        activityConfiguration(c.f83056a);
        super.onCreate(bundle);
        setContentView(R.layout.y7);
        super.overridePendingTransition(R.anim.af, 0);
        com.ss.android.ugc.aweme.crossplatform.d.a.a a2 = a.C1829a.a(getIntent());
        l.b(a2, "");
        this.f83053b = a2;
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f83053b;
        if (aVar == null) {
            l.a("crossPlatformParams");
        }
        a aVar2 = new a(this, aVar, (byte) 0);
        this.f83054c = aVar2;
        aVar2.a();
        a aVar3 = this.f83054c;
        if (aVar3 == null) {
            l.a("donationWebPageContainer");
        }
        aVar3.f83063e = new b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", false);
    }
}
