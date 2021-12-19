package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftGuideSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveGiftGuideSetting INSTANCE = new LiveGiftGuideSetting();

    private LiveGiftGuideSetting() {
    }

    static {
        Covode.recordClassIndex(10655);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftGuideSetting.class);
    }
}
