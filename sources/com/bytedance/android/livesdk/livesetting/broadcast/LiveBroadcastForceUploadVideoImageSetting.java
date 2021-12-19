package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastForceUploadVideoImageSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final LiveBroadcastForceUploadVideoImageSetting INSTANCE = new LiveBroadcastForceUploadVideoImageSetting();

    private LiveBroadcastForceUploadVideoImageSetting() {
    }

    static {
        Covode.recordClassIndex(10524);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastForceUploadVideoImageSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
