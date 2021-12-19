package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RoomFollowNoticeDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 180;
    public static final RoomFollowNoticeDurationSetting INSTANCE = new RoomFollowNoticeDurationSetting();

    private RoomFollowNoticeDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10872);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(RoomFollowNoticeDurationSetting.class);
    }
}
