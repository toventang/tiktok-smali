package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class JsbEnablePermissionCheckSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final JsbEnablePermissionCheckSetting INSTANCE = new JsbEnablePermissionCheckSetting();

    private JsbEnablePermissionCheckSetting() {
    }

    static {
        Covode.recordClassIndex(10688);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(JsbEnablePermissionCheckSetting.class);
    }
}
