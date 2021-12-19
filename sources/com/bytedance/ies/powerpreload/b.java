package com.bytedance.ies.powerpreload;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.a;
import com.bytedance.ies.powerpreload.b.d;
import com.bytedance.ies.powerpreload.d.a;
import com.bytedance.ies.powerpreload.task.b;
import com.bytedance.ies.powerpreload.task.f;
import com.bytedance.ies.powerpreload.task.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.w;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f34491a = i.a((h.f.a.a) c.f34495a);

    /* renamed from: b  reason: collision with root package name */
    private final h f34492b = i.a((h.f.a.a) new C0772b(this));

    static {
        Covode.recordClassIndex(20623);
    }

    public final g a() {
        return (g) this.f34491a.getValue();
    }

    public final com.bytedance.ies.powerpreload.task.b b() {
        return (com.bytedance.ies.powerpreload.task.b) this.f34492b.getValue();
    }

    /* renamed from: com.bytedance.ies.powerpreload.b$b  reason: collision with other inner class name */
    static final class C0772b extends m implements h.f.a.a<com.bytedance.ies.powerpreload.task.b> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(20625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0772b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerpreload.task.b invoke() {
            return new com.bytedance.ies.powerpreload.task.b(this.this$0.a());
        }
    }

    static final class c extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34495a = new c();

        static {
            Covode.recordClassIndex(20626);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            g gVar = new g();
            l.c(gVar, "");
            com.bytedance.ies.powerpreload.a.a.f34477a = gVar;
            return gVar;
        }
    }

    public final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f34494b;

        static {
            Covode.recordClassIndex(20624);
        }

        public final void onActivityPaused(Activity activity) {
            l.c(activity, "");
            this.f34494b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            l.c(activity, "");
            this.f34494b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.c(activity, "");
            l.c(bundle, "");
            this.f34494b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            l.c(activity, "");
            this.f34494b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            l.c(activity, "");
            this.f34494b.onActivityStopped(activity);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
            a.C0770a aVar = a.C0770a.f34476a;
            Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, aVar);
            if (newProxyInstance != null) {
                this.f34494b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }

        public final void onActivityDestroyed(Activity activity) {
            Set<com.bytedance.ies.powerpreload.task.h> a2;
            l.c(activity, "");
            com.bytedance.ies.powerpreload.task.b b2 = b.this.b();
            l.c(activity, "");
            Intent intent = activity.getIntent();
            l.a((Object) intent, "");
            String b3 = a.b(intent);
            if (b3 != null) {
                g gVar = b2.f34547a;
                String name = activity.getClass().getName();
                l.a((Object) name, "");
                d a3 = gVar.a(name);
                if (!(a3 == null || !a3.f34517b || (a2 = b2.f34547a.a(a3)) == null)) {
                    for (T t : a2) {
                        f<?> fVar = t.f34565a;
                        if (fVar != null && t.a(null, b3)) {
                            fVar.b();
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.c(activity, "");
            com.bytedance.ies.powerpreload.task.b b2 = b.this.b();
            l.c(activity, "");
            g gVar = b2.f34547a;
            String name = activity.getClass().getName();
            l.a((Object) name, "");
            d a2 = gVar.a(name);
            if (a2 != null) {
                if (a2.f34516a && (activity instanceof e)) {
                    ((e) activity).getSupportFragmentManager().a((i.b) new b.a(), false);
                }
                Intent intent = activity.getIntent();
                l.a((Object) intent, "");
                String b3 = a.b(intent);
                if (b3 != null && !a2.f34516a) {
                    a2.f34517b = true;
                    Set<com.bytedance.ies.powerpreload.task.h> a3 = b2.f34547a.a(a2);
                    if (a3 != null) {
                        for (T t : a3) {
                            f<?> fVar = t.f34565a;
                            if (fVar != null && t.a(null, b3)) {
                                fVar.a(activity);
                            }
                        }
                    }
                }
            }
        }
    }

    public b(com.bytedance.ies.powerpreload.a.b bVar) {
        l.c(bVar, "");
        l.c(bVar, "");
        com.bytedance.ies.powerpreload.a.a.f34478b = bVar;
        com.bytedance.ies.powerpreload.d.b bVar2 = a.C0777a.a().f34525a;
        l.c(this, "");
        bVar2.f34528a = this;
        bVar.f34480a.registerActivityLifecycleCallbacks(new a());
    }

    public final void a(d dVar, Bundle bundle) {
        ArrayList arrayList;
        l.c(dVar, "");
        if (dVar.f34522g != null) {
            dVar.f34516a = true;
        }
        List<String> list = dVar.f34519d;
        if (list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str : list) {
                Class<?> cls = Class.forName(str);
                if (cls != null) {
                    Object newInstance = cls.newInstance();
                    l.a(newInstance, "");
                    arrayList.add(newInstance);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
        dVar.f34518c = arrayList;
        List<? extends d> list2 = dVar.f34518c;
        if (list2 != null) {
            for (T t : list2) {
                if (t.enable(bundle)) {
                    f<d> a2 = com.bytedance.ies.powerpreload.a.a.c().a(t, dVar, bundle);
                    if (a2 != null) {
                        a2.a((f.a) null);
                    }
                    g a3 = a();
                    if (a2 == null) {
                        l.a();
                    }
                    a3.a(dVar, t, a2, bundle != null ? a.b(bundle) : null);
                }
            }
        }
    }
}
