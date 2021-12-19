package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtCjPayTiktokRegionHostSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveMtCjPayTiktokRegionHostSetting INSTANCE = new LiveMtCjPayTiktokRegionHostSetting();

    private LiveMtCjPayTiktokRegionHostSetting() {
    }

    static {
        Covode.recordClassIndex(10838);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMtCjPayTiktokRegionHostSetting.class);
    }
}
