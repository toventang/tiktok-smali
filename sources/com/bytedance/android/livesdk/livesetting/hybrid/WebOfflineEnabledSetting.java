package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class WebOfflineEnabledSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final WebOfflineEnabledSetting INSTANCE = new WebOfflineEnabledSetting();

    private WebOfflineEnabledSetting() {
    }

    static {
        Covode.recordClassIndex(10710);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WebOfflineEnabledSetting.class);
    }
}
