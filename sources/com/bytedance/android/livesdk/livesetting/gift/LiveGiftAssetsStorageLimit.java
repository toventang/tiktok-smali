package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGiftAssetsStorageLimit {
    @Group(isDefault = true, value = "default")
    private static final a DEFAULT = new a();
    public static final LiveGiftAssetsStorageLimit INSTANCE = new LiveGiftAssetsStorageLimit();

    private LiveGiftAssetsStorageLimit() {
    }

    public final a getDEFAULT() {
        return DEFAULT;
    }

    public final long getThreshold() {
        return getConfig().f18708a;
    }

    public final boolean isCheckEnable() {
        return getConfig().f18709b;
    }

    private final a getConfig() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LiveGiftAssetsStorageLimit.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10651);
    }
}
