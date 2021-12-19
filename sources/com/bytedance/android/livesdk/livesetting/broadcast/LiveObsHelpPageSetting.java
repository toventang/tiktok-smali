package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveObsHelpPageSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "https://webcast.tiktokv.com/falcon/webcast_mt/page/obs_intro/index.html";
    public static final LiveObsHelpPageSetting INSTANCE = new LiveObsHelpPageSetting();

    private LiveObsHelpPageSetting() {
    }

    static {
        Covode.recordClassIndex(10563);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveObsHelpPageSetting.class);
    }
}
