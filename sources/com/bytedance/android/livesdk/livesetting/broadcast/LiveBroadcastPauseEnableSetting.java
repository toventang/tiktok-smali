package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastPauseEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveBroadcastPauseEnableSetting INSTANCE = new LiveBroadcastPauseEnableSetting();

    private LiveBroadcastPauseEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10525);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastPauseEnableSetting.class);
    }
}
