package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkFastOpenDisableSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkFastOpenDisableSetting INSTANCE = new LiveSdkFastOpenDisableSetting();

    private LiveSdkFastOpenDisableSetting() {
    }

    static {
        Covode.recordClassIndex(10942);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkFastOpenDisableSetting.class);
    }
}
