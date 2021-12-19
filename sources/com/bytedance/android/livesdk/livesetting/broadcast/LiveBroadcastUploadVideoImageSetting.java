package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastUploadVideoImageSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveBroadcastUploadVideoImageSetting INSTANCE = new LiveBroadcastUploadVideoImageSetting();

    private LiveBroadcastUploadVideoImageSetting() {
    }

    static {
        Covode.recordClassIndex(10531);
    }

    public final boolean isDisable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageSetting.class) == 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastUploadVideoImageSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
