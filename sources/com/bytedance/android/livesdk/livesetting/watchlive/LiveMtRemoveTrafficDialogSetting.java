package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtRemoveTrafficDialogSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMtRemoveTrafficDialogSetting INSTANCE = new LiveMtRemoveTrafficDialogSetting();

    private LiveMtRemoveTrafficDialogSetting() {
    }

    static {
        Covode.recordClassIndex(11047);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMtRemoveTrafficDialogSetting.class);
    }
}
