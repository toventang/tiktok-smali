package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.covode.number.Covode;

public final class LiveMultiPlayerDeviceScore {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a((byte) 0);
    public static final LiveMultiPlayerDeviceScore INSTANCE = new LiveMultiPlayerDeviceScore();

    private LiveMultiPlayerDeviceScore() {
    }

    public final a getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(11088);
    }

    public final boolean isEnable() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LiveMultiPlayerDeviceScore.class);
        if (aVar == null) {
            aVar = new a((byte) 0);
        }
        float value = TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
        if (value < aVar.f18752b || value >= aVar.f18751a) {
            return false;
        }
        return true;
    }
}
