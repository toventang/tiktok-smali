package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableEffectNewEngineSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectNewEngineSetting INSTANCE = new LiveEnableEffectNewEngineSetting();

    private LiveEnableEffectNewEngineSetting() {
    }

    static {
        Covode.recordClassIndex(10826);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableEffectNewEngineSetting.class);
    }
}
