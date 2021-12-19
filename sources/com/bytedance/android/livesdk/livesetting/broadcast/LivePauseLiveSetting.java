package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePauseLiveSetting {
    @Group(isDefault = true, value = "Default")
    private static final boolean DEFAULT = false;
    public static final LivePauseLiveSetting INSTANCE = new LivePauseLiveSetting();
    @Group("Support Broadcast Pause Live")
    private static final boolean PAUSE_LIVE = true;

    private LivePauseLiveSetting() {
    }

    static {
        Covode.recordClassIndex(10565);
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePauseLiveSetting.class);
    }

    public final boolean pauseLiveEnabled() {
        if (getValue()) {
            return true;
        }
        return false;
    }
}
