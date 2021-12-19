package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveLinkmicModeSwitchOpenSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final TTliveLinkmicModeSwitchOpenSetting INSTANCE = new TTliveLinkmicModeSwitchOpenSetting();

    private TTliveLinkmicModeSwitchOpenSetting() {
    }

    static {
        Covode.recordClassIndex(10775);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TTliveLinkmicModeSwitchOpenSetting.class);
    }
}
