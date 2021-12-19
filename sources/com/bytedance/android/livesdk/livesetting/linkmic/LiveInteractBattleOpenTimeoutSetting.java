package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractBattleOpenTimeoutSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 30;
    public static final LiveInteractBattleOpenTimeoutSetting INSTANCE = new LiveInteractBattleOpenTimeoutSetting();

    private LiveInteractBattleOpenTimeoutSetting() {
    }

    static {
        Covode.recordClassIndex(10741);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveInteractBattleOpenTimeoutSetting.class);
    }
}
