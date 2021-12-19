package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class hz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51819a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hv f51820b;

    static {
        Covode.recordClassIndex(32301);
    }

    public final void run() {
        dt dtVar = this.f51820b.f51807b;
        if (dtVar == null) {
            this.f51820b.q().f51468c.a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            dtVar.d(this.f51819a);
        } catch (RemoteException e2) {
            this.f51820b.q().f51468c.a("Failed to reset data on the service: remote exception", e2);
        }
        this.f51820b.A();
    }

    hz(hv hvVar, zzn zzn) {
        this.f51820b = hvVar;
        this.f51819a = zzn;
    }
}
