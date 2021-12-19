package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDrawerSettings {
    @Group(isDefault = true, value = "default group")
    private static final LiveDrawerConfig DEFAULT = new LiveDrawerConfig();
    public static final LiveDrawerSettings INSTANCE = new LiveDrawerSettings();

    private LiveDrawerSettings() {
    }

    public final LiveDrawerConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveDrawerConfig getValue() {
        LiveDrawerConfig liveDrawerConfig = (LiveDrawerConfig) SettingsManager.INSTANCE.getValueSafely(LiveDrawerSettings.class);
        if (liveDrawerConfig == null) {
            return DEFAULT;
        }
        return liveDrawerConfig;
    }

    static {
        Covode.recordClassIndex(9561);
    }
}
