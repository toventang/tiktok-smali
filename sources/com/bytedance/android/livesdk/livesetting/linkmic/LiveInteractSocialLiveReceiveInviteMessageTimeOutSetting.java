package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractSocialLiveReceiveInviteMessageTimeOutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 55;
    public static final LiveInteractSocialLiveReceiveInviteMessageTimeOutSetting INSTANCE = new LiveInteractSocialLiveReceiveInviteMessageTimeOutSetting();

    private LiveInteractSocialLiveReceiveInviteMessageTimeOutSetting() {
    }

    static {
        Covode.recordClassIndex(10748);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractSocialLiveReceiveInviteMessageTimeOutSetting.class);
    }
}
