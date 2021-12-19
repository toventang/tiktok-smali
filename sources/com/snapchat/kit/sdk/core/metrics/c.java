package com.snapchat.kit.sdk.core.metrics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final List<b> f57156a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f57157b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f57158c;

    static {
        Covode.recordClassIndex(35619);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.f57157b = new WeakReference<>(activity);
    }

    c(ScheduledExecutorService scheduledExecutorService) {
        this.f57158c = scheduledExecutorService;
    }

    public final void onActivityDestroyed(Activity activity) {
        WeakReference<Activity> weakReference = this.f57157b;
        if (weakReference != null && activity == weakReference.get()) {
            this.f57157b = null;
        }
    }

    public final void onActivityStopped(Activity activity) {
        WeakReference<Activity> weakReference = this.f57157b;
        if (weakReference != null && activity == weakReference.get()) {
            for (b bVar : this.f57156a) {
                this.f57158c.execute(bVar.f57141g);
            }
        }
    }
}
