package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftIconDailyEffect {
    @Group(isDefault = true, value = "default")
    private static final boolean DEFAULT = true;
    public static final LiveGiftIconDailyEffect INSTANCE = new LiveGiftIconDailyEffect();

    private LiveGiftIconDailyEffect() {
    }

    static {
        Covode.recordClassIndex(10656);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftIconDailyEffect.class);
    }
}
