package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBattleContributeListLynxUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveBattleContributeListLynxUrlSetting INSTANCE = new LiveBattleContributeListLynxUrlSetting();

    private LiveBattleContributeListLynxUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10689);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveBattleContributeListLynxUrlSetting.class);
    }
}
