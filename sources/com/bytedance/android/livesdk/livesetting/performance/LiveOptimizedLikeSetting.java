package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptimizedLikeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveOptimizedLikeSetting INSTANCE = new LiveOptimizedLikeSetting();

    private LiveOptimizedLikeSetting() {
    }

    static {
        Covode.recordClassIndex(10904);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOptimizedLikeSetting.class);
    }
}
