package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftFluencyOptSettingV2 {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveGiftFluencyOptSettingV2 INSTANCE = new LiveGiftFluencyOptSettingV2();

    private LiveGiftFluencyOptSettingV2() {
    }

    static {
        Covode.recordClassIndex(10896);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftFluencyOptSettingV2.class);
    }
}
