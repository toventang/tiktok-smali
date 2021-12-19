package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveBroadcastUploadVideoImageCompressRateSetting {
    @Group(isDefault = true, value = "default group")
    private static final float DEFAULT = 0.4f;
    public static final LiveBroadcastUploadVideoImageCompressRateSetting INSTANCE = new LiveBroadcastUploadVideoImageCompressRateSetting();

    private LiveBroadcastUploadVideoImageCompressRateSetting() {
    }

    static {
        Covode.recordClassIndex(10528);
    }

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveBroadcastUploadVideoImageCompressRateSetting.class);
    }
}
