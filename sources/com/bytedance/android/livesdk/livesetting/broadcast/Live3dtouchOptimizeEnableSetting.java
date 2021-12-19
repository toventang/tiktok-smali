package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class Live3dtouchOptimizeEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final Live3dtouchOptimizeEnableSetting INSTANCE = new Live3dtouchOptimizeEnableSetting();

    private Live3dtouchOptimizeEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10516);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(Live3dtouchOptimizeEnableSetting.class);
    }
}
