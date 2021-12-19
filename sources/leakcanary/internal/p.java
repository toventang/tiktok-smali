package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.w;
import h.z;
import java.lang.reflect.Proxy;
import leakcanary.internal.InternalLeakCanary;

public final class p implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private int f159487a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f159488b;

    /* renamed from: c  reason: collision with root package name */
    private final b<Boolean, z> f159489c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Application.ActivityLifecycleCallbacks f159490d;

    static {
        Covode.recordClassIndex(105881);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f159490d.onActivityCreated(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f159490d.onActivityDestroyed(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f159490d.onActivityPaused(activity);
    }

    public final void onActivityResumed(Activity activity) {
        this.f159490d.onActivityResumed(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f159490d.onActivitySaveInstanceState(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
        l.c(activity, "");
        int i2 = this.f159487a + 1;
        this.f159487a = i2;
        if (!this.f159488b && i2 == 1) {
            this.f159488b = true;
            this.f159489c.invoke(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(b<? super Boolean, z> bVar) {
        l.c(bVar, "");
        InternalLeakCanary.e eVar = InternalLeakCanary.e.f159406a;
        Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, eVar);
        if (newProxyInstance != null) {
            this.f159490d = (Application.ActivityLifecycleCallbacks) newProxyInstance;
            this.f159489c = bVar;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void onActivityStopped(Activity activity) {
        l.c(activity, "");
        int i2 = this.f159487a;
        if (i2 > 0) {
            this.f159487a = i2 - 1;
        }
        if (this.f159488b && this.f159487a == 0 && !activity.isChangingConfigurations()) {
            this.f159488b = false;
            this.f159489c.invoke(false);
        }
    }
}
