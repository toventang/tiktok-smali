package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEnableUseEffectDownloadCacheSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEnableUseEffectDownloadCacheSetting INSTANCE = new LiveEnableUseEffectDownloadCacheSetting();

    private LiveEnableUseEffectDownloadCacheSetting() {
    }

    static {
        Covode.recordClassIndex(10542);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableUseEffectDownloadCacheSetting.class);
    }
}
