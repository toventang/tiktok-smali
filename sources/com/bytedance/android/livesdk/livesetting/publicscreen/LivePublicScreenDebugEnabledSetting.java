package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePublicScreenDebugEnabledSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LivePublicScreenDebugEnabledSetting INSTANCE = new LivePublicScreenDebugEnabledSetting();

    private LivePublicScreenDebugEnabledSetting() {
    }

    static {
        Covode.recordClassIndex(10926);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenDebugEnabledSetting.class);
    }
}
