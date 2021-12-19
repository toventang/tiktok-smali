package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveWatchDogStopDelayDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 10000;
    public static final LiveWatchDogStopDelayDurationSetting INSTANCE = new LiveWatchDogStopDelayDurationSetting();

    private LiveWatchDogStopDelayDurationSetting() {
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveWatchDogStopDelayDurationSetting.class);
    }

    static {
        Covode.recordClassIndex(10912);
    }
}
