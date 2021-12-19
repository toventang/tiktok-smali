package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOptBroadcastStartSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveOptBroadcastStartSetting INSTANCE = new LiveOptBroadcastStartSetting();

    private LiveOptBroadcastStartSetting() {
    }

    static {
        Covode.recordClassIndex(10564);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOptBroadcastStartSetting.class);
    }
}
