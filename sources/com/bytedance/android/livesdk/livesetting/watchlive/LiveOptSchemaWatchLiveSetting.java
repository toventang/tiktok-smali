package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptSchemaWatchLiveSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveOptSchemaWatchLiveSetting INSTANCE = new LiveOptSchemaWatchLiveSetting();

    private LiveOptSchemaWatchLiveSetting() {
    }

    static {
        Covode.recordClassIndex(11052);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOptSchemaWatchLiveSetting.class);
    }
}
