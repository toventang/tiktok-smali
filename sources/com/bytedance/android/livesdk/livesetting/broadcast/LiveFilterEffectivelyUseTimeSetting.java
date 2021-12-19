package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFilterEffectivelyUseTimeSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 30;
    public static final LiveFilterEffectivelyUseTimeSetting INSTANCE = new LiveFilterEffectivelyUseTimeSetting();

    private LiveFilterEffectivelyUseTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10546);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveFilterEffectivelyUseTimeSetting.class);
    }
}
