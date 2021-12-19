package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ik implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f51851a = true;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f51852b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzao f51853c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzn f51854d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f51855e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ hv f51856f;

    static {
        Covode.recordClassIndex(32313);
    }

    public final void run() {
        zzao zzao;
        dt dtVar = this.f51856f.f51807b;
        if (dtVar == null) {
            this.f51856f.q().f51468c.a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f51851a) {
            hv hvVar = this.f51856f;
            if (this.f51852b) {
                zzao = null;
            } else {
                zzao = this.f51853c;
            }
            hvVar.a(dtVar, zzao, this.f51854d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f51855e)) {
                    dtVar.a(this.f51853c, this.f51854d);
                } else {
                    dtVar.a(this.f51853c, this.f51855e, this.f51856f.q().e());
                }
            } catch (RemoteException e2) {
                this.f51856f.q().f51468c.a("Failed to send event to the service", e2);
            }
        }
        this.f51856f.A();
    }

    ik(hv hvVar, boolean z, zzao zzao, zzn zzn, String str) {
        this.f51856f = hvVar;
        this.f51852b = z;
        this.f51853c = zzao;
        this.f51854d = zzn;
        this.f51855e = str;
    }
}
