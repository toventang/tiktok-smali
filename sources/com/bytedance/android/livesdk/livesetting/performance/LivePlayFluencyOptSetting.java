package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePlayFluencyOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LivePlayFluencyOptSetting INSTANCE = new LivePlayFluencyOptSetting();

    private LivePlayFluencyOptSetting() {
    }

    static {
        Covode.recordClassIndex(10906);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePlayFluencyOptSetting.class);
    }
}
