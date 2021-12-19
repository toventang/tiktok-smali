package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ig implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f51839a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f51840b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hv f51841c;

    static {
        Covode.recordClassIndex(32309);
    }

    public final void run() {
        dt dtVar = this.f51841c.f51807b;
        if (dtVar == null) {
            this.f51841c.q().f51468c.a("Failed to send default event parameters to service");
            return;
        }
        try {
            dtVar.a(this.f51839a, this.f51840b);
        } catch (RemoteException e2) {
            this.f51841c.q().f51468c.a("Failed to send default event parameters to service", e2);
        }
    }

    ig(hv hvVar, Bundle bundle, zzn zzn) {
        this.f51841c = hvVar;
        this.f51839a = bundle;
        this.f51840b = zzn;
    }
}
