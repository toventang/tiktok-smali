package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class iv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final iw f51892a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51893b;

    /* renamed from: c  reason: collision with root package name */
    private final eb f51894c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f51895d;

    static {
        Covode.recordClassIndex(32324);
    }

    public iv(iw iwVar, int i2, eb ebVar, Intent intent) {
        this.f51892a = iwVar;
        this.f51893b = i2;
        this.f51894c = ebVar;
        this.f51895d = intent;
    }

    public final void run() {
        iw iwVar = this.f51892a;
        int i2 = this.f51893b;
        eb ebVar = this.f51894c;
        Intent intent = this.f51895d;
        if (iwVar.f51896a.a(i2)) {
            ebVar.f51476k.a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            iwVar.c().f51476k.a("Completed wakeful intent.");
            iwVar.f51896a.a(intent);
        }
    }
}
