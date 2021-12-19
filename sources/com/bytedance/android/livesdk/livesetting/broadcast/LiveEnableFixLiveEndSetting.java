package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableFixLiveEndSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableFixLiveEndSetting INSTANCE = new LiveEnableFixLiveEndSetting();

    private LiveEnableFixLiveEndSetting() {
    }

    static {
        Covode.recordClassIndex(10539);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableFixLiveEndSetting.class);
    }
}
