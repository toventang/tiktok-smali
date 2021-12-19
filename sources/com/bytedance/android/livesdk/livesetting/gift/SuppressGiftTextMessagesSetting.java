package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class SuppressGiftTextMessagesSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final SuppressGiftTextMessagesSetting INSTANCE = new SuppressGiftTextMessagesSetting();

    private SuppressGiftTextMessagesSetting() {
    }

    static {
        Covode.recordClassIndex(10676);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SuppressGiftTextMessagesSetting.class);
    }
}
