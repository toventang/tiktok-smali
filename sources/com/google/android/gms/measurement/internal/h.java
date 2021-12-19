package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.om;

/* access modifiers changed from: package-private */
public abstract class h {

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f51738c;

    /* renamed from: a  reason: collision with root package name */
    volatile long f51739a;

    /* renamed from: b  reason: collision with root package name */
    private final gb f51740b;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f51741d;

    static {
        Covode.recordClassIndex(32275);
    }

    public abstract void a();

    public final boolean b() {
        if (this.f51739a != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f51739a = 0;
        d().removeCallbacks(this.f51741d);
    }

    private final Handler d() {
        Handler handler;
        if (f51738c != null) {
            return f51738c;
        }
        synchronized (h.class) {
            if (f51738c == null) {
                f51738c = new om(this.f51740b.m().getMainLooper());
            }
            handler = f51738c;
        }
        return handler;
    }

    h(gb gbVar) {
        r.a(gbVar);
        this.f51740b = gbVar;
        this.f51741d = new k(this, gbVar);
    }

    public final void a(long j2) {
        c();
        if (j2 >= 0) {
            this.f51739a = this.f51740b.l().a();
            if (!d().postDelayed(this.f51741d, j2)) {
                this.f51740b.q().f51468c.a("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }
}
