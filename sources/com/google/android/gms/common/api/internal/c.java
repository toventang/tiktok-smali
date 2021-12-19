package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    static final c f50136a = new c();

    /* renamed from: b  reason: collision with root package name */
    final AtomicBoolean f50137b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f50138c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f50139d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f50140e = false;

    public interface a {
        static {
            Covode.recordClassIndex(31271);
        }

        void a(boolean z);
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

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public static c a() {
        return f50136a;
    }

    static {
        Covode.recordClassIndex(31270);
    }

    private c() {
    }

    public static void a(Application application) {
        MethodCollector.i(13149);
        c cVar = f50136a;
        synchronized (cVar) {
            try {
                if (!cVar.f50140e) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f50140e = true;
                }
            } finally {
                MethodCollector.o(13149);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f50137b.compareAndSet(true, false);
        this.f50138c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f50137b.compareAndSet(false, true)) {
            this.f50138c.set(true);
            a(true);
        }
    }

    private final void a(boolean z) {
        MethodCollector.i(13226);
        synchronized (f50136a) {
            try {
                ArrayList<a> arrayList = this.f50139d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    a aVar = arrayList.get(i2);
                    i2++;
                    aVar.a(z);
                }
            } finally {
                MethodCollector.o(13226);
            }
        }
    }

    public final void a(a aVar) {
        MethodCollector.i(13150);
        synchronized (f50136a) {
            try {
                this.f50139d.add(aVar);
            } finally {
                MethodCollector.o(13150);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f50137b.compareAndSet(true, false);
        this.f50138c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }
}
