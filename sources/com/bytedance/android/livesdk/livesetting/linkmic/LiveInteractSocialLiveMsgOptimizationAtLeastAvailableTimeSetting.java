package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractSocialLiveMsgOptimizationAtLeastAvailableTimeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 5;
    public static final LiveInteractSocialLiveMsgOptimizationAtLeastAvailableTimeSetting INSTANCE = new LiveInteractSocialLiveMsgOptimizationAtLeastAvailableTimeSetting();

    private LiveInteractSocialLiveMsgOptimizationAtLeastAvailableTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10746);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractSocialLiveMsgOptimizationAtLeastAvailableTimeSetting.class);
    }
}
