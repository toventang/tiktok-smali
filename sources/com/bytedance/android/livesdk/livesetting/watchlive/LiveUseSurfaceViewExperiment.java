package com.bytedance.android.livesdk.livesetting.watchlive;

import android.os.Build;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveUseSurfaceViewExperiment {
    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveUseSurfaceViewExperiment INSTANCE = new LiveUseSurfaceViewExperiment();
    @Group("v1")
    public static final boolean enableValue = true;

    private LiveUseSurfaceViewExperiment() {
    }

    static {
        Covode.recordClassIndex(11065);
    }

    public final boolean isEnable() {
        if (!SettingsManager.INSTANCE.getBooleanValue(LiveUseSurfaceViewExperiment.class) || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return true;
    }
}
