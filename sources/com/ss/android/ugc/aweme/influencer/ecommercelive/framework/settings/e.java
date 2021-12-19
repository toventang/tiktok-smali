package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f104592a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(67006);
    }

    public static final d a() {
        try {
            Object a2 = SettingsManager.a().a("live_ecommerce_config", d.class);
            l.b(a2, "");
            return (d) a2;
        } catch (Exception unused) {
            return new d();
        }
    }
}
