package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ij implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f51845a = true;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f51846b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzw f51847c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f51848d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzw f51849e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ hv f51850f;

    static {
        Covode.recordClassIndex(32312);
    }

    public final void run() {
        zzw zzw;
        dt dtVar = this.f51850f.f51807b;
        if (dtVar == null) {
            this.f51850f.q().f51468c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f51845a) {
            hv hvVar = this.f51850f;
            if (this.f51846b) {
                zzw = null;
            } else {
                zzw = this.f51847c;
            }
            hvVar.a(dtVar, zzw, this.f51848d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f51849e.f52086a)) {
                    dtVar.a(this.f51847c, this.f51848d);
                } else {
                    dtVar.a(this.f51847c);
                }
            } catch (RemoteException e2) {
                this.f51850f.q().f51468c.a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f51850f.A();
    }

    ij(hv hvVar, boolean z, zzw zzw, zzn zzn, zzw zzw2) {
        this.f51850f = hvVar;
        this.f51846b = z;
        this.f51847c = zzw;
        this.f51848d = zzn;
        this.f51849e = zzw2;
    }
}
