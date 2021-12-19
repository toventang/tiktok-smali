package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableTimeCostSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableTimeCostSetting INSTANCE = new LiveEnableTimeCostSetting();

    private LiveEnableTimeCostSetting() {
    }

    static {
        Covode.recordClassIndex(10889);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableTimeCostSetting.class);
    }
}
