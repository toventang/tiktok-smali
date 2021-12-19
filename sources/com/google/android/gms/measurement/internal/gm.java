package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final gk f51694a;

    static {
        Covode.recordClassIndex(32261);
    }

    gm(gk gkVar) {
        this.f51694a = gkVar;
    }

    public final void run() {
        gk gkVar = this.f51694a;
        gkVar.c();
        if (gkVar.r().t.a()) {
            gkVar.q().f51475j.a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a2 = gkVar.r().u.a();
        gkVar.r().u.a(1 + a2);
        if (a2 >= 5) {
            gkVar.q().f51471f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            gkVar.r().t.a(true);
            return;
        }
        gkVar.z.x();
    }
}
