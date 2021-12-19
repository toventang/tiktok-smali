package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.a;
import com.bytedance.covode.number.Covode;

public final class LiveBannerExperiment {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a(false, 1, null);
    public static final LiveBannerExperiment INSTANCE = new LiveBannerExperiment();

    private LiveBannerExperiment() {
    }

    public final a getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isNewBannerEnable() {
        return INSTANCE.getValue().getEnableNewBanner();
    }

    public final a getValue() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LiveBannerExperiment.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10495);
    }
}
