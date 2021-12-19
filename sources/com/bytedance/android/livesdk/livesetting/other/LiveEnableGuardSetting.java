package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableGuardSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveEnableGuardSetting INSTANCE = new LiveEnableGuardSetting();

    private LiveEnableGuardSetting() {
    }

    static {
        Covode.recordClassIndex(10827);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEnableGuardSetting.class);
    }
}
