package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.covode.number.Covode;

public final class LiveRandomLinkmicSetting {
    @Group(isDefault = true, value = "default group")
    private static final RandomLinkMicSetting DEFAULT = new RandomLinkMicSetting();
    public static final LiveRandomLinkmicSetting INSTANCE = new LiveRandomLinkmicSetting();

    private LiveRandomLinkmicSetting() {
    }

    public final RandomLinkMicSetting getDEFAULT() {
        return DEFAULT;
    }

    public final RandomLinkMicSetting getValue() {
        RandomLinkMicSetting randomLinkMicSetting = (RandomLinkMicSetting) SettingsManager.INSTANCE.getValueSafely(LiveRandomLinkmicSetting.class);
        if (randomLinkMicSetting == null) {
            return DEFAULT;
        }
        return randomLinkMicSetting;
    }

    static {
        Covode.recordClassIndex(10757);
    }
}
