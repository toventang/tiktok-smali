package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableSlardarSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnableSlardarSetting INSTANCE = new LiveEnableSlardarSetting();

    private LiveEnableSlardarSetting() {
    }

    static {
        Covode.recordClassIndex(10888);
    }

    public final boolean isDisable() {
        if (!SettingsManager.INSTANCE.getBooleanValue(LiveEnableSlardarSetting.class)) {
            return true;
        }
        return false;
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableSlardarSetting.class);
    }
}
