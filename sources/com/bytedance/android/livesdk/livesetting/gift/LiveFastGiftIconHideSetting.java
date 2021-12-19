package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFastGiftIconHideSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveFastGiftIconHideSetting INSTANCE = new LiveFastGiftIconHideSetting();

    private LiveFastGiftIconHideSetting() {
    }

    static {
        Covode.recordClassIndex(10641);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFastGiftIconHideSetting.class);
    }
}
