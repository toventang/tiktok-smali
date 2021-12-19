package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCommentMessageBadgeV2EnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveCommentMessageBadgeV2EnableSetting INSTANCE = new LiveCommentMessageBadgeV2EnableSetting();

    private LiveCommentMessageBadgeV2EnableSetting() {
    }

    static {
        Covode.recordClassIndex(10600);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCommentMessageBadgeV2EnableSetting.class);
    }
}
