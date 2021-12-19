package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMtInteractEndPageEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveMtInteractEndPageEnableSetting INSTANCE = new LiveMtInteractEndPageEnableSetting();

    private LiveMtInteractEndPageEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10750);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtInteractEndPageEnableSetting.class);
    }
}
