package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePrefetchRoomInfoEveryTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePrefetchRoomInfoEveryTimeSetting INSTANCE = new LivePrefetchRoomInfoEveryTimeSetting();

    private LivePrefetchRoomInfoEveryTimeSetting() {
    }

    static {
        Covode.recordClassIndex(11058);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePrefetchRoomInfoEveryTimeSetting.class);
    }
}
