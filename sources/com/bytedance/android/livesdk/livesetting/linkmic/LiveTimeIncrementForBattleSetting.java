package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveTimeIncrementForBattleSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 2;
    public static final LiveTimeIncrementForBattleSetting INSTANCE = new LiveTimeIncrementForBattleSetting();

    private LiveTimeIncrementForBattleSetting() {
    }

    static {
        Covode.recordClassIndex(10762);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveTimeIncrementForBattleSetting.class);
    }
}
