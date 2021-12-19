package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAudienceLinkmicLowestAgeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 16;
    public static final LiveAudienceLinkmicLowestAgeSetting INSTANCE = new LiveAudienceLinkmicLowestAgeSetting();

    private LiveAudienceLinkmicLowestAgeSetting() {
    }

    static {
        Covode.recordClassIndex(10731);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAudienceLinkmicLowestAgeSetting.class);
    }
}
