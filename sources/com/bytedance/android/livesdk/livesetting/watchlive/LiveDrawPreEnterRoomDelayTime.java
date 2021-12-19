package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDrawPreEnterRoomDelayTime {
    @Group(isDefault = true, value = "default")
    private static final int DEFAULT = 200;
    public static final LiveDrawPreEnterRoomDelayTime INSTANCE = new LiveDrawPreEnterRoomDelayTime();

    private LiveDrawPreEnterRoomDelayTime() {
    }

    static {
        Covode.recordClassIndex(11035);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDrawPreEnterRoomDelayTime.class);
    }
}
