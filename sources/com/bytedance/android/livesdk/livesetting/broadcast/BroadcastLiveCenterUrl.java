package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class BroadcastLiveCenterUrl {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final BroadcastLiveCenterUrl INSTANCE = new BroadcastLiveCenterUrl();

    private BroadcastLiveCenterUrl() {
    }

    static {
        Covode.recordClassIndex(10507);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(BroadcastLiveCenterUrl.class);
    }
}
