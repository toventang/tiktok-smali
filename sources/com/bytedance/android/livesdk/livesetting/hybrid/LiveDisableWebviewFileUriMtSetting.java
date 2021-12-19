package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveDisableWebviewFileUriMtSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveDisableWebviewFileUriMtSetting INSTANCE = new LiveDisableWebviewFileUriMtSetting();

    private LiveDisableWebviewFileUriMtSetting() {
    }

    static {
        Covode.recordClassIndex(10690);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDisableWebviewFileUriMtSetting.class);
    }
}
