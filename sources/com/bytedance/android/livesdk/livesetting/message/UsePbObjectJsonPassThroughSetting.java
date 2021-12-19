package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class UsePbObjectJsonPassThroughSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final UsePbObjectJsonPassThroughSetting INSTANCE = new UsePbObjectJsonPassThroughSetting();

    private UsePbObjectJsonPassThroughSetting() {
    }

    static {
        Covode.recordClassIndex(10800);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(UsePbObjectJsonPassThroughSetting.class);
    }
}
