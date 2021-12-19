package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnterDelayShowLoadingTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 200;
    public static final LiveEnterDelayShowLoadingTimeSetting INSTANCE = new LiveEnterDelayShowLoadingTimeSetting();

    private LiveEnterDelayShowLoadingTimeSetting() {
    }

    static {
        Covode.recordClassIndex(11037);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEnterDelayShowLoadingTimeSetting.class);
    }
}
