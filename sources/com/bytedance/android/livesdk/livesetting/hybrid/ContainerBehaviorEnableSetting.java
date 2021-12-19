package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ContainerBehaviorEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final ContainerBehaviorEnableSetting INSTANCE = new ContainerBehaviorEnableSetting();

    private ContainerBehaviorEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10682);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ContainerBehaviorEnableSetting.class);
    }
}
