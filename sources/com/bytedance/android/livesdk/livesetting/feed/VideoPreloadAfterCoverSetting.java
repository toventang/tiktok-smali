package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class VideoPreloadAfterCoverSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final VideoPreloadAfterCoverSetting INSTANCE = new VideoPreloadAfterCoverSetting();

    private VideoPreloadAfterCoverSetting() {
    }

    static {
        Covode.recordClassIndex(10633);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(VideoPreloadAfterCoverSetting.class);
    }
}
