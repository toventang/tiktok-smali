package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MtCoHostReplyTimeOutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 10;
    public static final MtCoHostReplyTimeOutSetting INSTANCE = new MtCoHostReplyTimeOutSetting();

    private MtCoHostReplyTimeOutSetting() {
    }

    static {
        Covode.recordClassIndex(10766);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostReplyTimeOutSetting.class);
    }
}
