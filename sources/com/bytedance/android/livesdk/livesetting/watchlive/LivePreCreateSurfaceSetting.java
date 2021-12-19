package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePreCreateSurfaceSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePreCreateSurfaceSetting INSTANCE = new LivePreCreateSurfaceSetting();

    private LivePreCreateSurfaceSetting() {
    }

    static {
        Covode.recordClassIndex(11057);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePreCreateSurfaceSetting.class);
    }
}
