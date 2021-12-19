package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtEffectSettingSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveMtEffectSettingSwitchSetting INSTANCE = new LiveMtEffectSettingSwitchSetting();

    private LiveMtEffectSettingSwitchSetting() {
    }

    static {
        Covode.recordClassIndex(10560);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEffectSettingSwitchSetting.class);
    }
}
