package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastFluencyOptSettingV2 {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveBroadcastFluencyOptSettingV2 INSTANCE = new LiveBroadcastFluencyOptSettingV2();

    private LiveBroadcastFluencyOptSettingV2() {
    }

    static {
        Covode.recordClassIndex(10885);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastFluencyOptSettingV2.class);
    }
}
