package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.pb;

final class ic implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pb f51827a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f51828b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51829c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f51830d;

    static {
        Covode.recordClassIndex(32305);
    }

    public final void run() {
        this.f51830d.f51313a.i().a(this.f51827a, this.f51828b, this.f51829c);
    }

    ic(AppMeasurementDynamiteService appMeasurementDynamiteService, pb pbVar, zzao zzao, String str) {
        this.f51830d = appMeasurementDynamiteService;
        this.f51827a = pbVar;
        this.f51828b = zzao;
        this.f51829c = str;
    }
}
