package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractAudienceTimeOutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 20;
    public static final LiveInteractAudienceTimeOutSetting INSTANCE = new LiveInteractAudienceTimeOutSetting();

    private LiveInteractAudienceTimeOutSetting() {
    }

    static {
        Covode.recordClassIndex(10738);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractAudienceTimeOutSetting.class);
    }
}
