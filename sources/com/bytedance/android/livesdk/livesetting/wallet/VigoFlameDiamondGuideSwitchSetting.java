package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class VigoFlameDiamondGuideSwitchSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final VigoFlameDiamondGuideSwitchSetting INSTANCE = new VigoFlameDiamondGuideSwitchSetting();

    private VigoFlameDiamondGuideSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(11012);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(VigoFlameDiamondGuideSwitchSetting.class);
    }
}
