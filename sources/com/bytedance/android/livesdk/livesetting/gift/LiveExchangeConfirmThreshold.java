package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveExchangeConfirmThreshold {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 50000;
    public static final LiveExchangeConfirmThreshold INSTANCE = new LiveExchangeConfirmThreshold();

    private LiveExchangeConfirmThreshold() {
    }

    static {
        Covode.recordClassIndex(10639);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveExchangeConfirmThreshold.class);
    }
}
