package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePlayerErrorCountSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LivePlayerErrorCountSetting INSTANCE = new LivePlayerErrorCountSetting();

    private LivePlayerErrorCountSetting() {
    }

    static {
        Covode.recordClassIndex(11055);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePlayerErrorCountSetting.class);
    }
}
