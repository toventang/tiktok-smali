package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableX2cSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableX2cSetting INSTANCE = new LiveEnableX2cSetting();

    private LiveEnableX2cSetting() {
    }

    static {
        Covode.recordClassIndex(10890);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableX2cSetting.class);
    }
}
