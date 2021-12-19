package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFixCheckPluginErrorSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveFixCheckPluginErrorSetting INSTANCE = new LiveFixCheckPluginErrorSetting();

    private LiveFixCheckPluginErrorSetting() {
    }

    static {
        Covode.recordClassIndex(10736);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFixCheckPluginErrorSetting.class);
    }
}
