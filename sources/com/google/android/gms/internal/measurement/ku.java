package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ku implements kv {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51128a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51129b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51130c;

    /* renamed from: d  reason: collision with root package name */
    private static final br<Long> f51131d;

    @Override // com.google.android.gms.internal.measurement.kv
    public final boolean a() {
        return f51128a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31945);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51128a = cbVar.a("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        f51129b = cbVar.a("measurement.collection.init_params_control_enabled", true);
        f51130c = cbVar.a("measurement.sdk.dynamite.use_dynamite3", true);
        f51131d = cbVar.a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }
}
