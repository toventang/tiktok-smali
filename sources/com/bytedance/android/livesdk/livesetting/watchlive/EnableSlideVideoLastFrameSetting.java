package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableSlideVideoLastFrameSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSlideVideoLastFrameSetting INSTANCE = new EnableSlideVideoLastFrameSetting();

    private EnableSlideVideoLastFrameSetting() {
    }

    static {
        Covode.recordClassIndex(11023);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSlideVideoLastFrameSetting.class);
    }
}
