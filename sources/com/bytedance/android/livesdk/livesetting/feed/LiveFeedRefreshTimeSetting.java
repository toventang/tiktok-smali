package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFeedRefreshTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 180;
    public static final LiveFeedRefreshTimeSetting INSTANCE = new LiveFeedRefreshTimeSetting();

    private LiveFeedRefreshTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10625);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFeedRefreshTimeSetting.class);
    }
}
