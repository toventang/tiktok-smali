package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f34804a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final d f34805b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(20878);
    }

    public static final c a() {
        try {
            return (c) SettingsManager.a().a("ad_splash_config", c.class);
        } catch (Exception unused) {
            return f34804a;
        }
    }
}
