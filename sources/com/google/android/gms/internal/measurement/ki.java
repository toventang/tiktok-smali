package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ki implements kj {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51100a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Long> f51101b;

    @Override // com.google.android.gms.internal.measurement.kj
    public final boolean a() {
        return f51100a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kj
    public final long b() {
        return f51101b.b().longValue();
    }

    static {
        Covode.recordClassIndex(31933);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51100a = cbVar.a("measurement.sdk.attribution.cache", true);
        f51101b = cbVar.a("measurement.sdk.attribution.cache.ttl", 604800000);
    }
}
