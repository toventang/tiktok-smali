package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTlivePayTypeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TTlivePayTypeSetting INSTANCE = new TTlivePayTypeSetting();

    private TTlivePayTypeSetting() {
    }

    static {
        Covode.recordClassIndex(11011);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TTlivePayTypeSetting.class);
    }
}
