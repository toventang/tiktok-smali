package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.ap;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.internal.measurement.lk;

/* access modifiers changed from: package-private */
public final class kj extends kk {

    /* renamed from: g  reason: collision with root package name */
    private ap.e f52006g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ kd f52007h;

    static {
        Covode.recordClassIndex(32367);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.kk
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.kk
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.kk
    public final int a() {
        return this.f52006g.zzd;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    kj(kd kdVar, String str, int i2, ap.e eVar) {
        super(str, i2);
        this.f52007h = kdVar;
        this.f52006g = eVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Long l2, Long l3, ay.k kVar, boolean z) {
        boolean z2;
        Object obj;
        lk.b();
        boolean d2 = this.f52007h.s().d(this.f52008a, p.ae);
        boolean z3 = this.f52006g.zzg;
        boolean z4 = this.f52006g.zzh;
        boolean z5 = this.f52006g.zzi;
        if (z3 || z4 || z5) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (!z || z2) {
            ap.c b2 = this.f52006g.b();
            boolean z6 = b2.zzf;
            if (kVar.b()) {
                if (!b2.c()) {
                    this.f52007h.q().f51471f.a("No number filter for long property. property", this.f52007h.n().c(kVar.zze));
                } else {
                    bool = a(a(kVar.zzg, b2.d()), z6);
                }
            } else if (kVar.c()) {
                if (!b2.c()) {
                    this.f52007h.q().f51471f.a("No number filter for double property. property", this.f52007h.n().c(kVar.zze));
                } else {
                    bool = a(a(kVar.zzi, b2.d()), z6);
                }
            } else if ((kVar.zzc & 4) == 0) {
                this.f52007h.q().f51471f.a("User property has no value, property", this.f52007h.n().c(kVar.zze));
            } else if (b2.a()) {
                bool = a(a(kVar.zzf, b2.b(), this.f52007h.q()), z6);
            } else if (!b2.c()) {
                this.f52007h.q().f51471f.a("No string or number filter defined. property", this.f52007h.n().c(kVar.zze));
            } else if (jv.a(kVar.zzf)) {
                bool = a(a(kVar.zzf, b2.d()), z6);
            } else {
                this.f52007h.q().f51471f.a("Invalid user property value for Numeric number filter. property, value", this.f52007h.n().c(kVar.zze), kVar.zzf);
            }
            ee eeVar = this.f52007h.q().f51476k;
            if (bool == null) {
                obj = "null";
            } else {
                obj = bool;
            }
            eeVar.a("Property filter result", obj);
            if (bool == null) {
                return false;
            }
            this.f52010c = true;
            if (z5 && !bool.booleanValue()) {
                return true;
            }
            if (!z || this.f52006g.zzg) {
                this.f52011d = bool;
            }
            if (bool.booleanValue() && z2 && kVar.a()) {
                long j2 = kVar.zzd;
                if (l2 != null) {
                    j2 = l2.longValue();
                }
                if (d2 && this.f52006g.zzg && !this.f52006g.zzh && l3 != null) {
                    j2 = l3.longValue();
                }
                if (this.f52006g.zzh) {
                    this.f52013f = Long.valueOf(j2);
                } else {
                    this.f52012e = Long.valueOf(j2);
                }
            }
            return true;
        }
        ee eeVar2 = this.f52007h.q().f51476k;
        Integer valueOf = Integer.valueOf(this.f52009b);
        if (this.f52006g.a()) {
            num = Integer.valueOf(this.f52006g.zzd);
        }
        eeVar2.a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
        return true;
    }
}
