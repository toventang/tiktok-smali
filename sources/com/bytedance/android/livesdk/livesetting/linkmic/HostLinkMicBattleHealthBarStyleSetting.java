package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HostLinkMicBattleHealthBarStyleSetting {
    @Group(isDefault = true, value = "control_group")
    private static final boolean DEFAULT = false;
    public static final HostLinkMicBattleHealthBarStyleSetting INSTANCE = new HostLinkMicBattleHealthBarStyleSetting();
    @Group("experimental_group")
    public static final boolean NEW_STYLE = true;

    private HostLinkMicBattleHealthBarStyleSetting() {
    }

    static {
        Covode.recordClassIndex(10721);
    }

    public final boolean isNewStyle() {
        if (SettingsManager.INSTANCE.getBooleanValue(HostLinkMicBattleHealthBarStyleSetting.class)) {
            return true;
        }
        return false;
    }
}
