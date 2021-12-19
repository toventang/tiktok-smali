package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableSlideFinishSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final EnableSlideFinishSetting INSTANCE = new EnableSlideFinishSetting();

    private EnableSlideFinishSetting() {
    }

    static {
        Covode.recordClassIndex(10813);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSlideFinishSetting.class);
    }
}
