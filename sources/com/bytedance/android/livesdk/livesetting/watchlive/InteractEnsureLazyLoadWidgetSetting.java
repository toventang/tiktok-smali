package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InteractEnsureLazyLoadWidgetSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final InteractEnsureLazyLoadWidgetSetting INSTANCE = new InteractEnsureLazyLoadWidgetSetting();

    private InteractEnsureLazyLoadWidgetSetting() {
    }

    static {
        Covode.recordClassIndex(11029);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(InteractEnsureLazyLoadWidgetSetting.class);
    }
}
