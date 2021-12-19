package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveLayoutPreloadSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveLayoutPreloadSetting INSTANCE = new LiveLayoutPreloadSetting();

    private LiveLayoutPreloadSetting() {
    }

    static {
        Covode.recordClassIndex(10898);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLayoutPreloadSetting.class);
    }
}
