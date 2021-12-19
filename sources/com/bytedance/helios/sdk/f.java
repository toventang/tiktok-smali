package com.bytedance.helios.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.b.o;
import com.bytedance.helios.api.c.b;
import com.bytedance.helios.sdk.utils.a;
import java.util.concurrent.atomic.AtomicBoolean;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30948a = f.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final f f30949b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final b f30950c = new b();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f30951d = new AtomicBoolean(true);

    /* renamed from: e  reason: collision with root package name */
    public String f30952e = "null";

    /* renamed from: f  reason: collision with root package name */
    public String f30953f = "null";

    /* renamed from: g  reason: collision with root package name */
    public int f30954g = 0;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f30955h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f30956i = new g(this);

    /* renamed from: j  reason: collision with root package name */
    public int f30957j = 0;

    /* renamed from: k  reason: collision with root package name */
    private final Object f30958k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private Application f30959l;

    /* renamed from: m  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f30960m = new Application.ActivityLifecycleCallbacks() {
        /* class com.bytedance.helios.sdk.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17958);
        }

        public final void onActivityDestroyed(Activity activity) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onDestroyed");
            f.this.f30950c.remove(activity);
            f.this.a(activity, 5);
        }

        public final void onActivityPaused(Activity activity) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onPaused");
            f.this.f30950c.add(activity, i.a.ON_PAUSE);
            f.this.a(activity, 3);
        }

        public final void onActivityResumed(Activity activity) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onResumed");
            f.this.f30950c.add(activity, i.a.ON_RESUME);
            f.this.f30952e = activity.getClass().getName();
            f.this.f30954g = activity.hashCode();
            f.this.a(activity, 2);
        }

        public final void onActivityStarted(Activity activity) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onStarted");
            f.this.f30950c.add(activity, i.a.ON_START);
            f.this.f30952e = activity.getClass().getName();
            f.this.f30954g = activity.hashCode();
            f.this.a(activity, 1);
        }

        public final void onActivityStopped(Activity activity) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onStopped");
            f.this.f30950c.add(activity, i.a.ON_STOP);
            f.this.a(activity, 4);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onSaveInstanceState");
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            com.bytedance.helios.sdk.utils.f.a("Helios-Log-Page-State", activity + " onCreated");
            f.this.f30950c.add(activity, i.a.ON_CREATE);
            f.this.f30952e = activity.getClass().getName();
            f.this.f30954g = activity.hashCode();
            f.this.a(activity, 0);
        }
    };
    private final l n = new LifecycleMonitor$2(this);

    public static f a() {
        return f30949b;
    }

    public final String b() {
        return this.f30950c.toString();
    }

    public final boolean c() {
        return this.f30951d.get();
    }

    public final int f() {
        int i2 = this.f30954g;
        if (i2 == 0) {
            return this.f30957j;
        }
        return i2;
    }

    public final String e() {
        if (TextUtils.equals("null", this.f30952e)) {
            return this.f30953f;
        }
        return this.f30952e;
    }

    static {
        Covode.recordClassIndex(17957);
    }

    public final boolean d() {
        if (!this.f30955h.get() || this.f30951d.get()) {
            return false;
        }
        return true;
    }

    private f() {
    }

    public final void a(Application application) {
        try {
            this.f30959l = application;
            a.a(application, this.f30960m);
            w.f3548i.getLifecycle().a(this.n);
        } catch (Exception e2) {
            o.a(new b(null, e2, "label_lifecycle_monitor_initialize", null));
        }
    }

    public final void a(Activity activity, int i2) {
        MethodCollector.i(2427);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f30958k) {
            try {
                com.bytedance.helios.api.a.b.get().startCheck(activity, i2);
            } catch (Throwable th) {
                MethodCollector.o(2427);
                throw th;
            }
        }
        com.bytedance.helios.sdk.c.f.a("checkResource", currentTimeMillis);
        MethodCollector.o(2427);
    }
}
