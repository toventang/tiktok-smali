package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractBattlePunishDurationSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 181;
    public static final LiveInteractBattlePunishDurationSetting INSTANCE = new LiveInteractBattlePunishDurationSetting();

    private LiveInteractBattlePunishDurationSetting() {
    }

    static {
        Covode.recordClassIndex(10742);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInteractBattlePunishDurationSetting.class);
    }
}
