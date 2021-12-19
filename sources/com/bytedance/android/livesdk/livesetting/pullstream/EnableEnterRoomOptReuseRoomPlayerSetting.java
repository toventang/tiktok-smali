package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableEnterRoomOptReuseRoomPlayerSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final EnableEnterRoomOptReuseRoomPlayerSetting INSTANCE = new EnableEnterRoomOptReuseRoomPlayerSetting();

    private EnableEnterRoomOptReuseRoomPlayerSetting() {
    }

    static {
        Covode.recordClassIndex(10931);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableEnterRoomOptReuseRoomPlayerSetting.class);
    }
}
