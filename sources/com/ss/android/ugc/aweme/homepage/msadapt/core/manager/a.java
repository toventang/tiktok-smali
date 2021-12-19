package com.ss.android.ugc.aweme.homepage.msadapt.core.manager;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a implements Application.ActivityLifecycleCallbacks {
    static {
        Covode.recordClassIndex(63210);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "");
    }

    public void onActivityDestroyed(Activity activity) {
        l.d(activity, "");
    }

    public void onActivityPaused(Activity activity) {
        l.d(activity, "");
    }

    public void onActivityResumed(Activity activity) {
        l.d(activity, "");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
    }

    public void onActivityStarted(Activity activity) {
        l.d(activity, "");
    }

    public void onActivityStopped(Activity activity) {
        l.d(activity, "");
    }
}
