package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class my implements mz {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51207a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51208b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51209c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Boolean> f51210d;

    /* renamed from: e  reason: collision with root package name */
    private static final br<Long> f51211e;

    @Override // com.google.android.gms.internal.measurement.mz
    public final boolean a() {
        return f51207a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mz
    public final boolean b() {
        return f51208b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mz
    public final boolean c() {
        return f51209c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.mz
    public final boolean d() {
        return f51210d.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(32003);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51207a = cbVar.a("measurement.sdk.collection.enable_extend_user_property_size", true);
        f51208b = cbVar.a("measurement.sdk.collection.last_deep_link_referrer2", true);
        f51209c = cbVar.a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f51210d = cbVar.a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f51211e = cbVar.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }
}
