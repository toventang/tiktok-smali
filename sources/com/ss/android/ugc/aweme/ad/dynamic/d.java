package com.ss.android.ugc.aweme.ad.dynamic;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f65721a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(40434);
    }

    public static DynamicAdConfig a() {
        try {
            return (DynamicAdConfig) SettingsManager.a().a("dynamic_ad_config", DynamicAdConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
