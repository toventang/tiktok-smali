package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveStartGiftLocalDefaultSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final TTliveStartGiftLocalDefaultSetting INSTANCE = new TTliveStartGiftLocalDefaultSetting();

    private TTliveStartGiftLocalDefaultSetting() {
    }

    static {
        Covode.recordClassIndex(10678);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TTliveStartGiftLocalDefaultSetting.class);
    }
}
