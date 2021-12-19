package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveSeiTalkSetting {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a((byte) 0);
    public static final LiveSeiTalkSetting INSTANCE = new LiveSeiTalkSetting();

    private LiveSeiTalkSetting() {
    }

    public final boolean enable() {
        return getConfig().f18727a;
    }

    public final int getInterval() {
        return getConfig().f18728b;
    }

    private final a getConfig() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LiveSeiTalkSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10782);
    }
}
