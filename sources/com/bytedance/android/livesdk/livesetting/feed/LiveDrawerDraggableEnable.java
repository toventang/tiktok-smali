package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDrawerDraggableEnable {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveDrawerDraggableEnable INSTANCE = new LiveDrawerDraggableEnable();

    private LiveDrawerDraggableEnable() {
    }

    static {
        Covode.recordClassIndex(10623);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDrawerDraggableEnable.class);
    }
}
