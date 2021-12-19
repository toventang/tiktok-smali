package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class VBoostEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final VBoostEnableSetting INSTANCE = new VBoostEnableSetting();

    private VBoostEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10594);
    }

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(VBoostEnableSetting.class);
    }
}
