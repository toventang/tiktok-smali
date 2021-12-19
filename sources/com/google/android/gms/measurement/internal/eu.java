package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.bv;
import com.google.android.gms.internal.measurement.dv;

public final class eu implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final String f51561a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ er f51562b;

    static {
        Covode.recordClassIndex(32215);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f51562b.f51552a.q().f51476k.a("Install Referrer Service disconnected");
    }

    eu(er erVar, String str) {
        this.f51562b = erVar;
        this.f51561a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bv bvVar;
        if (iBinder == null) {
            this.f51562b.f51552a.q().f51471f.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof bv) {
                bvVar = (bv) queryLocalInterface;
                if (bvVar == null) {
                    this.f51562b.f51552a.q().f51471f.a("Install Referrer Service implementation was not found");
                    return;
                }
            } else {
                bvVar = new dv(iBinder);
            }
            this.f51562b.f51552a.q().f51476k.a("Install Referrer Service connected");
            this.f51562b.f51552a.p().a(new et(this, bvVar, this));
        } catch (Exception e2) {
            this.f51562b.f51552a.q().f51471f.a("Exception occurred while calling Install Referrer API", e2);
        }
    }
}
