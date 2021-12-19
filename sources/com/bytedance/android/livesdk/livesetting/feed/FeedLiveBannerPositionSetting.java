package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class FeedLiveBannerPositionSetting {
    @Group(isDefault = true, value = "0:top")
    public static final int DEFAULT = 0;
    public static final FeedLiveBannerPositionSetting INSTANCE = new FeedLiveBannerPositionSetting();
    @Group("1:middle")
    public static final int v1 = 1;

    private FeedLiveBannerPositionSetting() {
    }

    static {
        Covode.recordClassIndex(10617);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FeedLiveBannerPositionSetting.class);
    }
}
