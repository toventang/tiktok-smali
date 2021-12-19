package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class nj implements ng {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Long> f51228a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Long> f51229b;

    @Override // com.google.android.gms.internal.measurement.ng
    public final long a() {
        return f51229b.b().longValue();
    }

    static {
        Covode.recordClassIndex(32015);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51228a = cbVar.a("measurement.id.max_bundles_per_iteration", 0);
        f51229b = cbVar.a("measurement.max_bundles_per_iteration", 2);
    }
}
