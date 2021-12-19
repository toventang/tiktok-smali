package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCommentEmoteInputMaxCount {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 4;
    public static final LiveCommentEmoteInputMaxCount INSTANCE = new LiveCommentEmoteInputMaxCount();

    private LiveCommentEmoteInputMaxCount() {
    }

    static {
        Covode.recordClassIndex(10598);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCommentEmoteInputMaxCount.class);
    }
}
