package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableFeedLiveCardReusePlayerSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableFeedLiveCardReusePlayerSetting INSTANCE = new EnableFeedLiveCardReusePlayerSetting();

    private EnableFeedLiveCardReusePlayerSetting() {
    }

    static {
        Covode.recordClassIndex(11018);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableFeedLiveCardReusePlayerSetting.class);
    }
}
