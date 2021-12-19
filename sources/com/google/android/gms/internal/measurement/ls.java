package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ls implements lp {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51166a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Long> f51167b;

    @Override // com.google.android.gms.internal.measurement.lp
    public final boolean a() {
        return f51166a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31970);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51166a = cbVar.a("measurement.sdk.referrer.delayed_install_referrer_api", false);
        f51167b = cbVar.a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }
}
