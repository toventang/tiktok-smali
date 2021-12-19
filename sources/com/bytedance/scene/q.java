package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.d.k;
import com.bytedance.scene.j;
import com.bytedance.scene.r;
import com.bytedance.scene.t;

public final class q<T extends j & r> {

    /* renamed from: a  reason: collision with root package name */
    T f43023a;

    /* renamed from: b  reason: collision with root package name */
    a f43024b = a.NONE;

    /* renamed from: c  reason: collision with root package name */
    boolean f43025c;

    static {
        Covode.recordClassIndex(26370);
    }

    public final void a() {
        if (this.f43024b == a.ACTIVITY_CREATED || this.f43024b == a.STOP) {
            this.f43024b = a.START;
            this.f43023a.cl_();
            return;
        }
        throw new IllegalStateException("invoke onActivityCreated() or onStop() first, current state " + this.f43024b.toString());
    }

    public final void b() {
        if (this.f43024b == a.START || this.f43024b == a.PAUSE) {
            this.f43024b = a.RESUME;
            this.f43023a.cm_();
            return;
        }
        throw new IllegalStateException("invoke onStart() or onPause() first, current state " + this.f43024b.toString());
    }

    public final void c() {
        if (this.f43024b == a.RESUME) {
            this.f43024b = a.PAUSE;
            this.f43023a.cn_();
            return;
        }
        throw new IllegalStateException("invoke onResume() first, current state " + this.f43024b.toString());
    }

    public final void d() {
        if (this.f43024b == a.PAUSE || this.f43024b == a.START) {
            this.f43024b = a.STOP;
            this.f43023a.co_();
            return;
        }
        throw new IllegalStateException("invoke onPause() or onStart() first, current state " + this.f43024b.toString());
    }

    enum a {
        NONE,
        ACTIVITY_CREATED,
        START,
        RESUME,
        PAUSE,
        STOP;

        static {
            Covode.recordClassIndex(26371);
        }
    }

    public final void e() {
        if (this.f43024b == a.STOP || this.f43024b == a.ACTIVITY_CREATED) {
            this.f43024b = a.NONE;
            this.f43023a.cp_();
            this.f43023a.k();
            this.f43023a.l();
            this.f43023a.m();
            this.f43023a.p = null;
            this.f43023a = null;
            return;
        }
        throw new IllegalStateException("invoke onStop() or onActivityCreated() first, current state " + this.f43024b.toString());
    }

    public final void a(Activity activity, ViewGroup viewGroup, T t, t.a aVar, boolean z, Bundle bundle) {
        MethodCollector.i(5011);
        if (this.f43024b == a.NONE) {
            k.a(activity, "activity can't be null");
            k.a(viewGroup, "viewGroup can't be null");
            k.a(t, "scene can't be null");
            k.a(aVar, "rootScopeFactory can't be null");
            if (t.q == w.NONE) {
                this.f43025c = z;
                if (z || bundle == null) {
                    this.f43024b = a.ACTIVITY_CREATED;
                    this.f43023a = t;
                    if (!this.f43025c) {
                        t.cj_();
                    }
                    this.f43023a.p = aVar;
                    this.f43023a.a(activity);
                    this.f43023a.a(null);
                    this.f43023a.b(bundle);
                    this.f43023a.a(bundle, viewGroup);
                    viewGroup.addView(this.f43023a.p(), new ViewGroup.LayoutParams(-1, -1));
                    this.f43023a.c(bundle);
                    MethodCollector.o(5011);
                    return;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("savedInstanceState should be null when not support restore");
                MethodCollector.o(5011);
                throw illegalArgumentException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Scene state must be " + w.NONE.name);
            MethodCollector.o(5011);
            throw illegalStateException;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("invoke onDestroyView() first, current state " + this.f43024b.toString());
        MethodCollector.o(5011);
        throw illegalStateException2;
    }
}
