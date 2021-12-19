package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNtpServerUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveNtpServerUrlSetting INSTANCE = new LiveNtpServerUrlSetting();

    private LiveNtpServerUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10978);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveNtpServerUrlSetting.class);
    }
}
