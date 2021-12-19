package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ForceJsPermissionSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = -1;
    public static final ForceJsPermissionSetting INSTANCE = new ForceJsPermissionSetting();

    private ForceJsPermissionSetting() {
    }

    static {
        Covode.recordClassIndex(10686);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ForceJsPermissionSetting.class);
    }
}
