package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class CreatorToolsLiveCenterUrl {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final CreatorToolsLiveCenterUrl INSTANCE = new CreatorToolsLiveCenterUrl();

    private CreatorToolsLiveCenterUrl() {
    }

    static {
        Covode.recordClassIndex(10511);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(CreatorToolsLiveCenterUrl.class);
    }
}
