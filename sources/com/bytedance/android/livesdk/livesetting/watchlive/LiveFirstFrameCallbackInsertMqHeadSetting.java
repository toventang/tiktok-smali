package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFirstFrameCallbackInsertMqHeadSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFirstFrameCallbackInsertMqHeadSetting INSTANCE = new LiveFirstFrameCallbackInsertMqHeadSetting();

    private LiveFirstFrameCallbackInsertMqHeadSetting() {
    }

    static {
        Covode.recordClassIndex(11042);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFirstFrameCallbackInsertMqHeadSetting.class);
    }
}
