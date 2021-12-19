package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableAnchorLiveLongPressShareSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final EnableAnchorLiveLongPressShareSetting INSTANCE = new EnableAnchorLiveLongPressShareSetting();

    private EnableAnchorLiveLongPressShareSetting() {
    }

    static {
        Covode.recordClassIndex(10967);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableAnchorLiveLongPressShareSetting.class);
    }
}
