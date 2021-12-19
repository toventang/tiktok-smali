package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastFluencyOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveBroadcastFluencyOptSetting INSTANCE = new LiveBroadcastFluencyOptSetting();

    private LiveBroadcastFluencyOptSetting() {
    }

    static {
        Covode.recordClassIndex(10884);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastFluencyOptSetting.class);
    }
}
