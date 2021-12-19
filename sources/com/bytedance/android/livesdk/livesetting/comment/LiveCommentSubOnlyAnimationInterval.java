package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCommentSubOnlyAnimationInterval {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 600;
    public static final LiveCommentSubOnlyAnimationInterval INSTANCE = new LiveCommentSubOnlyAnimationInterval();

    private LiveCommentSubOnlyAnimationInterval() {
    }

    static {
        Covode.recordClassIndex(10601);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCommentSubOnlyAnimationInterval.class);
    }
}
