package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSdkNobleIntroduceShowAndroidSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveSdkNobleIntroduceShowAndroidSetting INSTANCE = new LiveSdkNobleIntroduceShowAndroidSetting();

    private LiveSdkNobleIntroduceShowAndroidSetting() {
    }

    static {
        Covode.recordClassIndex(10851);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkNobleIntroduceShowAndroidSetting.class);
    }
}
