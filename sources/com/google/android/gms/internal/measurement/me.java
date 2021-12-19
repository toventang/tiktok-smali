package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class me implements mb {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51181a;

    /* renamed from: b  reason: collision with root package name */
    private static final br<Boolean> f51182b;

    /* renamed from: c  reason: collision with root package name */
    private static final br<Boolean> f51183c;

    @Override // com.google.android.gms.internal.measurement.mb
    public final boolean a() {
        return f51181a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31983);
        cb cbVar = new cb(bs.a("com.google.android.gms.measurement"));
        f51181a = cbVar.a("measurement.client.sessions.check_on_reset_and_enable2", true);
        f51182b = cbVar.a("measurement.client.sessions.check_on_startup", true);
        f51183c = cbVar.a("measurement.client.sessions.start_session_before_view_screen", true);
    }
}
