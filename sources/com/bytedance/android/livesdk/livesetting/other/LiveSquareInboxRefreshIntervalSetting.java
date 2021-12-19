package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSquareInboxRefreshIntervalSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 300;
    public static final LiveSquareInboxRefreshIntervalSetting INSTANCE = new LiveSquareInboxRefreshIntervalSetting();

    private LiveSquareInboxRefreshIntervalSetting() {
    }

    static {
        Covode.recordClassIndex(10857);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSquareInboxRefreshIntervalSetting.class);
    }
}
