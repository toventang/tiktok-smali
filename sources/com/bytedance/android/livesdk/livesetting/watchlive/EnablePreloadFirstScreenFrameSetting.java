package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnablePreloadFirstScreenFrameSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final EnablePreloadFirstScreenFrameSetting INSTANCE = new EnablePreloadFirstScreenFrameSetting();

    private EnablePreloadFirstScreenFrameSetting() {
    }

    static {
        Covode.recordClassIndex(11019);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnablePreloadFirstScreenFrameSetting.class);
    }
}
