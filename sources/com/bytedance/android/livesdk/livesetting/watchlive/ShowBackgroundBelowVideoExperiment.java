package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShowBackgroundBelowVideoExperiment {
    @Group(isDefault = true, value = "default")
    private static final boolean DEFAULT = false;
    public static final ShowBackgroundBelowVideoExperiment INSTANCE = new ShowBackgroundBelowVideoExperiment();
    @Group("v1")
    public static final boolean enableValue = true;

    private ShowBackgroundBelowVideoExperiment() {
    }

    static {
        Covode.recordClassIndex(11075);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(ShowBackgroundBelowVideoExperiment.class)) {
            return true;
        }
        return false;
    }
}
