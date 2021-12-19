package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePipoMonitorHostSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://mon.tiktokv.com";
    public static final LivePipoMonitorHostSetting INSTANCE = new LivePipoMonitorHostSetting();

    private LivePipoMonitorHostSetting() {
    }

    static {
        Covode.recordClassIndex(10846);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePipoMonitorHostSetting.class);
    }
}
