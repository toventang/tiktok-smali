package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFinishPagePushTipsMaxSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveFinishPagePushTipsMaxSetting INSTANCE = new LiveFinishPagePushTipsMaxSetting();

    private LiveFinishPagePushTipsMaxSetting() {
    }

    static {
        Covode.recordClassIndex(11041);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFinishPagePushTipsMaxSetting.class);
    }
}
