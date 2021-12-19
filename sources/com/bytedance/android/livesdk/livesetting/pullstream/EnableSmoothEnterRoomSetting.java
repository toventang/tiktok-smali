package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableSmoothEnterRoomSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableSmoothEnterRoomSetting INSTANCE = new EnableSmoothEnterRoomSetting();

    private EnableSmoothEnterRoomSetting() {
    }

    static {
        Covode.recordClassIndex(10932);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableSmoothEnterRoomSetting.class);
    }
}
