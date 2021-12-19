package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamEnableUrlListSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveStreamEnableUrlListSetting INSTANCE = new LiveStreamEnableUrlListSetting();

    private LiveStreamEnableUrlListSetting() {
    }

    static {
        Covode.recordClassIndex(10577);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveStreamEnableUrlListSetting.class);
    }
}
