package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveLynxJsbReportEventSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveLynxJsbReportEventSetting INSTANCE = new LiveLynxJsbReportEventSetting();

    private LiveLynxJsbReportEventSetting() {
    }

    static {
        Covode.recordClassIndex(10700);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLynxJsbReportEventSetting.class);
    }
}
