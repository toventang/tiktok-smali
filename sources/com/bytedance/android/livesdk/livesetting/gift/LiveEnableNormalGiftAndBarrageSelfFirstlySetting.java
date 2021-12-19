package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableNormalGiftAndBarrageSelfFirstlySetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableNormalGiftAndBarrageSelfFirstlySetting INSTANCE = new LiveEnableNormalGiftAndBarrageSelfFirstlySetting();

    private LiveEnableNormalGiftAndBarrageSelfFirstlySetting() {
    }

    static {
        Covode.recordClassIndex(10638);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableNormalGiftAndBarrageSelfFirstlySetting.class);
    }
}
