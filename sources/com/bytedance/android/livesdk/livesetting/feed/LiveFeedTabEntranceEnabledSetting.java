package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFeedTabEntranceEnabledSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveFeedTabEntranceEnabledSetting INSTANCE = new LiveFeedTabEntranceEnabledSetting();

    private LiveFeedTabEntranceEnabledSetting() {
    }

    static {
        Covode.recordClassIndex(10626);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFeedTabEntranceEnabledSetting.class);
    }
}
