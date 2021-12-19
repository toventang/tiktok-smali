package com.ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static CommerceAdLandpageBulletConfig f73629a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f73630b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(45316);
    }

    public static final boolean a() {
        CommerceAdLandpageBulletConfig c2 = c();
        if (c2 != null && c2.getTotalEnable()) {
            return c2.getAdLandpageRealEnable();
        }
        return false;
    }

    public static final boolean b() {
        CommerceAdLandpageBulletConfig c2 = c();
        if (c2 != null && c2.getTotalEnable()) {
            return c2.getAdLandpageNonFullScreenEnable();
        }
        return false;
    }

    public static CommerceAdLandpageBulletConfig c() {
        CommerceAdLandpageBulletConfig commerceAdLandpageBulletConfig = f73629a;
        if (commerceAdLandpageBulletConfig != null) {
            return commerceAdLandpageBulletConfig;
        }
        try {
            f73629a = (CommerceAdLandpageBulletConfig) SettingsManager.a().a("commerce_ad_landpage_bullet_config", CommerceAdLandpageBulletConfig.class);
        } catch (Throwable unused) {
        }
        return f73629a;
    }
}
