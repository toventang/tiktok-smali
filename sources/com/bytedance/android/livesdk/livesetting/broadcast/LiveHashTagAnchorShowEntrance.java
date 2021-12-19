package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHashTagAnchorShowEntrance {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveHashTagAnchorShowEntrance INSTANCE = new LiveHashTagAnchorShowEntrance();

    private LiveHashTagAnchorShowEntrance() {
    }

    static {
        Covode.recordClassIndex(10552);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHashTagAnchorShowEntrance.class);
    }
}
