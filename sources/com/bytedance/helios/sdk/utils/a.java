package com.bytedance.helios.sdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.LinkedList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30994a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final LinkedList<Application.ActivityLifecycleCallbacks> f30995b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private static c f30996c;

    /* renamed from: d  reason: collision with root package name */
    private static final h f30997d = i.a((h.f.a.a) C0651a.f30998a);

    private a() {
    }

    /* renamed from: com.bytedance.helios.sdk.utils.a$a  reason: collision with other inner class name */
    static final class C0651a extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0651a f30998a = new C0651a();

        static {
            Covode.recordClassIndex(18003);
        }

        C0651a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Application.ActivityLifecycleCallbacks() {
                /* class com.bytedance.helios.sdk.utils.a.C0651a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(18004);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    l.c(activity, "");
                    l.c(bundle, "");
                }

                public final void onActivityDestroyed(Activity activity) {
                    l.c(activity, "");
                    a.e(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    l.c(activity, "");
                    a.c(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    l.c(activity, "");
                    a.b(activity);
                }

                public final void onActivityStarted(Activity activity) {
                    l.c(activity, "");
                    a.a(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    l.c(activity, "");
                    a.d(activity);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    l.c(activity, "");
                    a.a(activity, bundle);
                }
            };
        }
    }

    static {
        Covode.recordClassIndex(18002);
    }

    public static final void a(Activity activity) {
        l.c(activity, "");
        c cVar = new c(activity, i.a.ON_START);
        if (!l.a(cVar, f30996c)) {
            f30996c = cVar;
            Iterator<T> it = f30995b.iterator();
            while (it.hasNext()) {
                it.next().onActivityStarted(activity);
            }
        }
    }

    public static final void b(Activity activity) {
        l.c(activity, "");
        c cVar = new c(activity, i.a.ON_RESUME);
        if (!l.a(cVar, f30996c)) {
            f30996c = cVar;
            Iterator<T> it = f30995b.iterator();
            while (it.hasNext()) {
                it.next().onActivityResumed(activity);
            }
        }
    }

    public static final void c(Activity activity) {
        l.c(activity, "");
        c cVar = new c(activity, i.a.ON_PAUSE);
        if (!l.a(cVar, f30996c)) {
            f30996c = cVar;
            Iterator<T> it = f30995b.iterator();
            while (it.hasNext()) {
                it.next().onActivityPaused(activity);
            }
        }
    }

    public static final void d(Activity activity) {
        l.c(activity, "");
        c cVar = new c(activity, i.a.ON_STOP);
        if (!l.a(cVar, f30996c)) {
            f30996c = cVar;
            Iterator<T> it = f30995b.iterator();
            while (it.hasNext()) {
                it.next().onActivityStopped(activity);
            }
        }
    }

    public static final void e(Activity activity) {
        l.c(activity, "");
        c cVar = new c(activity, i.a.ON_DESTROY);
        if (!l.a(cVar, f30996c)) {
            f30996c = cVar;
            Iterator<T> it = f30995b.iterator();
            while (it.hasNext()) {
                it.next().onActivityDestroyed(activity);
            }
        }
    }

    public static final void a(Activity activity, Bundle bundle) {
        l.c(activity, "");
        c cVar = new c(activity, i.a.ON_CREATE);
        if (!l.a(cVar, f30996c)) {
            f30996c = cVar;
            Iterator<T> it = f30995b.iterator();
            while (it.hasNext()) {
                it.next().onActivityCreated(activity, bundle);
            }
        }
    }

    public static final void a(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        MethodCollector.i(1574);
        l.c(application, "");
        if (activityLifecycleCallbacks != null) {
            LinkedList<Application.ActivityLifecycleCallbacks> linkedList = f30995b;
            synchronized (linkedList) {
                try {
                    if (linkedList.isEmpty()) {
                        application.registerActivityLifecycleCallbacks((C0651a.AnonymousClass1) f30997d.getValue());
                    }
                    linkedList.add(activityLifecycleCallbacks);
                } finally {
                    MethodCollector.o(1574);
                }
            }
            return;
        }
        MethodCollector.o(1574);
    }
}
