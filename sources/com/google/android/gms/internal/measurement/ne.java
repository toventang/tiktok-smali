package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ne implements nf {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51222a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51223b;

    @Override // com.google.android.gms.internal.measurement.nf
    public final boolean a() {
        return f51222a.b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.nf
    public final boolean b() {
        return f51223b.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(32010);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51222a = cbVar.a("measurement.sdk.screen.manual_screen_view_logging", true);
        f51223b = cbVar.a("measurement.sdk.screen.disabling_automatic_reporting", true);
    }
}
