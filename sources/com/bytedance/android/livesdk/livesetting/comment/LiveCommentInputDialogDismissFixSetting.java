package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCommentInputDialogDismissFixSetting {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a();
    public static final LiveCommentInputDialogDismissFixSetting INSTANCE = new LiveCommentInputDialogDismissFixSetting();

    private LiveCommentInputDialogDismissFixSetting() {
    }

    public static final a getValue() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LiveCommentInputDialogDismissFixSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10599);
    }
}
