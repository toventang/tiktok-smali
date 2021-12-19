package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFluencyPeriodDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 3000;
    public static final LiveFluencyPeriodDurationSetting INSTANCE = new LiveFluencyPeriodDurationSetting();

    private LiveFluencyPeriodDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10892);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveFluencyPeriodDurationSetting.class);
    }
}
