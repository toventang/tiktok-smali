package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.le;

/* access modifiers changed from: package-private */
public final class ji {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iz f51928a;

    static {
        Covode.recordClassIndex(32338);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f51928a.c();
        if (this.f51928a.r().a(this.f51928a.l().a())) {
            this.f51928a.r().n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f51928a.q().f51476k.a("Detected application was in foreground");
                b(this.f51928a.l().a(), false);
            }
        }
    }

    ji(iz izVar) {
        this.f51928a = izVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, boolean z) {
        this.f51928a.c();
        this.f51928a.w();
        if (this.f51928a.r().a(j2)) {
            this.f51928a.r().n.a(true);
        }
        this.f51928a.r().q.a(j2);
        if (this.f51928a.r().n.a()) {
            b(j2, z);
        }
    }

    private final void b(long j2, boolean z) {
        this.f51928a.c();
        if (this.f51928a.z.r()) {
            this.f51928a.r().q.a(j2);
            this.f51928a.q().f51476k.a("Session started, time", Long.valueOf(this.f51928a.l().b()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.f51928a.e().a("auto", "_sid", valueOf, j2);
            this.f51928a.r().n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f51928a.s().d(null, p.aq) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f51928a.e().a("auto", "_s", j2, bundle);
            le.b();
            if (this.f51928a.s().d(null, p.av)) {
                String a2 = this.f51928a.r().v.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.f51928a.e().a("auto", "_ssr", j2, bundle2);
                }
            }
        }
    }
}
