package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShowNewContainerLabel {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final ShowNewContainerLabel INSTANCE = new ShowNewContainerLabel();

    private ShowNewContainerLabel() {
    }

    static {
        Covode.recordClassIndex(10706);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ShowNewContainerLabel.class);
    }
}
