package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorScreenshotEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveAnchorScreenshotEnableSetting INSTANCE = new LiveAnchorScreenshotEnableSetting();

    private LiveAnchorScreenshotEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10520);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveAnchorScreenshotEnableSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
