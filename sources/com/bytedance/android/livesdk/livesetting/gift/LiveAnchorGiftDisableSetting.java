package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorGiftDisableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveAnchorGiftDisableSetting INSTANCE = new LiveAnchorGiftDisableSetting();

    private LiveAnchorGiftDisableSetting() {
    }

    static {
        Covode.recordClassIndex(10637);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnchorGiftDisableSetting.class);
    }
}
