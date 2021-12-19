package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.w;
import java.lang.reflect.Proxy;
import java.util.List;
import leakcanary.internal.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f159419a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(105845);
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f159420a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f159421b;

        static {
            Covode.recordClassIndex(105846);
        }

        public final void onActivityDestroyed(Activity activity) {
            this.f159421b.onActivityDestroyed(activity);
        }

        public final void onActivityPaused(Activity activity) {
            this.f159421b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.f159421b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.f159421b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            this.f159421b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            this.f159421b.onActivityStopped(activity);
        }

        public a(List list) {
            this.f159420a = list;
            j.f fVar = j.f.f159467a;
            Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, fVar);
            if (newProxyInstance != null) {
                this.f159421b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.c(activity, "");
            for (b bVar : this.f159420a) {
                bVar.invoke(activity);
            }
        }
    }
}
