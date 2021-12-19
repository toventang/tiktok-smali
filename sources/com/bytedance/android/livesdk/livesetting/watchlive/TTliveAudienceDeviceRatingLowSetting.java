package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveAudienceDeviceRatingLowSetting {
    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = -1.0f;
    public static final TTliveAudienceDeviceRatingLowSetting INSTANCE = new TTliveAudienceDeviceRatingLowSetting();

    private TTliveAudienceDeviceRatingLowSetting() {
    }

    static {
        Covode.recordClassIndex(11076);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(TTliveAudienceDeviceRatingLowSetting.class);
    }
}
