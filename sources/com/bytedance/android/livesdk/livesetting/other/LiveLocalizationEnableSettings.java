package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveLocalizationEnableSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveLocalizationEnableSettings INSTANCE = new LiveLocalizationEnableSettings();

    private LiveLocalizationEnableSettings() {
    }

    static {
        Covode.recordClassIndex(10836);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLocalizationEnableSettings.class);
    }
}
