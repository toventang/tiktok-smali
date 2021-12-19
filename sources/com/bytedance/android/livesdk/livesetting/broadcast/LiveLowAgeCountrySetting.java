package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveLowAgeCountrySetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveLowAgeCountrySetting INSTANCE = new LiveLowAgeCountrySetting();

    private LiveLowAgeCountrySetting() {
    }

    static {
        Covode.recordClassIndex(10556);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLowAgeCountrySetting.class);
    }
}
