package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableLiveLongPressShareSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final EnableLiveLongPressShareSetting INSTANCE = new EnableLiveLongPressShareSetting();

    private EnableLiveLongPressShareSetting() {
    }

    static {
        Covode.recordClassIndex(10968);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableLiveLongPressShareSetting.class);
    }
}
