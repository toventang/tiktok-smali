package leakcanary.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.lang.reflect.Proxy;
import leakcanary.a;
import leakcanary.g;
import leakcanary.internal.j;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C4198a f159407d = new C4198a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f159408a;

    /* renamed from: b  reason: collision with root package name */
    public final g f159409b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<a.C4197a> f159410c;

    static {
        Covode.recordClassIndex(105838);
    }

    /* renamed from: leakcanary.internal.a$a  reason: collision with other inner class name */
    public static final class C4198a {
        static {
            Covode.recordClassIndex(105839);
        }

        private C4198a() {
        }

        public /* synthetic */ C4198a(byte b2) {
            this();
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f159411a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f159412b;

        static {
            Covode.recordClassIndex(105840);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            this.f159412b.onActivityCreated(activity, bundle);
        }

        public final void onActivityPaused(Activity activity) {
            this.f159412b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            this.f159412b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.f159412b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            this.f159412b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            this.f159412b.onActivityStopped(activity);
        }

        public final void onActivityDestroyed(Activity activity) {
            l.c(activity, "");
            if (this.f159411a.f159410c.invoke().f159361b) {
                this.f159411a.f159409b.a(activity);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f159411a = aVar;
            j.f fVar = j.f.f159467a;
            Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, fVar);
            if (newProxyInstance != null) {
                this.f159412b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    private a(g gVar, h.f.a.a<a.C4197a> aVar) {
        this.f159409b = gVar;
        this.f159410c = aVar;
        this.f159408a = new b(this);
    }

    public /* synthetic */ a(g gVar, h.f.a.a aVar, byte b2) {
        this(gVar, aVar);
    }
}
