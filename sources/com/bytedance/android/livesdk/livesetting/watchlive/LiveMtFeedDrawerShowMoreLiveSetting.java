package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtFeedDrawerShowMoreLiveSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMtFeedDrawerShowMoreLiveSetting INSTANCE = new LiveMtFeedDrawerShowMoreLiveSetting();

    private LiveMtFeedDrawerShowMoreLiveSetting() {
    }

    static {
        Covode.recordClassIndex(11045);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtFeedDrawerShowMoreLiveSetting.class);
    }
}
