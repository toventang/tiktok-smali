package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveThorEnableSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveThorEnableSettings INSTANCE = new LiveThorEnableSettings();

    private LiveThorEnableSettings() {
    }

    static {
        Covode.recordClassIndex(10911);
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveThorEnableSettings.class);
    }
}
