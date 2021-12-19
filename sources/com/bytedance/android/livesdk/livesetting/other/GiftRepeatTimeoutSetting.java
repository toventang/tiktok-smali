package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class GiftRepeatTimeoutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 3;
    public static final GiftRepeatTimeoutSetting INSTANCE = new GiftRepeatTimeoutSetting();

    private GiftRepeatTimeoutSetting() {
    }

    static {
        Covode.recordClassIndex(10816);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GiftRepeatTimeoutSetting.class);
    }
}
