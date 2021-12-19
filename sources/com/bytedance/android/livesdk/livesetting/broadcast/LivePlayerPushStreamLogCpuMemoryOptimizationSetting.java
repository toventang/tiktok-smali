package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePlayerPushStreamLogCpuMemoryOptimizationSetting {
    @Group(isDefault = true, value = "control_group")
    public static final boolean DISABLE = false;
    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final LivePlayerPushStreamLogCpuMemoryOptimizationSetting INSTANCE = new LivePlayerPushStreamLogCpuMemoryOptimizationSetting();

    private LivePlayerPushStreamLogCpuMemoryOptimizationSetting() {
    }

    static {
        Covode.recordClassIndex(10567);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LivePlayerPushStreamLogCpuMemoryOptimizationSetting.class)) {
            return true;
        }
        return false;
    }
}
