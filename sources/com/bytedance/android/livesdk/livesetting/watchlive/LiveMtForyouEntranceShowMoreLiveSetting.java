package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtForyouEntranceShowMoreLiveSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMtForyouEntranceShowMoreLiveSetting INSTANCE = new LiveMtForyouEntranceShowMoreLiveSetting();

    private LiveMtForyouEntranceShowMoreLiveSetting() {
    }

    static {
        Covode.recordClassIndex(11046);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtForyouEntranceShowMoreLiveSetting.class);
    }
}
