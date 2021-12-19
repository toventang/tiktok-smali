package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGpuEnableSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveGpuEnableSettings INSTANCE = new LiveGpuEnableSettings();

    private LiveGpuEnableSettings() {
    }

    static {
        Covode.recordClassIndex(10897);
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGpuEnableSettings.class);
    }
}
