package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEffectNewEngineConfigSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveEffectNewEngineConfigSetting INSTANCE = new LiveEffectNewEngineConfigSetting();

    private LiveEffectNewEngineConfigSetting() {
    }

    static {
        Covode.recordClassIndex(10825);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveEffectNewEngineConfigSetting.class);
    }
}
