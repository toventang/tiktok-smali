package com.bytedance.ies.ugc.appcontext;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.ALog;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a.l.c<a> f34626a;

    /* renamed from: b  reason: collision with root package name */
    static final f.a.l.c<a> f34627b;

    /* renamed from: c  reason: collision with root package name */
    static final f.a.l.c<Activity> f34628c;

    /* renamed from: d  reason: collision with root package name */
    static final f.a.l.c<Activity> f34629d;

    /* renamed from: e  reason: collision with root package name */
    static final f.a.l.c<Activity> f34630e;

    /* renamed from: f  reason: collision with root package name */
    static final f.a.l.c<Activity> f34631f;

    /* renamed from: g  reason: collision with root package name */
    static final f.a.l.c<Activity> f34632g;

    /* renamed from: h  reason: collision with root package name */
    static final f.a.l.c<a> f34633h;

    /* renamed from: i  reason: collision with root package name */
    static final f.a.l.c<Boolean> f34634i;

    /* renamed from: j  reason: collision with root package name */
    static final f.a.l.c<Application> f34635j;

    /* renamed from: k  reason: collision with root package name */
    static final f.a.l.c<b> f34636k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile boolean f34637l = true;

    /* renamed from: m  reason: collision with root package name */
    public static volatile boolean f34638m;
    static int n;
    public static volatile long o;
    public static d p;
    public static final f q = new f();
    private static WeakReference<Activity> r;

    public interface c {
        static {
            Covode.recordClassIndex(20754);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(20755);
        }

        boolean a(Activity activity);
    }

    private f() {
    }

    public static t<a> a() {
        t<a> i2 = f34627b.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Activity> b() {
        t<Activity> i2 = f34628c.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Activity> c() {
        t<Activity> i2 = f34629d.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Activity> d() {
        t<Activity> i2 = f34630e.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Activity> e() {
        t<Activity> i2 = f34631f.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Activity> f() {
        t<Activity> i2 = f34632g.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Boolean> g() {
        t<Boolean> i2 = f34634i.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<b> h() {
        t<b> i2 = f34636k.e().i();
        l.b(i2, "");
        return i2;
    }

    public static t<Application> i() {
        t<Application> i2 = f34635j.e().i();
        l.b(i2, "");
        return i2;
    }

    public static Activity j() {
        WeakReference<Activity> weakReference = r;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(20751);
        f.a.l.c<a> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        f34626a = cVar;
        f.a.l.c<a> cVar2 = new f.a.l.c<>();
        l.b(cVar2, "");
        f34627b = cVar2;
        f.a.l.c<Activity> cVar3 = new f.a.l.c<>();
        l.b(cVar3, "");
        f34628c = cVar3;
        f.a.l.c<Activity> cVar4 = new f.a.l.c<>();
        l.b(cVar4, "");
        f34629d = cVar4;
        f.a.l.c<Activity> cVar5 = new f.a.l.c<>();
        l.b(cVar5, "");
        f34630e = cVar5;
        f.a.l.c<Activity> cVar6 = new f.a.l.c<>();
        l.b(cVar6, "");
        f34631f = cVar6;
        f.a.l.c<Activity> cVar7 = new f.a.l.c<>();
        l.b(cVar7, "");
        f34632g = cVar7;
        f.a.l.c<a> cVar8 = new f.a.l.c<>();
        l.b(cVar8, "");
        f34633h = cVar8;
        f.a.l.c<Boolean> cVar9 = new f.a.l.c<>();
        l.b(cVar9, "");
        f34634i = cVar9;
        f.a.l.c<Application> cVar10 = new f.a.l.c<>();
        l.b(cVar10, "");
        f34635j = cVar10;
        f.a.l.c<b> cVar11 = new f.a.l.c<>();
        l.b(cVar11, "");
        f34636k = cVar11;
    }

    public static final class e implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f34643a;

        static {
            Covode.recordClassIndex(20756);
        }

        public e(Application application) {
            this.f34643a = application;
        }

        public final void onActivityDestroyed(Activity activity) {
            String str;
            l.d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.d("@ActivityMonitor", sb.append(str).append(" destroyed.").toString());
            if (activity instanceof c) {
                f.f34638m = false;
            }
            f.f34632g.onNext(activity);
            if (f.n == 0) {
                f.f34635j.onNext(this.f34643a);
            }
        }

        public final void onActivityPaused(Activity activity) {
            String str;
            l.d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.d("@ActivityMonitor", sb.append(str).append(" paused.").toString());
            if (f.p != null) {
                d dVar = f.p;
                if (dVar == null) {
                    l.b();
                }
                if (dVar.a(activity)) {
                    f.a(null);
                }
            }
            f.f34630e.onNext(activity);
        }

        public final void onActivityResumed(Activity activity) {
            String str;
            l.d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.d("@ActivityMonitor", sb.append(str).append(" resumed.").toString());
            if (f.p != null) {
                d dVar = f.p;
                if (dVar == null) {
                    l.b();
                }
                if (dVar.a(activity)) {
                    f.a(activity);
                }
            }
            f.f34629d.onNext(activity);
        }

        public final void onActivityStarted(Activity activity) {
            String str;
            l.d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.d("@ActivityMonitor", sb.append(str).append(" started.").toString());
            int i2 = f.n + 1;
            f.n = i2;
            if (i2 == 1) {
                f.f34637l = false;
                f.f34634i.onNext(Boolean.valueOf(f.f34637l));
                f.f34636k.onNext(new b(activity, f.f34637l));
            }
            f.f34628c.onNext(activity);
        }

        public final void onActivityStopped(Activity activity) {
            String str;
            l.d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.d("@ActivityMonitor", sb.append(str).append(" stopped.").toString());
            int i2 = f.n - 1;
            f.n = i2;
            if (i2 == 0) {
                f.f34637l = true;
                f.o = System.currentTimeMillis();
                f.f34634i.onNext(Boolean.valueOf(f.f34637l));
                f.f34636k.onNext(new b(activity, f.f34637l));
            }
            f.f34631f.onNext(activity);
        }

        public final void onActivityPreCreated(Activity activity, Bundle bundle) {
            l.d(activity, "");
            f.f34626a.onNext(new a(activity, bundle));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.d(activity, "");
            l.d(bundle, "");
            f.f34633h.onNext(new a(activity, bundle));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String str;
            l.d(activity, "");
            StringBuilder sb = new StringBuilder();
            ComponentName componentName = activity.getComponentName();
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            ALog.d("@ActivityMonitor", sb.append(str).append(" created.").toString());
            if (activity instanceof c) {
                f.f34638m = true;
            }
            f.f34627b.onNext(new a(activity, bundle));
        }
    }

    public static void a(Activity activity) {
        if (activity == null) {
            r = null;
        } else {
            r = new WeakReference<>(activity);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f34639a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f34640b;

        static {
            Covode.recordClassIndex(20752);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f34639a, aVar.f34639a) && l.a(this.f34640b, aVar.f34640b);
        }

        public final int hashCode() {
            Activity activity = this.f34639a;
            int i2 = 0;
            int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
            Bundle bundle = this.f34640b;
            if (bundle != null) {
                i2 = bundle.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ActivityEvent(activity=" + this.f34639a + ", bundle=" + this.f34640b + ")";
        }

        public a(Activity activity, Bundle bundle) {
            this.f34639a = activity;
            this.f34640b = bundle;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f34641a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f34642b;

        static {
            Covode.recordClassIndex(20753);
        }

        public b(Activity activity, boolean z) {
            this.f34641a = activity;
            this.f34642b = z;
        }
    }
}
