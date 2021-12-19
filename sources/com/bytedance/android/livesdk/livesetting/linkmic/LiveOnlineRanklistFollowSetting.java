package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOnlineRanklistFollowSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveOnlineRanklistFollowSetting INSTANCE = new LiveOnlineRanklistFollowSetting();

    private LiveOnlineRanklistFollowSetting() {
    }

    static {
        Covode.recordClassIndex(10754);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOnlineRanklistFollowSetting.class);
    }
}
