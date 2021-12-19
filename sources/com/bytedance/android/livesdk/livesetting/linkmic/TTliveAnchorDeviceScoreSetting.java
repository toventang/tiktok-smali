package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveAnchorDeviceScoreSetting {
    @Group(isDefault = true, value = "default group")
    private static final float DEFAULT = -1.0f;
    public static final TTliveAnchorDeviceScoreSetting INSTANCE = new TTliveAnchorDeviceScoreSetting();

    private TTliveAnchorDeviceScoreSetting() {
    }

    static {
        Covode.recordClassIndex(10774);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(TTliveAnchorDeviceScoreSetting.class);
    }
}
