package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class AdmServerCfgSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final AdmServerCfgSetting INSTANCE = new AdmServerCfgSetting();

    private AdmServerCfgSetting() {
    }

    static {
        Covode.recordClassIndex(10502);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(AdmServerCfgSetting.class);
    }
}
