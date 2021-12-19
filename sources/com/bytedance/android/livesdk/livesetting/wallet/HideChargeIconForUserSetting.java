package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HideChargeIconForUserSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final HideChargeIconForUserSetting INSTANCE = new HideChargeIconForUserSetting();

    private HideChargeIconForUserSetting() {
    }

    static {
        Covode.recordClassIndex(10996);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(HideChargeIconForUserSetting.class);
    }
}
