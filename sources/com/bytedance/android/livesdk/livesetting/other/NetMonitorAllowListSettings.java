package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class NetMonitorAllowListSettings {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = new String[0];
    public static final NetMonitorAllowListSettings INSTANCE = new NetMonitorAllowListSettings();

    private NetMonitorAllowListSettings() {
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(NetMonitorAllowListSettings.class);
    }

    static {
        Covode.recordClassIndex(10865);
    }
}
