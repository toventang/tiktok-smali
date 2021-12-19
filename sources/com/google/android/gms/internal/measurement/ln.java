package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ln implements lo {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51161a = new cb(bs.a("com.google.android.gms.measurement")).a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true);

    @Override // com.google.android.gms.internal.measurement.lo
    public final boolean a() {
        return f51161a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31965);
    }
}
