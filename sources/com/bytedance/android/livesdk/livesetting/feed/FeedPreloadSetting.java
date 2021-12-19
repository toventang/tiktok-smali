package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class FeedPreloadSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 4;
    public static final FeedPreloadSetting INSTANCE = new FeedPreloadSetting();

    private FeedPreloadSetting() {
    }

    static {
        Covode.recordClassIndex(10618);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FeedPreloadSetting.class);
    }
}
