package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveVideoGiftCoverPanelSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveVideoGiftCoverPanelSetting INSTANCE = new LiveVideoGiftCoverPanelSetting();

    private LiveVideoGiftCoverPanelSetting() {
    }

    static {
        Covode.recordClassIndex(10673);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveVideoGiftCoverPanelSetting.class);
    }
}
