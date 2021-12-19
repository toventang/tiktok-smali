package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableEnterRoomOptFromLiveAudienceEndSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final EnableEnterRoomOptFromLiveAudienceEndSetting INSTANCE = new EnableEnterRoomOptFromLiveAudienceEndSetting();

    private EnableEnterRoomOptFromLiveAudienceEndSetting() {
    }

    static {
        Covode.recordClassIndex(11017);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableEnterRoomOptFromLiveAudienceEndSetting.class);
    }
}
