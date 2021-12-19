package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class lm implements li {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51157a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51158b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51159c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Boolean> f51160d;

    @Override // com.google.android.gms.internal.measurement.li
    public final boolean a() {
        return f51157a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.li
    public final boolean b() {
        return f51158b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.li
    public final boolean c() {
        return f51159c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.li
    public final boolean d() {
        return f51160d.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31964);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51157a = cbVar.a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f51158b = cbVar.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f51159c = cbVar.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f51160d = cbVar.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
