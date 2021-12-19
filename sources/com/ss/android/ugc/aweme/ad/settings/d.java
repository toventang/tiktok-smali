package com.ss.android.ugc.aweme.ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f66154a = new c[0];

    /* renamed from: b  reason: collision with root package name */
    public static final d f66155b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(40668);
    }

    public static c[] a() {
        try {
            Object a2 = SettingsManager.a().a("intent_scheme_intercept_config", c[].class);
            l.b(a2, "");
            return (c[]) a2;
        } catch (Throwable unused) {
            return f66154a;
        }
    }
}
