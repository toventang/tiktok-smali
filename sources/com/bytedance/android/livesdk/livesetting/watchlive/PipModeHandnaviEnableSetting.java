package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PipModeHandnaviEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PipModeHandnaviEnableSetting INSTANCE = new PipModeHandnaviEnableSetting();

    private PipModeHandnaviEnableSetting() {
    }

    static {
        Covode.recordClassIndex(11071);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PipModeHandnaviEnableSetting.class);
    }
}
