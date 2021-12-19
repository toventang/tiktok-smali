package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveWsMessageDecodeUploadLarkCloudSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveWsMessageDecodeUploadLarkCloudSetting INSTANCE = new LiveWsMessageDecodeUploadLarkCloudSetting();

    private LiveWsMessageDecodeUploadLarkCloudSetting() {
    }

    static {
        Covode.recordClassIndex(10799);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWsMessageDecodeUploadLarkCloudSetting.class);
    }
}
