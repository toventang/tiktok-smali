package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PayMethodsDisabledAlertSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final PayMethodsDisabledAlertSetting INSTANCE = new PayMethodsDisabledAlertSetting();

    private PayMethodsDisabledAlertSetting() {
    }

    static {
        Covode.recordClassIndex(10869);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(PayMethodsDisabledAlertSetting.class);
    }
}
