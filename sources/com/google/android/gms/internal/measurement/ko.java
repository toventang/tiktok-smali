package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ko implements kp {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51119a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51120b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Long> f51121c;

    @Override // com.google.android.gms.internal.measurement.kp
    public final boolean a() {
        return f51119a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kp
    public final boolean b() {
        return f51120b.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31939);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51119a = cbVar.a("measurement.service.configurable_service_limits", true);
        f51120b = cbVar.a("measurement.client.configurable_service_limits", true);
        f51121c = cbVar.a("measurement.id.service.configurable_service_limits", 0);
    }
}
