package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDrawPreEnterRoom {
    @Group(isDefault = true, value = "default")
    private static final boolean DEFAULT = false;
    public static final LiveDrawPreEnterRoom INSTANCE = new LiveDrawPreEnterRoom();
    @Group("v1")
    public static final boolean enableValue = true;

    private LiveDrawPreEnterRoom() {
    }

    static {
        Covode.recordClassIndex(11034);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveDrawPreEnterRoom.class)) {
            return true;
        }
        return false;
    }
}
