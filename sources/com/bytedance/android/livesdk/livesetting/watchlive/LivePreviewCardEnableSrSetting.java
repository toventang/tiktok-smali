package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePreviewCardEnableSrSetting {
    @Group(isDefault = true, value = "control_group")
    public static final int DISABLE = -1;
    @Group("experimental_group")
    public static final int ENABLE = 1;
    public static final LivePreviewCardEnableSrSetting INSTANCE = new LivePreviewCardEnableSrSetting();

    private LivePreviewCardEnableSrSetting() {
    }

    static {
        Covode.recordClassIndex(11061);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LivePreviewCardEnableSrSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
