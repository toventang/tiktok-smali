package com.ss.android.ugc.aweme.bullet;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.g.d;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;

public final class SingleTaskBulletContainerActivity extends BulletContainerActivity {

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f68832m;

    static {
        Covode.recordClassIndex(42399);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final View a(int i2) {
        if (this.f68832m == null) {
            this.f68832m = new SparseArray();
        }
        View view = (View) this.f68832m.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f68832m.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity
    public final int v() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final void finish() {
        super.finish();
        if (gb.a()) {
            overridePendingTransition(R.anim.dq, R.anim.dv);
        } else {
            overridePendingTransition(R.anim.f354do, R.anim.dx);
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
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

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.ui.common.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && ((BulletContainerActivity) this).f68822l) {
            d.a(this);
            ((BulletContainerActivity) this).f68822l = false;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onCreate", true);
        boolean booleanExtra = getIntent().getBooleanExtra("is_clear_top", false);
        if ((!gb.a() || !booleanExtra) && (gb.a() || booleanExtra)) {
            overridePendingTransition(R.anim.f354do, R.anim.dx);
        } else {
            overridePendingTransition(R.anim.dq, R.anim.dv);
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.SingleTaskBulletContainerActivity", "onCreate", false);
    }
}
