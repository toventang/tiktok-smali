package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMessageForceHttpSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMessageForceHttpSetting INSTANCE = new LiveMessageForceHttpSetting();

    private LiveMessageForceHttpSetting() {
    }

    static {
        Covode.recordClassIndex(10787);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageForceHttpSetting.class);
    }
}
