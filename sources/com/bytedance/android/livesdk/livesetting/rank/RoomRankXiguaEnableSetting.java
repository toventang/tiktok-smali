package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RoomRankXiguaEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final RoomRankXiguaEnableSetting INSTANCE = new RoomRankXiguaEnableSetting();

    private RoomRankXiguaEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10958);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(RoomRankXiguaEnableSetting.class);
    }
}
