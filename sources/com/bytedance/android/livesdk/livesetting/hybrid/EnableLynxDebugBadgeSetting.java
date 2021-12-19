package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableLynxDebugBadgeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableLynxDebugBadgeSetting INSTANCE = new EnableLynxDebugBadgeSetting();

    private EnableLynxDebugBadgeSetting() {
    }

    static {
        Covode.recordClassIndex(10683);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLynxDebugBadgeSetting.class);
    }
}
