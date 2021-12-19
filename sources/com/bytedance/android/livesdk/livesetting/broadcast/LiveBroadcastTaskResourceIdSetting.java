package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastTaskResourceIdSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 43;
    public static final LiveBroadcastTaskResourceIdSetting INSTANCE = new LiveBroadcastTaskResourceIdSetting();

    private LiveBroadcastTaskResourceIdSetting() {
    }

    static {
        Covode.recordClassIndex(10527);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastTaskResourceIdSetting.class);
    }
}
