package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveResumeLiveSetting {
    @Group(isDefault = true, value = "Default")
    private static final boolean DEFAULT = false;
    public static final LiveResumeLiveSetting INSTANCE = new LiveResumeLiveSetting();
    @Group("Disable resuming LIVE")
    private static final boolean RESUME_LIVE_DISABLED = false;
    @Group("Enable resuming LIVE")
    private static final boolean RESUME_LIVE_ENABLED = true;

    private LiveResumeLiveSetting() {
    }

    static {
        Covode.recordClassIndex(10569);
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveResumeLiveSetting.class);
    }

    public final boolean resumeLiveEnabled() {
        if (getValue()) {
            return true;
        }
        return false;
    }
}
