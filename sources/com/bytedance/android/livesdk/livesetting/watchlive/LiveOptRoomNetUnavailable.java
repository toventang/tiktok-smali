package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptRoomNetUnavailable {
    @Group(isDefault = true, value = "default")
    private static final boolean DEFAULT = false;
    public static final LiveOptRoomNetUnavailable INSTANCE = new LiveOptRoomNetUnavailable();
    @Group("v1")
    public static final boolean enableValue = true;

    private LiveOptRoomNetUnavailable() {
    }

    static {
        Covode.recordClassIndex(11051);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveOptRoomNetUnavailable.class)) {
            return true;
        }
        return false;
    }
}
