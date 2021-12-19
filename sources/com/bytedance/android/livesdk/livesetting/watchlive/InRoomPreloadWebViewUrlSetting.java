package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InRoomPreloadWebViewUrlSetting {
    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final InRoomPreloadWebViewUrlSetting INSTANCE = new InRoomPreloadWebViewUrlSetting();

    private InRoomPreloadWebViewUrlSetting() {
    }

    static {
        Covode.recordClassIndex(11025);
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(InRoomPreloadWebViewUrlSetting.class);
    }
}
