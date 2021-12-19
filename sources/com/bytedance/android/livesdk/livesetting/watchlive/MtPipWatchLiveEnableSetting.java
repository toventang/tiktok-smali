package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MtPipWatchLiveEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MtPipWatchLiveEnableSetting INSTANCE = new MtPipWatchLiveEnableSetting();

    private MtPipWatchLiveEnableSetting() {
    }

    static {
        Covode.recordClassIndex(11067);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MtPipWatchLiveEnableSetting.class);
    }
}
