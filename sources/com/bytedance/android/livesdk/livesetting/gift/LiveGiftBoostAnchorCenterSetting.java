package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftBoostAnchorCenterSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveGiftBoostAnchorCenterSetting INSTANCE = new LiveGiftBoostAnchorCenterSetting();

    private LiveGiftBoostAnchorCenterSetting() {
    }

    static {
        Covode.recordClassIndex(10652);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftBoostAnchorCenterSetting.class);
    }
}
