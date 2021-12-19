package com.b.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a implements Application.ActivityLifecycleCallbacks {
    static {
        Covode.recordClassIndex(2814);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        MethodCollector.i(8594);
        System.currentTimeMillis();
        if (!b.f5993a) {
            MethodCollector.o(8594);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int i2 = 0;
        while (true) {
            if (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) instanceof com.b.a.c.a) {
                    break;
                }
                i2++;
            } else {
                com.b.a.c.a aVar = new com.b.a.c.a(activity);
                aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    viewGroup.removeView(childAt);
                    aVar.addView(childAt);
                }
                viewGroup.addView(aVar, 0);
            }
        }
        System.currentTimeMillis();
        MethodCollector.o(8594);
    }
}
