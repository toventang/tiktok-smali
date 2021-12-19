package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.lr;
import com.google.android.gms.internal.measurement.mc;
import com.google.android.gms.internal.measurement.md;

/* access modifiers changed from: package-private */
public final class jg {

    /* renamed from: a  reason: collision with root package name */
    long f51923a;

    /* renamed from: b  reason: collision with root package name */
    long f51924b;

    /* renamed from: c  reason: collision with root package name */
    final h f51925c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ iz f51926d;

    static {
        Covode.recordClassIndex(32336);
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        long b2 = this.f51926d.l().b();
        long j2 = b2 - this.f51924b;
        this.f51924b = b2;
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final long b(long j2) {
        long j3 = j2 - this.f51924b;
        this.f51924b = j2;
        return j3;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.f51926d.c();
        this.f51925c.c();
        this.f51923a = j2;
        this.f51924b = j2;
    }

    public jg(iz izVar) {
        this.f51926d = izVar;
        this.f51925c = new jj(this, izVar.z);
        long b2 = izVar.l().b();
        this.f51923a = b2;
        this.f51924b = b2;
    }

    static /* synthetic */ void a(jg jgVar) {
        jgVar.f51926d.c();
        jgVar.a(false, false, jgVar.f51926d.l().b());
        jgVar.f51926d.d().a(jgVar.f51926d.l().b());
    }

    public final boolean a(boolean z, boolean z2, long j2) {
        this.f51926d.c();
        this.f51926d.D();
        lr.b();
        if (!this.f51926d.s().d(null, p.aA)) {
            j2 = this.f51926d.l().b();
        }
        mc.b();
        if (!this.f51926d.s().d(null, p.aw) || this.f51926d.z.r()) {
            this.f51926d.r().q.a(this.f51926d.l().a());
        }
        long j3 = j2 - this.f51923a;
        if (z || j3 >= 1000) {
            if (this.f51926d.s().d(null, p.U) && !z2) {
                md.b();
                if (this.f51926d.s().d(null, p.W)) {
                    lr.b();
                    if (this.f51926d.s().d(null, p.aA)) {
                        j3 = b(j2);
                    }
                }
                j3 = a();
            }
            this.f51926d.q().f51476k.a("Recording user engagement, ms", Long.valueOf(j3));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j3);
            hq.a(this.f51926d.h().a(!this.f51926d.s().h().booleanValue()), bundle, true);
            if (this.f51926d.s().d(null, p.U) && !this.f51926d.s().d(null, p.V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f51926d.s().d(null, p.V) || !z2) {
                this.f51926d.e().a("auto", "_e", bundle);
            }
            this.f51923a = j2;
            this.f51925c.c();
            this.f51925c.a(3600000);
            return true;
        }
        this.f51926d.q().f51476k.a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
        return false;
    }
}
