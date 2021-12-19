package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveAnchorDeviceRatingHighSetting {
    @Group(isDefault = true, value = "default group")
    private static final float DEFAULT = 7.92f;
    public static final TTliveAnchorDeviceRatingHighSetting INSTANCE = new TTliveAnchorDeviceRatingHighSetting();

    private TTliveAnchorDeviceRatingHighSetting() {
    }

    static {
        Covode.recordClassIndex(10773);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(TTliveAnchorDeviceRatingHighSetting.class);
    }
}
