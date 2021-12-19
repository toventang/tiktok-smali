package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveUseNewAudioCodecSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveUseNewAudioCodecSetting INSTANCE = new LiveUseNewAudioCodecSetting();

    private LiveUseNewAudioCodecSetting() {
    }

    static {
        Covode.recordClassIndex(10585);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUseNewAudioCodecSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
