package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveIntroLynxUrl {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveIntroLynxUrl INSTANCE = new LiveIntroLynxUrl();

    private LiveIntroLynxUrl() {
    }

    static {
        Covode.recordClassIndex(10555);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveIntroLynxUrl.class);
    }
}
