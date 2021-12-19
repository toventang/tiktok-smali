package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEnableCpuRateSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveMtEnableCpuRateSetting INSTANCE = new LiveMtEnableCpuRateSetting();

    private LiveMtEnableCpuRateSetting() {
    }

    static {
        Covode.recordClassIndex(10899);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEnableCpuRateSetting.class);
    }
}
