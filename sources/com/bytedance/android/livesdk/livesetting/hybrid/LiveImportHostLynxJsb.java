package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveImportHostLynxJsb {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveImportHostLynxJsb INSTANCE = new LiveImportHostLynxJsb();

    private LiveImportHostLynxJsb() {
    }

    static {
        Covode.recordClassIndex(10698);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveImportHostLynxJsb.class);
    }
}
