package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DeeplinkWebcastWebviewAllowedListSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = new String[0];
    public static final DeeplinkWebcastWebviewAllowedListSetting INSTANCE = new DeeplinkWebcastWebviewAllowedListSetting();

    private DeeplinkWebcastWebviewAllowedListSetting() {
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(DeeplinkWebcastWebviewAllowedListSetting.class);
    }

    static {
        Covode.recordClassIndex(10808);
    }
}
