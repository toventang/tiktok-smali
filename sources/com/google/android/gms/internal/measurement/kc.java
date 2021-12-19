package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class kc implements kd {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51093a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51094b;

    @Override // com.google.android.gms.internal.measurement.kd
    public final boolean a() {
        return f51093a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31927);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51093a = cbVar.a("measurement.androidId.delete_feature", true);
        f51094b = cbVar.a("measurement.log_androidId_enabled", false);
    }
}
