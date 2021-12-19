package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEnableInstantCpuRateSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveMtEnableInstantCpuRateSetting INSTANCE = new LiveMtEnableInstantCpuRateSetting();

    private LiveMtEnableInstantCpuRateSetting() {
    }

    static {
        Covode.recordClassIndex(10901);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMtEnableInstantCpuRateSetting.class);
    }
}
