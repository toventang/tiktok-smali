package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamSwRoiSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveStreamSwRoiSetting INSTANCE = new LiveStreamSwRoiSetting();

    private LiveStreamSwRoiSetting() {
    }

    static {
        Covode.recordClassIndex(10581);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveStreamSwRoiSetting.class);
    }
}
