package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DrawerCoverSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final DrawerCoverSetting INSTANCE = new DrawerCoverSetting();

    private DrawerCoverSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(9558);
    }

    public final boolean getValue() {
        Boolean bool = (Boolean) SettingsManager.INSTANCE.getValueSafely(DrawerCoverSetting.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return DEFAULT;
    }
}
