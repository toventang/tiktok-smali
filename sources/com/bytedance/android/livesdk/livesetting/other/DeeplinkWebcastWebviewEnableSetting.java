package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DeeplinkWebcastWebviewEnableSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final DeeplinkWebcastWebviewEnableSetting INSTANCE = new DeeplinkWebcastWebviewEnableSetting();

    private DeeplinkWebcastWebviewEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10809);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(DeeplinkWebcastWebviewEnableSetting.class);
    }
}
