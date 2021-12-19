package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractBattleContributeListUrlSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "https://webcast.tiktokv.com/falcon/webcast_mt/page/live_match/panel/index.html";
    public static final LiveInteractBattleContributeListUrlSetting INSTANCE = new LiveInteractBattleContributeListUrlSetting();

    private LiveInteractBattleContributeListUrlSetting() {
    }

    static {
        Covode.recordClassIndex(10739);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveInteractBattleContributeListUrlSetting.class);
    }
}
