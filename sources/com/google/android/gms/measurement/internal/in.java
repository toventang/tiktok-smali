package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

/* access modifiers changed from: package-private */
public final class in implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51868a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51869b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f51870c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f51871d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ pb f51872e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ hv f51873f;

    static {
        Covode.recordClassIndex(32316);
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            dt dtVar = this.f51873f.f51807b;
            if (dtVar == null) {
                this.f51873f.q().f51468c.a("Failed to get user properties; not connected to service", this.f51868a, this.f51869b);
                return;
            }
            Bundle a2 = jz.a(dtVar.a(this.f51868a, this.f51869b, this.f51870c, this.f51871d));
            this.f51873f.A();
            this.f51873f.o().a(this.f51872e, a2);
        } catch (RemoteException e2) {
            this.f51873f.q().f51468c.a("Failed to get user properties; remote exception", this.f51868a, e2);
        } finally {
            this.f51873f.o().a(this.f51872e, bundle);
        }
    }

    in(hv hvVar, String str, String str2, boolean z, zzn zzn, pb pbVar) {
        this.f51873f = hvVar;
        this.f51868a = str;
        this.f51869b = str2;
        this.f51870c = z;
        this.f51871d = zzn;
        this.f51872e = pbVar;
    }
}
