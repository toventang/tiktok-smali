package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class CanRechargeSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final CanRechargeSetting INSTANCE = new CanRechargeSetting();

    private CanRechargeSetting() {
    }

    static {
        Covode.recordClassIndex(10994);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CanRechargeSetting.class);
    }
}
