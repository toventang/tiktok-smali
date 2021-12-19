package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ChijiIsOpenSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final ChijiIsOpenSetting INSTANCE = new ChijiIsOpenSetting();

    private ChijiIsOpenSetting() {
    }

    static {
        Covode.recordClassIndex(10806);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ChijiIsOpenSetting.class);
    }
}
