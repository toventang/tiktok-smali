package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractSocialLiveAnchorInviteTimeOutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 120;
    public static final LiveInteractSocialLiveAnchorInviteTimeOutSetting INSTANCE = new LiveInteractSocialLiveAnchorInviteTimeOutSetting();

    private LiveInteractSocialLiveAnchorInviteTimeOutSetting() {
    }

    static {
        Covode.recordClassIndex(10744);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractSocialLiveAnchorInviteTimeOutSetting.class);
    }
}
