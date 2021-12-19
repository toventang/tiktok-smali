package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveScrapFluencyOptSettingV2 {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveScrapFluencyOptSettingV2 INSTANCE = new LiveScrapFluencyOptSettingV2();

    private LiveScrapFluencyOptSettingV2() {
    }

    static {
        Covode.recordClassIndex(10909);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveScrapFluencyOptSettingV2.class);
    }
}
