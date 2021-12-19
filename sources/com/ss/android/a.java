package com.ss.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static int f58159a;

    static {
        Covode.recordClassIndex(36152);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        f58159a++;
    }

    public final void onActivityStopped(Activity activity) {
        f58159a--;
    }
}
