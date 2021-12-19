package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSendGiftEnterFromParamSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveSendGiftEnterFromParamSetting INSTANCE = new LiveSendGiftEnterFromParamSetting();

    private LiveSendGiftEnterFromParamSetting() {
    }

    static {
        Covode.recordClassIndex(10672);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSendGiftEnterFromParamSetting.class);
    }
}
