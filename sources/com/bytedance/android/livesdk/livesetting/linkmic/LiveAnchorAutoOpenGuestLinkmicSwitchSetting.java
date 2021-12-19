package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorAutoOpenGuestLinkmicSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveAnchorAutoOpenGuestLinkmicSwitchSetting INSTANCE = new LiveAnchorAutoOpenGuestLinkmicSwitchSetting();

    private LiveAnchorAutoOpenGuestLinkmicSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(10726);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnchorAutoOpenGuestLinkmicSwitchSetting.class);
    }
}
