package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.mc;
import java.util.concurrent.atomic.AtomicReference;

final class gr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f51713a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51714b;

    static {
        Covode.recordClassIndex(32266);
    }

    public final void run() {
        gk gkVar = this.f51714b;
        long j2 = this.f51713a;
        gkVar.c();
        gkVar.D();
        gkVar.q().f51475j.a("Resetting analytics data (FE)");
        iz j3 = gkVar.j();
        j3.c();
        jg jgVar = j3.f51904c;
        jgVar.f51925c.c();
        jgVar.f51923a = 0;
        jgVar.f51924b = jgVar.f51923a;
        boolean r = gkVar.z.r();
        em r2 = gkVar.r();
        r2.f51527i.a(j2);
        if (!TextUtils.isEmpty(r2.r().v.a())) {
            r2.v.a(null);
        }
        mc.b();
        if (r2.s().d(null, p.aw)) {
            r2.q.a(0);
        }
        if (!r2.s().f()) {
            r2.c(!r);
        }
        r2.w.a(null);
        r2.x.a(0);
        r2.y.a(null);
        gkVar.g().y();
        mc.b();
        if (gkVar.s().d(null, p.aw)) {
            gkVar.j().f51903b.a();
        }
        gkVar.f51687c = !r;
        this.f51714b.g().a(new AtomicReference<>());
    }

    gr(gk gkVar, long j2) {
        this.f51714b = gkVar;
        this.f51713a = j2;
    }
}
