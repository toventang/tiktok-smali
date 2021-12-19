package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftDialogUpDownSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final LiveGiftDialogUpDownSetting INSTANCE = new LiveGiftDialogUpDownSetting();

    private LiveGiftDialogUpDownSetting() {
    }

    static {
        Covode.recordClassIndex(10654);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftDialogUpDownSetting.class);
    }
}
