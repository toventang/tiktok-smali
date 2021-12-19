package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNetworkTypeModeRateSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 5;
    public static final LiveNetworkTypeModeRateSetting INSTANCE = new LiveNetworkTypeModeRateSetting();

    private LiveNetworkTypeModeRateSetting() {
    }

    static {
        Covode.recordClassIndex(10752);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNetworkTypeModeRateSetting.class);
    }
}
