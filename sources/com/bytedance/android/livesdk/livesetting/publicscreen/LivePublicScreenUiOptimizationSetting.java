package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePublicScreenUiOptimizationSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LivePublicScreenUiOptimizationSetting INSTANCE = new LivePublicScreenUiOptimizationSetting();

    private LivePublicScreenUiOptimizationSetting() {
    }

    static {
        Covode.recordClassIndex(10927);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenUiOptimizationSetting.class);
    }
}
