package com.ss.android.ugc.aweme.lego.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.a.d;
import com.ss.android.ugc.aweme.lego.d.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f107514a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, q> f107515b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<? extends Activity>, WeakReference<Activity>> f107516c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, q> f107517d = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(68803);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.e.a$a  reason: collision with other inner class name */
    public final class C2766a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(68804);
        }

        public final void onActivityPaused(Activity activity) {
            l.d(activity, "");
        }

        public final void onActivityResumed(Activity activity) {
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

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C2766a() {
        }

        public final void onActivityDestroyed(Activity activity) {
            l.d(activity, "");
            a.this.f107516c.remove(activity.getClass());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Class<? extends android.app.Activity>, java.lang.ref.WeakReference<android.app.Activity>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "");
            a.this.f107516c.put(activity.getClass(), new WeakReference(activity));
        }
    }

    public final <T> T a(String str) {
        T t;
        MethodCollector.i(12316);
        l.d(str, "");
        synchronized (this.f107515b) {
            try {
                t = (T) this.f107515b.get(str);
            } finally {
                MethodCollector.o(12316);
            }
        }
        if (t == null) {
            t = (T) b(str);
        }
        return t;
    }

    public final q b(String str) {
        q qVar;
        MethodCollector.i(12318);
        l.d(str, "");
        q qVar2 = this.f107517d.get(str);
        if (qVar2 == null) {
            l.b();
        }
        q qVar3 = qVar2;
        synchronized (qVar3) {
            try {
                if (!this.f107515b.containsKey(str)) {
                    if (b.f107492a || b.a(qVar3)) {
                        if (this.f107514a == null) {
                            l.a("context");
                        }
                        Context context = this.f107514a;
                        if (context == null) {
                            l.a("context");
                        }
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.o1);
                        WeakReference<Activity> weakReference = this.f107516c.get(qVar3.b());
                        Activity activity = null;
                        if (weakReference != null) {
                            activity = weakReference.get();
                        }
                        d dVar = f.f107542g;
                        if (dVar != null) {
                            dVar.a(qVar3);
                        }
                        qVar3.a(contextThemeWrapper, activity);
                        d dVar2 = f.f107542g;
                        if (dVar2 != null) {
                            dVar2.b(qVar3);
                        }
                    }
                    synchronized (this.f107515b) {
                        try {
                            this.f107515b.put(str, qVar3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                q qVar4 = this.f107515b.get(str);
                if (qVar4 == null) {
                    l.b();
                }
                qVar = qVar4;
            } finally {
                MethodCollector.o(12318);
            }
        }
        MethodCollector.o(12318);
        return qVar;
    }

    public final void a(String str, q qVar) {
        l.d(str, "");
        l.d(qVar, "");
        if (!this.f107517d.containsKey(str)) {
            this.f107517d.put(str, qVar);
        }
    }
}
