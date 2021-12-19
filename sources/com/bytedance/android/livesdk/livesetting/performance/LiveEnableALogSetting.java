package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableALogSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnableALogSetting INSTANCE = new LiveEnableALogSetting();
    private static boolean value = SettingsManager.INSTANCE.getBooleanValue(LiveEnableALogSetting.class);

    private LiveEnableALogSetting() {
    }

    public final boolean isEnable() {
        return value;
    }

    public final boolean isDisable() {
        if (!isEnable()) {
            return true;
        }
        return false;
    }

    public final void update() {
        value = SettingsManager.INSTANCE.getBooleanValue(LiveEnableALogSetting.class);
    }

    static {
        Covode.recordClassIndex(10887);
    }
}
