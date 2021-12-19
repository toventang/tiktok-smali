package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InteractSeiUidEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final InteractSeiUidEnableSetting INSTANCE = new InteractSeiUidEnableSetting();

    private InteractSeiUidEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10722);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(InteractSeiUidEnableSetting.class);
    }
}
