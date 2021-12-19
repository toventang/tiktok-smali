package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePipoHostSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LivePipoHostSetting INSTANCE = new LivePipoHostSetting();

    private LivePipoHostSetting() {
    }

    static {
        Covode.recordClassIndex(10845);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePipoHostSetting.class);
    }
}
