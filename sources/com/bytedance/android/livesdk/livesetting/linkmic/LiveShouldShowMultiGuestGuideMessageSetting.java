package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveShouldShowMultiGuestGuideMessageSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveShouldShowMultiGuestGuideMessageSetting INSTANCE = new LiveShouldShowMultiGuestGuideMessageSetting();

    private LiveShouldShowMultiGuestGuideMessageSetting() {
    }

    static {
        Covode.recordClassIndex(10760);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveShouldShowMultiGuestGuideMessageSetting.class);
    }
}
