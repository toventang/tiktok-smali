package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HotLiveMessageSizeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 80;
    public static final HotLiveMessageSizeSetting INSTANCE = new HotLiveMessageSizeSetting();

    private HotLiveMessageSizeSetting() {
    }

    static {
        Covode.recordClassIndex(10784);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(HotLiveMessageSizeSetting.class);
    }
}
