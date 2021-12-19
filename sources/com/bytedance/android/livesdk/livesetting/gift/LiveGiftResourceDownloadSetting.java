package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftResourceDownloadSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveGiftResourceDownloadSetting INSTANCE = new LiveGiftResourceDownloadSetting();

    private LiveGiftResourceDownloadSetting() {
    }

    static {
        Covode.recordClassIndex(10661);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftResourceDownloadSetting.class);
    }
}
