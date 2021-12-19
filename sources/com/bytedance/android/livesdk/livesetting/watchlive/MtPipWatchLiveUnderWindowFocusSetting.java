package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MtPipWatchLiveUnderWindowFocusSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MtPipWatchLiveUnderWindowFocusSetting INSTANCE = new MtPipWatchLiveUnderWindowFocusSetting();

    private MtPipWatchLiveUnderWindowFocusSetting() {
    }

    static {
        Covode.recordClassIndex(11068);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MtPipWatchLiveUnderWindowFocusSetting.class);
    }
}
