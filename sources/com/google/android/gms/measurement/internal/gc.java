package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

final class gc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pb f51663a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f51664b;

    static {
        Covode.recordClassIndex(32251);
    }

    public final void run() {
        this.f51664b.f51313a.i().a(this.f51663a);
    }

    gc(AppMeasurementDynamiteService appMeasurementDynamiteService, pb pbVar) {
        this.f51664b = appMeasurementDynamiteService;
        this.f51663a = pbVar;
    }
}
