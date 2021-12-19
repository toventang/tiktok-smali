package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMessageManagerV2EnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMessageManagerV2EnableSetting INSTANCE = new LiveMessageManagerV2EnableSetting();

    private LiveMessageManagerV2EnableSetting() {
    }

    static {
        Covode.recordClassIndex(10789);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageManagerV2EnableSetting.class);
    }
}
