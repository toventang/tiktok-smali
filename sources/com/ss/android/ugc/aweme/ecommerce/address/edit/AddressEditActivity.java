package com.ss.android.ugc.aweme.ecommerce.address.edit;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class AddressEditActivity extends com.ss.android.ugc.aweme.ecommerce.common.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f84349a = i.a((h.f.a.a) new c(this));

    /* renamed from: b  reason: collision with root package name */
    private long f84350b = -1;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f84351c;

    static {
        Covode.recordClassIndex(52590);
    }

    private final com.ss.android.ugc.aweme.ecommerce.address.edit.c.c a() {
        return (com.ss.android.ugc.aweme.ecommerce.address.edit.c.c) this.f84349a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f84351c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f84351c == null) {
            this.f84351c = new SparseArray();
        }
        View view = (View) this.f84351c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84351c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ AddressEditActivity this$0;

        static {
            Covode.recordClassIndex(52591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AddressEditActivity addressEditActivity) {
            super(0);
            this.this$0 = addressEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            AddressEditActivity.super.onBackPressed();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        a().a(new a(this));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        a().a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().b(SystemClock.elapsedRealtime() - this.f84350b);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onResume", true);
        super.onResume();
        this.f84350b = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onResume", false);
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.address.edit.c.c> {
        final /* synthetic */ AddressEditActivity this$0;

        static {
            Covode.recordClassIndex(52594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AddressEditActivity addressEditActivity) {
            super(0);
            this.this$0 = addressEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.edit.c.c invoke() {
            return com.ss.android.ugc.aweme.ecommerce.router.i.a(StrategyService.b().a().a(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(52595);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.address.edit.c.b(this.this$0.this$0);
                }
            }).b(new h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.m>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(52596);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.m invoke() {
                    return new com.ss.android.ugc.aweme.ecommerce.address.edit.c.a(this.this$0.this$0);
                }
            }), this.this$0.getIntent().getData());
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        a().b();
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

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f84352a = new b();

        static {
            Covode.recordClassIndex(52592);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f84353a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.ecommerce.common.b, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onCreate", true);
        activityConfiguration(b.f84352a);
        super.onCreate(bundle);
        a().a(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onRestoreInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onRestoreInstanceState(bundle);
        a().a(this, bundle);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        a().b(this, bundle);
    }
}
