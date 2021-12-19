package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class NetMonitorBlockListSettings {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = new String[0];
    public static final NetMonitorBlockListSettings INSTANCE = new NetMonitorBlockListSettings();

    private NetMonitorBlockListSettings() {
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(NetMonitorBlockListSettings.class);
    }

    static {
        Covode.recordClassIndex(10866);
    }
}
