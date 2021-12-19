package com.ss.android.deviceregister;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public final class AActivity extends Activity {
    static {
        Covode.recordClassIndex(36682);
    }

    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onCreate", false);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.deviceregister.AActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
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
}
