package com.bytedance.ies.powerpreload.task;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.d;
import com.bytedance.ies.powerpreload.g;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class f<T extends com.bytedance.ies.powerpreload.b.d> implements com.bytedance.ies.powerpreload.b.d, Runnable {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ i[] f34551d = {new r(ab.a(f.class), "owner", "getOwner()Landroid/app/Activity;"), new r(ab.a(f.class), "stubOwner", "getStubOwner()Landroidx/fragment/app/Fragment;"), new r(ab.a(f.class), "callback", "getCallback()Lcom/bytedance/ies/powerpreload/task/Task$Callback;")};

    /* renamed from: a  reason: collision with root package name */
    private final g f34552a = new g(d.f34560a);

    /* renamed from: b  reason: collision with root package name */
    private final g f34553b = new g(e.f34561a);

    /* renamed from: c  reason: collision with root package name */
    private final g f34554c = new g(c.f34559a);

    /* renamed from: e  reason: collision with root package name */
    public boolean f34555e;

    /* renamed from: f  reason: collision with root package name */
    public final T f34556f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.ies.powerpreload.d f34557g;

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f34558h;

    public interface a {
        static {
            Covode.recordClassIndex(20671);
        }
    }

    static final class c extends m implements h.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34559a = new c();

        static {
            Covode.recordClassIndex(20673);
        }

        c() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    static final class d extends m implements h.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34560a = new d();

        static {
            Covode.recordClassIndex(20674);
        }

        d() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    static final class e extends m implements h.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f34561a = new e();

        static {
            Covode.recordClassIndex(20675);
        }

        e() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    private a c() {
        return (a) this.f34554c.a(f34551d[2]);
    }

    public abstract Object a();

    public final void a(Activity activity) {
        this.f34552a.a(f34551d[0], activity);
    }

    public final void a(Fragment fragment) {
        this.f34553b.a(f34551d[1], fragment);
    }

    public final void a(a aVar) {
        this.f34554c.a(f34551d[2], null);
    }

    @Override // com.bytedance.ies.powerpreload.b.d
    public boolean enable(Bundle bundle) {
        return true;
    }

    public void b() {
        g gVar = this.f34552a;
        i<?>[] iVarArr = f34551d;
        if (gVar.a(iVarArr[0]) != null) {
            a((Activity) null);
        }
        if (this.f34553b.a(iVarArr[1]) != null) {
            a((Fragment) null);
        }
    }

    static {
        Covode.recordClassIndex(20670);
    }

    public String toString() {
        return "Task(preload=" + this.f34556f + ", relationData=" + this.f34557g + ')';
    }

    public final void run() {
        TaskTraceMetric a2;
        Set<Class<?>> keySet;
        d<?> dVar;
        TaskTraceMetric a3;
        TaskTraceMetric a4;
        TaskTraceMetric a5;
        TaskTraceMetric a6;
        TaskTraceMetric a7;
        try {
            Bundle bundle = this.f34558h;
            if (!(bundle == null || (a7 = com.bytedance.ies.powerpreload.a.a(bundle)) == null)) {
                a7.f34536b = SystemClock.elapsedRealtime();
            }
            Object a8 = a();
            Bundle bundle2 = this.f34558h;
            if (!(bundle2 == null || (a6 = com.bytedance.ies.powerpreload.a.a(bundle2)) == null)) {
                a6.f34537c = SystemClock.elapsedRealtime();
            }
            if (a8 != null) {
                HashMap<Class<?>, d<?>> hashMap = com.bytedance.ies.powerpreload.a.a.a().f34484e;
                if (hashMap != null && (keySet = hashMap.keySet()) != null) {
                    Iterator<T> it = keySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.isAssignableFrom(a8.getClass())) {
                            if (next != null) {
                                HashMap<Class<?>, d<?>> hashMap2 = com.bytedance.ies.powerpreload.a.a.a().f34484e;
                                if (!(hashMap2 == null || (dVar = hashMap2.get(next)) == null)) {
                                    try {
                                        Bundle bundle3 = this.f34558h;
                                        if (!(bundle3 == null || (a5 = com.bytedance.ies.powerpreload.a.a(bundle3)) == null)) {
                                            a5.f34538d = SystemClock.elapsedRealtime();
                                        }
                                        dVar.a(a8, c());
                                        Bundle bundle4 = this.f34558h;
                                        if (!(bundle4 == null || (a4 = com.bytedance.ies.powerpreload.a.a(bundle4)) == null)) {
                                            a4.f34539e = SystemClock.elapsedRealtime();
                                        }
                                    } catch (Exception e2) {
                                        Bundle bundle5 = this.f34558h;
                                        if (!(bundle5 == null || (a3 = com.bytedance.ies.powerpreload.a.a(bundle5)) == null)) {
                                            a3.a();
                                        }
                                        T t = this.f34556f;
                                        if (t instanceof com.bytedance.ies.powerpreload.b.c) {
                                            Boolean.valueOf(((com.bytedance.ies.powerpreload.b.c) t).handleException(e2));
                                        } else if (c() != null) {
                                            c();
                                        } else {
                                            throw e2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c();
                return;
            }
        } catch (Exception e3) {
            Bundle bundle6 = this.f34558h;
            if (!(bundle6 == null || (a2 = com.bytedance.ies.powerpreload.a.a(bundle6)) == null)) {
                a2.a();
            }
            T t2 = this.f34556f;
            if (t2 instanceof com.bytedance.ies.powerpreload.b.c) {
                ((com.bytedance.ies.powerpreload.b.c) t2).handleException(e3);
            } else if (c() != null) {
                c();
            } else {
                throw e3;
            }
        }
        this.f34555e = true;
    }

    public static final class b extends f<com.bytedance.ies.powerpreload.b.d> {
        static {
            Covode.recordClassIndex(20672);
        }

        @Override // com.bytedance.ies.powerpreload.task.f
        public final Object a() {
            return null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.ies.powerpreload.b.d dVar, com.bytedance.ies.powerpreload.d dVar2, Bundle bundle) {
            super(dVar, dVar2, bundle);
            l.c(dVar, "");
            l.c(dVar2, "");
        }
    }

    public f(T t, com.bytedance.ies.powerpreload.d dVar, Bundle bundle) {
        l.c(t, "");
        l.c(dVar, "");
        this.f34556f = t;
        this.f34557g = dVar;
        this.f34558h = bundle;
    }
}
