package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDrawerVersion {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveDrawerVersion INSTANCE = new LiveDrawerVersion();

    private LiveDrawerVersion() {
    }

    static {
        Covode.recordClassIndex(10824);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDrawerVersion.class);
    }
}
