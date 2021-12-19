package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSchemaSkipDeepLinkSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = new String[0];
    public static final LiveSchemaSkipDeepLinkSetting INSTANCE = new LiveSchemaSkipDeepLinkSetting();

    private LiveSchemaSkipDeepLinkSetting() {
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSchemaSkipDeepLinkSetting.class);
    }

    static {
        Covode.recordClassIndex(10702);
    }
}
