package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDisableTimeBeforeMicRoomBeginSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 10;
    public static final LiveDisableTimeBeforeMicRoomBeginSetting INSTANCE = new LiveDisableTimeBeforeMicRoomBeginSetting();

    private LiveDisableTimeBeforeMicRoomBeginSetting() {
    }

    static {
        Covode.recordClassIndex(10734);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveDisableTimeBeforeMicRoomBeginSetting.class);
    }
}
