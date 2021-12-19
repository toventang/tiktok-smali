package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class od implements oe {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51256a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Long> f51257b;

    @Override // com.google.android.gms.internal.measurement.oe
    public final boolean a() {
        return f51256a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(32036);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51256a = cbVar.a("measurement.service.ssaid_removal", true);
        f51257b = cbVar.a("measurement.id.ssaid_removal", 0);
    }
}
