package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class nd implements na {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Long> f51217a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51218b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51219c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Boolean> f51220d;

    /* renamed from: e  reason: collision with root package name */
    private static final br<Long> f51221e;

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean a() {
        return f51218b.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean b() {
        return f51219c.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean c() {
        return f51220d.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(32009);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51217a = cbVar.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f51218b = cbVar.a("measurement.lifecycle.app_backgrounded_engagement", false);
        f51219c = cbVar.a("measurement.lifecycle.app_backgrounded_tracking", true);
        f51220d = cbVar.a("measurement.lifecycle.app_in_background_parameter", false);
        f51221e = cbVar.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }
}
