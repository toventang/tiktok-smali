package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class UserWithAgeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final UserWithAgeSetting INSTANCE = new UserWithAgeSetting();

    private UserWithAgeSetting() {
    }

    static {
        Covode.recordClassIndex(10991);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserWithAgeSetting.class);
    }
}
