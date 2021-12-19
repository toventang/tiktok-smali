package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LynxDelayDestroyJSB {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LynxDelayDestroyJSB INSTANCE = new LynxDelayDestroyJSB();

    private LynxDelayDestroyJSB() {
    }

    static {
        Covode.recordClassIndex(10705);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LynxDelayDestroyJSB.class);
    }
}
