package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAutoDotEnableCountSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveAutoDotEnableCountSetting INSTANCE = new LiveAutoDotEnableCountSetting();

    private LiveAutoDotEnableCountSetting() {
    }

    static {
        Covode.recordClassIndex(10819);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAutoDotEnableCountSetting.class);
    }
}
