package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRechargeAgeThresholdSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 18;
    public static final LiveRechargeAgeThresholdSetting INSTANCE = new LiveRechargeAgeThresholdSetting();

    private LiveRechargeAgeThresholdSetting() {
    }

    static {
        Covode.recordClassIndex(11002);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRechargeAgeThresholdSetting.class);
    }
}
