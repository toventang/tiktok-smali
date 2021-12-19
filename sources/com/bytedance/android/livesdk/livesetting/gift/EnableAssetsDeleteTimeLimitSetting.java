package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableAssetsDeleteTimeLimitSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final EnableAssetsDeleteTimeLimitSetting INSTANCE = new EnableAssetsDeleteTimeLimitSetting();

    private EnableAssetsDeleteTimeLimitSetting() {
    }

    static {
        Covode.recordClassIndex(10634);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableAssetsDeleteTimeLimitSetting.class);
    }
}
