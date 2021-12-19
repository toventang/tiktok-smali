package com.bytedance.b.e;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.b.j.d.c;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class a implements Application.ActivityLifecycleCallbacks, com.bytedance.b.j.d.a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f26184a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<c> f26185b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f26186c;

    /* renamed from: d  reason: collision with root package name */
    private String f26187d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26188e;

    /* renamed from: f  reason: collision with root package name */
    private int f26189f;

    static {
        Covode.recordClassIndex(15201);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.b.j.d.a
    public final boolean a() {
        return this.f26184a;
    }

    public a() {
        Application application = com.bytedance.b.k.a.f26313g;
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    private Object[] c() {
        Object[] objArr;
        synchronized (this.f26185b) {
            if (this.f26185b.size() > 0) {
                objArr = this.f26185b.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    @Override // com.bytedance.b.j.d.a
    public final String b() {
        WeakReference<Activity> weakReference = this.f26186c;
        String str = "";
        if (weakReference == null) {
            return str;
        }
        Activity activity = weakReference.get();
        if (activity == null || (str = this.f26187d) != null) {
            return str;
        }
        return activity.getClass().getCanonicalName();
    }

    public final void onActivityPaused(Activity activity) {
        c();
    }

    @Override // com.bytedance.b.j.d.a
    public final void a(c cVar) {
        if (cVar != null) {
            synchronized (this.f26185b) {
                this.f26185b.add(cVar);
            }
        }
    }

    @Override // com.bytedance.b.j.d.a
    public final void b(c cVar) {
        if (cVar != null) {
            synchronized (this.f26185b) {
                this.f26185b.remove(cVar);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f26186c = new WeakReference<>(activity);
        this.f26187d = null;
        c();
    }

    public final void onActivityStarted(Activity activity) {
        c();
        if (this.f26188e) {
            this.f26188e = false;
            return;
        }
        int i2 = this.f26189f + 1;
        this.f26189f = i2;
        if (i2 == 1) {
            this.f26184a = true;
            for (Object obj : c()) {
                ((c) obj).a();
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f26188e = true;
            return;
        }
        int i2 = this.f26189f - 1;
        this.f26189f = i2;
        if (i2 == 0) {
            this.f26184a = false;
            for (Object obj : c()) {
                ((c) obj).b();
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c();
    }
}
