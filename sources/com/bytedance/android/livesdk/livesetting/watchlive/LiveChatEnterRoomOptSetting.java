package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveChatEnterRoomOptSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveChatEnterRoomOptSetting INSTANCE = new LiveChatEnterRoomOptSetting();

    private LiveChatEnterRoomOptSetting() {
    }

    static {
        Covode.recordClassIndex(11032);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveChatEnterRoomOptSetting.class);
    }
}
