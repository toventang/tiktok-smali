package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class GuestCountDownTimeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final GuestCountDownTimeSetting INSTANCE = new GuestCountDownTimeSetting();

    private GuestCountDownTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10717);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GuestCountDownTimeSetting.class);
    }
}
