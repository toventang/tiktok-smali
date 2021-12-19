package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveForceLynxFallback {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveForceLynxFallback INSTANCE = new LiveForceLynxFallback();

    private LiveForceLynxFallback() {
    }

    static {
        Covode.recordClassIndex(10694);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveForceLynxFallback.class);
    }
}
