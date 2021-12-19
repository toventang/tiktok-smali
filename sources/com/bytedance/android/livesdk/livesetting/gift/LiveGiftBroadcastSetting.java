package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftBroadcastSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveGiftBroadcastSetting INSTANCE = new LiveGiftBroadcastSetting();

    private LiveGiftBroadcastSetting() {
    }

    static {
        Covode.recordClassIndex(10653);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftBroadcastSetting.class);
    }
}
