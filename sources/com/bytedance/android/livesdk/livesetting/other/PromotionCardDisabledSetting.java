package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PromotionCardDisabledSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final PromotionCardDisabledSetting INSTANCE = new PromotionCardDisabledSetting();

    private PromotionCardDisabledSetting() {
    }

    static {
        Covode.recordClassIndex(10871);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PromotionCardDisabledSetting.class);
    }
}
