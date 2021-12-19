package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class CoHostNeedWaitRtcJoinChannelSucceed {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final CoHostNeedWaitRtcJoinChannelSucceed INSTANCE = new CoHostNeedWaitRtcJoinChannelSucceed();

    private CoHostNeedWaitRtcJoinChannelSucceed() {
    }

    static {
        Covode.recordClassIndex(10778);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostNeedWaitRtcJoinChannelSucceed.class);
    }
}
