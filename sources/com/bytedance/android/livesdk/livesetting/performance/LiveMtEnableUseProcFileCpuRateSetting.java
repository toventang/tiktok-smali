package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEnableUseProcFileCpuRateSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtEnableUseProcFileCpuRateSetting INSTANCE = new LiveMtEnableUseProcFileCpuRateSetting();

    private LiveMtEnableUseProcFileCpuRateSetting() {
    }

    static {
        Covode.recordClassIndex(10902);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEnableUseProcFileCpuRateSetting.class);
    }
}
