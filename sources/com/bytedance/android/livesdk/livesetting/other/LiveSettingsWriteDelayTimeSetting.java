package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSettingsWriteDelayTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 500;
    public static final LiveSettingsWriteDelayTimeSetting INSTANCE = new LiveSettingsWriteDelayTimeSetting();

    private LiveSettingsWriteDelayTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10854);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveSettingsWriteDelayTimeSetting.class);
    }
}
