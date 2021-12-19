package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class GuestPushStreamTimeAndroidSetting {
    @Group(isDefault = true, value = "default group")
    private static final double DEFAULT = 0.0d;
    public static final GuestPushStreamTimeAndroidSetting INSTANCE = new GuestPushStreamTimeAndroidSetting();

    private GuestPushStreamTimeAndroidSetting() {
    }

    static {
        Covode.recordClassIndex(10720);
    }

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue(GuestPushStreamTimeAndroidSetting.class);
    }
}
