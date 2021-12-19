package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PostponeRequestBatchShareListSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 3;
    public static final PostponeRequestBatchShareListSetting INSTANCE = new PostponeRequestBatchShareListSetting();

    private PostponeRequestBatchShareListSetting() {
    }

    static {
        Covode.recordClassIndex(10989);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PostponeRequestBatchShareListSetting.class);
    }
}
