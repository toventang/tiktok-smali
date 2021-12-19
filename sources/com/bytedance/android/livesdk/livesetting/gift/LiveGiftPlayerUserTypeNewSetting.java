package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftPlayerUserTypeNewSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 4;
    public static final LiveGiftPlayerUserTypeNewSetting INSTANCE = new LiveGiftPlayerUserTypeNewSetting();

    private LiveGiftPlayerUserTypeNewSetting() {
    }

    static {
        Covode.recordClassIndex(10659);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftPlayerUserTypeNewSetting.class);
    }
}
