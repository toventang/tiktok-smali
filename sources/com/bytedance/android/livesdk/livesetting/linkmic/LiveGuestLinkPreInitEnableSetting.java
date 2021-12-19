package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGuestLinkPreInitEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveGuestLinkPreInitEnableSetting INSTANCE = new LiveGuestLinkPreInitEnableSetting();

    private LiveGuestLinkPreInitEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10737);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGuestLinkPreInitEnableSetting.class);
    }
}
