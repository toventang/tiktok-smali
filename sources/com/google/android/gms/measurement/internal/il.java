package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class il implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51857a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51858b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f51859c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ pb f51860d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ hv f51861e;

    static {
        Covode.recordClassIndex(32314);
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            dt dtVar = this.f51861e.f51807b;
            if (dtVar == null) {
                this.f51861e.q().f51468c.a("Failed to get conditional properties; not connected to service", this.f51857a, this.f51858b);
                return;
            }
            ArrayList<Bundle> b2 = jz.b(dtVar.a(this.f51857a, this.f51858b, this.f51859c));
            this.f51861e.A();
            this.f51861e.o().a(this.f51860d, b2);
        } catch (RemoteException e2) {
            this.f51861e.q().f51468c.a("Failed to get conditional properties; remote exception", this.f51857a, this.f51858b, e2);
        } finally {
            this.f51861e.o().a(this.f51860d, arrayList);
        }
    }

    il(hv hvVar, String str, String str2, zzn zzn, pb pbVar) {
        this.f51861e = hvVar;
        this.f51857a = str;
        this.f51858b = str2;
        this.f51859c = zzn;
        this.f51860d = pbVar;
    }
}
