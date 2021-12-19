package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePlayerPullStreamLogCpuMemoryOptimizationSetting {
    @Group(isDefault = true, value = "control_group")
    public static final boolean DISABLE = false;
    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final LivePlayerPullStreamLogCpuMemoryOptimizationSetting INSTANCE = new LivePlayerPullStreamLogCpuMemoryOptimizationSetting();

    private LivePlayerPullStreamLogCpuMemoryOptimizationSetting() {
    }

    static {
        Covode.recordClassIndex(11056);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LivePlayerPullStreamLogCpuMemoryOptimizationSetting.class)) {
            return true;
        }
        return false;
    }
}
