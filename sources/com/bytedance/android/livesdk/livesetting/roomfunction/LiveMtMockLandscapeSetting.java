package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtMockLandscapeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtMockLandscapeSetting INSTANCE = new LiveMtMockLandscapeSetting();

    private LiveMtMockLandscapeSetting() {
    }

    static {
        Covode.recordClassIndex(10975);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtMockLandscapeSetting.class);
    }
}
