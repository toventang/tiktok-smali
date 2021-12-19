package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkNewEffectPlayerSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveSdkNewEffectPlayerSetting INSTANCE = new LiveSdkNewEffectPlayerSetting();

    private LiveSdkNewEffectPlayerSetting() {
    }

    static {
        Covode.recordClassIndex(10570);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkNewEffectPlayerSetting.class);
    }
}
