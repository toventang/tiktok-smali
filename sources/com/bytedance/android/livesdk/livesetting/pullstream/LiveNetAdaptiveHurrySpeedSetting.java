package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNetAdaptiveHurrySpeedSetting {
    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 1.0f;
    public static final LiveNetAdaptiveHurrySpeedSetting INSTANCE = new LiveNetAdaptiveHurrySpeedSetting();

    private LiveNetAdaptiveHurrySpeedSetting() {
    }

    static {
        Covode.recordClassIndex(10937);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveNetAdaptiveHurrySpeedSetting.class);
    }
}
