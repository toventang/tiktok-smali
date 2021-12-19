package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class hx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f51814a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzkr f51815b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f51816c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ hv f51817d;

    static {
        Covode.recordClassIndex(32299);
    }

    public final void run() {
        zzkr zzkr;
        dt dtVar = this.f51817d.f51807b;
        if (dtVar == null) {
            this.f51817d.q().f51468c.a("Discarding data. Failed to set user property");
            return;
        }
        hv hvVar = this.f51817d;
        if (this.f51814a) {
            zzkr = null;
        } else {
            zzkr = this.f51815b;
        }
        hvVar.a(dtVar, zzkr, this.f51816c);
        this.f51817d.A();
    }

    hx(hv hvVar, boolean z, zzkr zzkr, zzn zzn) {
        this.f51817d = hvVar;
        this.f51814a = z;
        this.f51815b = zzkr;
        this.f51816c = zzn;
    }
}
