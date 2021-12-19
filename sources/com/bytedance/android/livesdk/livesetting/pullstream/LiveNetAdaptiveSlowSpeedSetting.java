package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNetAdaptiveSlowSpeedSetting {
    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 1.0f;
    public static final LiveNetAdaptiveSlowSpeedSetting INSTANCE = new LiveNetAdaptiveSlowSpeedSetting();

    private LiveNetAdaptiveSlowSpeedSetting() {
    }

    static {
        Covode.recordClassIndex(10939);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveNetAdaptiveSlowSpeedSetting.class);
    }
}
