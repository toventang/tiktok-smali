package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.if  reason: invalid class name */
public final class Cif implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzao f51835a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51836b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ pb f51837c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ hv f51838d;

    static {
        Covode.recordClassIndex(32308);
    }

    public final void run() {
        try {
            dt dtVar = this.f51838d.f51807b;
            if (dtVar == null) {
                this.f51838d.q().f51468c.a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] a2 = dtVar.a(this.f51835a, this.f51836b);
            this.f51838d.A();
            this.f51838d.o().a(this.f51837c, a2);
        } catch (RemoteException e2) {
            this.f51838d.q().f51468c.a("Failed to send event to the service to bundle", e2);
        } finally {
            this.f51838d.o().a(this.f51837c, (byte[]) null);
        }
    }

    Cif(hv hvVar, zzao zzao, String str, pb pbVar) {
        this.f51838d = hvVar;
        this.f51835a = zzao;
        this.f51836b = str;
        this.f51837c = pbVar;
    }
}
