package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtIgnoreRoomCheckSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtIgnoreRoomCheckSetting INSTANCE = new LiveMtIgnoreRoomCheckSetting();

    private LiveMtIgnoreRoomCheckSetting() {
    }

    static {
        Covode.recordClassIndex(10924);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtIgnoreRoomCheckSetting.class);
    }
}
