package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGurdChannelsSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = {"webcast_activity", "webcast_mt", "tiktok_live_lynx"};
    public static final LiveGurdChannelsSetting INSTANCE = new LiveGurdChannelsSetting();

    private LiveGurdChannelsSetting() {
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveGurdChannelsSetting.class);
    }

    static {
        Covode.recordClassIndex(10695);
    }
}
