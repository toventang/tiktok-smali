package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class HasPropBundleSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final HasPropBundleSetting INSTANCE = new HasPropBundleSetting();

    private HasPropBundleSetting() {
    }

    static {
        Covode.recordClassIndex(10817);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(HasPropBundleSetting.class);
    }
}
