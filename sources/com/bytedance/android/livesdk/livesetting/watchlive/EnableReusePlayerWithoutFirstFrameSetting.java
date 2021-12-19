package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableReusePlayerWithoutFirstFrameSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableReusePlayerWithoutFirstFrameSetting INSTANCE = new EnableReusePlayerWithoutFirstFrameSetting();

    private EnableReusePlayerWithoutFirstFrameSetting() {
    }

    static {
        Covode.recordClassIndex(11021);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableReusePlayerWithoutFirstFrameSetting.class);
    }
}
