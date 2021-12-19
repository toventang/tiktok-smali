package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInteractSocialLiveFrameTimeOutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 60;
    public static final LiveInteractSocialLiveFrameTimeOutSetting INSTANCE = new LiveInteractSocialLiveFrameTimeOutSetting();

    private LiveInteractSocialLiveFrameTimeOutSetting() {
    }

    static {
        Covode.recordClassIndex(10745);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractSocialLiveFrameTimeOutSetting.class);
    }
}
