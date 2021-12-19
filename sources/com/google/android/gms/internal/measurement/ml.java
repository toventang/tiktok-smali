package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ml implements mh {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51189a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51190b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Long> f51191c;

    @Override // com.google.android.gms.internal.measurement.mh
    public final boolean a() {
        return f51189a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mh
    public final boolean b() {
        return f51190b.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31990);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51189a = cbVar.a("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f51190b = cbVar.a("measurement.collection.redundant_engagement_removal_enabled", false);
        f51191c = cbVar.a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }
}
