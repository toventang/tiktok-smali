package com.ss.android.ugc.aweme.donation.webpage;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class DonationWebPageActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.d.a.a f83049a;

    /* renamed from: b  reason: collision with root package name */
    private a f83050b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f83051c;

    static {
        Covode.recordClassIndex(51773);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f83051c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f83051c == null) {
            this.f83051c = new SparseArray();
        }
        View view = (View) this.f83051c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f83051c.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ DonationWebPageActivity this$0;

        static {
            Covode.recordClassIndex(51774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DonationWebPageActivity donationWebPageActivity) {
            super(0);
            this.this$0 = donationWebPageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ DonationWebPageActivity this$0;

        static {
            Covode.recordClassIndex(51775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DonationWebPageActivity donationWebPageActivity) {
            super(0);
            this.this$0 = donationWebPageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.setResult(-1);
            this.this$0.finish();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        a aVar = this.f83050b;
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.y7);
        com.ss.android.ugc.aweme.crossplatform.d.a.a a2 = a.C1829a.a(getIntent());
        l.b(a2, "");
        this.f83049a = a2;
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f83049a;
        if (aVar == null) {
            l.a("crossPlatformParams");
        }
        a aVar2 = new a(this, aVar, (byte) 0);
        this.f83050b = aVar2;
        aVar2.a();
        a aVar3 = this.f83050b;
        if (aVar3 == null) {
            l.a("donationWebPageContainer");
        }
        aVar3.f83063e = new a(this);
        a aVar4 = this.f83050b;
        if (aVar4 == null) {
            l.a("donationWebPageContainer");
        }
        aVar4.f83062d = new b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onCreate", false);
    }
}
