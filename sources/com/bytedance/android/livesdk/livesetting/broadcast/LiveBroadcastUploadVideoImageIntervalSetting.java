package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastUploadVideoImageIntervalSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 2;
    public static final LiveBroadcastUploadVideoImageIntervalSetting INSTANCE = new LiveBroadcastUploadVideoImageIntervalSetting();

    private LiveBroadcastUploadVideoImageIntervalSetting() {
    }

    static {
        Covode.recordClassIndex(10530);
    }

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveBroadcastUploadVideoImageIntervalSetting.class);
    }
}
