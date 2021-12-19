package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNetAdaptiveSlowTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveNetAdaptiveSlowTimeSetting INSTANCE = new LiveNetAdaptiveSlowTimeSetting();

    private LiveNetAdaptiveSlowTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10940);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNetAdaptiveSlowTimeSetting.class);
    }
}
