package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGuestLiveAudioCaptureSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LiveGuestLiveAudioCaptureSetting INSTANCE = new LiveGuestLiveAudioCaptureSetting();

    private LiveGuestLiveAudioCaptureSetting() {
    }

    static {
        Covode.recordClassIndex(10666);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGuestLiveAudioCaptureSetting.class);
    }
}
