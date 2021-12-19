package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ms implements mt {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51198a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51199b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51200c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Long> f51201d;

    @Override // com.google.android.gms.internal.measurement.mt
    public final boolean a() {
        return f51198a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mt
    public final boolean b() {
        return f51199b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mt
    public final boolean c() {
        return f51200c.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31997);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51198a = cbVar.a("measurement.client.global_params.dev", false);
        f51199b = cbVar.a("measurement.service.global_params_in_payload", true);
        f51200c = cbVar.a("measurement.service.global_params", false);
        f51201d = cbVar.a("measurement.id.service.global_params", 0);
    }
}
