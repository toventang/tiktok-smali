package com.bytedance.ies.bullet.ui.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.ui.common.b.a;
import com.ss.android.ugc.aweme.au;
import h.a.n;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BulletActivityWrapper implements g {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f33023a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f33024b = new ArrayList();

    static {
        Covode.recordClassIndex(19709);
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final boolean a(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                return it.next().a(activity);
            } catch (as unused) {
            }
        }
        return false;
    }

    private List<a> c() {
        return n.k(this.f33024b);
    }

    @Override // com.bytedance.ies.bullet.ui.common.g
    public final Activity a() {
        return this.f33023a.get();
    }

    @Override // com.bytedance.ies.bullet.ui.common.g
    public final void b() {
        Activity activity = this.f33023a.get();
        if (activity != null) {
            activity.finish();
        }
    }

    static final class BulletLifecycleObserver implements au {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<BulletActivityWrapper> f33025a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<m> f33026b;

        static {
            Covode.recordClassIndex(19710);
        }

        @Override // androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            if (aVar == i.a.ON_CREATE) {
                onCreate();
            } else if (aVar == i.a.ON_START) {
                onStart();
            } else if (aVar == i.a.ON_RESUME) {
                onResume();
            } else if (aVar == i.a.ON_PAUSE) {
                onPause();
            } else if (aVar == i.a.ON_STOP) {
                onStop();
            } else if (aVar == i.a.ON_DESTROY) {
                onDestroy();
            }
        }

        @v(a = i.a.ON_CREATE)
        public final void onCreate() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a2;
            if (this.f33025a.get() != null && (bulletActivityWrapper = this.f33025a.get()) != null && (a2 = bulletActivityWrapper.a()) != null) {
                bulletActivityWrapper.a(a2, (Bundle) null);
            }
        }

        @v(a = i.a.ON_PAUSE)
        public final void onPause() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a2;
            if (this.f33025a.get() != null && (bulletActivityWrapper = this.f33025a.get()) != null && (a2 = bulletActivityWrapper.a()) != null) {
                bulletActivityWrapper.c(a2);
            }
        }

        @v(a = i.a.ON_RESUME)
        public final void onResume() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a2;
            if (this.f33025a.get() != null && (bulletActivityWrapper = this.f33025a.get()) != null && (a2 = bulletActivityWrapper.a()) != null) {
                bulletActivityWrapper.b(a2);
            }
        }

        @v(a = i.a.ON_START)
        public final void onStart() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a2;
            if (this.f33025a.get() != null && (bulletActivityWrapper = this.f33025a.get()) != null && (a2 = bulletActivityWrapper.a()) != null) {
                bulletActivityWrapper.e(a2);
            }
        }

        @v(a = i.a.ON_STOP)
        public final void onStop() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a2;
            if (this.f33025a.get() != null && (bulletActivityWrapper = this.f33025a.get()) != null && (a2 = bulletActivityWrapper.a()) != null) {
                bulletActivityWrapper.f(a2);
            }
        }

        @v(a = i.a.ON_DESTROY)
        public final void onDestroy() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a2;
            i lifecycle;
            if (this.f33025a.get() != null && (bulletActivityWrapper = this.f33025a.get()) != null && (a2 = bulletActivityWrapper.a()) != null) {
                bulletActivityWrapper.d(a2);
                m mVar = this.f33026b.get();
                if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
                    lifecycle.b(this);
                }
            }
        }

        public BulletLifecycleObserver(WeakReference<BulletActivityWrapper> weakReference, WeakReference<m> weakReference2) {
            l.c(weakReference, "");
            l.c(weakReference2, "");
            this.f33025a = weakReference;
            this.f33026b = weakReference2;
        }
    }

    public BulletActivityWrapper(Activity activity) {
        l.c(activity, "");
        this.f33023a = new WeakReference<>(activity);
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void b(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().b(activity);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void c(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().c(activity);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void d(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().d(activity);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void e(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().e(activity);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void f(Activity activity) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().f(activity);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.g
    public final void b(a aVar) {
        l.c(aVar, "");
        this.f33024b.remove(aVar);
    }

    @Override // com.bytedance.ies.bullet.ui.common.g
    public final void a(Intent intent) {
        l.c(intent, "");
        Activity activity = this.f33023a.get();
        if (activity != null) {
            activity.setResult(50000, intent);
        }
    }

    public final void a(m mVar) {
        l.c(mVar, "");
        mVar.getLifecycle().a(new BulletLifecycleObserver(new WeakReference(this), new WeakReference(mVar)));
    }

    @Override // com.bytedance.ies.bullet.ui.common.g
    public final void a(a aVar) {
        l.c(aVar, "");
        this.f33024b.add(aVar);
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void b(Activity activity, Bundle bundle) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().b(activity, bundle);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void c(Activity activity, Bundle bundle) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().c(activity, bundle);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void a(Activity activity, Configuration configuration) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(activity, configuration);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void a(Activity activity, Bundle bundle) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(activity, bundle);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void a(Activity activity, boolean z) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(activity, z);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void a(Activity activity, int i2, int i3, Intent intent) {
        l.c(activity, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(activity, i2, i3, intent);
            } catch (as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.a
    public final void a(Activity activity, int i2, String[] strArr, int[] iArr) {
        l.c(activity, "");
        l.c(strArr, "");
        l.c(iArr, "");
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            try {
                it.next().a(activity, i2, strArr, iArr);
            } catch (as unused) {
            }
        }
    }
}
