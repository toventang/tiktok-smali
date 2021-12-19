package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class CoHostUserRtcReplyMsgSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final CoHostUserRtcReplyMsgSetting INSTANCE = new CoHostUserRtcReplyMsgSetting();

    private CoHostUserRtcReplyMsgSetting() {
    }

    static {
        Covode.recordClassIndex(10779);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostUserRtcReplyMsgSetting.class);
    }
}
