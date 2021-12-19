package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

final class hc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pb f51746a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51747b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51748c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f51749d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f51750e;

    static {
        Covode.recordClassIndex(32278);
    }

    public final void run() {
        this.f51750e.f51313a.i().a(this.f51746a, this.f51747b, this.f51748c, this.f51749d);
    }

    hc(AppMeasurementDynamiteService appMeasurementDynamiteService, pb pbVar, String str, String str2, boolean z) {
        this.f51750e = appMeasurementDynamiteService;
        this.f51746a = pbVar;
        this.f51747b = str;
        this.f51748c = str2;
        this.f51749d = z;
    }
}
