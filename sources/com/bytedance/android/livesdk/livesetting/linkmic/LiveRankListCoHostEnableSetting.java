package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRankListCoHostEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveRankListCoHostEnableSetting INSTANCE = new LiveRankListCoHostEnableSetting();

    private LiveRankListCoHostEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10758);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRankListCoHostEnableSetting.class);
    }
}
