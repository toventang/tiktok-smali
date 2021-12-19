package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveIsLoadGiftAfterFeedEndSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveIsLoadGiftAfterFeedEndSetting INSTANCE = new LiveIsLoadGiftAfterFeedEndSetting();

    private LiveIsLoadGiftAfterFeedEndSetting() {
    }

    static {
        Covode.recordClassIndex(10629);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveIsLoadGiftAfterFeedEndSetting.class);
    }
}
