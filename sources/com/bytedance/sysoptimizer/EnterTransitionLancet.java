package com.bytedance.sysoptimizer;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public class EnterTransitionLancet {
    static {
        Covode.recordClassIndex(26979);
    }

    public void onStop() {
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            Activity activity = (Activity) new Object();
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    activity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
