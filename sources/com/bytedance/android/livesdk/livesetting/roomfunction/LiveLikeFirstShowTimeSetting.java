package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveLikeFirstShowTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3000;
    public static final LiveLikeFirstShowTimeSetting INSTANCE = new LiveLikeFirstShowTimeSetting();

    private LiveLikeFirstShowTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10973);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveLikeFirstShowTimeSetting.class);
    }
}
