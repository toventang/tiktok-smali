package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveCheckQuestionTooShortSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveCheckQuestionTooShortSetting INSTANCE = new LiveCheckQuestionTooShortSetting();

    private LiveCheckQuestionTooShortSetting() {
    }

    static {
        Covode.recordClassIndex(10970);
    }

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveCheckQuestionTooShortSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
