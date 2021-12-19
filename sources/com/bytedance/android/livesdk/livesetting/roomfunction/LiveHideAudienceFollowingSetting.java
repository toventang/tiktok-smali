package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHideAudienceFollowingSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveHideAudienceFollowingSetting INSTANCE = new LiveHideAudienceFollowingSetting();

    private LiveHideAudienceFollowingSetting() {
    }

    static {
        Covode.recordClassIndex(10972);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHideAudienceFollowingSetting.class);
    }
}
