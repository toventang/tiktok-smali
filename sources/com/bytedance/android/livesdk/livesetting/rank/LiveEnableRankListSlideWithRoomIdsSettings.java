package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableRankListSlideWithRoomIdsSettings {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableRankListSlideWithRoomIdsSettings INSTANCE = new LiveEnableRankListSlideWithRoomIdsSettings();

    private LiveEnableRankListSlideWithRoomIdsSettings() {
    }

    static {
        Covode.recordClassIndex(10950);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableRankListSlideWithRoomIdsSettings.class);
    }
}
