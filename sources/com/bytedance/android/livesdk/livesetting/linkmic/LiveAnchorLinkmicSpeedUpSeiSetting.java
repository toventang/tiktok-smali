package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorLinkmicSpeedUpSeiSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveAnchorLinkmicSpeedUpSeiSetting INSTANCE = new LiveAnchorLinkmicSpeedUpSeiSetting();

    private LiveAnchorLinkmicSpeedUpSeiSetting() {
    }

    static {
        Covode.recordClassIndex(10728);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnchorLinkmicSpeedUpSeiSetting.class);
    }
}
