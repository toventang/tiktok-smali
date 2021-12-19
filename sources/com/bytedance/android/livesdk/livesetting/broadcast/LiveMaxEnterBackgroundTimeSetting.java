package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMaxEnterBackgroundTimeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 60000;
    public static final LiveMaxEnterBackgroundTimeSetting INSTANCE = new LiveMaxEnterBackgroundTimeSetting();

    private LiveMaxEnterBackgroundTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10557);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMaxEnterBackgroundTimeSetting.class);
    }
}
