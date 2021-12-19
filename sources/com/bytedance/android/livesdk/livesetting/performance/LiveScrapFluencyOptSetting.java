package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveScrapFluencyOptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveScrapFluencyOptSetting INSTANCE = new LiveScrapFluencyOptSetting();

    private LiveScrapFluencyOptSetting() {
    }

    static {
        Covode.recordClassIndex(10908);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveScrapFluencyOptSetting.class);
    }
}
