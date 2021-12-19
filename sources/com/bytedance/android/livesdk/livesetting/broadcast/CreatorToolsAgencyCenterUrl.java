package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class CreatorToolsAgencyCenterUrl {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final CreatorToolsAgencyCenterUrl INSTANCE = new CreatorToolsAgencyCenterUrl();

    private CreatorToolsAgencyCenterUrl() {
    }

    static {
        Covode.recordClassIndex(10510);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(CreatorToolsAgencyCenterUrl.class);
    }
}
