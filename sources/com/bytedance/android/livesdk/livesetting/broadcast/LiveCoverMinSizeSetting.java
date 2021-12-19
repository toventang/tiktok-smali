package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCoverMinSizeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 250;
    public static final LiveCoverMinSizeSetting INSTANCE = new LiveCoverMinSizeSetting();

    private LiveCoverMinSizeSetting() {
    }

    static {
        Covode.recordClassIndex(10536);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoverMinSizeSetting.class);
    }
}
