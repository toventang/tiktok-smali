package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableXBridgeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveEnableXBridgeSetting INSTANCE = new LiveEnableXBridgeSetting();

    private LiveEnableXBridgeSetting() {
    }

    static {
        Covode.recordClassIndex(10692);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableXBridgeSetting.class);
    }
}
