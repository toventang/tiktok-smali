package com.ss.android.sdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.common.util.f;

public class BootstrapActivity extends Activity {
    static {
        Covode.recordClassIndex(37149);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            Intent a2 = f.a(this, getPackageName());
            finish();
            if (a2 != null) {
                com.ss.android.ugc.tiktok.security.a.a.a(a2, this);
                startActivity(a2);
            }
        } catch (Exception unused) {
        }
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", false);
    }
}
