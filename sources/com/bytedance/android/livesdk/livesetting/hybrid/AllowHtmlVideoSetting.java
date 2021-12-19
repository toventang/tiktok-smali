package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class AllowHtmlVideoSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final AllowHtmlVideoSetting INSTANCE = new AllowHtmlVideoSetting();

    private AllowHtmlVideoSetting() {
    }

    static {
        Covode.recordClassIndex(10681);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(AllowHtmlVideoSetting.class);
    }
}
