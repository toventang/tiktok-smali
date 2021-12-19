package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableRankListSlideWithRoomIdsFeedDrawerSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableRankListSlideWithRoomIdsFeedDrawerSettings INSTANCE = new LiveEnableRankListSlideWithRoomIdsFeedDrawerSettings();

    private LiveEnableRankListSlideWithRoomIdsFeedDrawerSettings() {
    }

    static {
        Covode.recordClassIndex(10949);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableRankListSlideWithRoomIdsFeedDrawerSettings.class);
    }
}
