package com.ss.ugc.aweme.performance.core.monitor.c;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f153364a = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    public static String f153365b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final a f153366c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static List<Application.ActivityLifecycleCallbacks> f153367d = new ArrayList();

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(101813);
    }

    public final void onActivityResumed(Activity activity) {
        String str;
        Class<?> cls;
        f153364a = new WeakReference<>(activity);
        if (activity == null || (cls = activity.getClass()) == null || (str = cls.getSimpleName()) == null) {
            str = "";
        }
        f153365b = str;
    }

    public final void onActivityStopped(Activity activity) {
        Iterator<T> it = f153367d.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        ComponentName componentName;
        if (activity == null || (componentName = activity.getComponentName()) == null || (str = componentName.getShortClassName()) == null) {
            str = "";
        }
        f153365b = str;
    }
}
