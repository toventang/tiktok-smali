package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.notification.a.e;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102225a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Activity> f102226b;

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<Activity> f102227c;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "");
    }

    public final void onActivityDestroyed(Activity activity) {
        l.d(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
    }

    public final void onActivityStarted(Activity activity) {
        l.d(activity, "");
    }

    public final void onActivityStopped(Activity activity) {
        l.d(activity, "");
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(65408);
    }

    public static Activity a() {
        WeakReference<Activity> weakReference = f102226b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void onActivityPaused(Activity activity) {
        l.d(activity, "");
        f102227c = null;
    }

    public final void onActivityResumed(Activity activity) {
        l.d(activity, "");
        f102227c = new WeakReference<>(activity);
        f102226b = new WeakReference<>(activity);
        e eVar = e.f102841b;
        eVar.f102843a = false;
        String name = eVar.getClass().getName();
        l.b(name, "");
        eVar.a(name, 0, false);
    }
}
