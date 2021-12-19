package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShowLinkCrossRoomResetStacktraceSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final ShowLinkCrossRoomResetStacktraceSetting INSTANCE = new ShowLinkCrossRoomResetStacktraceSetting();

    private ShowLinkCrossRoomResetStacktraceSetting() {
    }

    static {
        Covode.recordClassIndex(10772);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ShowLinkCrossRoomResetStacktraceSetting.class);
    }
}
