package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftInterfaceOptimizeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveGiftInterfaceOptimizeSetting INSTANCE = new LiveGiftInterfaceOptimizeSetting();

    private LiveGiftInterfaceOptimizeSetting() {
    }

    static {
        Covode.recordClassIndex(10657);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftInterfaceOptimizeSetting.class);
    }
}
