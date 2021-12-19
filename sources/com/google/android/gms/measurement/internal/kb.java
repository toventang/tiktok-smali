package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

final class kb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pb f51980a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51981b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51982c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f51983d;

    static {
        Covode.recordClassIndex(32359);
    }

    public final void run() {
        this.f51983d.f51313a.i().a(this.f51980a, this.f51981b, this.f51982c);
    }

    kb(AppMeasurementDynamiteService appMeasurementDynamiteService, pb pbVar, String str, String str2) {
        this.f51983d = appMeasurementDynamiteService;
        this.f51980a = pbVar;
        this.f51981b = str;
        this.f51982c = str2;
    }
}
