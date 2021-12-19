package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

final class jd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pb f51916a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f51917b;

    static {
        Covode.recordClassIndex(32333);
    }

    public final void run() {
        this.f51917b.f51313a.e().a(this.f51916a, this.f51917b.f51313a.o());
    }

    jd(AppMeasurementDynamiteService appMeasurementDynamiteService, pb pbVar) {
        this.f51917b = appMeasurementDynamiteService;
        this.f51916a = pbVar;
    }
}
