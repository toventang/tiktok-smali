package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHourlyRankLengthSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 99;
    public static final LiveHourlyRankLengthSetting INSTANCE = new LiveHourlyRankLengthSetting();

    private LiveHourlyRankLengthSetting() {
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHourlyRankLengthSetting.class);
    }

    static {
        Covode.recordClassIndex(10951);
    }
}
