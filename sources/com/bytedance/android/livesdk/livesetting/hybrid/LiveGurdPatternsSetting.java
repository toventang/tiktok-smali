package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGurdPatternsSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = {".tiktokv.com/falcon/", ".akamaized.net/ies/resource/falcon/", ".tiktokcdn.com/ies/resource/falcon/"};
    public static final LiveGurdPatternsSetting INSTANCE = new LiveGurdPatternsSetting();

    private LiveGurdPatternsSetting() {
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveGurdPatternsSetting.class);
    }

    static {
        Covode.recordClassIndex(10696);
    }
}
