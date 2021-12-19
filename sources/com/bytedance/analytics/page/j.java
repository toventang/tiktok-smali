package com.bytedance.analytics.page;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.analytics.a;
import com.bytedance.analytics.a.b;
import com.bytedance.analytics.a.g;
import com.bytedance.analytics.b.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static final j f6592a = new j();

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<Activity> f6593b;

    static {
        Covode.recordClassIndex(3171);
    }

    public final void onActivityPaused(Activity activity) {
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

    private j() {
    }

    public final void onActivityResumed(Activity activity) {
        l.d(activity, "");
        f6593b = new WeakReference<>(activity);
        a(activity);
    }

    private static void a(Activity activity) {
        MethodCollector.i(5360);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup != null && viewGroup.getChildCount() > 0 && !(viewGroup.getChildAt(0) instanceof g)) {
            g gVar = new g(activity);
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                viewGroup.removeViewAt(0);
                gVar.addView(childAt, childAt.getLayoutParams());
            }
            viewGroup.addView(gVar, new ViewGroup.LayoutParams(-1, -1));
        }
        MethodCollector.o(5360);
    }

    public final void onActivityDestroyed(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
        String valueOf = String.valueOf(activity.hashCode());
        HashSet hashSet = new HashSet();
        f fVar = null;
        for (f fVar2 : g.f6585c.values()) {
            if (fVar2.f6576g && TextUtils.equals(fVar2.f6578i, valueOf)) {
                if (l.a(g.f6584b, fVar2)) {
                    fVar = fVar2;
                } else {
                    hashSet.add(fVar2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f fVar3 = (f) it.next();
            if (!l.a(fVar3, fVar)) {
                l.b(fVar3, "");
                g.a(fVar3);
            }
        }
        if (fVar != null) {
            g.a(fVar.f6570a);
        }
        l.d(activity, "");
        b.f6525c.remove(Integer.valueOf(activity.hashCode()));
        b.f6526d.remove(Integer.valueOf(activity.hashCode()));
        if (activity instanceof b) {
            b bVar = (b) activity;
            l.d(bVar, "");
            g.a(bVar.ac_());
        } else {
            c<Activity> cVar = e.f6569b;
            if (cVar != null) {
                a a2 = cVar.a(activity);
                l.d(a2, "");
                g.a(a2.f6503b);
            }
        }
        l.d(activity, "");
        m<? super String, ? super String, z> mVar = f.f6561b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag_ActivityLife", l.a("onDestroy ", (Object) activity.getClass().getName()));
        }
        if (activity instanceof d) {
            ((e) activity).getSupportFragmentManager().a(k.f6594a);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "");
        if (activity instanceof d) {
            ((e) activity).getSupportFragmentManager().a((i.b) k.f6594a, true);
        }
        if (activity instanceof b) {
            com.bytedance.analytics.b.a((b) activity);
        } else {
            c<Activity> cVar = e.f6569b;
            if (cVar != null) {
                com.bytedance.analytics.b.a(cVar.a(activity));
            }
        }
        if (activity.getComponentName() != null) {
            String className = activity.getComponentName().getClassName();
            l.b(className, "");
            l.d(className, "");
            HashMap hashMap = new HashMap();
            hashMap.put("btm_activity", className);
            com.ss.android.ugc.aweme.cw.g.a().submit(new com.bytedance.analytics.b.e(hashMap));
        }
        l.d(activity, "");
        m<? super String, ? super String, z> mVar = f.f6561b;
        if (mVar != null) {
            mVar.invoke("BTMLogTag_ActivityLife", l.a("onCreate ", (Object) activity.getClass().getName()));
        }
    }
}
