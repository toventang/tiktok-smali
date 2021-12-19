package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnablePerPushInteractiveStreamSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnablePerPushInteractiveStreamSetting INSTANCE = new LiveEnablePerPushInteractiveStreamSetting();

    private LiveEnablePerPushInteractiveStreamSetting() {
    }

    static {
        Covode.recordClassIndex(10735);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnablePerPushInteractiveStreamSetting.class);
    }
}
