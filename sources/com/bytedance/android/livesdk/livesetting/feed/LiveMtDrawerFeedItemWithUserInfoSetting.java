package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtDrawerFeedItemWithUserInfoSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveMtDrawerFeedItemWithUserInfoSetting INSTANCE = new LiveMtDrawerFeedItemWithUserInfoSetting();

    private LiveMtDrawerFeedItemWithUserInfoSetting() {
    }

    static {
        Covode.recordClassIndex(10630);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtDrawerFeedItemWithUserInfoSetting.class);
    }
}
