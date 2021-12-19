package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptimizeStyleV1Setting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveOptimizeStyleV1Setting INSTANCE = new LiveOptimizeStyleV1Setting();

    private LiveOptimizeStyleV1Setting() {
    }

    static {
        Covode.recordClassIndex(10844);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveOptimizeStyleV1Setting.class);
    }
}
