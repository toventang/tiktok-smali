package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MtCoHostReceiveInviteMessageTimeOutSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 15;
    public static final MtCoHostReceiveInviteMessageTimeOutSetting INSTANCE = new MtCoHostReceiveInviteMessageTimeOutSetting();

    private MtCoHostReceiveInviteMessageTimeOutSetting() {
    }

    static {
        Covode.recordClassIndex(10765);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostReceiveInviteMessageTimeOutSetting.class);
    }
}
