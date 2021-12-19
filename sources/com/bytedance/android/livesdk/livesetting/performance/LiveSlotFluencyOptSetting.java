package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSlotFluencyOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveSlotFluencyOptSetting INSTANCE = new LiveSlotFluencyOptSetting();

    private LiveSlotFluencyOptSetting() {
    }

    static {
        Covode.recordClassIndex(10910);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSlotFluencyOptSetting.class);
    }
}
