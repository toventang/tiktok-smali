package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTLiveWebviewMonitorConfigSlardarAndroidSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final TTLiveWebviewMonitorConfigSlardarAndroidSetting INSTANCE = new TTLiveWebviewMonitorConfigSlardarAndroidSetting();

    private TTLiveWebviewMonitorConfigSlardarAndroidSetting() {
    }

    static {
        Covode.recordClassIndex(10707);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(TTLiveWebviewMonitorConfigSlardarAndroidSetting.class);
    }
}
