package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveForYouPageTagSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveForYouPageTagSetting INSTANCE = new LiveForYouPageTagSetting();

    private LiveForYouPageTagSetting() {
    }

    static {
        Covode.recordClassIndex(10627);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveForYouPageTagSetting.class);
    }
}
