package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtInteractInviterCancelEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveMtInteractInviterCancelEnableSetting INSTANCE = new LiveMtInteractInviterCancelEnableSetting();

    private LiveMtInteractInviterCancelEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10751);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtInteractInviterCancelEnableSetting.class);
    }
}
