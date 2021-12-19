package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RemoveOnlineFollowersSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final RemoveOnlineFollowersSetting INSTANCE = new RemoveOnlineFollowersSetting();

    private RemoveOnlineFollowersSetting() {
    }

    static {
        Covode.recordClassIndex(10587);
    }

    public final boolean show() {
        if (SettingsManager.INSTANCE.getIntValue(RemoveOnlineFollowersSetting.class) == 0) {
            return true;
        }
        return false;
    }
}
