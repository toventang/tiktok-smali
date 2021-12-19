package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSharePanelShowDislikeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveSharePanelShowDislikeSetting INSTANCE = new LiveSharePanelShowDislikeSetting();

    private LiveSharePanelShowDislikeSetting() {
    }

    static {
        Covode.recordClassIndex(10985);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSharePanelShowDislikeSetting.class);
    }
}
