package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorNetworkMonitorDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 20;
    public static final LiveAnchorNetworkMonitorDurationSetting INSTANCE = new LiveAnchorNetworkMonitorDurationSetting();

    private LiveAnchorNetworkMonitorDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10518);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorNetworkMonitorDurationSetting.class);
    }
}
