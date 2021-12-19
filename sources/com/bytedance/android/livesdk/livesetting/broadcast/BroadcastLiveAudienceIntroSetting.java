package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class BroadcastLiveAudienceIntroSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 1;
    public static final BroadcastLiveAudienceIntroSetting INSTANCE = new BroadcastLiveAudienceIntroSetting();

    private BroadcastLiveAudienceIntroSetting() {
    }

    static {
        Covode.recordClassIndex(10505);
    }

    public final boolean disable() {
        if (SettingsManager.INSTANCE.getIntValue(BroadcastLiveAudienceIntroSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
