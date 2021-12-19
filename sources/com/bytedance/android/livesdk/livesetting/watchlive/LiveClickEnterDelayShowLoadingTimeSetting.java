package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveClickEnterDelayShowLoadingTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveClickEnterDelayShowLoadingTimeSetting INSTANCE = new LiveClickEnterDelayShowLoadingTimeSetting();

    private LiveClickEnterDelayShowLoadingTimeSetting() {
    }

    static {
        Covode.recordClassIndex(11033);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveClickEnterDelayShowLoadingTimeSetting.class);
    }
}
