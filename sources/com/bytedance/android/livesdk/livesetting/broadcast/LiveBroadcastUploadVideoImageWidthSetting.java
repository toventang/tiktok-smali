package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastUploadVideoImageWidthSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 360;
    public static final LiveBroadcastUploadVideoImageWidthSetting INSTANCE = new LiveBroadcastUploadVideoImageWidthSetting();

    private LiveBroadcastUploadVideoImageWidthSetting() {
    }

    static {
        Covode.recordClassIndex(10532);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageWidthSetting.class);
    }
}
