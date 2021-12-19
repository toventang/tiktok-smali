package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveHashtagAudienceShowEntranceSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveHashtagAudienceShowEntranceSetting INSTANCE = new LiveHashtagAudienceShowEntranceSetting();

    private LiveHashtagAudienceShowEntranceSetting() {
    }

    static {
        Covode.recordClassIndex(10553);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHashtagAudienceShowEntranceSetting.class);
    }
}
