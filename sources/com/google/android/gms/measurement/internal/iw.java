package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.ja;

public final class iw<T extends Context & ja> {

    /* renamed from: a  reason: collision with root package name */
    public final T f51896a;

    static {
        Covode.recordClassIndex(32325);
    }

    public final eb c() {
        return ff.a(this.f51896a, null, null).q();
    }

    public final void a() {
        ff a2 = ff.a(this.f51896a, null, null);
        eb q = a2.q();
        a2.t();
        q.f51476k.a("Local AppMeasurementService is starting up");
    }

    public final void b() {
        ff a2 = ff.a(this.f51896a, null, null);
        eb q = a2.q();
        a2.t();
        q.f51476k.a("Local AppMeasurementService is shutting down");
    }

    public iw(T t) {
        r.a(t);
        this.f51896a = t;
    }

    public final void a(Runnable runnable) {
        jo a2 = jo.a(this.f51896a);
        a2.p().a(new ix(a2, runnable));
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().f51468c.a("onRebind called with null intent");
            return;
        }
        c().f51476k.a("onRebind called. action", intent.getAction());
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            c().f51468c.a("onUnbind called with null intent");
            return true;
        }
        c().f51476k.a("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
