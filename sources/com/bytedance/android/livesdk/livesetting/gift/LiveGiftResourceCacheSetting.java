package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftResourceCacheSetting {
    @Group(isDefault = true, value = "default group")
    private static final long DEFAULT = 0;
    public static final LiveGiftResourceCacheSetting INSTANCE = new LiveGiftResourceCacheSetting();

    private LiveGiftResourceCacheSetting() {
    }

    static {
        Covode.recordClassIndex(10660);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveGiftResourceCacheSetting.class);
    }
}
