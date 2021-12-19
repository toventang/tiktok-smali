package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableLinkLoadWidgetOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final EnableLinkLoadWidgetOptSetting INSTANCE = new EnableLinkLoadWidgetOptSetting();

    private EnableLinkLoadWidgetOptSetting() {
    }

    static {
        Covode.recordClassIndex(10716);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableLinkLoadWidgetOptSetting.class);
    }
}
