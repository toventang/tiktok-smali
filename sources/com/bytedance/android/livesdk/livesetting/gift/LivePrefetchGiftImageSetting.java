package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePrefetchGiftImageSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LivePrefetchGiftImageSetting INSTANCE = new LivePrefetchGiftImageSetting();

    private LivePrefetchGiftImageSetting() {
    }

    static {
        Covode.recordClassIndex(10671);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePrefetchGiftImageSetting.class);
    }
}
