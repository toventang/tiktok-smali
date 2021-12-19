package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFluencyEnterDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 5000;
    public static final LiveFluencyEnterDurationSetting INSTANCE = new LiveFluencyEnterDurationSetting();

    private LiveFluencyEnterDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10891);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveFluencyEnterDurationSetting.class);
    }
}
