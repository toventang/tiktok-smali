package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ih implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51842a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hv f51843b;

    static {
        Covode.recordClassIndex(32310);
    }

    public final void run() {
        dt dtVar = this.f51843b.f51807b;
        if (dtVar == null) {
            this.f51843b.q().f51468c.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            dtVar.b(this.f51842a);
            this.f51843b.A();
        } catch (RemoteException e2) {
            this.f51843b.q().f51468c.a("Failed to send measurementEnabled to the service", e2);
        }
    }

    ih(hv hvVar, zzn zzn) {
        this.f51843b = hvVar;
        this.f51842a = zzn;
    }
}
