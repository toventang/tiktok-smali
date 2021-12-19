package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class kt implements kq {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51126a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51127b;

    @Override // com.google.android.gms.internal.measurement.kq
    public final boolean a() {
        return f51126a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kq
    public final boolean b() {
        return f51127b.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31944);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51126a = cbVar.a("measurement.client.consent_state_v1.dev", false);
        f51127b = cbVar.a("measurement.service.consent_state_v1", false);
    }
}
