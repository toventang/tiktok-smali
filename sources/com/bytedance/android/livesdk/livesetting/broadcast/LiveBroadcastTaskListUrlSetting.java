package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastTaskListUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveBroadcastTaskListUrlSetting INSTANCE = new LiveBroadcastTaskListUrlSetting();

    private LiveBroadcastTaskListUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10526);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveBroadcastTaskListUrlSetting.class);
    }
}
