package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamBitrateAdaptSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = -1;
    public static final LiveStreamBitrateAdaptSetting INSTANCE = new LiveStreamBitrateAdaptSetting();

    private LiveStreamBitrateAdaptSetting() {
    }

    static {
        Covode.recordClassIndex(10574);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStreamBitrateAdaptSetting.class);
    }
}
