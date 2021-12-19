package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBattleScoreAnimationTimeThresholdSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 10;
    public static final LiveBattleScoreAnimationTimeThresholdSetting INSTANCE = new LiveBattleScoreAnimationTimeThresholdSetting();

    private LiveBattleScoreAnimationTimeThresholdSetting() {
    }

    static {
        Covode.recordClassIndex(10732);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveBattleScoreAnimationTimeThresholdSetting.class);
    }
}
