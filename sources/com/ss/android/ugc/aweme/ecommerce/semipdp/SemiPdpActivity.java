package com.ss.android.ugc.aweme.ecommerce.semipdp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.common.b;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;

public final class SemiPdpActivity extends b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f87238a;

    static {
        Covode.recordClassIndex(54736);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f87238a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f87238a == null) {
            this.f87238a = new SparseArray();
        }
        View view = (View) this.f87238a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f87238a.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    static final class a extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87239a = new a();

        static {
            Covode.recordClassIndex(54737);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f87240a);
            baseActivityViewModel2.config(AnonymousClass2.f87241a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onCreate", true);
        activityConfiguration(a.f87239a);
        super.onCreate(bundle);
        setContentView(R.layout.ph);
        String a2 = a(getIntent(), "ENTER_PARAMS");
        String a3 = a(getIntent(), "product_info");
        int intExtra = getIntent().getIntExtra("ERROR_CODE", 0);
        a aVar = new a();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("ENTER_PARAMS", (Serializable) dg.a(a2, SemiPdpStarter.SemiPdpEnterParams.class));
        bundle2.putParcelable("product_info", (Parcelable) dg.a(a3, ProductPackStruct.class));
        bundle2.putInt("ERROR_CODE", intExtra);
        aVar.setArguments(bundle2);
        com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(this).b();
        getSupportFragmentManager().a().a(R.id.b94, aVar, "SemiPdpFragment").c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
