package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableDrawSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableDrawSetting INSTANCE = new LiveEnableDrawSetting();

    private LiveEnableDrawSetting() {
    }

    static {
        Covode.recordClassIndex(11036);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableDrawSetting.class);
    }
}
