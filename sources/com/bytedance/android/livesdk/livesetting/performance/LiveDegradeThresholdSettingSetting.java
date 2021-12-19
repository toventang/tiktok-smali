package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.ak;
import com.bytedance.covode.number.Covode;

public final class LiveDegradeThresholdSettingSetting {
    @Group(isDefault = true, value = "default group")
    private static final ak DEFAULT = new ak();
    public static final LiveDegradeThresholdSettingSetting INSTANCE = new LiveDegradeThresholdSettingSetting();

    private LiveDegradeThresholdSettingSetting() {
    }

    public final ak getDEFAULT() {
        return DEFAULT;
    }

    public final ak getValue() {
        ak akVar = (ak) SettingsManager.INSTANCE.getValueSafely(LiveDegradeThresholdSettingSetting.class);
        if (akVar == null) {
            return DEFAULT;
        }
        return akVar;
    }

    static {
        Covode.recordClassIndex(10886);
    }
}
