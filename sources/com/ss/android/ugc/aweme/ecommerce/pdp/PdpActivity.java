package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.common.b;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;

public final class PdpActivity extends b {

    /* renamed from: a  reason: collision with root package name */
    private long f86295a = -1;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f86296b;

    static {
        Covode.recordClassIndex(54006);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f86296b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f86296b == null) {
            this.f86296b = new SparseArray();
        }
        View view = (View) this.f86296b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f86296b.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        k a2 = k.a.a(this);
        if (a2 != null) {
            a2.a("return");
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().b(SystemClock.elapsedRealtime() - this.f86295a);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onResume", true);
        super.onResume();
        this.f86295a = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onResume", false);
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
        public static final a f86297a = new a();

        static {
            Covode.recordClassIndex(54007);
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
            baseActivityViewModel2.config(AnonymousClass1.f86298a);
            baseActivityViewModel2.config(AnonymousClass2.f86299a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onCreate", true);
        activityConfiguration(a.f86297a);
        super.onCreate(bundle);
        setContentView(R.layout.ph);
        Serializable serializableExtra = getIntent().getSerializableExtra("ENTER_PARAMS");
        if (serializableExtra != null) {
            IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) serializableExtra;
            ProductPackStruct productPackStruct = (ProductPackStruct) getIntent().getParcelableExtra("PREFETCH_RESULT");
            int intExtra = getIntent().getIntExtra("ERROR_CODE", 0);
            k kVar = new k(this, pdpEnterParam);
            kVar.r = getIntent().getLongExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
            kVar.q = getIntent().getLongExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
            i iVar = new i();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("ENTER_PARAMS", pdpEnterParam);
            bundle2.putBoolean("full_screen", pdpEnterParam.getFullScreen());
            if (productPackStruct != null) {
                if (intExtra != 0) {
                    bundle2.putInt("ERROR_CODE", intExtra);
                }
                bundle2.putParcelable("PREFETCH_RESULT", productPackStruct);
                bundle2.putLong("PREFETCH_FINISH_TIME", getIntent().getLongExtra("PREFETCH_FINISH_TIME", 0));
            }
            iVar.setArguments(bundle2);
            getSupportFragmentManager().a().a(R.id.b94, iVar, "pdp_fragment").c();
            com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(this).b();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onCreate", false);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onCreate", false);
        throw nullPointerException;
    }
}
