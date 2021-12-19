package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCoHostInviteePanelDismissSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveCoHostInviteePanelDismissSetting INSTANCE = new LiveCoHostInviteePanelDismissSetting();

    private LiveCoHostInviteePanelDismissSetting() {
    }

    static {
        Covode.recordClassIndex(10733);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostInviteePanelDismissSetting.class);
    }
}
