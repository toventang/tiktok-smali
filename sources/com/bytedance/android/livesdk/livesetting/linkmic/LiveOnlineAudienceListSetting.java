package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveOnlineAudienceListSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveOnlineAudienceListSetting INSTANCE = new LiveOnlineAudienceListSetting();

    private LiveOnlineAudienceListSetting() {
    }

    static {
        Covode.recordClassIndex(10753);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOnlineAudienceListSetting.class);
    }
}
