package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkWarningTagDelayEndDurationSetting {
    @Group(isDefault = true, value = "default group")
    public static final double DEFAULT = 0.01d;
    public static final LiveSdkWarningTagDelayEndDurationSetting INSTANCE = new LiveSdkWarningTagDelayEndDurationSetting();

    private LiveSdkWarningTagDelayEndDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10852);
    }

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue(LiveSdkWarningTagDelayEndDurationSetting.class);
    }
}
