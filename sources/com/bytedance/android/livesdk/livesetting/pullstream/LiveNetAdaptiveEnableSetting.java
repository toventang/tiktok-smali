package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNetAdaptiveEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveNetAdaptiveEnableSetting INSTANCE = new LiveNetAdaptiveEnableSetting();

    private LiveNetAdaptiveEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10936);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNetAdaptiveEnableSetting.class);
    }
}
