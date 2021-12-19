package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RtcAbLabelSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final RtcAbLabelSetting INSTANCE = new RtcAbLabelSetting();

    private RtcAbLabelSetting() {
    }

    static {
        Covode.recordClassIndex(10770);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(RtcAbLabelSetting.class);
    }
}
