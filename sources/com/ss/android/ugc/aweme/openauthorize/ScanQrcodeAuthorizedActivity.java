package com.ss.android.ugc.aweme.openauthorize;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public final class ScanQrcodeAuthorizedActivity extends c {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f114494a;

    static {
        Covode.recordClassIndex(73687);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.openauthorize.c, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f114494a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.openauthorize.c, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f114494a == null) {
            this.f114494a = new SparseArray();
        }
        View view = (View) this.f114494a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f114494a.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.ScanQrcodeAuthorizedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.ScanQrcodeAuthorizedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.ScanQrcodeAuthorizedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        a.d(this);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.openauthorize.c, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.ScanQrcodeAuthorizedActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.ScanQrcodeAuthorizedActivity", "onCreate", false);
    }
}
