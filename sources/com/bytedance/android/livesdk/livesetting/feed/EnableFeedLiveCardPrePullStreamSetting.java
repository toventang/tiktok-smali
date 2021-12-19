package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableFeedLiveCardPrePullStreamSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableFeedLiveCardPrePullStreamSetting INSTANCE = new EnableFeedLiveCardPrePullStreamSetting();

    private EnableFeedLiveCardPrePullStreamSetting() {
    }

    static {
        Covode.recordClassIndex(10613);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableFeedLiveCardPrePullStreamSetting.class);
    }
}
