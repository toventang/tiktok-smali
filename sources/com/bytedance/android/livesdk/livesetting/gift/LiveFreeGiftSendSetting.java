package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFreeGiftSendSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveFreeGiftSendSetting INSTANCE = new LiveFreeGiftSendSetting();

    private LiveFreeGiftSendSetting() {
    }

    static {
        Covode.recordClassIndex(10650);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFreeGiftSendSetting.class);
    }
}
