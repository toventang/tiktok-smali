package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractBattleDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 301;
    public static final LiveInteractBattleDurationSetting INSTANCE = new LiveInteractBattleDurationSetting();

    private LiveInteractBattleDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10740);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInteractBattleDurationSetting.class);
    }
}
