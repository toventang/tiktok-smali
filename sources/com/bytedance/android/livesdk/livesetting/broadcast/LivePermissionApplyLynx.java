package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LivePermissionApplyLynx {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LivePermissionApplyLynx INSTANCE = new LivePermissionApplyLynx();

    private LivePermissionApplyLynx() {
    }

    static {
        Covode.recordClassIndex(10566);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePermissionApplyLynx.class);
    }
}
