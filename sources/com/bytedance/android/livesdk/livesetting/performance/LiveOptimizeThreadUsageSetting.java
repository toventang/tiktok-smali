package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptimizeThreadUsageSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveOptimizeThreadUsageSetting INSTANCE = new LiveOptimizeThreadUsageSetting();

    private LiveOptimizeThreadUsageSetting() {
    }

    static {
        Covode.recordClassIndex(10903);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOptimizeThreadUsageSetting.class);
    }
}
