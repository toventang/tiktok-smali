package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHourlyRankQueryEntranceDelaySetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 3000;
    public static final LiveHourlyRankQueryEntranceDelaySetting INSTANCE = new LiveHourlyRankQueryEntranceDelaySetting();

    private LiveHourlyRankQueryEntranceDelaySetting() {
    }

    static {
        Covode.recordClassIndex(10952);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHourlyRankQueryEntranceDelaySetting.class);
    }
}
