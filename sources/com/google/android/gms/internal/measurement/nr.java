package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class nr implements ns {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51238a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Double> f51239b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Long> f51240c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Long> f51241d;

    /* renamed from: e  reason: collision with root package name */
    private static final br<String> f51242e;

    @Override // com.google.android.gms.internal.measurement.ns
    public final boolean a() {
        return f51238a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ns
    public final double b() {
        return f51239b.b().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.ns
    public final long c() {
        return f51240c.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ns
    public final long d() {
        return f51241d.b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.ns
    public final String e() {
        return f51242e.b();
    }

    static {
        Covode.recordClassIndex(32023);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51238a = cbVar.a("measurement.test.boolean_flag", false);
        f51239b = new bz(cbVar, "measurement.test.double_flag", Double.valueOf(-3.0d));
        f51240c = cbVar.a("measurement.test.int_flag", -2);
        f51241d = cbVar.a("measurement.test.long_flag", -1);
        f51242e = cbVar.a("measurement.test.string_flag", "---");
    }
}
