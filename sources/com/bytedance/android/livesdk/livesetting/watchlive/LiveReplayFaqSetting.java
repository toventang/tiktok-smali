package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveReplayFaqSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveReplayFaqSetting INSTANCE = new LiveReplayFaqSetting();

    private LiveReplayFaqSetting() {
    }

    static {
        Covode.recordClassIndex(11062);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveReplayFaqSetting.class);
    }
}
