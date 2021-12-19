package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveEndUseLynx {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveEndUseLynx INSTANCE = new LiveEndUseLynx();

    private LiveEndUseLynx() {
    }

    static {
        Covode.recordClassIndex(10693);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEndUseLynx.class);
    }
}
