package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class kz implements kw {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51136a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51137b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51138c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Boolean> f51139d;

    /* renamed from: e  reason: collision with root package name */
    private static final br<Boolean> f51140e;

    /* renamed from: f  reason: collision with root package name */
    private static final br<Boolean> f51141f;

    @Override // com.google.android.gms.internal.measurement.kw
    public final boolean a() {
        return f51136a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kw
    public final boolean b() {
        return f51137b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kw
    public final boolean c() {
        return f51138c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kw
    public final boolean d() {
        return f51139d.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kw
    public final boolean e() {
        return f51140e.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.kw
    public final boolean f() {
        return f51141f.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31950);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51136a = cbVar.a("measurement.gold.enhanced_ecommerce.format_logs", true);
        f51137b = cbVar.a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f51138c = cbVar.a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f51139d = cbVar.a("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f51140e = cbVar.a("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f51141f = cbVar.a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }
}
