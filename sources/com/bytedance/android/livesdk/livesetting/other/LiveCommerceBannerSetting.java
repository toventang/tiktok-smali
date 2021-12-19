package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.f.b;
import com.bytedance.covode.number.Covode;

public final class LiveCommerceBannerSetting {
    @Group(isDefault = true, value = "default group")
    private static final b DEFAULT = new b();
    public static final LiveCommerceBannerSetting INSTANCE = new LiveCommerceBannerSetting();

    private LiveCommerceBannerSetting() {
    }

    public final b getValue() {
        b bVar = (b) SettingsManager.INSTANCE.getValueSafely(LiveCommerceBannerSetting.class);
        if (bVar == null) {
            return DEFAULT;
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(10823);
    }
}
