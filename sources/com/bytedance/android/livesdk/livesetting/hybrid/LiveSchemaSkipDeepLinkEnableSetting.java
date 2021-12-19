package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSchemaSkipDeepLinkEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveSchemaSkipDeepLinkEnableSetting INSTANCE = new LiveSchemaSkipDeepLinkEnableSetting();

    private LiveSchemaSkipDeepLinkEnableSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(10701);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSchemaSkipDeepLinkEnableSetting.class);
    }
}
