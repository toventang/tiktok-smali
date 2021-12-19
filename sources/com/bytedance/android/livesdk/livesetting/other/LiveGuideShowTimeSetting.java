package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGuideShowTimeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveGuideShowTimeSetting INSTANCE = new LiveGuideShowTimeSetting();

    private LiveGuideShowTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10834);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideShowTimeSetting.class);
    }
}
