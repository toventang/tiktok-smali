package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.x;
import com.bytedance.covode.number.Covode;

public final class GiftPlayerAutoReleaseSwitchSetting {
    @Group(isDefault = true, value = "default group")
    private static final x DEFAULT = new x();
    public static final GiftPlayerAutoReleaseSwitchSetting INSTANCE = new GiftPlayerAutoReleaseSwitchSetting();

    private GiftPlayerAutoReleaseSwitchSetting() {
    }

    public final x getValue() {
        x xVar = (x) SettingsManager.INSTANCE.getValueSafely(GiftPlayerAutoReleaseSwitchSetting.class);
        if (xVar == null) {
            return DEFAULT;
        }
        return xVar;
    }

    static {
        Covode.recordClassIndex(10635);
    }
}
