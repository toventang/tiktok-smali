package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSubscribeRegionEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSubscribeRegionEnableSetting INSTANCE = new LiveSubscribeRegionEnableSetting();

    private LiveSubscribeRegionEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10859);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSubscribeRegionEnableSetting.class);
    }
}
