package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveAnchorInviteGuestLinkmicSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveAnchorInviteGuestLinkmicSetting INSTANCE = new LiveAnchorInviteGuestLinkmicSetting();

    private LiveAnchorInviteGuestLinkmicSetting() {
    }

    static {
        Covode.recordClassIndex(10727);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnchorInviteGuestLinkmicSetting.class);
    }
}
