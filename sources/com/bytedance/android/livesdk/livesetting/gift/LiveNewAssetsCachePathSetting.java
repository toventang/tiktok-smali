package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveNewAssetsCachePathSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveNewAssetsCachePathSetting INSTANCE = new LiveNewAssetsCachePathSetting();

    private LiveNewAssetsCachePathSetting() {
    }

    static {
        Covode.recordClassIndex(10670);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNewAssetsCachePathSetting.class);
    }
}
