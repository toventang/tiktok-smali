package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

/* access modifiers changed from: package-private */
public final class ia implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51821a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ pb f51822b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hv f51823c;

    static {
        Covode.recordClassIndex(32303);
    }

    public final void run() {
        try {
            dt dtVar = this.f51823c.f51807b;
            if (dtVar == null) {
                this.f51823c.q().f51468c.a("Failed to get app instance id");
                return;
            }
            String c2 = dtVar.c(this.f51821a);
            if (c2 != null) {
                this.f51823c.e().a(c2);
                this.f51823c.r().f51529k.a(c2);
            }
            this.f51823c.A();
            this.f51823c.o().a(this.f51822b, c2);
        } catch (RemoteException e2) {
            this.f51823c.q().f51468c.a("Failed to get app instance id", e2);
        } finally {
            this.f51823c.o().a(this.f51822b, (String) null);
        }
    }

    ia(hv hvVar, zzn zzn, pb pbVar) {
        this.f51823c = hvVar;
        this.f51821a = zzn;
        this.f51822b = pbVar;
    }
}
