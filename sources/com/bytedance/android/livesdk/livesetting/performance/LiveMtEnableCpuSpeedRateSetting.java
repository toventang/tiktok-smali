package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEnableCpuSpeedRateSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtEnableCpuSpeedRateSetting INSTANCE = new LiveMtEnableCpuSpeedRateSetting();

    private LiveMtEnableCpuSpeedRateSetting() {
    }

    static {
        Covode.recordClassIndex(10900);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEnableCpuSpeedRateSetting.class);
    }
}
