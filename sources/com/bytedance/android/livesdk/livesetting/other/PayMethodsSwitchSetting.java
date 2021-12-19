package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PayMethodsSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final PayMethodsSwitchSetting INSTANCE = new PayMethodsSwitchSetting();

    private PayMethodsSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(10870);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PayMethodsSwitchSetting.class);
    }
}
