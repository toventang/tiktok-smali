package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* access modifiers changed from: package-private */
public final class ie implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51833a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hv f51834b;

    static {
        Covode.recordClassIndex(32307);
    }

    public final void run() {
        dt dtVar = this.f51834b.f51807b;
        if (dtVar == null) {
            this.f51834b.q().f51468c.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            dtVar.a(this.f51833a);
            this.f51834b.i().y();
            this.f51834b.a(dtVar, (AbstractSafeParcelable) null, this.f51833a);
            this.f51834b.A();
        } catch (RemoteException e2) {
            this.f51834b.q().f51468c.a("Failed to send app launch to the service", e2);
        }
    }

    ie(hv hvVar, zzn zzn) {
        this.f51834b = hvVar;
        this.f51833a = zzn;
    }
}
