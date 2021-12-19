package com.bytedance.common.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public final class a extends Observable implements Application.ActivityLifecycleCallbacks, WeakHandler.IHandler {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f26733b = true;

    /* renamed from: c  reason: collision with root package name */
    private static a f26734c;

    /* renamed from: f  reason: collision with root package name */
    private static int f26735f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26736a;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Activity> f26737d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f26738e = new Runnable() {
        /* class com.bytedance.common.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15768);
        }

        public final void run() {
            if (a.this.f26736a) {
                a.this.f26736a = false;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private WeakHandler f26739g = new WeakHandler(this);

    /* renamed from: h  reason: collision with root package name */
    private final List<Application.ActivityLifecycleCallbacks> f26740h = new ArrayList();

    static {
        Covode.recordClassIndex(15767);
    }

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(13518);
            if (f26734c == null) {
                f26734c = new a();
            }
            aVar = f26734c;
            MethodCollector.o(13518);
        }
        return aVar;
    }

    private Object[] b() {
        Object[] objArr;
        MethodCollector.i(13520);
        synchronized (this.f26740h) {
            try {
                if (this.f26740h.size() > 0) {
                    objArr = this.f26740h.toArray();
                } else {
                    objArr = null;
                }
            } finally {
                MethodCollector.o(13520);
            }
        }
        return objArr;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 1 && f26733b) {
            setChanged();
            notifyObservers(Boolean.valueOf(f26733b));
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f26736a) {
            this.f26739g.postDelayed(this.f26738e, 30000);
        }
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f26737d = new WeakReference<>(activity);
        if (!this.f26736a) {
            this.f26736a = true;
        }
        this.f26739g.removeCallbacks(this.f26738e);
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.f26739g.removeMessages(1);
        int i2 = f26735f;
        if (i2 == 0) {
            f26733b = false;
        }
        f26735f = i2 + 1;
    }

    public final void onActivityStopped(Activity activity) {
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i2 = f26735f - 1;
        f26735f = i2;
        if (i2 == 0) {
            f26733b = true;
            this.f26739g.sendEmptyMessageDelayed(1, 30000);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f26733b = false;
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}
