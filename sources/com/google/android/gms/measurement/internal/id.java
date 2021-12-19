package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class id implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ hn f51831a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hv f51832b;

    static {
        Covode.recordClassIndex(32306);
    }

    public final void run() {
        dt dtVar = this.f51832b.f51807b;
        if (dtVar == null) {
            this.f51832b.q().f51468c.a("Failed to send current screen to service");
            return;
        }
        try {
            hn hnVar = this.f51831a;
            if (hnVar == null) {
                dtVar.a(0, (String) null, (String) null, this.f51832b.m().getPackageName());
            } else {
                dtVar.a(hnVar.f51774c, this.f51831a.f51772a, this.f51831a.f51773b, this.f51832b.m().getPackageName());
            }
            this.f51832b.A();
        } catch (RemoteException e2) {
            this.f51832b.q().f51468c.a("Failed to send current screen to the service", e2);
        }
    }

    id(hv hvVar, hn hnVar) {
        this.f51832b = hvVar;
        this.f51831a = hnVar;
    }
}
