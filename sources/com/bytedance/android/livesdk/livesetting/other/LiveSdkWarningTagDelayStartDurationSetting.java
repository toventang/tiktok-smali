package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkWarningTagDelayStartDurationSetting {
    @Group(isDefault = true, value = "default group")
    public static final double DEFAULT = 4.0d;
    public static final LiveSdkWarningTagDelayStartDurationSetting INSTANCE = new LiveSdkWarningTagDelayStartDurationSetting();

    private LiveSdkWarningTagDelayStartDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10853);
    }

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue(LiveSdkWarningTagDelayStartDurationSetting.class);
    }
}
