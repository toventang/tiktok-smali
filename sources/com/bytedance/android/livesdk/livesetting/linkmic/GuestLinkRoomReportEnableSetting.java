package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class GuestLinkRoomReportEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final GuestLinkRoomReportEnableSetting INSTANCE = new GuestLinkRoomReportEnableSetting();

    private GuestLinkRoomReportEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10718);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GuestLinkRoomReportEnableSetting.class);
    }
}
