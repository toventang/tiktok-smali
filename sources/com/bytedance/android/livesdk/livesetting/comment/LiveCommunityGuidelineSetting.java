package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCommunityGuidelineSetting {
    @Group(isDefault = true, value = "default group")
    private static final String DEFAULT = "";
    public static final LiveCommunityGuidelineSetting INSTANCE = new LiveCommunityGuidelineSetting();

    private LiveCommunityGuidelineSetting() {
    }

    static {
        Covode.recordClassIndex(10602);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveCommunityGuidelineSetting.class);
    }
}
