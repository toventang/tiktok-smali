package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRoomChargeTypeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveRoomChargeTypeSetting INSTANCE = new LiveRoomChargeTypeSetting();

    private LiveRoomChargeTypeSetting() {
    }

    static {
        Covode.recordClassIndex(11007);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRoomChargeTypeSetting.class);
    }
}
