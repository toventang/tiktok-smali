package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HideGiftIconForUserSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final HideGiftIconForUserSetting INSTANCE = new HideGiftIconForUserSetting();

    private HideGiftIconForUserSetting() {
    }

    static {
        Covode.recordClassIndex(10636);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(HideGiftIconForUserSetting.class);
    }
}
