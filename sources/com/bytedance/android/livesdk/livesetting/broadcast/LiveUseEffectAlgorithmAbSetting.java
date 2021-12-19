package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveUseEffectAlgorithmAbSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveUseEffectAlgorithmAbSetting INSTANCE = new LiveUseEffectAlgorithmAbSetting();

    private LiveUseEffectAlgorithmAbSetting() {
    }

    static {
        Covode.recordClassIndex(10584);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUseEffectAlgorithmAbSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
