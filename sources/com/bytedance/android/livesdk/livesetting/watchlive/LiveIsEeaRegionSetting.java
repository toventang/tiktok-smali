package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveIsEeaRegionSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveIsEeaRegionSetting INSTANCE = new LiveIsEeaRegionSetting();

    private LiveIsEeaRegionSetting() {
    }

    static {
        Covode.recordClassIndex(11044);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveIsEeaRegionSetting.class);
    }
}
