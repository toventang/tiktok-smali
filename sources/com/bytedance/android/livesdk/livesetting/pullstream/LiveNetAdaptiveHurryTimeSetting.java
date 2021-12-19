package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNetAdaptiveHurryTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2000;
    public static final LiveNetAdaptiveHurryTimeSetting INSTANCE = new LiveNetAdaptiveHurryTimeSetting();

    private LiveNetAdaptiveHurryTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10938);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNetAdaptiveHurryTimeSetting.class);
    }
}
