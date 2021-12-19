package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class AudiencePingIntervalSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60;
    public static final AudiencePingIntervalSetting INSTANCE = new AudiencePingIntervalSetting();

    private AudiencePingIntervalSetting() {
    }

    static {
        Covode.recordClassIndex(11015);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(AudiencePingIntervalSetting.class);
    }
}
