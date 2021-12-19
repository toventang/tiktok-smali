package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LowAgeAnchorLimitSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "18";
    public static final LowAgeAnchorLimitSetting INSTANCE = new LowAgeAnchorLimitSetting();

    private LowAgeAnchorLimitSetting() {
    }

    static {
        Covode.recordClassIndex(10988);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LowAgeAnchorLimitSetting.class);
    }
}
