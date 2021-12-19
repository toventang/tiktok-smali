package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRoomUserInfoIconSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveRoomUserInfoIconSetting INSTANCE = new LiveRoomUserInfoIconSetting();

    private LiveRoomUserInfoIconSetting() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(10981);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRoomUserInfoIconSetting.class);
    }
}
