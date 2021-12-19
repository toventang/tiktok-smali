package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFinishPagePushTipsDaysSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 15;
    public static final LiveFinishPagePushTipsDaysSetting INSTANCE = new LiveFinishPagePushTipsDaysSetting();

    private LiveFinishPagePushTipsDaysSetting() {
    }

    static {
        Covode.recordClassIndex(11039);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFinishPagePushTipsDaysSetting.class);
    }
}
