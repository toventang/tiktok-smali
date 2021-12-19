package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class AgeRestrictedConfig {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final AgeRestrictedConfig INSTANCE = new AgeRestrictedConfig();

    private AgeRestrictedConfig() {
    }

    static {
        Covode.recordClassIndex(10964);
    }

    public final boolean isLimit() {
        return SettingsManager.INSTANCE.getBooleanValue(AgeRestrictedConfig.class);
    }
}
