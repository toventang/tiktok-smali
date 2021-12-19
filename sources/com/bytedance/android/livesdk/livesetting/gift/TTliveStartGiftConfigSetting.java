package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveStartGiftConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final TTliveStartGiftConfigSetting INSTANCE = new TTliveStartGiftConfigSetting();

    private TTliveStartGiftConfigSetting() {
    }

    static {
        Covode.recordClassIndex(10677);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TTliveStartGiftConfigSetting.class);
    }
}
