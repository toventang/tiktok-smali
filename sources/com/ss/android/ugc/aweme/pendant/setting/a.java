package com.ss.android.ugc.aweme.pendant.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114755a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(73835);
    }

    public static final ShredConfigurationData a() {
        try {
            ShredConfigurationData shredConfigurationData = (ShredConfigurationData) SettingsManager.a().a("fragments_configuration", ShredConfigurationData.class);
            if (shredConfigurationData == null) {
                return new ShredConfigurationData(false, new int[0]);
            }
            return shredConfigurationData;
        } catch (Throwable unused) {
        }
    }
}
